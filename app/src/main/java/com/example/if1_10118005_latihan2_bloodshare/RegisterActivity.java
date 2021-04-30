package com.example.if1_10118005_latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
    }

    public void OnClickRegister(View view) {
        Intent intent = new Intent(RegisterActivity.this, AlmostThereActivity.class);
        startActivity(intent);
    }
}