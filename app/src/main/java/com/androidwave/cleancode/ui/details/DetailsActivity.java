package com.androidwave.cleancode.ui.details;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentTransaction;

import com.androidwave.cleancode.R;
import com.androidwave.cleancode.ui.base.BaseActivity;
import com.androidwave.cleancode.ui.details_fragment.InfoFragment;
import com.bumptech.glide.Glide;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends BaseActivity implements DetailsMvpView {

    @Inject
    DetailsPresenter<DetailsMvpView> presenter;

    Bundle extras;
    @BindView(R.id.ivFlag)
    ImageView ivFlag;
    @BindView(R.id.tvCountryName)
    TextView tvCountryName;
    @BindView(R.id.tvTotalCases)
    TextView tvTotalCases;
    @BindView(R.id.tvDeath)
    TextView tvDeath;
    @BindView(R.id.tvRecovered)
    TextView tvRecovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        presenter.onAttach(this);
        setUp();
    }

    @Override
    protected void setUp() {
        extras = getIntent().getExtras();
        presenter.onViewPrepared();
    }

    @Override
    public void populateUI() {
        String flagLink = extras.getString("flag");
        String name = extras.getString("name");
        int total = extras.getInt("total");
        int death = extras.getInt("death");
        int recovered = extras.getInt("recovered");

        Glide.with(this)
                .load(flagLink)
                .into(ivFlag);

        tvCountryName.setText(name);
        tvTotalCases.setText("" + total);
        tvDeath.setText("" + death);
        tvRecovered.setText("" + recovered);
    }

    @Override
    public void loadInfoFragment() {
        InfoFragment infoFragment = new InfoFragment();
        infoFragment.setArguments(extras);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.info_placeholder, infoFragment);
        transaction.commit();
    }
}
