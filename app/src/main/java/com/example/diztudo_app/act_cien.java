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

public class act_cien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_act_cien);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ciencias_act), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btncito = findViewById(R.id.btn_cito);
        Button btngene = findViewById(R.id.btn_gene);
        Button btneco = findViewById(R.id.btn_eco);
        Button btnfisio = findViewById(R.id.btn_fisio);
        Button btnbota = findViewById(R.id.btn_bota);
        Button btnmicro = findViewById(R.id.btn_micro);
        Button btnEx1Cien = findViewById(R.id.btn_ex1_cien);
        Button btnEx2Cien = findViewById(R.id.btn_ex2_cien);
        Button btnEx3Cien = findViewById(R.id.btn_ex3_cien);
        Button btnEx4Cien = findViewById(R.id.btn_ex4_cien);
        Button btnEx5Cien = findViewById(R.id.btn_ex5_cien);
        Button btnEx6Cien= findViewById(R.id.btn_ex6_cien);

        setButtonRedirect(btncito, "https://www.todamateria.com.br/citologia/");
        setButtonRedirect(btngene, "https://www.todamateria.com.br/introducao-a-genetica/");
        setButtonRedirect(btneco, "https://brasilescola.uol.com.br/biologia/ecologia.htm#:~:text=Ecologia%20%C3%A9%20a%20ci%C3%AAncia%20que%20estuda%20as%20rela%C3%A7%C3%B5es%20entre%20os,%2C%20popula%C3%A7%C3%B5es%2C%20comunidades%20e%20ecossistemas.");
        setButtonRedirect(btnfisio, "https://www.todamateria.com.br/fisiologia/");
        setButtonRedirect(btnbota, "https://www.todamateria.com.br/botanica-o-estudo-das-plantas/");
        setButtonRedirect(btnmicro, "https://brasilescola.uol.com.br/biologia/microbiologia.htm");
        setButtonRedirect(btnEx1Cien, "https://www.todamateria.com.br/citologia/");
        setButtonRedirect(btnEx2Cien, "https://www.todamateria.com.br/introducao-a-genetica/");
        setButtonRedirect(btnEx3Cien, "https://brasilescola.uol.com.br/biologia/ecologia.htm#:~:text=Ecologia%20%C3%A9%20a%20ci%C3%AAncia%20que%20estuda%20as%20rela%C3%A7%C3%B5es%20entre%20os,%2C%20popula%C3%A7%C3%B5es%2C%20comunidades%20e%20ecossistemas.");
        setButtonRedirect(btnEx4Cien, "https://www.todamateria.com.br/fisiologia/");
        setButtonRedirect(btnEx5Cien, "https://www.todamateria.com.br/botanica-o-estudo-das-plantas/");
        setButtonRedirect(btnEx6Cien, "https://brasilescola.uol.com.br/biologia/microbiologia.htm");
    }

    private void setButtonRedirect(Button button, String url) {
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

    }
}
