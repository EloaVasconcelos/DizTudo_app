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

public class activity_hist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hist);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.act_filo), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnph = findViewById(R.id.btn_ph);
        Button btnim = findViewById(R.id.btn_im);
        Button btnimod = findViewById(R.id.btn_imod);
        Button btnicont = findViewById(R.id.btn_icont);
        Button btnsecxx = findViewById(R.id.btn_secxx);
        Button btnmbrc = findViewById(R.id.btn_brc);
        Button btnEx1Hist = findViewById(R.id.btn_ex1_hist);
        Button btnEx2Hist = findViewById(R.id.btn_ex2_hist);
        Button btnEx3Hist = findViewById(R.id.btn_ex3_hist);
        Button btnEx4Hist = findViewById(R.id.btn_ex4_hist);
        Button btnEx5Hist = findViewById(R.id.btn_ex5_hist);
        Button btnEx6Hist= findViewById(R.id.btn_ex6_hist);

        setButtonRedirect(btnph, "https://www.todamateria.com.br/pre-historia-resumo/");
        setButtonRedirect(btnim, "https://www.todamateria.com.br/idade-media/");
        setButtonRedirect(btnimod, "https://www.todamateria.com.br/idade-moderna/");
        setButtonRedirect(btnicont, "https://www.todamateria.com.br/idade-contemporanea/");
        setButtonRedirect(btnsecxx, "https://brasilescola.uol.com.br/guerras/seculo-xx.htm");
        setButtonRedirect(btnmbrc, "https://www.todamateria.com.br/brasil-colonia/");
        setButtonRedirect(btnEx1Hist, "https://www.todamateria.com.br/pre-historia-resumo/");
        setButtonRedirect(btnEx2Hist, "https://www.todamateria.com.br/idade-media/");
        setButtonRedirect(btnEx3Hist, "https://www.todamateria.com.br/idade-moderna/");
        setButtonRedirect(btnEx4Hist, "https://www.todamateria.com.br/idade-contemporanea/");
        setButtonRedirect(btnEx5Hist, "ttps://brasilescola.uol.com.br/guerras/seculo-xx.htm");
        setButtonRedirect(btnEx6Hist, "https://www.todamateria.com.br/brasil-colonia/");
    }

    private void setButtonRedirect(Button button, String url) {
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}