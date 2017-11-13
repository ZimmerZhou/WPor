package com.lans.lwk.wpor.model;

import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

/**
 * Created by Li on 2017/11/11.
 */

public interface OnLocationAndWeathListener {
    void Success(City_Info info, Real_Time_WeatherInfo weatherInfo);
    void failed(String text);

}
