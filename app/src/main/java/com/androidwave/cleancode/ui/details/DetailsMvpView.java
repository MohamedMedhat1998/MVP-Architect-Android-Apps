package com.androidwave.cleancode.ui.details;

import com.androidwave.cleancode.ui.base.MvpView;

public interface DetailsMvpView extends MvpView {
    public void populateUI();

    public void loadInfoFragment();
}
