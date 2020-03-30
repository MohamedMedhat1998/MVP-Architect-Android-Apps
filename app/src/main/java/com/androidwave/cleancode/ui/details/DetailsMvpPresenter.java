package com.androidwave.cleancode.ui.details;

import com.androidwave.cleancode.ui.base.MvpPresenter;

public interface DetailsMvpPresenter<V extends DetailsMvpView> extends MvpPresenter<V> {
    public void onViewPrepared();
}
