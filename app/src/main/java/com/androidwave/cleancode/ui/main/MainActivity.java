package com.androidwave.cleancode.ui.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.androidwave.cleancode.R;
import com.androidwave.cleancode.data.network.pojo.SimplifiedFeedItem;
import com.androidwave.cleancode.ui.base.BaseActivity;
import com.androidwave.cleancode.ui.details.DetailsActivity;
import com.androidwave.cleancode.utils.DividerItemDecoration;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainMvpView, RssAdapter.Callback {

    @Inject
    MainMvpPresenter<MainMvpView> mPresenter;

    @Inject
    RssAdapter mRssAdapter;

    LinearLayoutManager mLayoutManager;
    @BindView(R.id.recyclerViewFeed)
    RecyclerView recyclerViewFeed;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mPresenter.onAttach(MainActivity.this);
        setUp();

    }

    @Override
    protected void setUp() {
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(RecyclerView.VERTICAL);
        Drawable dividerDrawable = ContextCompat.getDrawable(this, R.drawable.divider_drawable);
        recyclerViewFeed.addItemDecoration(new DividerItemDecoration(dividerDrawable));
        recyclerViewFeed.setLayoutManager(mLayoutManager);
        mRssAdapter.setOnItemClickedListener(item -> {
            Intent i = new Intent(MainActivity.this, DetailsActivity.class);
            i.putExtra("flag", item.getFlagLink());
            i.putExtra("name", item.getCountryName());
            i.putExtra("total", item.getTotalCases());
            i.putExtra("death", item.getDeaths());
            i.putExtra("recovered", item.getRecovered());
            startActivity(i);
        });
        mPresenter.onViewPrepared();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void updateFeed(List<SimplifiedFeedItem> feedItems) {
        recyclerViewFeed.setAdapter(mRssAdapter);
        mRssAdapter.setData(feedItems);
    }

    @Override
    public void onEmptyViewRetryClick() {
        mPresenter.onViewPrepared();
    }
}
