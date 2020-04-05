package com.androidwave.cleancode.data.network.firebase;

import com.androidwave.cleancode.data.network.pojo.User;
import com.androidwave.cleancode.data.utils.RegisterResult;

import io.reactivex.subjects.Subject;

public interface FirebaseHelper {

    public Subject<RegisterResult> register(User user);

}
