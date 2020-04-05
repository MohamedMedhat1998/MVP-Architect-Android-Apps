package com.androidwave.cleancode.ui.sign_up;

import com.androidwave.cleancode.ui.base.MvpView;

public interface SignUpMvpView extends MvpView {
    String getFullName();

    String getMobileNumber();

    String getPassword();

    String getConfirmPassword();

    void onSuccess(String message);

    void navigateToLogin();

}
