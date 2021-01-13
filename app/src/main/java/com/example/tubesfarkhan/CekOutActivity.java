package com.example.tubesfarkhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CekOutActivity extends AppCompatActivity {

    TextView txTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_out);

        txTotal = findViewById(R.id.txtotal);

        Integer hargaTotal = getIntent().getIntExtra("harga", 0);
        String valueTotal = hargaTotal.toString();
        txTotal.setText("Rp. " + valueTotal);
    }
}