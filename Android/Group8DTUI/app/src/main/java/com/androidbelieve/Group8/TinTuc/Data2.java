package com.androidbelieve.Group8.TinTuc;


/**
 * Created by Thuan on 11/20/2016.
 */

public class Data2 {
    private String str1, str2;
    private int img;

    public Data2(String str1, String str2, int img) {
        this.str1 = str1;
        this.str2 = str2;
        this.img = img;
    }

    public int getImg() {
        return this.img;
    }

    public String getTitle() {
        return this.str1;
    }

    public String getTag() {
        return this.str2;
    }


}
