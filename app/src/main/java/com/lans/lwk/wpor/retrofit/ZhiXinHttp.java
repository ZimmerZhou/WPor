package com.lans.lwk.wpor.retrofit;

import com.lans.lwk.wpor.model.entity.CityId;

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

public class ZhiXinHttp {

//https://api.seniverse.com/v3/location/search.json?key=iqcw8lb4lk6wah1l&q=北京
    public static final String URL="https://api.seniverse.com/v3/location/";

    private static final int DEFAULT_TIMEOUT=5;

    private static final ZhiXinHttp instance=null;
    private WeathRequest api;
    private Retrofit retrofit;
    private ZhiXinHttp(){
        OkHttpClient.Builder okbuilder=new OkHttpClient.Builder();
        okbuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        retrofit=new Retrofit.Builder().client(okbuilder.build()).baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
        api=retrofit.create(WeathRequest.class);

    }



    public static ZhiXinHttp GetInstance(){

        if(instance!=null){
            return instance;
        }
        return new ZhiXinHttp();


    }

    public void Request_BDW(String location,Subscriber<CityId> subscriber){
        api.query_CityId("iqcw8lb4lk6wah1l",location).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

}
