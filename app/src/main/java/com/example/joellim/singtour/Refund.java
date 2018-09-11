package com.example.joellim.singtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Refund extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund);
    }

    public void refundBank(View view){
        Intent intent = new Intent(this, RefundBank.class);
        startActivity(intent);
    }
}
