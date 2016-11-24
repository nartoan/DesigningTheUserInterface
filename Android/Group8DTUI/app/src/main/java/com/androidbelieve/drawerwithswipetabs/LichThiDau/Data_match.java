package com.androidbelieve.drawerwithswipetabs.LichThiDau;

/**
 * Created by thuanbv on 11/23/2016.
 */

public class Data_match {
    private String name1, name2, time;
    private int alarm, img1, img2, background;

    public Data_match(String name1, String name2, String time, int alarm, int img1, int img2, int background) {
        this.name1 = name1;
        this.name2 = name2;
        this.time = time;
        this.alarm = alarm;
        this.img1 = img1;
        this.img2 = img2;
        this.background = background;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAlarm() {
        return alarm;
    }

    public void setAlarm(int alarm) {
        this.alarm = alarm;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }
}
