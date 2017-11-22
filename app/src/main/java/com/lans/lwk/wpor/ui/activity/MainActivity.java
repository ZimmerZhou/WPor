package com.lans.lwk.wpor.ui.activity;



import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.configs.MyView;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.presenter.MainPresenter;
import com.lans.lwk.wpor.ui.view.IMainActivityView;
import com.lans.lwk.wpor.util.Utils;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;



public class MainActivity extends AppCompatActivity implements IMainActivityView,View.OnClickListener{
    //MainPresenter
    private MainPresenter mainPresenter;
    //工具类，主要用于权限的请求
    private Utils utils;
    //加载Dialog
    private ProgressDialog dialog;

    @BindView(R.id.relalayout) RelativeLayout relativeLayout;
    @BindView(R.id.act_main_lin1) LinearLayout lin1;
    @BindView(R.id.act_main_lin2) LinearLayout lin2;
    @BindView(R.id.act_main_lin3) LinearLayout lin3;
    @BindView(R.id.act_main_vp)  ViewPager viewPager;

    @BindView(R.id.location) TextView location;
    @BindView(R.id.aqilty) TextView aqilty;

    @BindView(R.id.act_main_tv1) TextView tv1;
    @BindView(R.id.act_main_tv2) TextView tv2;
    @BindView(R.id.act_main_tv3) TextView tv3;
    @BindView(R.id.temp) TextView temp;
    @BindView(R.id.Skycon) TextView Skycon;
    @BindView(R.id.feng) TextView feng;
    @BindView(R.id.humidity) TextView humidity;
    @BindView(R.id.aqi) TextView aqi;
    //温度折线显示fragement
    TempLChar tempLChar;
    //预报信息显示Fragement
    ForCastFragement forcast;
    //指数相关Fragement
    QualityFragement qualityFragement;
    private TextView tvs[];
    private List<Fragment> fragments=new ArrayList<>();
    private MyPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);


        setContentView(R.layout.location);
        ButterKnife.bind(this);
        getSupportActionBar().hide();
        initViews();
        showDialog("获取信息中");



    }


    private void initViews(){
        dialog=new ProgressDialog(this);
        dialog.setTitle("提示");
        dialog.setCancelable(false);

      if(mainPresenter==null) mainPresenter=new MainPresenter(this);
        if(utils==null)utils=new Utils(this);


        //初始化Fragement
        fragments.add(tempLChar=new TempLChar());
        fragments.add(forcast=new ForCastFragement());
        fragments.add(qualityFragement=new QualityFragement());


        tvs=new TextView[]{tv1,tv2,tv3};

        pagerAdapter=new MyPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);

        viewPager.setOffscreenPageLimit(3);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                    setItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });





    }



    /**
     * 设置显示的页面
     *
     * @param index 下标
     */
    private void setItem(int index) {
        for (int i = 0; i < 3; i++) {
            if (i == index) {

                tvs[i].setTextColor(Color.BLACK);
            } else {

                tvs[i].setTextColor(Color.GRAY);
            }
        }
    }

    /***
     * 停止定位服务
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
        //发起定位
        GetLocation();


    }

    @Override
    protected void onDestroy() {
        mainPresenter.onDestroy();
        super.onDestroy();
    }

    /**
     * 将info传给TempChar
     * @param info
     */
    @Override
    public void Temp_Request(City_Info info) {
        GetTempLChar().RequestForcase(info);
    }

    /**
     * 设置天气背景
     */
    @Override
    public void setBackGround() {
        relativeLayout.setBackgroundResource(R.drawable.weather2);
    }

    /**
     * 根据不同的mode设置页面要显示的内容
     * @param text
     * @param mode
     */
    @Override
    public void setText(String text,MyView mode) {
        switch (mode){
            case LOCATION:
                location.setText(text); break;
            case AQI:
                aqilty.setText(text); break;
            case TEMPERATURE:
                temp.setText(text); break;
            case WEATHER:
            Skycon.setText(text); break;
            case WIND_DIRECT:
                feng.setText(text); break;
            case HUMIDITY:
                humidity.setText(text); break;
            case FEELLIKE:
                aqi.setText(text); break;

        }

    }
    //显示加载Dialog
    @Override
    public void showDialog(String message) {
        dialog.setMessage(message);
        dialog.show();
    }
    //隐藏D
    @Override
    public void hideDialog() {
        dialog.hide();
    }
    //注销定位监听
    @Override
    public void unregisterListener() {
        mainPresenter.unregisterListener();
    }

    //返回TempLChar
    @Override
    public TempLChar GetTempLChar() {
        return tempLChar;
    }
    //返回ForcastFragement
    @Override
    public ForCastFragement GetForcast() {
        return forcast;
    }
    //返回QualityFragement
    @Override
    public QualityFragement GetQualityFragement() {
        return qualityFragement;
    }

    /**
     * 发起定位
     */
    @Override
    public void GetLocation() {
        mainPresenter.GetLocation();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_main_lin1:
                setItem(0);
                viewPager.setCurrentItem(0);
                break;
            case R.id.act_main_lin2:
                setItem(1);
                viewPager.setCurrentItem(1);
                break;
            case R.id.act_main_lin3:
                setItem(2);
                viewPager.setCurrentItem(2);
                break;
        }
    }


    class MyPagerAdapter extends FragmentPagerAdapter{

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
