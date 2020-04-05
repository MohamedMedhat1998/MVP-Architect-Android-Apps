package com.androidwave.cleancode.data.network.firebase;

import androidx.annotation.NonNull;

import com.androidwave.cleancode.data.network.pojo.User;
import com.androidwave.cleancode.data.utils.RegisterResult;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

import static com.androidwave.cleancode.root.AppConstant.FirebaseConstants.FULL_NAME;
import static com.androidwave.cleancode.root.AppConstant.FirebaseConstants.PASSWORD;
import static com.androidwave.cleancode.root.AppConstant.FirebaseConstants.USER;

@Singleton
public class FirebaseManager implements FirebaseHelper {

    @Inject
    FirebaseDatabase firebaseDatabase;

    @Inject
    public FirebaseManager() {

    }

    @Override
    public Subject<RegisterResult> register(User user) {
        DatabaseReference newUser = firebaseDatabase.getReference(USER);
        Subject<RegisterResult> subject = PublishSubject.create();
        newUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.hasChild(user.getPhone())) {
                    subject.onError(new Throwable("User already exists"));
                } else {
                    newUser.child(user.getPhone()).child(FULL_NAME).setValue(user.getFullName(), (databaseError, databaseReference) -> {
                        if (databaseError != null) {
                            subject.onError(databaseError.toException());
                        } else {
                            newUser.child(user.getPhone()).child(PASSWORD).setValue(user.getPassword(), (dbError, dbReference) -> {
                                if (dbError != null) {
                                    subject.onError(dbError.toException());
                                } else {
                                    subject.onNext(RegisterResult.SUCCESS);
                                }
                            });
                        }
                    });
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return subject;
    }
}
