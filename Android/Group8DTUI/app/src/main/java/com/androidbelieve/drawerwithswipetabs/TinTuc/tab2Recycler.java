package com.androidbelieve.drawerwithswipetabs.TinTuc;

import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidbelieve.drawerwithswipetabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trangkute on 11/23/2016.
 */

public class tab2Recycler extends RecyclerView.Adapter<tab2Recycler.RViewHolder>{

    private final static int HEADER_VIEW = 0;
    private final static int CONTENT_VIEW = 1;
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
    public int getItemViewType(int position){
        switch (position){
            case 0:
                return HEADER_VIEW;
            default:
                return CONTENT_VIEW;
        }
    }


    @Override
    public RViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int layourRes = 0;
        switch (viewType){
            case HEADER_VIEW:
                layourRes = R.layout.header_tab2;
                break;
            case CONTENT_VIEW:
                layourRes = R.layout.tinhot;
                break;
        }

        View view = LayoutInflater.from(parent.getContext()).inflate(layourRes,parent, false);
        return new RViewHolder(view);
    }

    @Override   //truyen anh
    public void onBindViewHolder(RViewHolder holder, int position) {
        if(holder.imgHeader != null){
            holder.imgHeader.setImageResource(R.drawable.background_material_red);
        }
        else {
            Data_tab2 item = list.get(position);
            holder.text.setText(item.getText());
            holder.img.setImageResource(item.getImg());
        }
        Log.e("position: ", String.valueOf(getItemViewType(position)));
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
            text = (TextView) view.findViewById(R.id.texttintuc);
            imgHeader = (ImageView) view.findViewById(R.id.imgHeader);
        }
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
    }
}
