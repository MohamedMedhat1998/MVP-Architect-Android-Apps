package com.androidwave.cleancode.ui.sign_up;

import com.androidwave.cleancode.ui.base.MvpPresenter;

public interface SignUpMvpPresenter<V extends SignUpMvpView> extends MvpPresenter<V> {
    void onSignUpClicked();
}
