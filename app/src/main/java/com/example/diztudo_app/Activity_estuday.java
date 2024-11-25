package com.example.diztudo_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_estuday extends AppCompatActivity {
    Button btn_portu;
    Button btn_mat;
    Button btn_ci;
    Button btn_hist;
    Button btn_filo;
    Button btn_art;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_estuday);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.portugues_act), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        btn_portu = findViewById(R.id.btn_portu);
        btn_portu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent portugues_act = new Intent(Activity_estuday.this, portu_act.class);
                startActivity(portugues_act);
            }
        });

        btn_mat = findViewById(R.id.btn_mat);
        btn_mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent matematica_act = new Intent(Activity_estuday.this, activity_mat.class);
                startActivity(matematica_act);
            }
        });

        btn_ci = findViewById(R.id.btn_ci);
        btn_ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ciencias_act = new Intent(Activity_estuday.this, act_cien.class);
                startActivity(ciencias_act);
            }
        });

        btn_hist = findViewById(R.id.btn_hist);
        btn_hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historia_act = new Intent(Activity_estuday.this, activity_hist.class);
                startActivity(historia_act);
            }
        });

        btn_filo = findViewById(R.id.btn_filo);
        btn_filo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent filosofia_act = new Intent(Activity_estuday.this, activity_filo.class);
                startActivity(filosofia_act);
            }
        });

        btn_art = findViewById(R.id.btn_art);
        btn_art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artes_act = new Intent(Activity_estuday.this, activity_artes.class);
                startActivity(artes_act);
            }
        });
    }
}
