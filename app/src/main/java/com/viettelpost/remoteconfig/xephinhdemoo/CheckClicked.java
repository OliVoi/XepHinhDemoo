package com.viettelpost.remoteconfig.xephinhdemoo;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;

public class CheckClicked {
    private static CheckClicked checkClicked;
    private static View view;
    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Drawable drawableDefau, drawable1, drawable2, drawable3, drawable4, drawable5, drawable6, drawable7, drawable8, drawable9;

    public CheckClicked(View v) {
        this.view = v;
    }

    public CheckClicked getCheckClicked(View v) {
        if (checkClicked == null) {
            checkClicked = new CheckClicked(v);
        }
        return checkClicked;
    }

    public void GetClick() {

    }
}
