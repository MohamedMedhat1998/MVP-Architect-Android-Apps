package com.androidwave.cleancode.ui.sign_up;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.androidwave.cleancode.R;
import com.androidwave.cleancode.ui.base.BaseActivity;

import javax.inject.Inject;

public class SignUpActivity extends BaseActivity implements SignUpMvpView {

    @Inject
    SignUpPresenter<SignUpMvpView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getActivityComponent().inject(this);
    }

    @Override
    protected void setUp() {

    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SignUpActivity.class);
    }
}
