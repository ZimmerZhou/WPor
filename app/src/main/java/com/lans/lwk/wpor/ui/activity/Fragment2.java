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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lans.lwk.wpor.R;
import com.lans.lwk.wpor.model.entity.Forecast_WeatherInfo;
import com.lans.lwk.wpor.model.entity.JiRenBean;
import com.lans.lwk.wpor.model.entity.Text;
import com.lans.lwk.wpor.model.impl.OnJiRendatChangeListener;
import com.lans.lwk.wpor.ui.view.ForcastView;
import com.squareup.picasso.Picasso;

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
    private static Context context;


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=getContext();

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
    for(int i=0;i<3;i++){

        timestring[i]=info.getWeather().get(0).getFuture().get(i).getDate().substring(5);

        weather[i]=info.getWeather().get(0).getFuture().get(i).getText().replace("/","转");


        temp[i]=info.getWeather().get(0).getFuture().get(i).getHigh()+"°/"+info.getWeather().get(0).getFuture().get(i).getLow()+"°";

        cheng[i]=info.getWeather().get(0).getFuture().get(i).getWind();
    }
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
