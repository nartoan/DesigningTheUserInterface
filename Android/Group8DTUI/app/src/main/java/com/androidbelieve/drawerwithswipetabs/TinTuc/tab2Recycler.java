package com.androidbelieve.drawerwithswipetabs.TinTuc;

import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidbelieve.drawerwithswipetabs.Main.MainActivity;
import com.androidbelieve.drawerwithswipetabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trangkute on 11/23/2016.
 */

public abstract class tab2Recycler extends RecyclerView.Adapter<tab2Recycler.RViewHolder> implements GetAssetInterface {


    private List<Data_tab2> list = new ArrayList<Data_tab2>();

    public  tab2Recycler (List<Data_tab2> list){
        this.list = list;
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
    public RViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.tinhot, parent, false);
        return new RViewHolder(itemView);
    }

    @Override   //truyen anh
    public void onBindViewHolder(RViewHolder holder, int position) {

            Data_tab2 item = list.get(position);
            holder.text.setText(item.getText());
            Typeface typeface = Typeface.createFromAsset(getAsset(),"fonts/Roboto-Black.ttf");
            holder.text.setTypeface(typeface);
            holder.img.setImageResource(item.getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RViewHolder extends RecyclerView.ViewHolder implements DialogInterface.OnClickListener{

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

}