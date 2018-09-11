package com.example.joellim.singtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.joellim.singtour.MESSAGE";

    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.editText);
        pass = (EditText)findViewById(R.id.editText2);
    }

    /** called for login button */
    public void login(View view){
        if(user.getText().toString().equals("admin") && pass.getText().toString().equals("pass")){
            Intent intent = new Intent(this, MainMenu.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"User: admin\nPass: pass",Toast.LENGTH_LONG).show();
        }
    }
}
