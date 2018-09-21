package com.example.joellim.singtour;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;

public class PaymentLoading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_loading);

        Intent i = new Intent("places");
        sendBroadcast(i);

        CountDownTimer cd = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(PaymentLoading.this, Receipt.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"Please do not leave this page!",Toast.LENGTH_SHORT).show();
    }
}
