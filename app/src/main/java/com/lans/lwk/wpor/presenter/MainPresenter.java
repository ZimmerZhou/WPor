package com.lans.lwk.wpor.presenter;


import com.lans.lwk.wpor.configs.MyView;
import com.lans.lwk.wpor.model.Imodel.IMainModel;
import com.lans.lwk.wpor.model.entity.CityId;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.Real_Time_WeatherInfo;
import com.lans.lwk.wpor.model.impl.MainModelImp;
import com.lans.lwk.wpor.model.listener.OnCityIdListener;
import com.lans.lwk.wpor.model.listener.OnJirenWeatherListener;
import com.lans.lwk.wpor.model.listener.OnLocationListener;
import com.lans.lwk.wpor.model.listener.OnRealTimeWeathListener;
import com.lans.lwk.wpor.ui.view.IMainActivityView;

/**
 * Created by Li on 2017/11/11.
 *
 */

public class MainPresenter {
    //Mainactivity接口
    private IMainActivityView iMainActivityView;
    //modele接口
    private IMainModel iMainModel;
    private int tempnow=0;

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
                        int temp=((int)(weatherInfo.getResult().getTemperature()));
                        tempnow=temp;
                        iMainActivityView.setText(temp+"",MyView.TEMPERATURE);

                    }

                    @Override
                    public void failed(String text) {

                    }
                });
    }

    /**
     * 开始定位，并在定位成功以后开始请求天气信息
     */
    public void GetLocation(){
        iMainModel.GetLocation(new OnLocationListener() {
            @Override
            public void Success(City_Info info) {
                //得到实时天气状况
                GetRealTimeWeatherInfo();
                //将info传给TempChar界面
                iMainActivityView.Temp_Request(info);
                //得到城市ID
                GetCityId(info);
                //设置主界面定位地点
                iMainActivityView.setText(info.getDistrict()+" "+info.getStreet(),MyView.LOCATION);
                //隐藏Dialog
                iMainActivityView.hideDialog();

            }

            @Override
            public void failed(String text) {
                iMainActivityView.showDialog(text);
            }
        });


    }

    /**
     * 得到详细的天气信息
     * @param cityid
     */

    public void GetJirenWeather(String cityid){
        iMainModel.GetJirenWeather(cityid, new OnJirenWeatherListener() {
            @Override
            public void Success(JiRenBean info) {
                //根据当前天气判断加载不同的天气背景图片
               int code=Integer.parseInt(info.getWeather().get(0).getNow().getCode());
                if(code>9 && code <21){
                    iMainActivityView.setBackGround();
                }
                //设置温度显示界面的建议
                iMainActivityView.GetTempLChar().setText(info.getWeather().get(0).getToday().getSuggestion().getDressing().getDetails(),1);

                //天气情况(晴朗/阴天)
                iMainActivityView.setText(info.getWeather().get(0).getNow().getText(),MyView.WEATHER);
                //风向/风力
                iMainActivityView.setText(info.getWeather().get(0).getNow().getWind_direction()+"风\n"+
                        info.getWeather().get(0).getFuture().get(0).getWind(), MyView.WIND_DIRECT);
                //将info传给ForcastFragement界面
                iMainActivityView.GetForcast().SetDate(info);
                //相对湿度
                iMainActivityView.setText("相对湿度\n"+"    "+((info.getWeather().get(0).getNow().getHumidity()))+"%",MyView.HUMIDITY);
                //空气指数
                iMainActivityView.setText("空气指数"+info.getWeather().get(0).getNow().getAir_quality().getCity().getAqi()+" "+
                        info.getWeather().get(0).getNow().getAir_quality().getCity().getQuality(),MyView.AQI);
                //将info传给QualityFragement界面
                iMainActivityView.GetQualityFragement().setDate(info);
                //体感温度
                String feellike=info.getWeather().get(0).getNow().getFeels_like();
                int min=Math.min(Integer.parseInt(feellike),tempnow);
                iMainActivityView.setText("体感温度\n  "+"  "+min+"°",MyView.FEELLIKE);



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
                //通过得到的cityid信息查询天气情况
                GetJirenWeather(cityinfo.getResults().get(0).getId());

            }

            @Override
            public void failed() {

            }
        });
    }






}
