package com.androidbelieve.Group8.TinTuc;

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

import com.androidbelieve.Group8.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thuan on 11/20/2016.
 */

public class RelatedAdapter extends RecyclerView.Adapter<RelatedAdapter.RecyclerViewHolder> {
    ContextCompat res;

    private List<Data2> listData = new ArrayList<Data2>();

    public RelatedAdapter(List<Data2> list) {
        this.listData = list;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.vsdfgdsgsdfg, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Data2 item = listData.get(position);
        holder.title1.setText(item.getTitle());
        holder.tag.setText(item.getTag());
        holder.img.setImageResource(item.getImg());
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

        public TextView title1, tag;
        public ImageView img;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            title1 = (TextView) itemView.findViewById(R.id.title1);
            tag = (TextView) itemView.findViewById(R.id.tag);
            img = (ImageView) itemView.findViewById(R.id.cover);
        }


        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }

    }
}
