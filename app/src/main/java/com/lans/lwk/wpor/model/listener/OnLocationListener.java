package com.lans.lwk.wpor.model.listener;

import com.lans.lwk.wpor.model.entity.City_Info;

/**
 * Created by Li on 2017/11/17.
 */

public interface OnLocationListener {

    void Success(City_Info info);
    void failed(String text);
}
