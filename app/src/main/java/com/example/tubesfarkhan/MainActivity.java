package com.example.tubesfarkhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout Content1,Content2,Content3,Content4,Content5;
    TextView txJudul1,txJudul2,txJudul3,txJudul4,txJudul5,txHarga1,txHarga2,txHarga3,txHarga4,txHarga5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Content1 = findViewById(R.id.content1);
        Content2 = findViewById(R.id.content2);
        Content3 = findViewById(R.id.content3);
        Content4 = findViewById(R.id.content4);
        Content5 = findViewById(R.id.content5);

        txJudul1 = findViewById(R.id.txjudul1);
        txJudul2 = findViewById(R.id.txjudul2);
        txJudul3 = findViewById(R.id.txjudul3);
        txJudul4 = findViewById(R.id.txjudul4);
        txJudul5 = findViewById(R.id.txjudul5);

        txHarga1 = findViewById(R.id.txharga1);
        txHarga2 = findViewById(R.id.txharga2);
        txHarga3 = findViewById(R.id.txharga3);
        txHarga4 = findViewById(R.id.txharga4);
        txHarga5 = findViewById(R.id.txharga5);

        Content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.besi_beton);
                intent.putExtra("judul", txJudul1.getText());
                intent.putExtra("harga", 40000);
                startActivity(intent);
            }
        });
        Content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.besi_hollow);
                intent.putExtra("judul", txJudul2.getText());
                intent.putExtra("harga", 80000);
                startActivity(intent);
            }
        });
        Content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.siku);
                intent.putExtra("judul", txJudul3.getText());
                intent.putExtra("harga", 200000);
                startActivity(intent);
            }
        });
        Content4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.besi_cnp);
                intent.putExtra("judul", txJudul1.getText());
                intent.putExtra("harga", 90000);
                startActivity(intent);
            }
        });
        Content5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.wiremesh);
                intent.putExtra("judul", txJudul2.getText());
                intent.putExtra("harga", 300000);
                startActivity(intent);
            }
        });
    }
}