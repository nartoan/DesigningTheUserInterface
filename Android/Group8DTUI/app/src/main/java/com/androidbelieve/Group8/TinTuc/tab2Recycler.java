package com.androidbelieve.Group8.TinTuc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidbelieve.Group8.R;
import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by trangkute on 11/23/2016.
 */

public abstract class tab2Recycler extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements GetAssetInterface {

    public static final int TYPE_HEADER = 1;
    public static final int TYPE_ITEM = 2;

    Context context;
    tab2Fragment tab2Fragment;
    private List<Data_tab2> list = new ArrayList<Data_tab2>();

    public tab2Recycler(List<Data_tab2> list, tab2Fragment tab2Fragment){
        this.list = list;
        this.tab2Fragment = tab2Fragment;
        this.context = tab2Fragment.getActivity();
    }

    public class ViewHolder0 extends RViewHolder{
        public ViewHolder0(View itemView){
            super(itemView);
        }
    }

    /*
    @Override
    public RViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.tinhot, parent, false);
        return new RViewHolder(itemView);
    }*/


    @Override
    public int getItemViewType(int position) {
        return position == 0 ? TYPE_HEADER : TYPE_ITEM;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == TYPE_ITEM) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View itemView = inflater.inflate(R.layout.tinhot, parent, false);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, mottintuc.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //context.startActivity(intent);
                }
            });
            return new RViewHolder(itemView);
        } else {
            View convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.tab2header, parent, false);
            return new RViewHolderHeader(convertView);
        }
    }

    @Override   //truyen anh
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position) == TYPE_ITEM) {
            RViewHolder viewHolder = (RViewHolder) holder;
            Data_tab2 item = list.get(position);
            viewHolder.text.setText(item.getText());
            Typeface typeface = Typeface.createFromAsset(getAsset(), "fonts/Roboto-Black.ttf");
            viewHolder.text.setTypeface(typeface);
            viewHolder.img.setImageResource(item.getImg());
        } else {
            RViewHolderHeader viewHolder = (RViewHolderHeader) holder;
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
                TextSliderView textSliderView = new TextSliderView(tab2Fragment.getActivity());
                // initialize a SliderLayout
                textSliderView
                        .description(name)
                        .image(file_maps.get(name))
                        .setScaleType(BaseSliderView.ScaleType.Fit)
                        .setOnSliderClickListener(tab2Fragment);

                //add your extra information
                textSliderView.bundle(new Bundle());
                textSliderView.getBundle()
                        .putString("extra",name);

                viewHolder.sliderLayout.addSlider(textSliderView);
            }
            viewHolder.sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
            viewHolder.sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
            viewHolder.sliderLayout.setCustomAnimation(new DescriptionAnimation());
            viewHolder.sliderLayout.setDuration(5000);
            viewHolder.sliderLayout.addOnPageChangeListener(tab2Fragment);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class RViewHolder extends RecyclerView.ViewHolder implements DialogInterface.OnClickListener{

        ImageView img;
        TextView text;

        //header image
        ImageView imgHeader;
        public RViewHolder (View view){
            super(view);
            img = (ImageView) view.findViewById(R.id.anhtintuc);
            text = (TextView) view.findViewById(R.id.titlenews);

        }
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
    }

    public static class RViewHolderHeader extends RecyclerView.ViewHolder {

        SliderLayout sliderLayout;

        public RViewHolderHeader(View itemView) {
            super(itemView);
            sliderLayout = (SliderLayout) itemView.findViewById(R.id.slider);
        }
    }



}
