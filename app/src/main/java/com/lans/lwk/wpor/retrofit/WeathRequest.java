package com.lans.lwk.wpor.retrofit;

import com.lans.lwk.wpor.model.entity.CityId;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

import okhttp3.RequestBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
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


    /**
     * 得到city ID
     * @param key
     * @param q
     * @return
     */
    @GET("search.json")
    Observable<CityId> query_CityId(@Query("key") String key,@Query("q") String q);

    /**
     * 得到现在的信息
     * @param cityid
     * @return
     */
    @GET("now")
    Observable<JiRenBean> query_JiRen(@Query("cityid") String cityid);

    /**
     * 得到未来预报信息
     * @param Longitude
     * @param Latitude
     * @return
     */
   // https://api.caiyunapp.com/v2/TAkhjf8d1nlSlspN/121.6544,25.1552/forecast.json
    @GET("{Longitude},{Latitude}/forecast.json")
    Observable<Forecast_WeatherInfo>Query_Forest(@Path("Longitude") String Longitude,@Path("Latitude") String Latitude);
}
