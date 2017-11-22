package com.lans.lwk.wpor.model.listener;

import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.JiRenBean;

/**
 * Created by Li on 2017/11/18.
 */

public interface OnJirenWeatherListener {

    void Success(JiRenBean info);
    void failed();
}
