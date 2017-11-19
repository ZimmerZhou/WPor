package com.lans.lwk.wpor.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.impl.OnJiRendatChangeListener;
import com.lans.lwk.wpor.presenter.ForeDetailPresenter;
import com.lans.lwk.wpor.ui.view.IForeDetailView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Forc_Detail_Activity extends AppCompatActivity implements IForeDetailView{
    static String [] dates={"0","0","0","0","0","0","0","0","0","0"};
    static String [] timestamp=new String[10];
    private ForeDetailPresenter presenter;
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
        }
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

            date.setText(dates[position]);
            time.setText(timestamp[position]);
            // holder.itemView.setBackgroundColor(Color.BLUE);
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }
}
