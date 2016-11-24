package com.androidbelieve.drawerwithswipetabs.BXH;

import android.content.DialogInterface;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidbelieve.drawerwithswipetabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thuan on 11/20/2016.
 */

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.RecyclerViewHolder> {
    ContextCompat res;

    private List<Data> listData = new ArrayList<Data>();

    public CustomRecyclerAdapter(List<Data> list) {
        this.listData = list;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.itembxh, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Data item = listData.get(position);
        holder.vitri.setText(item.getVitri());
        holder.img.setImageResource(item.getImg());
        holder.tendoibong.setText(item.getTendoibong());
        holder.sotran.setText(item.getSotran());
        holder.hieuso.setText(item.getHieuso());
        holder.diem.setText(item.getDiem());
        holder.mLayout.setBackgroundResource(item.getBackground());
        holder.cardview.setCardBackgroundColor(item.getBackground());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }


    /**
     * ViewHolder for item view of list
     */

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements
            DialogInterface.OnClickListener {


        public TextView vitri, tendoibong, sotran, hieuso, diem;
        public ImageView img;
        LinearLayout mLayout;
        public CardView cardview;


        public RecyclerViewHolder(View itemView) {
            super(itemView);

            vitri = (TextView) itemView.findViewById(R.id.vitri);
            tendoibong = (TextView) itemView.findViewById(R.id.tendoibong);
            sotran = (TextView) itemView.findViewById(R.id.sotran);
            hieuso = (TextView) itemView.findViewById(R.id.hieuso);
            diem = (TextView) itemView.findViewById(R.id.diem);
            mLayout = (LinearLayout) itemView.findViewById(R.id.itemlayout);
            img = (ImageView) itemView.findViewById(R.id.doibong);
            cardview =(CardView) itemView.findViewById(R.id.cardview);

            // set listener for button delete
            //btnDelete.setOnClickListener(this);

        }


        @Override
        public void onClick(DialogInterface dialogInterface, int i) {


        }

        /*// remove item when click button delete
        @Override
        public void onClick(View v) {
            removeItem(getAdapterPosition());
        }
        */
    }
}
