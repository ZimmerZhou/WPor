package com.lans.lwk.wpor.presenter;

import android.util.Log;

import com.lans.lwk.wpor.model.IMainModel;
import com.lans.lwk.wpor.model.OnRealTimeWeathListener;
import com.lans.lwk.wpor.model.entity.CityId;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;
import com.lans.lwk.wpor.model.impl.MainModelImp;
import com.lans.lwk.wpor.model.impl.OnCityIdListener;
import com.lans.lwk.wpor.model.impl.OnForWeatherListener;
import com.lans.lwk.wpor.model.impl.OnJirenWeatherListener;
import com.lans.lwk.wpor.model.impl.OnLocationListener;
import com.lans.lwk.wpor.retrofit.HttpMethods;
import com.lans.lwk.wpor.ui.activity.Forc_Detail_Activity;
import com.lans.lwk.wpor.ui.view.IMainActivityView;

import java.util.List;

import rx.Subscriber;

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

    public void GetRealTimeWeatherInfo(){
                iMainModel.getRealTimeWeatherInfo(new OnRealTimeWeathListener(){
                    @Override
                    public void Success(Real_Time_WeatherInfo weatherInfo) {
                        iMainActivityView.setText(((int)(weatherInfo.getResult().getTemperature()))+"",3);
                        iMainActivityView.setText("相对湿度\n"+"    "+((weatherInfo.getResult().getHumidity())*100)+"%",6);
                      //  iMainActivityView.setText(weatherInfo.getResult().getSkycon(),4);
                    }

                    @Override
                    public void failed(String text) {

                    }
                });


    }

    public void GetLocation(){
        iMainModel.GetLocation(new OnLocationListener() {
            @Override
            public void Success(City_Info info) {
                GetRealTimeWeatherInfo();
                GetForcastWeatherInfo();
                GetForcaseInfo(info);
                GetCityId(info);

               // iMainActivityView.GetTempLChar().GetTempInfo(info.getLongitude(),info.getLatitude());
                iMainActivityView.setText(info.getDistrict()+" "+info.getStreet(),1);

            }

            @Override
            public void failed(String text) {

            }
        });


    }


    public void GetForcaseInfo(City_Info city_info){
        iMainModel.GetTempInfo(city_info.getLongitude(), city_info.getLatitude(), new OnForWeatherListener() {
            @Override
            public void Success(Forecast_WeatherInfo info) {
                iMainActivityView.GetTempLChar().setDate(info);
                iMainActivityView.setText("aqi\n"+info.getResult().getHourly().getAqi().get(0).getValue()+"",7);
                //将预报信息传递给温度显示fragement
                //iMainActivityView.GetForcast().SetDate(info);
            }

            @Override
            public void failed() {

            }
        });
    }

    public void GetJirenWeather(String cityid){
        Log.i("HAHA",cityid+"999");
        iMainModel.GetJirenWeather(cityid, new OnJirenWeatherListener() {
            @Override
            public void Success(JiRenBean info) {
                Log.i("HAHA",info.getWeather().get(0).getCity_name()+"999");
                iMainActivityView.GetTempLChar().setText(info.getWeather().get(0).getToday().getSuggestion().getDressing().getDetails(),1);
                iMainActivityView.setText(info.getWeather().get(0).getNow().getText(),4);
                iMainActivityView.GetForcast().SetDate(info);

                //iMainActivityView.Get
            }

            @Override
            public void failed() {

            }
        });
    }


    public void GetCityId(final City_Info info){

        iMainModel.GetCityId(info.getDistrict().substring(0,2), new OnCityIdListener() {
            @Override
            public void Success(CityId cityinfo) {
                String id=CityId(cityinfo,info.getCity().substring(0,2));
                Log.i("HAHA",id+"11111");
                GetJirenWeather(id);

            }

            @Override
            public void failed() {

            }
        });
    }

    private String CityId(CityId cityinfo,String city){
      List<CityId.ResultsBean> resultbean= cityinfo.getResults();
        for(int i=0;i<resultbean.size();i++){
            if(resultbean.get(i).getPath().contains(city)){
                return resultbean.get(i).getId();
            }
        }
        return null;
    }

    public void GetForcastWeatherInfo(){
//      iMainModel.getForcastWeatherInfo(new OnBDWeatherInfoListener() {
//          @Override
//          public void Success(Bean weatherInfo) {
//              iMainActivityView.setText(weatherInfo.getResults().get(0).getWeather_data().get(0).getWind(),5);
//              Log.i("HAHA",weatherInfo.getResults().get(0).getWeather_data().get(0).getWeather());
//              //温度des
//              iMainActivityView.GetTempLChar().setText(weatherInfo.getResults().get(0).getIndex().get(0).getDes(),1);
//              iMainActivityView.setText(weatherInfo.getResults().get(0).getWeather_data().get(0).getWeather(),4);
//
//            //  weatherInfo.getResults().get(0).getWeather_data().get(2).getDate();
//              Log.i("HAHA",weatherInfo.getResults().get(0).getWeather_data().get(5).getDate());
//          }
//
//          @Override
//          public void failed(String text) {
//
//          }
//      });


    }




}
