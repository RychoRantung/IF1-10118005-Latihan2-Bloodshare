package com.example.if1_10118005_latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        getSupportActionBar().hide();
    }

    public void OnClickVerify(View view) {
        Intent intent = new Intent(AlmostThereActivity.this, VerifyActivity.class);
        startActivity(intent);
    }

}