package com.androidbelieve.drawerwithswipetabs.BXH;


/**
 * Created by Thuan on 11/20/2016.
 */

public class Data {
    private String vitri, tendoibong, sotran, hieuso, diem;
    private int img, background;

    public Data(String vitri, String tendoibong, String sotran, String hieuso, String diem, int img, int background) {
        this.vitri = vitri;
        this.tendoibong = tendoibong;
        this.sotran = sotran;
        this.hieuso = hieuso;
        this.diem = diem;
        this.img = img;
        this.background = background;
    }

    public int getBackground() {
        return this.background;
    }

    public int getImg() {
        return this.img;
    }

    public String getVitri() {
        return this.vitri;
    }

    public String getTendoibong() {
        return this.tendoibong;
    }

    public String getSotran() {
        return this.sotran;
    }

    public String getHieuso() {
        return this.hieuso;
    }

    public String getDiem() {
        return this.diem;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public void setTendoibong(String tendoibong) {
        this.tendoibong = tendoibong;
    }

    public void setSotran(String sotran) {
        this.sotran = sotran;
    }

    public void setHieuso(String hieuso) {
        this.hieuso = hieuso;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }
}
