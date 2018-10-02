package com.viettelpost.remoteconfig.xephinhdemoo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FindById {
    private static FindById findById;
    private Activity activity;

    private FindById(Activity a) {
        this.activity = a;
    }

    public static FindById getFindById(Activity a) {
        if (findById == null) {
            findById = new FindById(a);
        }
        return findById;
    }

    public void finId(ImageButton btn, ImageButton btn1, ImageButton btn2, ImageButton btn3, ImageButton btn4, ImageButton btn5, ImageButton btn6, ImageButton btn7, ImageButton btn8, ImageButton btn9, Button btnFile, Drawable drawableDefau, TextView textView) {

        btn = this.activity.findViewById(R.id.img);

        btn1 = this.activity.findViewById(R.id.img1);

        btn2 = this.activity.findViewById(R.id.img2);

        btn3 = this.activity.findViewById(R.id.img3);

        btn4 = activity.findViewById(R.id.img4);

        btn5 = activity.findViewById(R.id.img5);

        btn6 = activity.findViewById(R.id.img6);

        btn7 = activity.findViewById(R.id.img7);
        btn8 = activity.findViewById(R.id.img8);

        btn9 = activity.findViewById(R.id.img9);
        btnFile = activity.findViewById(R.id.btn_file);

        drawableDefau = btn.getBackground();
        textView = this.activity.findViewById(R.id.txt_touch);

    }

}
