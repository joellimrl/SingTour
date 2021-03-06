package com.example.joellim.singtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Guide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        WebView wv = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("http://www.visitsingapore.com/singapore-itineraries/best-of-singapore-in-7-days/");
    }

    public void maps(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void grab(View v){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.grabtaxi.passenger");
        if (launchIntent != null){
            startActivity(launchIntent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.about:
                intent = new Intent(this, About.class);
                break;

            case R.id.print:
                intent = new Intent(this, Print.class);
                break;

            case R.id.account:
                intent = new Intent(this, Account.class);
                break;

            case R.id.settings:
                intent = new Intent(this, SettingsActivity.class);
                break;

            case R.id.logout:
                intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        startActivity(intent);
        return true;
    }
}
