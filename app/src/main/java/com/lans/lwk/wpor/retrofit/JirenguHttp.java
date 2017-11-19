package com.lans.lwk.wpor.retrofit;

import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by Li on 2017/5/10.
 */

public class JirenguHttp {
//https://weixin.jirengu.com/weather/now?cityid=WX4FBXXFKE4F
    public static final String BASE_URL="https://weixin.jirengu.com/weather/";

    private static final int DEFAULT_TIMEOUT=5;

    private static final JirenguHttp instance=null;
    private WeathRequest api;
    private Retrofit retrofit;
    private JirenguHttp(){
        OkHttpClient.Builder okbuilder=new OkHttpClient.Builder();
        okbuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        retrofit=new Retrofit.Builder().client(okbuilder.build()).baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
        api=retrofit.create(WeathRequest.class);

    }



    public static JirenguHttp GetInstance(){

        if(instance!=null){
            return instance;
        }
        return new JirenguHttp();


    }

    public void RequestJiRen(String cityid,Subscriber<JiRenBean> subscriber){
        api.query_JiRen(cityid).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }





//    public void Request_BDW(String location,Subscriber<Bean> subscriber){
//        api.query_BD(location,"json","3vMLUnjui3DNrgYHtmB62uSlX7hTtV5V").subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
//    }

}
