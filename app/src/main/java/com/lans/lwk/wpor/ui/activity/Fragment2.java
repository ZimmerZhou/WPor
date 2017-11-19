package com.lans.lwk.wpor.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.Text;
import com.lans.lwk.wpor.model.impl.OnJiRendatChangeListener;
import com.lans.lwk.wpor.ui.view.ForcastView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Fragment2 extends Fragment implements ForcastView{
    // TODO: Rename parameter arguments, choose names that match
        @BindView(R.id.rec_view) RecyclerView recyclerView;
    static String [] timestring={"今天","今天","今天","今天"};
    static String [] weather={"晴朗","晴朗","晴朗","晴朗"};
    static String [] temp={"0","0","0","0"};
    static String [] cheng={"0","0","0","0"};
    MyAdapter adapter;
    private JiRenBean beaninfo;


    public Fragment2() {
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
        View view=inflater.inflate(R.layout.fragment_fragment2, container, false);
        ButterKnife.bind(this,view);

        LinearLayoutManager lay= new  LinearLayoutManager(getContext());
        lay.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lay);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        adapter=new MyAdapter();
        adapter.setOnItemClickLitener(new MyAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                Intent intent=new Intent(getActivity(),Forc_Detail_Activity.class);
                Bundle bundle=new Bundle();
                bundle.putSerializable("bean",beaninfo);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void SetDate(JiRenBean info) {
        beaninfo=info;


        timestring[0]=info.getWeather().get(0).getFuture().get(0).getDate().substring(5);
        timestring[1]=info.getWeather().get(0).getFuture().get(1).getDate().substring(5);
        timestring[2]=info.getWeather().get(0).getFuture().get(2).getDate().substring(5);
        timestring[3]=info.getWeather().get(0).getFuture().get(3).getDate().substring(5);

        weather[0]=info.getWeather().get(0).getFuture().get(0).getText();
        weather[1]=info.getWeather().get(0).getFuture().get(1).getText();
        weather[2]=info.getWeather().get(0).getFuture().get(2).getText();
        weather[3]=info.getWeather().get(0).getFuture().get(3).getText();

        temp[0]=info.getWeather().get(0).getFuture().get(0).getHigh()+"°/"+info.getWeather().get(0).getFuture().get(0).getLow()+"°";
        temp[1]=info.getWeather().get(0).getFuture().get(1).getHigh()+"°/"+info.getWeather().get(0).getFuture().get(1).getLow()+"°";
        temp[2]=info.getWeather().get(0).getFuture().get(2).getHigh()+"°/"+info.getWeather().get(0).getFuture().get(2).getLow()+"°";
        temp[3]=info.getWeather().get(0).getFuture().get(3).getHigh()+"°/"+info.getWeather().get(0).getFuture().get(3).getLow()+"°";

        cheng[0]=info.getWeather().get(0).getFuture().get(0).getWind();
        cheng[1]=info.getWeather().get(0).getFuture().get(1).getWind();
        cheng[2]=info.getWeather().get(0).getFuture().get(2).getWind();


         adapter.notifyDataSetChanged();
    }

    protected  static class MyAdapter extends RecyclerView.Adapter{

        private OnItemClickListener listener;

        public  interface OnItemClickListener{
            void OnItemClick(View view,int position);
        }


        public void setOnItemClickLitener(OnItemClickListener listener){
            this.listener=listener;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.bfragement2_item,parent,false)) {
            };
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

            TextView time = (TextView) holder.itemView.findViewById(R.id.times);
            TextView  situ=ButterKnife.findById(holder.itemView,R.id.situ);
            TextView  fenge=ButterKnife.findById(holder.itemView,R.id.fenge);
            TextView  chengdu=ButterKnife.findById(holder.itemView,R.id.chengdu);
            TextView  wendu=ButterKnife.findById(holder.itemView,R.id.wendu);

              time.setText(timestring[position]);
            situ.setText(weather[position]);
            wendu.setText(temp[position]);
                chengdu.setText(cheng[position]);
//            holder.itemView.setBackgroundColor(Color.BLUE);


            if(listener!=null){
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos=holder.getLayoutPosition();
                        listener.OnItemClick(v,pos);
                    }
                });
            }
        if(position==3){
            time.setText("");
            situ.setText("");
            fenge.setText("查看更多");
            chengdu.setText("");
            wendu.setText("");
        }
        }

        @Override
        public int getItemCount() {
            return 4;
        }
    }


}
