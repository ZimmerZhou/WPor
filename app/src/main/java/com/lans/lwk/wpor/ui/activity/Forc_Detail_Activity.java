package com.lans.lwk.wpor.ui.activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.impl.OnJiRendatChangeListener;
import com.lans.lwk.wpor.presenter.ForeDetailPresenter;
import com.lans.lwk.wpor.ui.view.IForeDetailView;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Forc_Detail_Activity extends AppCompatActivity implements IForeDetailView{
    static String [] dates={"0","0","0","0","0","0","0","0","0","0"};
    static String [] timestamp=new String[10];
    static String [] imageview=new String[10];
    static String [] imagebott=new String[10];
    static String [][] weatherinfo=new String[10][2];
    static String [] windsc=new String[10];
    static String [] templow=new String[10];
    static String [] temp=new String[10];
    private MyAdapter  adapter;
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

    @Override
    public  void setDate(JiRenBean info) {
        dates[0]=info.getWeather().get(0).getFuture().get(0).getDay();
        dates[0]=info.getWeather().get(0).getFuture().get(1).getDay();
        dates[0]=info.getWeather().get(0).getFuture().get(2).getDay();

        adapter.notifyDataSetChanged();
    }

    private void DateTime(){
        for(int i=0;i<10;i++){
            dates[i]=info.getWeather().get(0).getFuture().get(i).getDay();
            timestamp[i]=info.getWeather().get(0).getFuture().get(i).getDate().substring(5);
            String id=info.getWeather().get(0).getFuture().get(i).getCode1();
            imageview[i]=id;
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


    private class MyAdapter extends RecyclerView.Adapter{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_for,parent,false)) {
            };
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            TextView date=ButterKnife.findById(holder.itemView,R.id.date);
            TextView time=ButterKnife.findById(holder.itemView,R.id.timestamp);
            ImageView imageView=ButterKnife.findById(holder.itemView,R.id.imageview);
            ImageView imageviewbottom=ButterKnife.findById(holder.itemView,R.id.imageviewbottom);
            TextView weather=ButterKnife.findById(holder.itemView,R.id.textss);
            TextView weathbottom=ButterKnife.findById(holder.itemView,R.id.weathbottom);
            TextView wind=ButterKnife.findById(holder.itemView,R.id.wind);
            TextView temphigh=ButterKnife.findById(holder.itemView,R.id.temphigh);
            TextView low=ButterKnife.findById(holder.itemView,R.id.templow);

            date.setText(dates[position]);
            time.setText(timestamp[position]);
            Picasso.with(getApplicationContext()).load(Uri.parse("http://weixin.jirengu.com/images/weather/code/"+imageview[position]+".png")).resize(100,100).into(imageView);
            weather.setText(weatherinfo[position][0]);
            weathbottom.setText(weatherinfo[position][1]);
            Picasso.with(getApplicationContext()).load(Uri.parse("http://weixin.jirengu.com/images/weather/code/"+imagebott[position]+".png")).resize(100,100).into(imageviewbottom);
            wind.setText(windsc[position]);
            temphigh.setText(temp[position]+"°");
            low.setText(templow[position]+"°");
            // holder.itemView.setBackgroundColor(Color.BLUE);
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }

    private int GetImageId(String code){

        return 0;
    }
}
