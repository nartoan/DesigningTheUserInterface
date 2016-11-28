package com.androidbelieve.drawerwithswipetabs.LichThiDau;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidbelieve.drawerwithswipetabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thuan on 11/20/2016.
 */

public class MatchRecyclerAdapter extends RecyclerView.Adapter<MatchRecyclerAdapter.RecyclerViewHolder> {
    ContextCompat res;

    private List<Data_match> listData = new ArrayList<Data_match>();

    public MatchRecyclerAdapter(List<Data_match> list) {
        this.listData = list;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_match, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Data_match item = listData.get(position);
        holder.img1.setImageResource(item.getImg1());
        holder.name1.setText(item.getName1());
        holder.time.setText(item.getTime());
        holder.name2.setText(item.getName2());
        holder.img2.setImageResource(item.getImg2());
        holder.mLayout.setBackgroundResource(item.getBackground());

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


        public TextView name1, name2, time;
        public ImageView img1, img2;
        public Button alarm;
        LinearLayout mLayout;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            alarm = (Button) itemView.findViewById(R.id.alarm);
            img1 = (ImageView) itemView.findViewById(R.id.doibong1);
            name1 = (TextView) itemView.findViewById(R.id.tendoi1);
            time = (TextView) itemView.findViewById(R.id.time);
            name2 = (TextView) itemView.findViewById(R.id.tendoi2);
            img2 = (ImageView) itemView.findViewById(R.id.doibong2);
            mLayout = (LinearLayout) itemView.findViewById(R.id.itemlayout_match);

            alarm.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
                    String title = name1.getText() + " vs " + name2.getText();
                    i.putExtra(AlarmClock.EXTRA_MESSAGE, title);
                    String _time = (String) time.getText().subSequence(6,11);
                    Integer _hour = Integer.parseInt((String) _time.subSequence(0,2));
                    Integer _minute = Integer.parseInt((String) _time.subSequence(3,5));
                    i.putExtra(AlarmClock.EXTRA_HOUR, _hour);
                    i.putExtra(AlarmClock.EXTRA_MINUTES, _minute);
                    v.getContext().startActivity(i);
                }
            });
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
