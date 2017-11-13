package com.lans.lwk.wpor.model.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.Poi;
import com.lans.lwk.wpor.LocationService;
import com.lans.lwk.wpor.app.LocationApplication;
import com.lans.lwk.wpor.model.IMainModel;
import com.lans.lwk.wpor.model.OnLocationAndWeathListener;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;
import com.lans.lwk.wpor.retrofit.HttpMethods;

import rx.Subscriber;

/**
 * Created by Li on 2017/11/11.
 */

public class MainModelImp implements IMainModel {
    private LocationService locationService;
    private OnLocationAndWeathListener locationListener;
    private String Longitude,Latitude,city;
    @Override
    public void getWeatherInfo(final OnLocationAndWeathListener locationListener) {
        // -----------location config ------------
        this.locationListener=locationListener;
        //获取locationservice实例
        locationService = LocationApplication.getLocationSer();
        //注册位置监听器
        locationService.registerListener(mListener);

        int type = 0;
        if (type == 0) {
            locationService.setLocationOption(locationService.getDefaultLocationClientOption());
        } else if (type == 1) {
            locationService.setLocationOption(locationService.getOption());
        }
                     // start之后会默认发起一次定位请求
                    locationService.start();// 定位SDK

                   // locationService.stop();

    }

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

            if (null != location && location.getLocType() != BDLocation.TypeServerError) {
                StringBuffer sb = new StringBuffer(256);

                sb.append("time : ");
                /*
                * 时间也可以使用systemClock.elapsedRealtime()方法 获取的是自从开机以来，每次回调的时间；
               *location.getTime() 是指服务端出本次结果的时间，如果位置不发生变化，则时间不变
               * */
                sb.append(location.getTime());
                sb.append("\nlocType : ");// 定位类型
                sb.append(location.getLocType());
                sb.append("\nlocType description : ");// *****对应的定位类型说明*****
                sb.append(location.getLocTypeDescription());
                sb.append("\nlatitude : ");// 纬度
                sb.append(location.getLatitude());
                Latitude=location.getLatitude()+"";
                sb.append("\nlontitude : ");// 经度
                sb.append(location.getLongitude());
                Longitude=location.getLongitude()+"";
                sb.append("\nradius : ");// 半径
                sb.append(location.getRadius());
                sb.append("\nCountryCode : ");// 国家码
                sb.append(location.getCountryCode());
                sb.append("\nCountry : ");// 国家名称
                sb.append(location.getCountry());
                sb.append("\ncitycode : ");// 城市编码
                sb.append(location.getCityCode());
                sb.append("\ncity : ");// 城市
                sb.append(location.getCity());
                city=location.getCity();
                sb.append("\nDistrict : ");// 区
                sb.append(location.getDistrict());
                sb.append("\nStreet : ");// 街道
                sb.append(location.getStreet());
                sb.append("\naddr : ");// 地址信息
                sb.append(location.getAddrStr());
                sb.append("\nUserIndoorState: ");// *****返回用户室内外判断结果*****
                sb.append(location.getUserIndoorState());
                sb.append("\nDirection(not all devices have value): ");
                sb.append(location.getDirection());// 方向
                sb.append("\nlocationdescribe: ");
                sb.append(location.getLocationDescribe());// 位置语义化信息
                sb.append("\nPoi: ");// POI信息
                Log.i("append",sb.toString());
                if (location.getPoiList() != null && !location.getPoiList().isEmpty()) {
                    for (int i = 0; i < location.getPoiList().size(); i++) {
                        Poi poi = (Poi) location.getPoiList().get(i);
                        sb.append(poi.getName() + ";");
                    }
                }
                if (location.getLocType() == BDLocation.TypeGpsLocation) {// GPS定位结果
                    sb.append("\nspeed : ");
                    sb.append(location.getSpeed());// 速度 单位：km/h
                    sb.append("\nsatellite : ");
                    sb.append(location.getSatelliteNumber());// 卫星数目
                    sb.append("\nheight : ");
                    sb.append(location.getAltitude());// 海拔高度 单位：米
                    sb.append("\ngps status : ");
                    sb.append(location.getGpsAccuracyStatus());// *****gps质量判断*****
                    sb.append("\ndescribe : ");
                    sb.append("gps定位成功");
                    Log.i("append",sb.toString());
                } else if (location.getLocType() == BDLocation.TypeNetWorkLocation) {// 网络定位结果
                    // 运营商信息
                        if (location.hasAltitude()) {// *****如果有海拔高度*****
                        sb.append("\nheight : ");
                        sb.append(location.getAltitude());// 单位：米
                    }
                    sb.append("\noperationers : ");// 运营商信息
                    sb.append(location.getOperators());
                    sb.append("\ndescribe : ");
                    sb.append("网络定位成功");
                } else if (location.getLocType() == BDLocation.TypeOffLineLocation) {// 离线定位结果
                    sb.append("\ndescribe : ");
                    sb.append("离线定位成功，离线定位结果也是有效的");
                } else if (location.getLocType() == BDLocation.TypeServerError) {
                    sb.append("\ndescribe : ");
                    sb.append("服务端网络定位失败，可以反馈IMEI号和大体定位时间到loc-bugs@baidu.com，会有人追查原因");
                } else if (location.getLocType() == BDLocation.TypeNetWorkException) {
                    sb.append("\ndescribe : ");
                    sb.append("网络不同导致定位失败，请检查网络是否通畅");
                } else if (location.getLocType() == BDLocation.TypeCriteriaException) {
                    sb.append("\ndescribe : ");
                    sb.append("无法获取有效定位依据导致定位失败，一般是由于手机的原因，处于飞行模式下一般会造成这种结果，可以试着重启手机");
                }
                Log.i("GG",location.getAddrStr()+"  "+location.getLocationDescribe());

                Message message=new Message();
                message.what=1;
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        getLocationAndWeatherInfo(new City_Info(location.getLongitude()+"",location.getLatitude()+"",location.getCity(),location.getDistrict()
                        ,location.getStreet(),location.getLocationDescribe()),locationListener);
                       // locationListener.LocationSuccess(sb.toString());
                    }
                });


            }else{
                locationListener.failed("定位失败");
            }

        }

    };




    public void getLocationAndWeatherInfo(final City_Info city_info, final OnLocationAndWeathListener listener) {
        Subscriber<Real_Time_WeatherInfo> sub =new Subscriber<Real_Time_WeatherInfo>() {
         @Override
        public void onCompleted() {

          }

         @Override
        public void onError(Throwable e) {
            listener.failed("定位失败");
         }

      @Override
      public void onNext(Real_Time_WeatherInfo news) {
          Log.i("TAG", "onNext: "+city+"  "+news.getStatus()+news.getResult().getSkycon());
          listener.Success(city_info,news);
      }
  };

        HttpMethods.GetInstance().Request(Longitude,Latitude,sub);
    }



}
