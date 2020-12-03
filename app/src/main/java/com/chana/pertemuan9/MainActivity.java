package com.chana.pertemuan9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_persegi, btn_panjang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_persegi = findViewById(R.id.btn_persegi);
        btn_panjang = findViewById(R.id.btn_panjang);

        btn_persegi.setOnClickListener(this);
        btn_panjang.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_persegi){
            startActivity( new Intent(MainActivity.this, persegi.class));
        } else if (v.getId() == R.id.btn_panjang){
            startActivity( new Intent(MainActivity.this, persegipanjang.class));
        }
    }
}