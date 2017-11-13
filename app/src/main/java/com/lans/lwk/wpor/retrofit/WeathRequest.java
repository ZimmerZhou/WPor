package com.lans.lwk.wpor.retrofit;

import com.lans.lwk.wpor.model.entity.CityId;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

import okhttp3.RequestBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Li on 2017/11/12.
 */

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
    @GET("{Longitude},{Latitude}/forecast.json")
    Observable<Forecast_WeatherInfo> query_forest(@Path("Longitude") String Longitude, @Path("Latitude") String Latitude);

    @GET("{Longitude}:{Latitude}")
    Observable<CityId> query_ID(@Path("Longitude") String Longitude, @Path("Latitude") String Latitude);
}
