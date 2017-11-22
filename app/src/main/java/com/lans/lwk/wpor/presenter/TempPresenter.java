package com.lans.lwk.wpor.presenter;

import com.lans.lwk.wpor.model.Imodel.IMainModel;
import com.lans.lwk.wpor.model.Imodel.ITempModel;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.impl.MainModelImp;
import com.lans.lwk.wpor.model.impl.TempModelImp;
import com.lans.lwk.wpor.model.listener.OnForWeatherListener;
import com.lans.lwk.wpor.ui.view.IMainActivityView;
import com.lans.lwk.wpor.ui.view.ITempView;

/**
 * Created by Li on 2017/11/22.
 */

public class TempPresenter {
    //TempChar接口
    private ITempView iTempView;
    //modele接口
    private ITempModel iTempModel;

    public TempPresenter(ITempView iTempView) {
        this.iTempView=iTempView;
        iTempModel=new TempModelImp();
    }
    public void GetForcaseInfo(City_Info city_info){
        iTempModel.GetTempInfo(city_info.getLongitude(), city_info.getLatitude(), new OnForWeatherListener() {
            @Override
            public void Success(Forecast_WeatherInfo info) {
                //将预报信息传给温度fragement
                iTempView.setDate(info);
            }

            @Override
            public void failed() {
            }
        });
    }

}
