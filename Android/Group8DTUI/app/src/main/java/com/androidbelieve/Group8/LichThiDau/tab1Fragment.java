package com.androidbelieve.Group8.LichThiDau;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidbelieve.Group8.R;

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

        Data_match item = new Data_match("Swansea City","Sunderland","23/12\n23:00",R.drawable.alarm,R.drawable.swansea,R.drawable.sunderland,R.color.last);
        list.add(0, item);

        item = new Data_match("Liverpool","Sunderland","23/12\n21:00",R.drawable.alarm,R.drawable.liverpool,R.drawable.sunderland,R.color.last);
        list.add(0,item);

        item = new Data_match("Hull City","Leicester City","23/12\n04:00",R.drawable.alarm,R.drawable.hull,R.drawable.leicester,R.color.last);
        list.add(0,item);

        item = new Data_match("Swansea City","Sunderland","23/12\n01:45",R.drawable.alarm,R.drawable.swansea,R.drawable.sunderland,R.color.last);
        list.add(0, item);

        item = new Data_match("Bournemoth","Sunderland","22/12\n23:00",R.drawable.alarm,R.drawable.bournemouth,R.drawable.sunderland,R.color.last);
        list.add(0,item);

        item = new Data_match("Burnley","Manchester city","22/12\n21:00",R.drawable.alarm,R.drawable.burnley,R.drawable.mc,R.color.last);
        list.add(0,item);

        item = new Data_match("Manchester city","Watford","22/12\n04:30",R.drawable.alarm,R.drawable.mc,R.drawable.watford,R.color.last);
        list.add(0,item);

        item = new Data_match("Everton","Sunderland","22/12\n01:45",R.drawable.alarm,R.drawable.everton,R.drawable.sunderland,R.color.last);
        list.add(0,item);

        item = new Data_match("Chelsea","Manchester United","21/12\n23:00",R.drawable.alarm,R.drawable.chelsea,R.drawable.mu,R.color.last);
        list.add(0,item);

        item = new Data_match("Manchester city","Arsenal","21/12\n21:00",R.drawable.alarm,R.drawable.mc,R.drawable.arsenal,R.color.last);
        list.add(0,item);

        item = new Data_match("Tottenham Hotspur","Everton","21/12\n04:30",R.drawable.alarm,R.drawable.tottenham,R.drawable.everton,R.color.last);
        list.add(0,item);

        item = new Data_match("Stoke City","West Ham United","21/12\n01:45",R.drawable.alarm,R.drawable.stoke,R.drawable.westham,R.color.last);
        list.add(0,item);


    }
}
