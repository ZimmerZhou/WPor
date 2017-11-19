package com.lans.lwk.wpor.model.impl;

import com.lans.lwk.wpor.model.entity.CityId;

/**
 * Created by Li on 2017/11/18.
 */

public interface OnCityIdListener {
    void Success(CityId info);
    void failed();
}
