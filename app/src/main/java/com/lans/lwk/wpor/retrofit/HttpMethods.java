package com.lans.lwk.wpor.retrofit;

import com.lans.lwk.wpor.model.entity.CityId;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Li on 2017/5/10.
 */

public class HttpMethods {

    public static final String BASE_URL="https://api.caiyunapp.com/v2/8uupsJ1Zu4PurdDW/";
    public static final String URL="https://weixin.jirengu.com/weather/cityid?location=";

    private static final int DEFAULT_TIMEOUT=5;

    private static final HttpMethods instance=null;
    private WeathRequest api;
    private Retrofit retrofit;
    private HttpMethods(){

        OkHttpClient.Builder okbuilder=new OkHttpClient.Builder();
        okbuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        retrofit=new Retrofit.Builder().client(okbuilder.build()).baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
        api=retrofit.create(WeathRequest.class);
    }

    private HttpMethods(String url){

        OkHttpClient.Builder okbuilder=new OkHttpClient.Builder();
        okbuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        retrofit=new Retrofit.Builder().client(okbuilder.build()).baseUrl(url).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
        api=retrofit.create(WeathRequest.class);
    }

    public static HttpMethods GetInstance(){
        if(instance!=null){
        return instance;
        }
        return new HttpMethods();
    }

    public void Request(String Longitude,String Latitude,Subscriber<Real_Time_WeatherInfo> subscriber){
        api.query(Longitude, Latitude).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void Request_Forecast(String Longitude,String Latitude,Subscriber<Forecast_WeatherInfo> subscriber){
        api.query_forest(Longitude, Latitude).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void Request_FL(String Longitude,String Latitude,Subscriber<CityId> subscriber){
        api.query_ID(Longitude, Latitude).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

}
