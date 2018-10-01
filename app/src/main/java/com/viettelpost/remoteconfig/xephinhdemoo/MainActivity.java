package com.viettelpost.remoteconfig.xephinhdemoo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Drawable drawableDefau, drawable1, drawable2, drawable3, drawable4, drawable5, drawable6, drawable7, drawable8, drawable9;
    private Drawable d1, d2, d3, d4, d5, d6, d7, d8, d9;
    private LinearLayout linearLayout;
    private TextView textView;
    private Button btnNew;
    private int index = 0;
    private String arrId[] = {"img1", "img2", "img3", "img4", "img5", "img6", "img7", "img8", "img9"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        finId();
        getDrawDefau();


    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public void newGame() {
        for (int i = 0; i < 1000; i++) {
            btn1.performClick();
        }
    }

    public void getDrawDefau() {
        drawable1 = d1 = btn1.getBackground();
        drawable2 = d2 = btn2.getBackground();
        drawable3 = d3 = btn3.getBackground();
        drawable4 = d4 = btn4.getBackground();
        drawable5 = d5 = btn5.getBackground();
        drawable6 = d6 = btn6.getBackground();
        drawable7 = d7 = btn7.getBackground();
        drawable8 = d8 = btn8.getBackground();
        drawable9 = d9 = btn9.getBackground();
    }


    private void finId() {
        btn1 = findViewById(R.id.img1);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.img2);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.img3);
        btn3.setOnClickListener(this);

        btn4 = findViewById(R.id.img4);
        btn4.setOnClickListener(this);

        btn5 = findViewById(R.id.img5);
        btn5.setOnClickListener(this);

        btn6 = findViewById(R.id.img6);
        btn6.setOnClickListener(this);

        btn7 = findViewById(R.id.img7);
        btn7.setOnClickListener(this);

        btn8 = findViewById(R.id.img8);
        btn8.setOnClickListener(this);

        btn9 = findViewById(R.id.img9);
        btn9.setOnClickListener(this);

        drawableDefau = btn1.getBackground();
        textView = findViewById(R.id.txt_touch);
        btnNew = findViewById(R.id.btn_new);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_new:
                newGame();
                break;
            case R.id.img1:
                drawable1 = btn1.getBackground();
                drawable2 = btn2.getBackground();
                if (drawable2 == drawableDefau) {
                    valueTouch();
                    btn2.setBackground(drawable1);
                    btn1.setBackground(drawableDefau);
                }
                drawable4 = btn4.getBackground();
                if (drawable4 == drawableDefau) {
                    valueTouch();
                    btn4.setBackground(drawable1);
                    btn1.setBackground(drawableDefau);
                }
                break;

            case R.id.img2:
                drawable2 = btn2.getBackground();
                drawable1 = btn1.getBackground();
                if (drawable1 == drawableDefau) {
                    valueTouch();
                    btn1.setBackground(drawable2);
                    btn2.setBackground(drawableDefau);
                    break;
                }
                drawable3 = btn3.getBackground();
                if (drawable3 == drawableDefau) {
                    valueTouch();
                    btn3.setBackground(drawable2);
                    btn2.setBackground(drawableDefau);
                    break;
                }
                drawable5 = btn5.getBackground();
                if (drawable5 == drawableDefau) {
                    valueTouch();
                    btn5.setBackground(drawable2);
                    btn2.setBackground(drawableDefau);
                    break;
                }
                break;

            case R.id.img3:
                drawable3 = btn3.getBackground();
                drawable2 = btn2.getBackground();
                if (drawable2 == drawableDefau) {
                    valueTouch();
                    btn2.setBackground(drawable3);
                    btn3.setBackground(drawableDefau);
                }
                drawable6 = btn6.getBackground();
                if (drawable6 == drawableDefau) {
                    valueTouch();
                    btn6.setBackground(drawable3);
                    btn3.setBackground(drawableDefau);
                }
                break;

            case R.id.img4:
                drawable4 = btn4.getBackground();
                drawable1 = btn1.getBackground();
                if (drawable1 == drawableDefau) {
                    valueTouch();
                    btn1.setBackground(drawable4);
                    btn4.setBackground(drawableDefau);
                }
                drawable7 = btn7.getBackground();
                if (drawable7 == drawableDefau) {
                    valueTouch();
                    btn7.setBackground(drawable4);
                    btn4.setBackground(drawableDefau);
                }
                drawable5 = btn5.getBackground();
                if (drawable5 == drawableDefau) {
                    valueTouch();
                    btn5.setBackground(drawable4);
                    btn4.setBackground(drawableDefau);
                }
                break;

            case R.id.img5:
                drawable5 = btn5.getBackground();
                drawable2 = btn2.getBackground();
                if (drawable2 == drawableDefau) {
                    valueTouch();
                    btn2.setBackground(drawable5);
                    btn5.setBackground(drawableDefau);
                }
                drawable4 = btn4.getBackground();
                if (drawable4 == drawableDefau) {
                    valueTouch();
                    btn4.setBackground(drawable5);
                    btn5.setBackground(drawableDefau);
                }
                drawable6 = btn6.getBackground();
                if (drawable6 == drawableDefau) {
                    valueTouch();
                    btn6.setBackground(drawable5);
                    btn5.setBackground(drawableDefau);
                }
                drawable8 = btn8.getBackground();
                if (drawable8 == drawableDefau) {
                    valueTouch();
                    btn8.setBackground(drawable5);
                    btn5.setBackground(drawableDefau);
                }
                break;

            case R.id.img6:
                drawable6 = btn6.getBackground();
                drawable3 = btn3.getBackground();
                if (drawable3 == drawableDefau) {
                    valueTouch();
                    btn3.setBackground(drawable6);
                    btn6.setBackground(drawableDefau);
                }
                drawable5 = btn5.getBackground();
                if (drawable5 == drawableDefau) {
                    valueTouch();
                    btn5.setBackground(drawable6);
                    btn6.setBackground(drawableDefau);
                }
                drawable9 = btn9.getBackground();
                if (drawable9 == drawableDefau) {
                    valueTouch();
                    btn9.setBackground(drawable6);
                    btn6.setBackground(drawableDefau);
                }
                break;
            case R.id.img7:
                drawable7 = btn7.getBackground();
                drawable4 = btn4.getBackground();
                if (drawable4 == drawableDefau) {
                    valueTouch();
                    btn4.setBackground(drawable7);
                    btn7.setBackground(drawableDefau);
                }
                drawable8 = btn8.getBackground();
                if (drawable8 == drawableDefau) {
                    valueTouch();
                    btn8.setBackground(drawable7);
                    btn7.setBackground(drawableDefau);
                }
                break;
            case R.id.img8:
                drawable8 = btn8.getBackground();
                drawable5 = btn5.getBackground();
                if (drawable5 == drawableDefau) {
                    valueTouch();
                    btn5.setBackground(drawable8);
                    btn8.setBackground(drawableDefau);
                }
                drawable7 = btn7.getBackground();
                if (drawable7 == drawableDefau) {
                    valueTouch();
                    btn7.setBackground(drawable8);
                    btn8.setBackground(drawableDefau);
                }
                drawable9 = btn9.getBackground();
                if (drawable9 == drawableDefau) {
                    valueTouch();
                    btn9.setBackground(drawable8);
                    btn8.setBackground(drawableDefau);
                }
                break;
            case R.id.img9:
                drawable9 = btn9.getBackground();
                drawable6 = btn6.getBackground();

                if (drawable6 == drawableDefau) {
                    valueTouch();
                    btn6.setBackground(drawable9);
                    btn9.setBackground(drawableDefau);
                }
                drawable8 = btn8.getBackground();
                if (drawable8 == drawableDefau) {
                    valueTouch();
                    btn8.setBackground(drawable9);
                    btn9.setBackground(drawableDefau);
                }
                break;
        }

        if (index > 0 && drawable1 == d1 && drawable2 == d2 && drawable3 == d3 && drawable4 == d4 && drawable5 == d5 && drawable7 == d7 && drawable8 == d8 && drawable9 == d9 && drawable6 == d6) {
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }
    }

    public void valueTouch() {
        index++;
        String v = String.valueOf(index);
        textView.setText(v);
    }

}
