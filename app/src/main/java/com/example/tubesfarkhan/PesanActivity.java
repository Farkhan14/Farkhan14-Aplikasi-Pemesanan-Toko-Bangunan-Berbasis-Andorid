package com.example.tubesfarkhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class PesanActivity extends AppCompatActivity {

    EditText etBarang;
    Button btnPesan;
    ImageView imgBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        imgBarang = findViewById(R.id.img_barang);
        Bundle bundle = getIntent().getExtras();
        int Foto = bundle.getInt("foto");
        imgBarang.setImageResource(Foto);

        etBarang = findViewById(R.id.et_barang);
        btnPesan = findViewById(R.id.btn_pesan);

        Integer Harga = getIntent().getIntExtra("harga", 0);

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PesanActivity.this, CekOutActivity.class);
                    intent.putExtra("harga", Integer.parseInt(etBarang.getText().toString()) * Harga);
                startActivity(intent);
            }
        });
    }
}