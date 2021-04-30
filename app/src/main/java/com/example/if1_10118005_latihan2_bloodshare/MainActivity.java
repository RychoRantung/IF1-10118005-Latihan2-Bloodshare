package com.example.if1_10118005_latihan2_bloodshare;

/*
    * NIM: 10118005
    * Nama: Rycho Rantung
    * Kelas: IF-1
    * Tanggal Pengerjaan: 28 April 2021
    * Deskripsi Pekerjaan: Membuat project aplikasi bloodshare. Aplikasi ini hanya bisa berpindah activity saja

 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}