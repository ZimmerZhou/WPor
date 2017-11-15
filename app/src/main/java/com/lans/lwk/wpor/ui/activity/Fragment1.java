package com.lans.lwk.wpor.ui.activity;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.configs.CharConfig;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.gesture.ContainerScrollType;
import lecho.lib.hellocharts.gesture.ZoomType;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.ValueShape;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.Chart;
import lecho.lib.hellocharts.view.LineChartView;


public class Fragment1 extends Fragment {
    String[] date = {"1:00","2:00","3:00","4:00","5:00","6:00","7:00","8:00","9:00","10:00",
            "11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00",
            "21:00","22:00","23:00","24:00"};//X轴的标注
    int[] points= {50,42,20,33,10,10,22,18,40,20,21,22,23,24,25,26,27,28,29,30,21,22,23,24};//图表的数据点
    private List<PointValue> mPointValues = new ArrayList<PointValue>();
    private List<AxisValue> mAxisXValues = new ArrayList<AxisValue>();

    private LineChartView lineChart;
    public Fragment1() {
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
        lineChart=(LineChartView)view.findViewById(R.id.line_chart);

        CharConfig.initLineChart(lineChart,mPointValues,mAxisXValues,date,points);//初始化
        return view;
    }







}
