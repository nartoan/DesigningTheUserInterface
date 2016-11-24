package com.androidbelieve.drawerwithswipetabs.LichThiDau;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidbelieve.drawerwithswipetabs.LichThiDau.Data_match;
import com.androidbelieve.drawerwithswipetabs.LichThiDau.MatchRecyclerAdapter;
import com.androidbelieve.drawerwithswipetabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ratan on 7/29/2015.
 */
public class tab1Fragment extends Fragment {

    private List<Data_match> list = new ArrayList<Data_match>();
    private RecyclerView recyclerView;
    private MatchRecyclerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private boolean created = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, null);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_match);

        mAdapter = new MatchRecyclerAdapter(list);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        if (!created) addItem();
        return view;
    }


    public void addItem() {

        created = true;

        Data_match item = new Data_match("Swansea City","Sunderland","20:00",R.drawable.alarm,R.drawable.swansea,R.drawable.sunderland,R.color.last);
        list.add(0, item);

        item = new Data_match("Liverpool","Sunderland","22:00",R.drawable.alarm,R.drawable.liverpool,R.drawable.sunderland,R.color.last);
        list.add(0,item);

        item = new Data_match("Hull City","Leicester City","01:45",R.drawable.alarm,R.drawable.hull,R.drawable.leicester,R.color.last);
        list.add(0,item);

        item = new Data_match("Swansea City","Sunderland","20:00",R.drawable.alarm,R.drawable.swansea,R.drawable.sunderland,R.color.last);
        list.add(0, item);

        item = new Data_match("Bournemoth","Sunderland","18:00",R.drawable.alarm,R.drawable.bournemouth,R.drawable.sunderland,R.color.last);
        list.add(0,item);

        item = new Data_match("Burnley","Manchester city","01:45",R.drawable.alarm,R.drawable.burnley,R.drawable.mc,R.color.last);
        list.add(0,item);

        item = new Data_match("Manchester city","Watford","01:45",R.drawable.alarm,R.drawable.mc,R.drawable.watford,R.color.last);
        list.add(0,item);

        item = new Data_match("Everton","Sunderland","16:00",R.drawable.alarm,R.drawable.everton,R.drawable.sunderland,R.color.last);
        list.add(0,item);

        item = new Data_match("Chelsea","Manchester United","04:30",R.drawable.alarm,R.drawable.chelsea,R.drawable.mu,R.color.last);
        list.add(0,item);

        item = new Data_match("Manchester city","Arsenal","01:45",R.drawable.alarm,R.drawable.mc,R.drawable.arsenal,R.color.last);
        list.add(0,item);

        item = new Data_match("Tottenham Hotspur","Everton","23:00",R.drawable.alarm,R.drawable.tottenham,R.drawable.everton,R.color.last);
        list.add(0,item);

        item = new Data_match("Stoke City","West Ham United","16:00",R.drawable.alarm,R.drawable.stoke,R.drawable.westham,R.color.last);
        list.add(0,item);


    }
}
