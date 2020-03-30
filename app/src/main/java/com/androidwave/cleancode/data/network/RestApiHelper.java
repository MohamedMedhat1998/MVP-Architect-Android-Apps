package com.androidwave.cleancode.data.network;

import com.androidwave.cleancode.data.network.pojo.Country;
import com.androidwave.cleancode.data.network.pojo.FeedItem;

import java.util.List;

import io.reactivex.Single;

public interface RestApiHelper {

    Single<FeedItem> getStatistics();

    Single<List<Country>> getCountryByName(String name);
}
