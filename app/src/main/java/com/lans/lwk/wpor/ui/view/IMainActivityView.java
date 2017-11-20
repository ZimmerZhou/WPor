package com.lans.lwk.wpor.ui.view;

import com.lans.lwk.wpor.configs.MyView;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;
import com.lans.lwk.wpor.ui.activity.Forc_Detail_Activity;
import com.lans.lwk.wpor.ui.activity.Fragment2;
import com.lans.lwk.wpor.ui.activity.QualityFragement;
import com.lans.lwk.wpor.ui.activity.TempLChar;

import java.util.List;

/**
 * Created by Li on 2017/11/10.
 */

public interface IMainActivityView {

    void setBackGround();


    //设置控件Text
    void setText(final String text,MyView mode);


    void showDialog();
    void hideDialog();

    //注销定位监听
    void unregisterListener();

    //得到实时天气信息
    void getWeatherInfo();

    //得到温度fragement
    TempLChar GetTempLChar();
    //得到预报fragement
    Fragment2 GetForcast();

    QualityFragement GetQualityFragement();

    //得到当前位置
    void GetLocation();


}
