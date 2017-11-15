package com.lans.lwk.wpor.retrofit;

import com.lans.lwk.wpor.model.entity.Bean;
import com.lans.lwk.wpor.model.entity.CityId;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

import okhttp3.RequestBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Li on 2017/11/12.
 */
//http://api.map.baidu.com/telematics/v3/weather?location=临潼&output=json&ak=3vMLUnjui3DNrgYHtmB62uSlX7hTtV5V

public interface WeathRequest {
    /**
     *  查询实时天气情况
     * @param Longitude 经度
     * @param Latitude  纬度
     * @return
     */
    @GET("{Longitude},{Latitude}/realtime.json")
    Observable<Real_Time_WeatherInfo> query(@Path("Longitude") String Longitude,@Path("Latitude") String Latitude);


    //https://api.caiyunapp.com/v2/TAkhjf8d1nlSlspN/121.6544,25.1552/forecast.json
    @GET("now?cityid={CityId}")
    Observable<Bean> query_forest(@Path("CityId") String CityId);

    @GET("cityid?location={Longitude}:{Latitude}")
    Observable<CityId> query_ID(@Query("Longitude") String Longitude, @Query("Latitude") String Latitude);

    @GET("weather") //?location={location}&output=json&ak=3vMLUnjui3DNrgYHtmB62uSlX7hTtV5V
    Observable<Bean> query_BD(@Query("location") String location,@Query("output") String json,@Query("ak") String ak);
}
