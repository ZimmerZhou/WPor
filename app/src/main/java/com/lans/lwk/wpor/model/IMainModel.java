package com.lans.lwk.wpor.model;

import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.impl.OnCityIdListener;
import com.lans.lwk.wpor.model.impl.OnForWeatherListener;
import com.lans.lwk.wpor.model.impl.OnJirenWeatherListener;
import com.lans.lwk.wpor.model.impl.OnLocationListener;

/**
 * Created by Li on 2017/11/10.
 */

public interface IMainModel {

    //天气信息
    void getRealTimeWeatherInfo(OnRealTimeWeathListener info);
    //注销定位监听
    void unregisterListener();

    //得到当前位置
    void GetLocation(OnLocationListener listener);



    void GetTempInfo(String Longitude,String Latitude,OnForWeatherListener listener);

    void GetCityId(String city, OnCityIdListener listener);

    void GetJirenWeather(String cityid, OnJirenWeatherListener listener);
}
