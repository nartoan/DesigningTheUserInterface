package com.androidbelieve.Group8.TinTuc;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.androidbelieve.Group8.R;
import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by trangkute on 11/23/2016.
 */

public class tab2Fragment extends android.support.v4.app.Fragment implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{

    private List<Data_tab2> list = new ArrayList<Data_tab2>();
    private RecyclerView recyclerView;
    private tab2Recycler mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private boolean created = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.tab2recycler);

        mAdapter = new tab2Recycler(list, this) {
            @Override
            public AssetManager getAsset() {
                return getActivity().getAssets();
            }
        };
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener(){

                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(getContext(), mottintuc.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Toast.makeText((Context) getActivity(), "Chạm tay nhau 1s thôi là nhớ nhau cả đời!", Toast.LENGTH_LONG).show();
                    }
                })
        );
        if (!created) addItem();
        return view;
    }

    private void addItem() {
        created = true;
        Data_tab2 item = new Data_tab2(R.drawable.tab2_1,"MU - West Ham: Mourinho hưng phấn đón \"Búa tạ\"");
        list.add(item);
        item = new Data_tab2(R.drawable.tab2_2,"Chelsea - Tottenham: Bước ngoặt tuyệt tác cứa lòng");
        list.add(item);
        item = new Data_tab2(R.drawable.tab2_3,"Arsenal: Xhaka, nguy cơ từ đắt giá thành hàng hớ");
        list.add(item);
        item = new Data_tab2(R.drawable.tab2_4,"Góc chiến thuật Chelsea – Tottenham: Xuất thần và bản lĩnh");
        list.add(item);
        item = new Data_tab2(R.drawable.tab2_5,"Chelsea bay trên đỉnh, Conte chưa dám mơ vô địch");
        list.add(item);
        item = new Data_tab2(R.drawable.tab2_6,"Lên số 1, Chelsea chờ \"xả thịt\" Tottenham lẫn Man City");
        list.add(item);
        item = new Data_tab2(R.drawable.tab2_7,"Liverpool - Sunderland: Nghẹt thở tại Anfield");
        list.add(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
        Log.e("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
}
