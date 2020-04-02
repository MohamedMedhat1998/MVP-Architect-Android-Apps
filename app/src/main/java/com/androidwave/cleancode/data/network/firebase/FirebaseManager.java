package com.androidwave.cleancode.data.network.firebase;

import com.androidwave.cleancode.data.network.pojo.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;
import javax.inject.Singleton;

import static com.androidwave.cleancode.root.AppConstant.FirebaseConstants.FULL_NAME;
import static com.androidwave.cleancode.root.AppConstant.FirebaseConstants.PASSWORD;
import static com.androidwave.cleancode.root.AppConstant.FirebaseConstants.USER;
@Singleton
public class FirebaseManager implements FirebaseHelper {

    @Inject
    FirebaseDatabase firebaseDatabase;

    @Inject
    public FirebaseManager(){

    }

    @Override
    public void register(User user) {
        DatabaseReference newUser = firebaseDatabase.getReference(USER).child(user.getPhone());
        newUser.child(FULL_NAME).setValue(user.getFullName());
        newUser.child(PASSWORD).setValue(user.getPassword());
    }
}
