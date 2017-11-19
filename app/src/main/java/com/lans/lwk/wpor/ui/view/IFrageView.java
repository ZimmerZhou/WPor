package com.lans.lwk.wpor.ui.view;

import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;

import java.util.List;

/**
 * Created by Li on 2017/11/17.
 */

public interface IFrageView {

    void setDate(Forecast_WeatherInfo info);

    void setText(String text,int id);
}
