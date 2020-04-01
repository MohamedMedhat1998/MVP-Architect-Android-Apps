package com.androidwave.cleancode.ui.sign_up;

import com.androidwave.cleancode.data.DataManager;
import com.androidwave.cleancode.ui.base.BasePresenter;
import com.androidwave.cleancode.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class SignUpPresenter<V extends SignUpMvpView> extends BasePresenter<V> implements SignUpMvpPresenter<V> {

    @Inject
    public SignUpPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }
}
