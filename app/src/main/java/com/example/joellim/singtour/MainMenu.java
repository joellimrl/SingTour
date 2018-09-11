package com.example.joellim.singtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void guide(View view){
        Intent intent = new Intent(this, Guide.class);
        startActivity(intent);
    }

    public void refund(View view){
        Intent intent = new Intent(this, Refund.class);
        startActivity(intent);
    }

    public void places(View view){
        Intent intent = new Intent(this, Places.class);
        startActivity(intent);
    }
}
