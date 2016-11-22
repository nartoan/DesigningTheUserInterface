package com.androidbelieve.drawerwithswipetabs;

import android.widget.ImageView;

/**
 * Created by Trang kute on 11/22/2016.
 */

public class DataChild {
    private String win, lose, draw;
    ImageView next;

    public DataChild(String win, String draw, String lose, ImageView next){
        this.draw = draw;
        this.lose = lose;
        this.next = next;
        this.win = win;
    }

    void setWin(String win){
        this.win = win;
    }

    void setLose(String lose){
        this.lose = lose;
    }

    void setDraw(String draw){
        this.draw = draw;
    }

    void setNext(ImageView next){
        this.next = next;
    }
}
