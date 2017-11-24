package com.android.android_lab_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    // константы для ID пунктов меню
    final int MENU_ALPHA_ID = 1;
    final int MENU_SCALE_ID = 2;
    final int MENU_TRANSLATE_ID = 3;
    final int MENU_ROTATE_ID = 4;
    final int MENU_COMBO_ID = 5;

    ImageView iv1;
    ImageView iv2;
    Button rotate;
    Button group;
    Button fade;
    Button animate;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView) findViewById(R.id.androidImage1);
        iv2 = (ImageView) findViewById(R.id.androidImage2);
        rotate = (Button) findViewById(R.id.Button01);
        group = (Button) findViewById(R.id.Button04);
        fade = (Button) findViewById(R.id.Button03);
        animate = (Button) findViewById(R.id.Button02);

        animate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim1;
                anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.mytrans);
                iv1.startAnimation(anim1);
                iv2.startAnimation(anim1);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim1, anim2;
                anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.myrotate);
                iv1.startAnimation(anim1);

                anim2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.myrotate2);
                iv2.startAnimation(anim2);
            }
        });

        group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim1;
                anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.mycombo);
                iv1.startAnimation(anim1);
                iv2.startAnimation(anim1);
            }
        });

        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim1;
                anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.myalpha);
                iv1.startAnimation(anim1);
                iv2.startAnimation(anim1);
            }
        });
    }

}