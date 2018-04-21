package com.example.egifcb.pandec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Pengenalan
    EditText panjang, lebar, tinggi;
    Button cari;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang = findViewById(R.id.panjang_edt);
        lebar = findViewById(R.id.lebar_edt);
        tinggi = findViewById(R.id.tinggi_edt);

        cari = findViewById(R.id.btn_cari);

        hasil = findViewById(R.id.tv_hasil);

        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pjg, lbr, tgi;

                pjg = Integer.parseInt(panjang.getText().toString());
                lbr = Integer.parseInt(lebar.getText().toString());
                tgi = Integer.parseInt(tinggi.getText().toString());

                if (panjang.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(), "Panjang Masih Kosong",
                            Toast.LENGTH_SHORT).show();
                }else if (lebar.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(), "Lebar Masih Kosong",
                            Toast.LENGTH_SHORT).show();
                }else if (tinggi.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(), "Tinggi Masih Kosong",
                            Toast.LENGTH_SHORT).show();
                }else {
                    int hsl;

                    hsl = pjg * lbr * tgi;

                    hasil.setText(String.valueOf(hsl));
                }
            }
        });
    }
}
