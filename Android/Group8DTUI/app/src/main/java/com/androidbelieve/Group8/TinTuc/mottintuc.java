package com.androidbelieve.Group8.TinTuc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.androidbelieve.Group8.BXH.CustomRecyclerAdapter;
import com.androidbelieve.Group8.BXH.Data;
import com.androidbelieve.Group8.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Trang kute on 11/27/2016.
 */

public class mottintuc extends AppCompatActivity {

    private List<Data2> list = new ArrayList<Data2>();
    private RecyclerView recyclerView;
    private RelatedAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private boolean created = false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mottintuc);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        WebView content = (WebView) findViewById(R.id.content);
        content.setScrollContainer(false);
        content.loadUrl("file:///android_asset/content.html");

        recyclerView = (RecyclerView) findViewById(R.id.related);

        mAdapter = new RelatedAdapter(list);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        if (!created) addItem();
    }

    private void addItem() {
        created = true;
        Data2 item = new Data2("Chelsea-Conte tranh James Rodriguez với MU-Mourinho", "Sport | 2 giờ trước", R.drawable.tinlq1);
        list.add(item);
        Log.e("dsd", "dsa");

        item = new Data2("Arsenal – Bournemouth: Chờ Giroud phá dớp", "Sport | 3 phút trước", R.drawable.tinlq2);
        list.add(item);

        item = new Data2("MU - West Ham: Mourinho hưng phấn đón \"Búa tạ\"", "Sport | 2 ngày trước", R.drawable.tinlq3);
        list.add(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
