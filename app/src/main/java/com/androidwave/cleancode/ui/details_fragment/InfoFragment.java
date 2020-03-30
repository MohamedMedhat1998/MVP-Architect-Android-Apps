package com.androidwave.cleancode.ui.details_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.androidwave.cleancode.R;
import com.androidwave.cleancode.ui.base.BaseFragment;
import com.bumptech.glide.Glide;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoFragment extends BaseFragment implements InfoMvpView {

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

    @Inject
    InfoPresenter<InfoMvpView> presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        presenter.onAttach(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        ButterKnife.bind(this, view);
        setUp(view);
        return view;
    }

    @Override
    protected void setUp(View view) {
        Bundle extras = getArguments();
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
        presenter.onViewPrepared();
    }
}
