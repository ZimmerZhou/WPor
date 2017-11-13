package com.lans.lwk.wpor.ui.activity;



import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.lans.lwk.wpor.LocationService;
import com.lans.lwk.wpor.R;

import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.presenter.MainPresenter;
import com.lans.lwk.wpor.retrofit.HttpMethods;
import com.lans.lwk.wpor.ui.view.IMainActivityView;
import com.lans.lwk.wpor.util.Utils;

import java.util.List;

import rx.Subscriber;

public class MainActivity extends AppCompatActivity implements IMainActivityView{
    private TextView LocationResult,location,pm25;
    private Button startLocation;
   // private String permissionInfo;
    private MainPresenter mainPresenter;
    private Utils utils;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏

        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
//        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
//                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
//            window.setNavigationBarColor(Color.TRANSPARENT);
//        }
        setContentView(R.layout.location);



        initViews();


    }


    private void initViews(){
      if(mainPresenter==null) mainPresenter=new MainPresenter(this);
        if(utils==null)utils=new Utils(this);
        location=(TextView)findViewById(R.id.location);
        LocationResult = (TextView) findViewById(R.id.textView1);
        LocationResult.setMovementMethod(ScrollingMovementMethod.getInstance());
        startLocation = (Button) findViewById(R.id.addfence);
        pm25=(TextView)findViewById(R.id.pm25);

    }

    /***
     * Stop location service
     */
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        unregisterListener(); //注销定位监听
        super.onStop();
    }


    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        //获得权限
        utils.getPersimmions();
       // setLocation();
        getWeatherInfo();

        HttpMethods.GetInstance().Request_Forecast("121.6544", "25.1552", new Subscriber<Forecast_WeatherInfo>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Forecast_WeatherInfo weatherInfo) {
             List<Forecast_WeatherInfo.ResultBean.HourlyBean.Pm25Bean> list= weatherInfo.getResult().getHourly().getPm25();
                Log.i("TAG",weatherInfo.getStatus()+" "+list.get(0));
            }
        });

    }

    @Override
    protected void onDestroy() {
        mainPresenter.onDestroy();
        super.onDestroy();
    }



    @Override
    public void setText(String text,int mode) {
        switch (mode){
            case 1:
                location.setText(text); break;
            case 2:
                pm25.setText(text); break;
        }

    }

    @Override
    public void unregisterListener() {
        mainPresenter.unregisterListener();
    }

    @Override
    public void getWeatherInfo() {
        mainPresenter.GetLocationAndWeatherInfo();
    }


}
