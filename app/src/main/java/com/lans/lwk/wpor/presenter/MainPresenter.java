package com.lans.lwk.wpor.presenter;

import android.util.Log;

import com.lans.lwk.wpor.configs.MyView;
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
import com.lans.lwk.wpor.ui.activity.Forc_Detail_Activity;
import com.lans.lwk.wpor.ui.view.IMainActivityView;

import java.util.List;

import rx.Subscriber;

/**
 * Created by Li on 2017/11/11.
 *
 */

public class MainPresenter {
    //Mainactivity接口
    private IMainActivityView iMainActivityView;
    //modele接口
    private IMainModel iMainModel;

    public MainPresenter(IMainActivityView iMainActivityView) {
        this.iMainActivityView=iMainActivityView;
        iMainModel=new MainModelImp();
    }

    //为防止内存泄露在activity的onDestroy方法里面调用如下方法
    public void onDestroy() {
        iMainActivityView=null;
    }

    /**
     * 反注册位置监听器
     */
    public void unregisterListener(){
        iMainModel.unregisterListener();
    }

    /**
     * 得到实时天气信息
     */
    public void GetRealTimeWeatherInfo(){
                iMainModel.getRealTimeWeatherInfo(new OnRealTimeWeathListener(){
                    @Override
                    public void Success(Real_Time_WeatherInfo weatherInfo) {
                        //设置MainActivity温度内容
                        iMainActivityView.setText(((int)(weatherInfo.getResult().getTemperature()))+"",MyView.TEMPERATURE);

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
                Log.i("HAHA",info.getCity()+" "+info.getDistrict()+"  city定位");
                Log.i("HAHA",info.toString()+"  city55");
                GetRealTimeWeatherInfo();
                GetForcastWeatherInfo();
                GetForcaseInfo(info);
                GetCityId(info);
                iMainActivityView.hideDialog();

                iMainActivityView.setText(info.getDistrict()+" "+info.getStreet(),MyView.LOCATION);

            }

            @Override
            public void failed(String text) {
                iMainActivityView.showDialog(text);
            }
        });


    }


    public void GetForcaseInfo(City_Info city_info){
        iMainModel.GetTempInfo(city_info.getLongitude(), city_info.getLatitude(), new OnForWeatherListener() {
            @Override
            public void Success(Forecast_WeatherInfo info) {
                //将预报信息传给温度fragement
                iMainActivityView.GetTempLChar().setDate(info);


                //将预报信息传递给温度显示fragement
                //iMainActivityView.GetForcast().SetDate(info);


            }

            @Override
            public void failed() {
            }
        });
    }

    public void GetJirenWeather(String cityid){
        iMainModel.GetJirenWeather(cityid, new OnJirenWeatherListener() {
            @Override
            public void Success(JiRenBean info) {
               int code=Integer.parseInt(info.getWeather().get(0).getNow().getCode());
                if(code>9 && code <21){
                    iMainActivityView.setBackGround();
                }
                //设置温度显示界面的建议
                iMainActivityView.GetTempLChar().setText(info.getWeather().get(0).getToday().getSuggestion().getDressing().getDetails(),1);

                //天气情况(晴朗/阴天)
                iMainActivityView.setText(info.getWeather().get(0).getNow().getText(),MyView.WEATHER);

                iMainActivityView.setText(info.getWeather().get(0).getNow().getWind_direction()+"风\n"+
                        info.getWeather().get(0).getFuture().get(0).getWind(), MyView.WIND_DIRECT);

                iMainActivityView.GetForcast().SetDate(info);

                iMainActivityView.setText("相对湿度\n"+"    "+((info.getWeather().get(0).getNow().getHumidity()))+"%",MyView.HUMIDITY);

                iMainActivityView.setText("空气指数"+info.getWeather().get(0).getNow().getAir_quality().getCity().getAqi()+" "+
                        info.getWeather().get(0).getNow().getAir_quality().getCity().getQuality(),MyView.PM25);

                iMainActivityView.GetQualityFragement().setDate(info);

                iMainActivityView.setText("体感温度\n  "+"  "+info.getWeather().get(0).getNow().getFeels_like()+"°",MyView.AQI);



            }

            @Override
            public void failed() {

            }
        });
    }

    /**
     * 得到city ID通过cityid查询城市的天气情况
     * @param info
     */
    public void GetCityId(final City_Info info){

        iMainModel.GetCityId(info.getLatitude()+":"+info.getLongitude(), new OnCityIdListener() {
            @Override
            public void Success(CityId cityinfo) {
                 Log.i("HAHA",cityinfo.getResults().get(0).getPath()+"  CITY");
                 //  String id=CityId(cityinfo,info.getCity().substring(0,2));
                //通过得到的cityid信息查询天气情况
                GetJirenWeather(cityinfo.getResults().get(0).getId());

            }

            @Override
            public void failed() {

            }
        });
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
