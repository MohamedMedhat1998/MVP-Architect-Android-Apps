package com.androidwave.cleancode.ui.details_fragment;

import android.util.Log;

import com.androidwave.cleancode.data.DataManager;
import com.androidwave.cleancode.ui.base.BasePresenter;
import com.androidwave.cleancode.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class InfoPresenter<V extends InfoMvpView> extends BasePresenter<V> implements InfoMvpPresenter<V> {

    @Inject
    public InfoPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onViewPrepared() {

    }
}
