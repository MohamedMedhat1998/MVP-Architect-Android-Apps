package com.androidwave.cleancode.data.network;

import com.androidwave.cleancode.data.network.pojo.FeedItem;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created on : Jan 19, 2019
 * Author     : AndroidWave
 * Email    : info@androidwave.com
 */
public interface CoronaNetworkService {

    @GET("statistics")
    Single<FeedItem> getStatistics();

}
