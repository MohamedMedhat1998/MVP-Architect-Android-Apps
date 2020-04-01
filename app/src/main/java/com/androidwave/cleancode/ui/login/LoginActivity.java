package com.androidwave.cleancode.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;

import com.androidwave.cleancode.R;
import com.androidwave.cleancode.data.network.pojo.UserProfile;
import com.androidwave.cleancode.ui.base.BaseActivity;
import com.androidwave.cleancode.ui.main.MainActivity;
import com.androidwave.cleancode.ui.sign_up.SignUpActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity implements LoginMvpView {
    @Inject
    LoginMvpPresenter<LoginMvpView> mPresenter;

    @BindView(R.id.input_phone)
    EditText inputPhone;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.btn_login)
    AppCompatButton btnLogin;
    @BindView(R.id.link_signup)
    TextView linkSignup;


    // UI references.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mPresenter.onAttach(LoginActivity.this);
        setUp();
    }

    @Override
    protected void setUp() {
        btnLogin.setOnClickListener(v -> {
            mPresenter.onLoginClick();
        });
        linkSignup.setOnClickListener(view -> {
            mPresenter.onSignUpClick();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDetach();
    }

    @Override
    public void onLoginSuccess(UserProfile mUser) {
        startActivity(MainActivity.getStartIntent(this));
    }

    @Override
    public void navigateToSignUp() {
        startActivity(SignUpActivity.getStartIntent(this));
    }

    @Override
    public String getPhone() {
        return inputPhone.getText().toString();
    }

    @Override
    public String getPassword() {
        return inputPassword.getText().toString();
    }

    @Override
    public void showInputError() {
        showMessage(getString(R.string.input_invalid));
    }

    @Override
    public void setPassword(String password) {
        inputPassword.setText(password);
    }

    @Override
    public void setPhone(String phone) {
        inputPhone.setText(phone);
    }


}

