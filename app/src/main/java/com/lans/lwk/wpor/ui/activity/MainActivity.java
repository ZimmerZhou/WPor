package com.lans.lwk.wpor.ui.activity;



import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lans.lwk.wpor.R;

import com.lans.lwk.wpor.configs.MyView;
import com.lans.lwk.wpor.presenter.MainPresenter;
import com.lans.lwk.wpor.ui.view.IMainActivityView;
import com.lans.lwk.wpor.util.Utils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IMainActivityView,View.OnClickListener{
    private TextView LocationResult;
    private Button startLocation;
    private MainPresenter mainPresenter;
    private Utils utils;
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

    TempLChar tempLChar;
    Fragment2 forcast;
    QualityFragement qualityFragement;
    private TextView tvs[];
    private List<Fragment> fragments=new ArrayList<>();
    private MyPagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏

        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
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



        fragments.add(tempLChar=new TempLChar());
        fragments.add(forcast=new Fragment2());
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
       //getWeatherInfo();
        GetLocation();


    }

    @Override
    protected void onDestroy() {
        mainPresenter.onDestroy();
        super.onDestroy();
    }


    @Override
    public void setBackGround() {
        relativeLayout.setBackgroundResource(R.drawable.weather2);
    }

    @Override
    public void setText(String text,MyView mode) {
        switch (mode){
            case LOCATION:
                location.setText(text); break;
            case PM25:
                aqilty.setText(text); break;
            case TEMPERATURE:
                temp.setText(text); break;
            case WEATHER:
            Skycon.setText(text); break;
            case WIND_DIRECT:
                feng.setText(text); break;
            case HUMIDITY:
                humidity.setText(text); break;
            case AQI:
                aqi.setText(text); break;

        }

    }

    @Override
    public void showDialog(String message) {
        dialog.setMessage(message);
        dialog.show();
    }

    @Override
    public void hideDialog() {
        dialog.hide();
    }

    @Override
    public void unregisterListener() {
        mainPresenter.unregisterListener();
    }

    @Override
    public void getWeatherInfo() {

    }

    @Override
    public TempLChar GetTempLChar() {
        return tempLChar;
    }

    @Override
    public Fragment2 GetForcast() {
        return forcast;
    }

    @Override
    public QualityFragement GetQualityFragement() {
        return qualityFragement;
    }

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
