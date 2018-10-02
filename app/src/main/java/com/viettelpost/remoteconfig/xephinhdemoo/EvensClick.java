package com.viettelpost.remoteconfig.xephinhdemoo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class EvensClick {
    private static EvensClick evensClick;
    private Activity activity;

    private EvensClick(Activity a) {
        this.activity = a;
    }

    public static EvensClick getEvensClick(Activity a) {
        if (evensClick == null) {
            evensClick = new EvensClick(a);
        }
        return evensClick;
    }

    public void evenButton1(){

    }

}
