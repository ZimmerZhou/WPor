package com.lans.lwk.wpor.model.Imodel;

import com.lans.lwk.wpor.model.listener.OnForWeatherListener;

/**
 * Created by Li on 2017/11/22.
 */

public interface ITempModel {

    void GetTempInfo(String Longitude,String Latitude,OnForWeatherListener listener);
}
