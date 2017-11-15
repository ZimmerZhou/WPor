package com.lans.lwk.wpor.presenter;

import android.util.Log;

import com.lans.lwk.wpor.model.IMainModel;
import com.lans.lwk.wpor.model.OnLocationAndWeathListener;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;
import com.lans.lwk.wpor.model.impl.MainModelImp;
import com.lans.lwk.wpor.ui.view.IMainActivityView;

import java.util.List;

/**
 * Created by Li on 2017/11/11.
 */

public class MainPresenter {
    private IMainActivityView iMainActivityView;
    private IMainModel iMainModel;

    public MainPresenter(IMainActivityView iMainActivityView) {
        this.iMainActivityView=iMainActivityView;
        iMainModel=new MainModelImp();
    }

    public void setLocation(){



    }
    //为防止内存泄露在activity的onDestroy方法里面调用如下方法
    public void onDestroy() {
        iMainActivityView=null;
    }

    public void unregisterListener(){
        iMainModel.unregisterListener();
    }

    public void GetLocationAndWeatherInfo(){
                iMainModel.getWeatherInfo(new OnLocationAndWeathListener() {
                    @Override
                    public void Success(City_Info info, Real_Time_WeatherInfo weatherInfo) {
                       // Log.i("TAGGG",info.getCity()+" "+info.getDistrict()+info.getStreet()+" "+weatherInfo.getResult().getSkycon());
                       // iMainActivityView.setText(info.getDistrict()+" "+info.getStreet()+ info.getLocationDescribe().substring(1,info.getLocationDescribe().length()-2),1);
                        //iMainActivityView.setText("pm2.5:"+weatherInfo.getResult().getPm25()+"",2);
                    }

                    @Override
                    public void failed(String text) {

                    }
                });
    }


}
