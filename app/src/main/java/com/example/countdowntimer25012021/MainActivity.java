package com.example.countdowntimer25012021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountDownTimer countDownTimer = new CountDownTimer(5000 , 1000) {
            @Override
            public void onTick(long l) {
                if (l > 1000){
                    Log.d("BBB",l + "");
                }
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Kết thúc", Toast.LENGTH_SHORT).show();
            }
        };
        countDownTimer.start();
    }
}