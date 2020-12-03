package com.chana.pertemuan9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {

    EditText persegi;
    Button hitungPersegi;
    TextView kelilingPersegi,luasPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        persegi = findViewById(R.id.edit_persegi);
        hitungPersegi = findViewById(R.id.btn_hitungpersegi);
        kelilingPersegi = findViewById(R.id.kelilingPersegi);
        luasPersegi = findViewById(R.id.luasPersegi);

        hitungPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sisi = Integer.parseInt(persegi.getText().toString());
                int keliling = sisi * 4;
                int luas = sisi * sisi;
                kelilingPersegi.setText(String.valueOf(keliling));
                luasPersegi.setText(String.valueOf(luas));
            }
        });
    }
}