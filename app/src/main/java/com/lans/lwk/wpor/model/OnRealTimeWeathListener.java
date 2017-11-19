package com.lans.lwk.wpor.model;

import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

/**
 * Created by Li on 2017/11/11.
 */

public interface OnRealTimeWeathListener {
    void Success(Real_Time_WeatherInfo weatherInfo);
    void failed(String text);

}


