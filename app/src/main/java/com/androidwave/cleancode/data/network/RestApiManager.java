package com.androidwave.cleancode.data.network;

import com.androidwave.cleancode.data.network.pojo.Country;
import com.androidwave.cleancode.data.network.pojo.FeedItem;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class RestApiManager implements RestApiHelper {

    private CoronaNetworkService mCoronaNetworkService;
    private CountryNetworkService mCountryNetworkService;

    @Inject
    public RestApiManager(CoronaNetworkService coronaApiService, CountryNetworkService countryApiService) {
        mCoronaNetworkService = coronaApiService;
        mCountryNetworkService = countryApiService;
    }


    @Override
    public Single<FeedItem> getStatistics() {
        return mCoronaNetworkService.getStatistics();
    }

    @Override
    public Single<List<Country>> getCountryByName(String name) {
        return mCountryNetworkService.getCountryByName(name);
    }
}
