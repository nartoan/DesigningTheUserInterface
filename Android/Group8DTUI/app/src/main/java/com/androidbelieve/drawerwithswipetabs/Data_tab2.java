package com.androidbelieve.drawerwithswipetabs;

import android.speech.tts.Voice;
import android.widget.ImageView;

/**
 * Created by trangkute on 11/23/2016.
 */

public class Data_tab2 {

    private int img;
    private String text;

    public Data_tab2(int img, String text){
        this.img = img;
        this.text = text;
    }
    void setImg(int img){this.img = img;}
    void setText(String text){this.text = text;}

    public int getImg(){
        return this.img;
    }

    public String getText(){
        return this.text;
    }
}
