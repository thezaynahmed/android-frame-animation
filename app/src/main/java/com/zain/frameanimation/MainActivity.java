package com.zain.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable cartoonAnimation;
    private ImageView cartoonImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartoonImage = findViewById(R.id.cartoon_id);
        cartoonImage.setBackgroundResource(R.drawable.cartoon_anim);
        cartoonAnimation = (AnimationDrawable) cartoonImage.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        cartoonAnimation.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                cartoonAnimation.stop();
            }
        },5000);//5 SEC
        return super.onTouchEvent(event);
    }
}