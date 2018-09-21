package com.example.joellim.singtour;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Receipt extends AppCompatActivity {

    Boolean temp = Boolean.TRUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        ImageView imgFavorite = (ImageView) findViewById(R.id.imageView16);
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                temp = Boolean.FALSE;
            }
        });

        CountDownTimer cd = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                if (temp){
                    finish();
                }
            }
        }.start();
    }
}
