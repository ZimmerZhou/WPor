package com.lans.lwk.wpor.model.listener;

import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;

/**
 * Created by Li on 2017/11/17.
 */

public interface OnForWeatherListener {

    void Success(Forecast_WeatherInfo info);
    void failed();
}
