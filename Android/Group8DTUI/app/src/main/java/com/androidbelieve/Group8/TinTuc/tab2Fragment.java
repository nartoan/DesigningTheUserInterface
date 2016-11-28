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
    private SliderLayout imageSlider;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.tab2recycler);

        imageSlider = (SliderLayout)view.findViewById(R.id.slider);

        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("Hannibal", "http://static2.hypable.com/wp-content/uploads/2013/12/hannibal-season-2-release-date.jpg");
        url_maps.put("Big Bang Theory", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
        url_maps.put("House of Cards", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
        url_maps.put("Game of Thrones", "http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("M.U tính chiêu mộ \"Vua kiến tạo\" NHA ngay tháng Một. Ferdinand chỉ ra 2 mắt xích yếu trong sơ đồ 3-4-3 của Chelsea",R.drawable.hannibal);
        file_maps.put("Người M.U lạc quan về cơ hội vô địch Premier League",R.drawable.bigbang);
        file_maps.put("Ibrahimovic nói gì sau khi được dựng tượng ở Thụy Điển?",R.drawable.house);
        file_maps.put("Chelsea thăng hoa: Đừng quên Pedro", R.drawable.game_of_thrones);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(getActivity());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            imageSlider.addSlider(textSliderView);
        }
        imageSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        imageSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        imageSlider.setCustomAnimation(new DescriptionAnimation());
        imageSlider.setDuration(5000);
        imageSlider.addOnPageChangeListener(this);

        mAdapter = new tab2Recycler(list, getActivity()) {
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
    public void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        imageSlider.stopAutoCycle();
        super.onStop();
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
