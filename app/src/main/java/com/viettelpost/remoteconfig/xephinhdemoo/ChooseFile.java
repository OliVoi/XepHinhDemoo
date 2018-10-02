package com.viettelpost.remoteconfig.xephinhdemoo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.esafirm.imagepicker.features.ImagePicker;
import com.esafirm.imagepicker.features.ReturnMode;
import com.esafirm.imagepicker.model.Image;

import java.util.ArrayList;
import java.util.List;

public class ChooseFile {

    private static ChooseFile findId;
    private Button btnFile;
    private Activity activity;

    public ChooseFile(Activity a) {
        this.activity = a;
    }

    public static ChooseFile getChoose(Activity a) {
        if (findId == null) {
            findId = new ChooseFile(a);
        }
        return findId;
    }

    public void actionButton(Button b) {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImagePicker.create(activity).showCamera(true).single().returnMode(ReturnMode.ALL).limit(1).start();
            }
        });
    }

    public void chooseOk(ImageView imageView, Intent data, ImageButton btn1, ImageButton btn2, ImageButton btn3, ImageButton btn4, ImageButton btn5, ImageButton btn6, ImageButton btn7, ImageButton btn8, ImageButton btn9) {
        Image image = ImagePicker.getFirstImageOrNull(data);
        if (image != null) {

            //imageView.setImageBitmap(BitmapFactory.decodeFile(image.getPath()));

            imageView.setBackground(new BitmapDrawable(activity.getResources(), BitmapFactory.decodeFile(image.getPath())));
            List<Bitmap> bitmapList = new ArrayList<Bitmap>();

            BitmapDrawable drawable = (BitmapDrawable) imageView.getBackground();
            Bitmap srcBmp = drawable.getBitmap();

            bitmapList = cutImageInFour(srcBmp);

            btn1.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(0)));
            btn2.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(1)));
            btn3.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(2)));
            btn4.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(3)));
            btn5.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(4)));
            btn6.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(5)));
            btn7.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(6)));
            btn8.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(7)));
            btn9.setBackground(new BitmapDrawable(activity.getResources(), bitmapList.get(8)));

        }
    }

    private List<Bitmap> cutImageInFour(Bitmap x) {
        List<Bitmap> newPieces = new ArrayList<Bitmap>();

        int w = x.getWidth();
        int h = x.getHeight();

        int boxWidth = w / 3;
        int boxHeight = h / 3;

        Bitmap top1 = Bitmap.createBitmap(x, 0, 0, boxWidth, boxHeight);
        newPieces.add(top1);
        Bitmap top2 = Bitmap.createBitmap(x, boxWidth, 0, boxWidth, boxHeight);
        newPieces.add(top2);
        Bitmap top3 = Bitmap.createBitmap(x, boxWidth * 2, 0, boxWidth, boxHeight);
        newPieces.add(top3);
        Bitmap top4 = Bitmap.createBitmap(x, 0, boxHeight, boxWidth, boxHeight);
        newPieces.add(top4);
        Bitmap top5 = Bitmap.createBitmap(x, boxWidth, boxHeight, boxWidth, boxHeight);
        newPieces.add(top5);
        Bitmap top6 = Bitmap.createBitmap(x, boxWidth * 2, boxHeight, boxWidth, boxHeight);
        newPieces.add(top6);
        Bitmap top7 = Bitmap.createBitmap(x, 0, boxHeight * 2, boxWidth, boxHeight);
        newPieces.add(top7);
        Bitmap top8 = Bitmap.createBitmap(x, boxWidth, boxHeight * 2, boxWidth, boxHeight);
        newPieces.add(top8);
        Bitmap top9 = Bitmap.createBitmap(x, boxWidth * 2, boxHeight * 2, boxWidth, boxHeight);
        newPieces.add(top9);

        return newPieces;
    }
}