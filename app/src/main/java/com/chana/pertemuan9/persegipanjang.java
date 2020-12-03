package com.chana.pertemuan9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegipanjang extends AppCompatActivity {

    EditText lebar,panjang;
    Button hitungPersegiPanjang;
    TextView keliling,luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);
        lebar = findViewById(R.id.edit_lebar);
    }
}