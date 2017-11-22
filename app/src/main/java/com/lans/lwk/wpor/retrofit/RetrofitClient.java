package com.lans.lwk.wpor.retrofit;

import android.text.TextUtils;
import android.util.Log;

import com.lans.lwk.wpor.configs.MyView;
import com.lans.lwk.wpor.model.entity.CityId;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;


/**对 Retrofit进行简单封装，默认返回加载彩云URL将其写为静态内部类，因此没有进行缓存
 * Created by Li on 2017/5/10.
 */

public class RetrofitClient {
    //将RetrofitClient进行缓存
    static HashMap<String,RetrofitClient> hashMap=new HashMap<>();
    //彩云天气API
    private static final String CAIYUN_URL="https://api.caiyunapp.com/v2/8uupsJ1Zu4PurdDW/";
    //jirengu天气API
    public static final String JIRENGU_URL="https://weixin.jirengu.com/weather/";

    //心知天气API
    public static final String ZHIXIN_URL="https://api.seniverse.com/v3/location/";


    //默认超时时间
    private static final int DEFAULT_TIMEOUT=5;

    private static final RetrofitClient instance=null;
    private WeathRequest api;
    private OkHttpClient.Builder okbuilder;

    private static RetrofitClient client;

    /**
     * 初始化一个默认的RetrofitClient
     */
    private static class SingletonHolder{
        private static RetrofitClient CAIYUN=new RetrofitClient();
    }

    private RetrofitClient(){
        this(MyView.CAIYUN);
    }

    /**
     * 通过mode的不同来构造不同的Retrofit 有(MyView.CAIYUN 彩云api , MyView.JIRENGU jirengu api,MyView.ZHIXIN 心知api)
     * @param mode
     */
    private RetrofitClient(MyView mode){
        String URL="";
        switch (mode){
            case CAIYUN:
                    URL=CAIYUN_URL; break;

            case BAIDU:
                //URL=CAIYUN_URL;

            case JIRENGU:
                    URL=JIRENGU_URL; break;

            case ZHIXIN:
                URL=ZHIXIN_URL; break;

        }
        if(TextUtils.isEmpty(URL)){
            Log.v("TAG","url为空");
        }
        okbuilder=new OkHttpClient.Builder();
        okbuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        Retrofit  retrofit=new Retrofit.Builder().client(okbuilder.build()).baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
        api=retrofit.create(WeathRequest.class);
    }

    /**
     * 将RetrofitClient进行缓存
     * @param mode
     * @return
     */
    public static RetrofitClient GetCache(MyView mode){
    if(hashMap.get(mode.name())!=null){
            return hashMap.get(mode.name());
    }else{
      return  GetInstance(mode);
    }

}

    private static RetrofitClient GetInstance(MyView mode){

        client=new RetrofitClient(mode);
        hashMap.put(mode.name(),client);
        return client;


    }
    //返回默认构造的RetrofitClient
    public static RetrofitClient GetCache(){
        return SingletonHolder.CAIYUN;
    }

    /**
     * 得到实时天气信息
     * @param Longitude
     * @param Latitude
     * @param subscriber
     */
    public void Request(String Longitude,String Latitude,Action1<Real_Time_WeatherInfo> subscriber){
        api.query(Longitude, Latitude).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    /**
     * 得到未来预报天气信息
     * @param Longitude
     * @param Latitude
     * @param subscriber
     */
    public void Request_Forecast(String Longitude,String Latitude,Action1<Forecast_WeatherInfo> subscriber){
        api.Query_Forest(Longitude,Latitude).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    /**
     * 得到天气信息（信息全面）
     * @param cityid
     * @param subscriber
     */
    public void RequestJiRen(String cityid,Action1<JiRenBean> subscriber){
        api.query_JiRen(cityid).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    /**
     * 得到城市ID
     * @param location
     * @param subscriber
     */
    public void Request_BDW(String location,Action1<CityId> subscriber){
        api.query_CityId("iqcw8lb4lk6wah1l",location).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }




}
