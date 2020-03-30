package com.androidwave.cleancode.ui.main;

import android.util.Log;

import com.androidwave.cleancode.data.DataManager;
import com.androidwave.cleancode.data.network.pojo.FeedItem;
import com.androidwave.cleancode.data.network.pojo.SimplifiedFeedItem;
import com.androidwave.cleancode.ui.base.BasePresenter;
import com.androidwave.cleancode.utils.rx.SchedulerProvider;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created on : Feb 11, 2019
 * Author     : AndroidWave
 */
public class MainPresenter<V extends MainMvpView> extends BasePresenter<V>
        implements MainMvpPresenter<V> {
    @Inject
    public MainPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onViewPrepared() {
        getMvpView().showLoading();
        getCompositeDisposable().add(getDataManager()
                .getStatistics()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (!isViewAttached()) {
                        return;
                    }
                    getMvpView().hideLoading();
                    /**
                     * Update view here
                     */
                    List<SimplifiedFeedItem> items = new ArrayList<>();
                    for (int i = 0; i < response.getResponse().size(); i++) {
                        FeedItem.ResponseBean bean = response.getResponse().get(i);
                        String country = bean.getCountry();
                        //TODO send request to get the country code
                        getCompositeDisposable().add(getDataManager()
                                .getCountryByName(country.replaceAll("-", " "))
                                .subscribeOn(getSchedulerProvider().io())
                                .observeOn(getSchedulerProvider().ui())
                                .subscribe(responseCountry -> {
                                    String countryCode = responseCountry.get(0).getAlpha2Code();
                                    String flagLink = "https://www.countryflags.io/" + countryCode + "/flat/64.png";
                                    Log.d("FLAG-LINK",flagLink);
                                    items.add(bean.getSimplifiedFeedItem(flagLink));
                                    getMvpView().updateFeed(items);
                                }, error -> {
                                    Log.d("ERROR",error.getMessage());
                                })
                        );
                    }

                }, error -> {
                    if (!isViewAttached()) {
                        return;
                    }
                    getMvpView().hideLoading();

                    /**
                     * manage all kind of error in single place
                     */
                    handleApiError(error);
                }));
    }
}
