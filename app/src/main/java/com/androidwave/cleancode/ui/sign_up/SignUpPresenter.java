package com.androidwave.cleancode.ui.sign_up;

import com.androidwave.cleancode.data.DataManager;
import com.androidwave.cleancode.data.network.pojo.User;
import com.androidwave.cleancode.ui.base.BasePresenter;
import com.androidwave.cleancode.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class SignUpPresenter<V extends SignUpMvpView> extends BasePresenter<V> implements SignUpMvpPresenter<V> {

    @Inject
    public SignUpPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onSignUpClicked() {
        String name = getMvpView().getFullName().trim();
        String phone = getMvpView().getMobileNumber().trim();
        String password = getMvpView().getPassword().trim();
        String confirmPassword = getMvpView().getConfirmPassword().trim();
        if (!name.isEmpty() && !phone.isEmpty() && !password.isEmpty() && !confirmPassword.isEmpty()) {
            if (!password.equals(confirmPassword)) {
                getMvpView().onError("Password doesn't match");
            } else {
                //TODO use RxJava
                getDataManager().register(new User(name, phone, password));
            }
        } else {
            getMvpView().onError("Please fill all the fields");
        }
    }
}
