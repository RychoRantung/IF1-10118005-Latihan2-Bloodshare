package com.example.if1_10118005_latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        getSupportActionBar().hide();
    }
    public void OnClickSend(View view) {
        Intent intent = new Intent(VerifyActivity.this, HomeActivity.class );
        startActivity(intent);
    }
}