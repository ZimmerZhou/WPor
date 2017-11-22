package com.lans.lwk.wpor.model.Imodel;

import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;

import com.lans.lwk.wpor.model.listener.OnCityIdListener;
import com.lans.lwk.wpor.model.listener.OnForWeatherListener;
import com.lans.lwk.wpor.model.listener.OnJirenWeatherListener;
import com.lans.lwk.wpor.model.listener.OnLocationListener;
import com.lans.lwk.wpor.model.listener.OnRealTimeWeathListener;

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




    void GetCityId(String city, OnCityIdListener listener);

    void GetJirenWeather(String cityid, OnJirenWeatherListener listener);
}
