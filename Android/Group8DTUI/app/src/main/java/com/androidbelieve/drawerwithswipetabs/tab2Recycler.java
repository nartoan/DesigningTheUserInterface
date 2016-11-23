package com.androidbelieve.drawerwithswipetabs;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trangkute on 11/23/2016.
 */

public class tab2Recycler extends RecyclerView.Adapter<tab2Recycler.RViewHolder>{

    private List<Data_tab2> list = new ArrayList<Data_tab2>();

    public  tab2Recycler (List<Data_tab2> list){
        this.list = list;
    }

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
        holder.img.setImageResource(item.getImg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RViewHolder extends RecyclerView.ViewHolder implements DialogInterface.OnClickListener{

        ImageView img;
        TextView text;
        public RViewHolder (View view){
            super(view);
            img = (ImageView) view.findViewById(R.id.anhtintuc);
            text = (TextView) view.findViewById(R.id.texttintuc);
        }
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
    }
}
