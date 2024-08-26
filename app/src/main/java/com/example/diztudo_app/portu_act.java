package com.example.diztudo_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class portu_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_portu);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.portugues_act), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnInterpre = findViewById(R.id.btn_interpre);
        Button btnFunc = findViewById(R.id.btn_func);
        Button btnVari = findViewById(R.id.btn_vari);
        Button btnFigu = findViewById(R.id.btn_figu);
        Button btnGrama = findViewById(R.id.btn_grama);
        Button btnMovi = findViewById(R.id.btn_movi);
        Button btnEx1 = findViewById(R.id.btn_ex1_port);
        Button btnEx2 = findViewById(R.id.btn_ex2_port);
        Button btnEx3 = findViewById(R.id.btn_ex3_port);
        Button btnEx4 = findViewById(R.id.btn_ex4_port);
        Button btnEx5 = findViewById(R.id.btn_ex5_port);
        Button btnEx6 = findViewById(R.id.btn_ex6_port);

        setButtonRedirect(btnInterpre, "https://brasilescola.uol.com.br/redacao/a-interpretacao-textual.htm#:~:text=um%20processo%20consciente.-,O%20que%20%C3%A9%20interpreta%C3%A7%C3%A3o%20de%20texto%3F,contexto%20de%20produ%C3%A7%C3%A3o%20desse%20texto.");
        setButtonRedirect(btnFunc, "https://brasilescola.uol.com.br/gramatica/funcoes-linguagem.htm");
        setButtonRedirect(btnVari, "https://www.todamateria.com.br/variacoes-linguisticas/");
        setButtonRedirect(btnFigu, "https://www.todamateria.com.br/figuras-de-linguagem/");
        setButtonRedirect(btnGrama, "https://brasilescola.uol.com.br/gramatica");
        setButtonRedirect(btnMovi, "https://www.todamateria.com.br/movimentos-literarios/");
        setButtonRedirect(btnEx1, "https://www.todamateria.com.br/exercicios-de-interpretacao-de-texto/");
        setButtonRedirect(btnEx2, "https://brasilescola.uol.com.br/gramatica/funcoes-linguagem.htm");
        setButtonRedirect(btnEx3, "https://www.todamateria.com.br/variacoes-linguisticas/");
        setButtonRedirect(btnEx4, "https://www.todamateria.com.br/figuras-de-linguagem/");
        setButtonRedirect(btnEx5, "https://exercicios.brasilescola.uol.com.br/exercicios-gramatica");
        setButtonRedirect(btnEx6, "https://www.todamateria.com.br/exercicios/exercicios-de-literatura/");
    }

    private void setButtonRedirect(Button button, String url) {
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}
