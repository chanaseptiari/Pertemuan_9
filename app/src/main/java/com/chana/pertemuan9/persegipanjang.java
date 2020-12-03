package com.chana.pertemuan9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegipanjang extends AppCompatActivity {

    EditText lebarPersegiPanjang,panjangPersegiPanjang;
    Button hitungPersegiPanjang;
    TextView kelilingPersegiPanjang,luasPersegiPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);
        lebarPersegiPanjang = findViewById(R.id.edit_lebar);
        panjangPersegiPanjang = findViewById(R.id.edit_panjang);
        hitungPersegiPanjang = findViewById(R.id.btn_persegipanjang);
        kelilingPersegiPanjang = findViewById(R.id.kelilingPersegiPanjang);
        luasPersegiPanjang = findViewById(R.id.luasPersegiPanjang);

        hitungPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lebar = Integer.valueOf(lebarPersegiPanjang.getText().toString());
                int panjang = Integer.valueOf(panjangPersegiPanjang.getText().toString());
                int keliling = (panjang + lebar) * 2;
                int luas = lebar * panjang;
                kelilingPersegiPanjang.setText(String.valueOf(keliling));
                luasPersegiPanjang.setText(String.valueOf(luas));
            }
        });
    }
}