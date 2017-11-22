package com.lans.lwk.wpor.ui.activity;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.JiRenBean.WeatherBean.NowBean.AirQualityBean.CityBean;

import butterknife.BindView;
import butterknife.ButterKnife;


public class QualityFragement extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    @BindView(R.id.recycle_view) RecyclerView recyclerView;
    @BindView(R.id.aqi) TextView aqi;
    @BindView(R.id.pm25) TextView pm25;
    @BindView(R.id.pm10) TextView pm10;
    @BindView(R.id.so2) TextView so2;
    @BindView(R.id.no2) TextView no2;
    @BindView(R.id.co) TextView co;
    @BindView(R.id.o3) TextView o3;
    static String[] values=new String[6];
    private MyAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_quality_fragement, container, false);
        ButterKnife.bind(this,view);

        LinearLayoutManager lay= new  LinearLayoutManager(getContext());
        lay.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(lay);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter=new MyAdapter());



        return view;
    }


    public void setDate(JiRenBean info){
       CityBean bean=info.getWeather().get(0).getNow().getAir_quality().getCity();
        aqi.setText(bean.getAqi());
        pm25.setText(bean.getPm25());
       pm10.setText(bean.getPm10());
        so2.setText(bean.getSo2());
      no2.setText(bean.getNo2());
        co.setText(bean.getCo());
       o3.setText(bean.getO3());
       JiRenBean.WeatherBean.TodayBean.SuggestionBean suggestion= info.getWeather().get(0).getToday().getSuggestion();

            values[0]="穿衣："+suggestion.getDressing().getBrief()+"  "+suggestion.getDressing().getDetails();
            values[1]="运动："+suggestion.getSport().getBrief()+"  "+suggestion.getSport().getDetails();
            values[2]="洗车："+suggestion.getCar_washing().getBrief()+"  "+suggestion.getCar_washing().getDetails();
            values[3]="影响："+suggestion.getFlu().getBrief()+"  "+suggestion.getFlu().getDetails();
            values[4]="辐射："+suggestion.getUv().getBrief()+"  "+suggestion.getUv().getDetails();
            values[5]="旅游："+suggestion.getTravel().getBrief()+"  "+suggestion.getTravel().getDetails();



        adapter.notifyDataSetChanged();

    }

    private class MyAdapter extends RecyclerView.Adapter{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.quality_details,parent,false)) {
            };
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            TextView tv = (TextView) holder.itemView.findViewById(R.id.quali);
             tv.setText(values[position]);

        }

        @Override
        public int getItemCount() {
            return 6;
        }
    }

}
