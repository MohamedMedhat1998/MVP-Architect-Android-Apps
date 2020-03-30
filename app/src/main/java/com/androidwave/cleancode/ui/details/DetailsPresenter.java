package com.androidwave.cleancode.ui.details;

import com.androidwave.cleancode.data.DataManager;
import com.androidwave.cleancode.ui.base.BasePresenter;
import com.androidwave.cleancode.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class DetailsPresenter<V extends DetailsMvpView> extends BasePresenter<V> implements DetailsMvpPresenter<V> {

    @Inject
    public DetailsPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }


    @Override
    public void onViewPrepared() {
        getMvpView().populateUI();
        getMvpView().loadInfoFragment();
    }
}
