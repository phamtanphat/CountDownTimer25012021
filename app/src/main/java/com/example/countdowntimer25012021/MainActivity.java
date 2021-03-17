package com.example.countdowntimer25012021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper mViewFlipper;
    int[] mArrImages = {R.drawable.hinh1,R.drawable.hinh2,R.drawable.hinh3,R.drawable.hinh4,R.drawable.hinh5};
    int mCount = 0;
    CountDownTimer mCountDownTimer;
    ImageView mImageView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewFlipper = findViewById(R.id.viewFlipper);


        mCountDownTimer = new CountDownTimer(2500 , 2000) {
            @Override
            public void onTick(long l) {
                if (l > 1000){
                    if (mCount >= mArrImages.length){
                        mCount = 0;
                    }
                    mImageView = new ImageView(MainActivity.this);
                    mImageView.setImageResource(mArrImages[mCount++]);
                    mViewFlipper.addView(mImageView);
                    mViewFlipper.setInAnimation(MainActivity.this,android.R.anim.fade_in);
                    mViewFlipper.setOutAnimation(MainActivity.this,android.R.anim.fade_in);
                    mViewFlipper.showNext();
                }
            }

            @Override
            public void onFinish() {
                mCountDownTimer.start();
            }
        };

        mCountDownTimer.start();


    }
}