package com.androidwave.cleancode.data.network;

import com.androidwave.cleancode.data.network.pojo.Country;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CountryNetworkService {

    @GET("{name}")
    Single<List<Country>> getCountryByName(@Path("name") String name);
}
