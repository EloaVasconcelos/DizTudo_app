package com.example.diztudo_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activityescolha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activityescolha);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnParodia = findViewById(R.id.btnparodia);
        Button btnRotina = findViewById(R.id.btnrotina);


        btnParodia.setOnClickListener(v -> {
            Intent intent = new Intent(activityescolha.this, MainActivity.class);
            startActivity(intent);
        });


        btnRotina.setOnClickListener(v -> {
            Intent intent = new Intent(activityescolha.this, Activity_estuday.class);
            startActivity(intent);
        });
    }
}
