package com.androidwave.cleancode.data.network.firebase;

import com.androidwave.cleancode.data.network.pojo.User;

import io.reactivex.Single;

public interface FirebaseHelper {

    public void register(User user);

}
