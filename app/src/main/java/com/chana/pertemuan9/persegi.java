package com.chana.pertemuan9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {
    EditText sisi;
    Button hitungPersegi;
    TextView keliling,luas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        sisi = findViewById(R.id.edit_persegi);
        hitungPersegi = findViewById(R.id.btn_persegi);

    }
}