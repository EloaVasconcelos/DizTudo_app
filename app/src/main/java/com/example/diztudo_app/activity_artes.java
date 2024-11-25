package com.example.diztudo_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_artes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_artes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.act_artes), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnant = findViewById(R.id.btn_ant);
        Button btnmed = findViewById(R.id.btn_med);
        Button btnren = findViewById(R.id.btn_ren);
        Button btnbarroco = findViewById(R.id.btn_bar);
        Button btnmoder = findViewById(R.id.btn_mod);
        Button btncont = findViewById(R.id.btn_con);
        Button btnEx1Art = findViewById(R.id.btn_ex1_artes);
        Button btnEx2Art = findViewById(R.id.btn_ex2_artes);
        Button btnEx3Art = findViewById(R.id.btn_ex3_artes);
        Button btnEx4Art = findViewById(R.id.btn_ex4_artes);
        Button btnEx5Art = findViewById(R.id.btn_ex5_artes);
        Button btnEx6Art= findViewById(R.id.btn_ex6_artes);

        setButtonRedirect(btnant, "https://www.todamateria.com.br/historia-da-arte-definicao-aspectos-periodos/#:~:text=Foi%20na%20%C3%A9poca%20do%20Paleol%C3%ADtico,)%20e%20Altamira%20(Espanha).");
        setButtonRedirect(btnmed, "https://www.todamateria.com.br/arte-medieval/");
        setButtonRedirect(btnren, "https://www.todamateria.com.br/renascimento-artistico/");
        setButtonRedirect(btnbarroco, "https://www.todamateria.com.br/arte-barroca/");
        setButtonRedirect(btnmoder, "https://www.todamateria.com.br/arte-moderna/");
        setButtonRedirect(btncont, "https://www.todamateria.com.br/arte-contemporanea/");
        setButtonRedirect(btnEx1Art, "https://www.todamateria.com.br/historia-da-arte-definicao-aspectos-periodos/#:~:text=Foi%20na%20%C3%A9poca%20do%20Paleol%C3%ADtico,)%20e%20Altamira%20(Espanha).");
        setButtonRedirect(btnEx2Art, "https://www.todamateria.com.br/arte-medieval/");
        setButtonRedirect(btnEx3Art, "https://www.todamateria.com.br/renascimento-artistico/");
        setButtonRedirect(btnEx4Art, "https://www.todamateria.com.br/arte-barroca/");
        setButtonRedirect(btnEx5Art, "https://www.todamateria.com.br/arte-moderna/");
        setButtonRedirect(btnEx6Art, "https://www.todamateria.com.br/arte-contemporanea/");
    }

    private void setButtonRedirect(Button button, String url) {
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}