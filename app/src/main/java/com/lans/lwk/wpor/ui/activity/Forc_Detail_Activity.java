package com.lans.lwk.wpor.ui.activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.ui.view.IForeDetailView;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Forc_Detail_Activity extends AppCompatActivity implements IForeDetailView{
    //时间  周三/周四
    static String [] dates=new String[10];
    //日期 11-12/11-13
    static String [] timestamp=new String[10];
    //天气图片（上部）
    static String [] imageview=new String[10];
    //天气图片（下部）
    static String [] imagebott=new String[10];
    //天气情况   多云/阴
    static String [][] weatherinfo=new String[10][2];
    //风力等级
    static String [] windsc=new String[10];
    //温度下限
    static String [] templow=new String[10];
    //温度上限
    static String [] temp=new String[10];
    //recycleview适配器
    private MyAdapter  adapter;
    //天气
    private JiRenBean info;
    @BindView(R.id.recycle) RecyclerView re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forc__detail_);

        getSupportActionBar().hide();
        ButterKnife.bind(this);
        LinearLayoutManager lay= new  LinearLayoutManager(this);
        lay.setOrientation(LinearLayoutManager.HORIZONTAL);

        re.setLayoutManager(lay);
        re.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));
        re.setAdapter(adapter=new MyAdapter());
        info=(JiRenBean) getIntent().getSerializableExtra("bean");

        DateTime();



    }



    /**
     * 设置recycleview显示的数据
     */
    private void DateTime(){
        for(int i=0;i<10;i++){
            dates[i]=info.getWeather().get(0).getFuture().get(i).getDay();
            timestamp[i]=info.getWeather().get(0).getFuture().get(i).getDate().substring(5);
            imageview[i]=info.getWeather().get(0).getFuture().get(i).getCode1();
            imagebott[i]=info.getWeather().get(0).getFuture().get(i).getCode2();
            weatherinfo[i]=info.getWeather().get(0).getFuture().get(i).getText().split("/");
            windsc[i]=info.getWeather().get(0).getFuture().get(i).getWind();
            temp[i]=info.getWeather().get(0).getFuture().get(i).getHigh();
            templow[i]=info.getWeather().get(0).getFuture().get(i).getLow();
        }
        dates[0]="今天";
    }

    @Override
    public Forc_Detail_Activity GetForActivity() {
        return this;
    }


    public  class MyAdapter extends RecyclerView.Adapter<MyAdapter.BaseLayout>{

        @Override
        public MyAdapter.BaseLayout onCreateViewHolder(ViewGroup holder, int viewType) {
            View view=LayoutInflater.from(holder.getContext()).inflate(R.layout.detail_for,holder,false);
            BaseLayout layout=new BaseLayout(view);
            return layout;
        }



        @Override
        public void onBindViewHolder(MyAdapter.BaseLayout holder, int position) {

           holder.date.setText(dates[position]);
            holder. time.setText(timestamp[position]);
            Picasso.with(getApplicationContext()).load(Uri.parse("http://weixin.jirengu.com/images/weather/code/"+imageview[position]+".png")).resize(100,100).into(holder.imageView);
            holder. weather.setText(weatherinfo[position][0]);
            holder. weathbottom.setText(weatherinfo[position][1]);
            Picasso.with(getApplicationContext()).load(Uri.parse("http://weixin.jirengu.com/images/weather/code/"+imagebott[position]+".png")).resize(100,100).into(holder.imageviewbottom);
            holder. wind.setText(windsc[position]);
            holder. temphigh.setText(temp[position]+"°");
            holder. low.setText(templow[position]+"°");

        }

        @Override
        public int getItemCount() {
            return 10;
        }

         class BaseLayout extends RecyclerView.ViewHolder{
            @BindView(R.id.date) TextView date;
             @BindView(R.id.timestamp) TextView time;
             @BindView(R.id.imageview) ImageView imageView;
             @BindView(R.id.imageviewbottom) ImageView imageviewbottom;
             @BindView(R.id.textss) TextView weather;
             @BindView(R.id.weathbottom) TextView weathbottom;
             @BindView(R.id.wind) TextView wind;
             @BindView(R.id.temphigh) TextView temphigh;
             @BindView(R.id.templow) TextView low;

            public BaseLayout(View itemView) {
                super(itemView);
                ButterKnife.bind(this,itemView);
            }
        }

    }

}
