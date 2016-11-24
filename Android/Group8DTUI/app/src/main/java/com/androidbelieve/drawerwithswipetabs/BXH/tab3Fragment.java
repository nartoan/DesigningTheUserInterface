package com.androidbelieve.drawerwithswipetabs.BXH;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidbelieve.drawerwithswipetabs.BXH.CustomRecyclerAdapter;
import com.androidbelieve.drawerwithswipetabs.BXH.Data;
import com.androidbelieve.drawerwithswipetabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ratan on 7/29/2015.
 */
public class tab3Fragment extends Fragment {

    private List<Data> list = new ArrayList<Data>();
    private RecyclerView recyclerView;
    private CustomRecyclerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private boolean created = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3, null);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);

        mAdapter = new CustomRecyclerAdapter(list);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        if (!created) addItem();
        return view;
    }

    public void addItem() {
        created = true;
        Data item = new Data("20", "Swansea City", "12", "-11", "6", R.drawable.swansea, R.color.last);
        list.add(0, item);

        item = new Data("19", "Sunderland", "12", "-9", "8", R.drawable.sunderland, R.color.last);
        list.add(0, item);

        item = new Data("18", "Hull City", "12", "-17", "10", R.drawable.hull, R.color.last);
        list.add(0, item);

        item = new Data("17", "West Ham United", "12", "-10", "11", R.drawable.westham, R.color.white);
        list.add(0, item);

        item = new Data("16", "Crystal Palace", "12", "-4", "11", R.drawable.crystal, R.color.white);
        list.add(0, item);

        item = new Data("15", "Middlesbrough", "11", "-2", "11", R.drawable.middlesbrough, R.color.white);
        list.add(0, item);

        item = new Data("14", "Leicester City", "12", "-6", "12", R.drawable.leicester, R.color.white);
        list.add(0, item);

        item = new Data("13", "Stoke City", "12", "-6", "13", R.drawable.stoke, R.color.white);
        list.add(0, item);

        item = new Data("12", "West Bromwich Albion", "11", "-3", "13", R.drawable.westbromwich, R.color.white);
        list.add(0, item);

        item = new Data("11", "Burnley", "11", "-4", "14", R.drawable.burnley, R.color.white);
        list.add(0, item);

        item = new Data("10", "Southampton", "12", "0", "14", R.drawable.southampton, R.color.white);
        list.add(0, item);

        item = new Data("9", "Bournemouth", "12", "-2", "15", R.drawable.bournemouth, R.color.white);
        list.add(0, item);

        item = new Data("8", "Watford", "12", "-3", "18", R.drawable.watford, R.color.white);
        list.add(0, item);

        item = new Data("7", "Everton", "12", "2", "19", R.drawable.everton, R.color.white);
        list.add(0, item);

        item = new Data("6", "Manchester United", "12", "3", "19", R.drawable.mu, R.color.white);
        list.add(0, item);

        item = new Data("5", "Tottenham Hotspur", "12", "10", "24", R.drawable.tottenham, R.color.fifth);
        list.add(0, item);

        item = new Data("4", "Arsenal", "12", "13", "25", R.drawable.arsenal, R.color.back);
        list.add(0, item);

        item = new Data("3", "Manchester City", "12", "16", "27", R.drawable.mc, R.color.back);
        list.add(0, item);

        item = new Data("2", "Liverpool", "12", "16", "27", R.drawable.liverpool, R.color.back);
        list.add(0, item);

        item = new Data("1", "Chelsea", "12", "18", "28", R.drawable.chelsea, R.color.first);
        list.add(0, item);
    }
}
