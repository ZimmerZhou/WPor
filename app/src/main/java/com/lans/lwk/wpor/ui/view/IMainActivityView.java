package com.lans.lwk.wpor.ui.view;

import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;

import java.util.List;

/**
 * Created by Li on 2017/11/10.
 */

public interface IMainActivityView {


    //设置控件Text
    void setText(final String text,int mode);

    //注销定位监听
    void unregisterListener();

    //得到实时天气信息
    void getWeatherInfo();
}
