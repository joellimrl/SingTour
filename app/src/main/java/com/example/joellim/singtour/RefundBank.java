package com.example.joellim.singtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RefundBank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund_bank);
    }

    public void backToMain(View view){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
