package com.lans.lwk.wpor.model.impl;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.lans.lwk.wpor.LocationService;
import com.lans.lwk.wpor.app.LocationApplication;
import com.lans.lwk.wpor.configs.MyView;
import com.lans.lwk.wpor.model.IMainModel;
import com.lans.lwk.wpor.model.OnRealTimeWeathListener;
import com.lans.lwk.wpor.model.entity.CityId;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;
import com.lans.lwk.wpor.retrofit.RetrofitClient;

import rx.functions.Action1;

/**
 * Created by Li on 2017/11/11.
 * 主要用于向服务器请求相关信息
 */

public class MainModelImp implements IMainModel {
    //定位配置
    private LocationService locationService;
    //定位监听器
    private OnLocationListener onLocationListener;
    //city_info用于将位置相关信息返回给调用者
    private City_Info city_info;


    /**
     * 得到位置信息(发起定位)
     * @param onLocationListener
     */
    public void GetLocation(final OnLocationListener onLocationListener){

        //获取locationservice实例
        locationService = LocationApplication.getLocationSer();
        //注册位置监听器
        locationService.registerListener(mListener);
        //添加默认配置
        locationService.setLocationOption(locationService.getDefaultLocationClientOption());
        // 开始定位
        locationService.start();
        //将位置监听器初始化
        this.onLocationListener=onLocationListener;

    }

    /**
     * 反注册定位结果监听（当activity stop的时候会调用）
     */
    @Override
    public void unregisterListener() {
        locationService.unregisterListener(mListener);
        locationService.stop();
    }



    /*****
     *
     * 定位结果回调，重写onReceiveLocation方法.
     *
     */

    private BDAbstractLocationListener mListener = new BDAbstractLocationListener() {

        @Override
        public void onReceiveLocation(final BDLocation location) {
            // TODO Auto-generated method stub
            //是否定位成功标志位
            boolean isSuccess=true;

            if (null != location && location.getLocType() != BDLocation.TypeServerError) {

                 if (location.getLocType() == BDLocation.TypeNetWorkException) {
                 isSuccess=false;
                 onLocationListener.failed("网络不同导致定位失败，请检查网络是否通畅");
                } else if (location.getLocType() == BDLocation.TypeCriteriaException) {
                 isSuccess=false;
                 onLocationListener.failed("无法获取有效定位依据导致定位失败，一般是由于手机的原因，处于飞行模式下一般会造成这种结果，可以试着重启手机");
                }
                  //定位成功，并且结果不为空，将结果返回
                    if(isSuccess&& location.getStreet()!=null && onLocationListener!=null){
                        //构造city_info
                    city_info=new City_Info(location.getLongitude()+"",location.getLatitude()+"",location.getCity(),location.getDistrict()
                            ,location.getStreet(),location.getLocationDescribe());
                        //回掉
                    onLocationListener.Success(city_info);
                        //停止定位
                    locationService.stop();
                }
            }

        }

    };


    /**
     * 得到实时天气状况(只是用到了温度等信息,此接口信息不全)
     * @param listener
     */
    @Override
    public void getRealTimeWeatherInfo(final OnRealTimeWeathListener listener) {
        RetrofitClient.GetInstance().Request(city_info.getLongitude(), city_info.getLatitude(),new Action1<Real_Time_WeatherInfo>(){
            @Override
            public void call(Real_Time_WeatherInfo weatherInfo) {
                listener.Success(weatherInfo);
            }
        });


    }

    /**
     * 得到未来24小时预报信息
     * @param Longitude
     * @param Latitude
     * @param listener
     */
    @Override
    public void GetTempInfo(String Longitude,String Latitude,final OnForWeatherListener listener) {
        RetrofitClient.GetInstance().Request_Forecast(Longitude,Latitude, new Action1<Forecast_WeatherInfo>() {

            @Override
            public void call(Forecast_WeatherInfo forecastWeatherInfo) {
                listener.Success(forecastWeatherInfo);
            }
        });
    }

    /**
     *得到表示city的ID，通过此ID查询城市的相关天气信息
     * @param city  (Latitude:Longitude)
     * @param listener
     */
    @Override
    public void GetCityId(final String city, final OnCityIdListener listener) {
        RetrofitClient.GetInstance(MyView.ZHIXIN).Request_BDW(city, new Action1<CityId>() {

            @Override
            public void call(CityId cityId) {
                listener.Success(cityId);
            }


        });

    }

    /**
     * 查询城市相关天气信息
     * @param cityid 城市id
     * @param listener
     */
    @Override
    public void GetJirenWeather(String cityid, final OnJirenWeatherListener listener) {
        RetrofitClient.GetInstance(MyView.JIRENGU).RequestJiRen(cityid, new Action1<JiRenBean>() {


            @Override
            public void call(JiRenBean jiRenBean) {
                listener.Success(jiRenBean);
            }
        });
    }

}