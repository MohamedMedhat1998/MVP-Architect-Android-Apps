package com.androidwave.cleancode.di.module;

import android.app.Application;
import android.content.Context;

import com.androidwave.cleancode.BuildConfig;
import com.androidwave.cleancode.data.BaseDataManager;
import com.androidwave.cleancode.data.DataManager;
import com.androidwave.cleancode.data.db.AppDatabase;
import com.androidwave.cleancode.data.network.AuthenticationInterceptor;
import com.androidwave.cleancode.data.network.CoronaNetworkService;
import com.androidwave.cleancode.data.network.CountryNetworkService;
import com.androidwave.cleancode.data.network.RestApiHelper;
import com.androidwave.cleancode.data.network.RestApiManager;
import com.androidwave.cleancode.data.prefs.PreferencesHelper;
import com.androidwave.cleancode.data.prefs.PreferencesManager;
import com.androidwave.cleancode.di.ApiInfo;
import com.androidwave.cleancode.di.ApplicationContext;
import com.androidwave.cleancode.di.DatabaseInfo;
import com.androidwave.cleancode.di.PreferenceInfo;
import com.androidwave.cleancode.root.AppConstant;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created on : Jan 19, 2019
 * Author     : AndroidWave
 * Email    : info@androidwave.com
 */
@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }


    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstant.DB_NAME;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.CORONA_API_KEY;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstant.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(BaseDataManager mDataManager) {
        return mDataManager;
    }


    @Provides
    @Singleton
    AppDatabase provideAppDatabase() {
        return AppDatabase.getDatabaseInstance(mApplication);
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(PreferencesManager preferencesManager) {
        return preferencesManager;
    }

    @Provides
    @Singleton
    RestApiHelper provideRestApiHelper(RestApiManager restApiManager) {
        return restApiManager;
    }


    /**
     * @return HTTTP Client
     */
    @Provides
    public OkHttpClient provideClient(Map<String, String> headers) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        if (headers != null) {
            AuthenticationInterceptor authenticationInterceptor = new AuthenticationInterceptor(headers);
            return new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .addInterceptor(authenticationInterceptor)
                    .build();
        } else {
            return new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build();
        }

    }

    /**
     * provide Retrofit instances
     *
     * @param baseURL base url for api calling
     * @param client  OkHttp client
     * @return Retrofit instances
     */

    @Provides
    public Retrofit provideRetrofit(String baseURL, OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Provide Api service
     *
     * @return ApiService instances
     */
    @Provides
    public CoronaNetworkService provideCoronaApiService() {
        Map<String, String> headers = new HashMap<>();
        headers.put("x-rapidapi-host", BuildConfig.CORONA_API_HOST);
        headers.put("x-rapidapi-key", BuildConfig.CORONA_API_KEY);
        return provideRetrofit(BuildConfig.CORONA_BASE_URL, provideClient(headers)).create(CoronaNetworkService.class);
    }

    @Provides
    public CountryNetworkService provideCountryApiService() {
        return provideRetrofit(BuildConfig.COUNTRY_BASE_URL, provideClient(null)).create(CountryNetworkService.class);
    }
}
