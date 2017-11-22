package com.lans.lwk.wpor.model.impl;

import com.lans.lwk.wpor.model.Imodel.ITempModel;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.listener.OnForWeatherListener;
import com.lans.lwk.wpor.retrofit.RetrofitClient;

import rx.functions.Action1;

/**
 * Created by Li on 2017/11/22.
 */

public class TempModelImp implements ITempModel{

    /**
     * 得到未来24小时预报信息
     * @param Longitude
     * @param Latitude
     * @param listener
     */
    //@Override
    public void GetTempInfo(String Longitude,String Latitude,final OnForWeatherListener listener) {
        RetrofitClient.GetCache().Request_Forecast(Longitude,Latitude, new Action1<Forecast_WeatherInfo>() {

            @Override
            public void call(Forecast_WeatherInfo forecastWeatherInfo) {
                listener.Success(forecastWeatherInfo);
            }
        });
    }
}
