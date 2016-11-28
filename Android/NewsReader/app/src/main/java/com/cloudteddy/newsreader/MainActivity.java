package com.cloudteddy.newsreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView content = (WebView) findViewById(R.id.content);
        content.setScrollContainer(false);
        content.loadUrl("file:///android_asset/content.html");

        RecyclerView related = (RecyclerView) findViewById(R.id.related);
        related.setHasFixedSize(true);
        related.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        related.setAdapter(new RelatedAdapter());
    }
}
