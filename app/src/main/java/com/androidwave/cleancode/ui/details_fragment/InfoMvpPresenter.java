package com.androidwave.cleancode.ui.details_fragment;

import com.androidwave.cleancode.ui.base.MvpPresenter;
import com.androidwave.cleancode.ui.base.MvpView;

public interface InfoMvpPresenter<V extends InfoMvpView> extends MvpPresenter<V> {
    public void onViewPrepared();
}
