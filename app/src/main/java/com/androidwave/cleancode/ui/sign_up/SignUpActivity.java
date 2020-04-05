package com.androidwave.cleancode.ui.sign_up;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatButton;

import com.androidwave.cleancode.R;
import com.androidwave.cleancode.ui.base.BaseActivity;
import com.androidwave.cleancode.ui.login.LoginActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends BaseActivity implements SignUpMvpView {

    @Inject
    SignUpPresenter<SignUpMvpView> presenter;

    @BindView(R.id.input_full_name)
    EditText inputFullName;
    @BindView(R.id.input_phone)
    EditText inputPhone;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.input_confirm_password)
    EditText inputConfirmPassword;
    @BindView(R.id.btn_sign_up)
    AppCompatButton btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        presenter.onAttach(this);
        setUp();
    }

    @Override
    protected void setUp() {
        btnSignUp.setOnClickListener(view -> {
            presenter.onSignUpClicked();
        });
    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SignUpActivity.class);
    }

    @Override
    public String getFullName() {
        return inputFullName.getText().toString();
    }

    @Override
    public String getMobileNumber() {
        return inputPhone.getText().toString();
    }

    @Override
    public String getPassword() {
        return inputPassword.getText().toString();
    }

    @Override
    public String getConfirmPassword() {
        return inputConfirmPassword.getText().toString();
    }

    @Override
    public void onSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void navigateToLogin() {
        startActivity(LoginActivity.getStartIntent(this));
    }

    @Override
    public void onError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
