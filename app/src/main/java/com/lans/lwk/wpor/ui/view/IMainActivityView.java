package com.lans.lwk.wpor.ui.view;

import com.lans.lwk.wpor.configs.MyView;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.ui.activity.ForCastFragement;
import com.lans.lwk.wpor.ui.activity.QualityFragement;
import com.lans.lwk.wpor.ui.activity.TempLChar;

/**
 * Created by Li on 2017/11/10.
 */

public interface IMainActivityView {

    void Temp_Request(City_Info info);

    void setBackGround();


    //设置控件Text
    void setText(final String text,MyView mode);


    void showDialog(String message);
    void hideDialog();

    //注销定位监听
    void unregisterListener();



    //得到温度fragement
    TempLChar GetTempLChar();
    //得到预报fragement
    ForCastFragement GetForcast();

    QualityFragement GetQualityFragement();

    //得到当前位置
    void GetLocation();


}
