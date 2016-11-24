package com.androidbelieve.drawerwithswipetabs.TinTuc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidbelieve.drawerwithswipetabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trangkute on 11/23/2016.
 */

public class tab2Fragment extends android.support.v4.app.Fragment{

    private List<Data_tab2> list = new ArrayList<Data_tab2>();
    private RecyclerView recyclerView;
    private tab2Recycler mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private boolean created = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.tab2recycler);

        mAdapter = new tab2Recycler(list);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        if (!created) addItem();
        return view;
    }

    private void addItem() {
        created = true;
        Data_tab2 item = new Data_tab2(R.drawable.chelsea,"k biet viet gi car, :( viet linh tinh nha");
        list.add(item);
        item = new Data_tab2(R.drawable.mu,"k biet viet gi car, :( viet linh tinh nha");
        list.add(item);
        item = new Data_tab2(R.drawable.hull,"k biet viet gi car, :( viet linh tinh nha");
        list.add(item);
        item = new Data_tab2(R.drawable.southampton,"k biet viet gi car, :( viet linh tinh nha");
        list.add(item);
        item = new Data_tab2(R.drawable.liverpool,"k biet viet gi car, :( viet linh tinh nha");
        list.add(item);
        item = new Data_tab2(R.drawable.arsenal,"k biet viet gi car, :( viet linh tinh nha");
        list.add(item);
        item = new Data_tab2(R.drawable.leicester,"k biet viet gi car, :( viet linh tinh nha");
        list.add(item);
    }
}
