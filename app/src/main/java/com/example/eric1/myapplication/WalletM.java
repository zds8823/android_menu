package com.example.eric1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WalletM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet_m);
    }

    public void MainActivity (View v){
        startActivity(new Intent(WalletM.this, MainActivity.class));
    }
}
