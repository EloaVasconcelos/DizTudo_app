package com.example.diztudo_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_mat extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.matematica_act), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btncon = findViewById(R.id.btn_conj);
        Button btnalg = findViewById(R.id.btn_algebra);
        Button btngeo = findViewById(R.id.btn_geo);
        Button btntrigo = findViewById(R.id.btn_trigo);
        Button btnprob = findViewById(R.id.btn_prob);
        Button btncalc = findViewById(R.id.btn_calc);
        Button btnEx1Mat = findViewById(R.id.btn_ex1_mat);
        Button btnEx2Mat = findViewById(R.id.btn_ex2_mat);
        Button btnEx3Mat = findViewById(R.id.btn_ex3_mat);
        Button btnEx4Mat = findViewById(R.id.btn_ex4_mat);
        Button btnEx5Mat = findViewById(R.id.btn_ex5_mat);
        Button btnEx6Mat= findViewById(R.id.btn_ex6_mat);

        setButtonRedirect(btncon, "https://www.todamateria.com.br/teoria-dos-conjuntos/");
        setButtonRedirect(btnalg, "https://www.todamateria.com.br/matematica/algebra/");
        setButtonRedirect(btngeo, "https://www.todamateria.com.br/matematica/geometria/#:~:text=A%20geometria%20%C3%A9%20uma%20%C3%A1rea,a%20%E2%80%9Cmedida%20de%20terra%E2%80%9D.");
        setButtonRedirect(btntrigo, "https://www.todamateria.com.br/trigonometria/");
        setButtonRedirect(btnprob, "https://www.todamateria.com.br/probabilidade/");
        setButtonRedirect(btncalc, "https://descomplica.com.br/blog/corra-e-nao-perca-todas-formulas-de-matematica-que-voce-precisa-decorar-para-o-seu-vestibular/");
        setButtonRedirect(btnEx1Mat, "https://www.todamateria.com.br/teoria-dos-conjuntos/");
        setButtonRedirect(btnEx2Mat, "https://www.todamateria.com.br/matematica/algebra/");
        setButtonRedirect(btnEx3Mat, "https://www.todamateria.com.br/matematica/geometria/#:~:text=A%20geometria%20%C3%A9%20uma%20%C3%A1rea,a%20%E2%80%9Cmedida%20de%20terra%E2%80%9D.");
        setButtonRedirect(btnEx4Mat, "https://www.todamateria.com.br/trigonometria/");
        setButtonRedirect(btnEx5Mat, "https://www.todamateria.com.br/probabilidade/");
        setButtonRedirect(btnEx6Mat, "https://descomplica.com.br/blog/corra-e-nao-perca-todas-formulas-de-matematica-que-voce-precisa-decorar-para-o-seu-vestibular/");
    }

    private void setButtonRedirect(Button button, String url) {
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

    }
}