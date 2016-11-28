package com.androidbelieve.Group8.TinTuc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

import com.androidbelieve.Group8.R;

/**
 * Created by Trang kute on 11/27/2016.
 */

public class mottintuc extends AppCompatActivity {
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

        RecyclerView related = (RecyclerView) findViewById(R.id.related);
        related.setHasFixedSize(true);
        related.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        related.setAdapter(new RelatedAdapter());
    }
}
