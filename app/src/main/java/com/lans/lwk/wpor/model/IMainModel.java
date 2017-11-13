package com.lans.lwk.wpor.model;

import com.lans.lwk.wpor.model.entity.City_Info;


import java.util.List;

/**
 * Created by Li on 2017/11/10.
 */

public interface IMainModel {

    //得到当前位置和天气信息
    void getWeatherInfo(OnLocationAndWeathListener info);
    //注销定位监听
    void unregisterListener();

}
