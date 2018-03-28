package com.example.eric1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void WalletM (View v){
        startActivity(new Intent(MainActivity.this, WalletM.class));
    }

    public void MarketM (View v){
        startActivity(new Intent(MainActivity.this, WalletM.class));
    }
}