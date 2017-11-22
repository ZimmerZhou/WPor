package com.lans.lwk.wpor.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.configs.CharConfig;
import com.lans.lwk.wpor.model.entity.City_Info;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.presenter.TempPresenter;
import com.lans.lwk.wpor.ui.view.ITempView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;


public class TempLChar extends Fragment implements ITempView{
    @BindView(R.id.line_chart) LineChartView lineChart;
    @BindView(R.id.tmp_des) TextView tmp_des;
    private TempPresenter presenter=new TempPresenter(this);

    //折线图点坐标
    private List<PointValue> mPointValues = new ArrayList<PointValue>();
    //折线图X轴坐标
    private List<AxisValue> mAxisXValues = new ArrayList<AxisValue>();


    public TempLChar() {
        // Required empty public constructor
    }

 

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_fragment1, container, false);
        ButterKnife.bind(this,view);
        return view;
    }


    //加载折线图
    @Override
    public void setDate( Forecast_WeatherInfo info) {

        CharConfig.initLineChart(lineChart,mPointValues,mAxisXValues,info.getResult().getHourly().getTemperature());//初始化
    }
    //设置穿衣建议内容
    @Override
    public void setText(String text,int id) {
        switch (id){
            case 1:
                tmp_des.setText(text); break;

        }
    }
    //请求得到预报信息
    @Override
    public void RequestForcase(City_Info info) {
        presenter.GetForcaseInfo(info);
    }
}
