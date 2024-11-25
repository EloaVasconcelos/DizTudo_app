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

public class activity_filo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_filo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.act_filo), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnfant = findViewById(R.id.btn_fant);
        Button btnfmed = findViewById(R.id.btn_fmed);
        Button btnfmod = findViewById(R.id.btn_fmod);
        Button btnfcont = findViewById(R.id.btn_fcont);
        Button btnetica = findViewById(R.id.btn_etica);
        Button btnmfbr = findViewById(R.id.btn_fbr);
        Button btnEx1Filo = findViewById(R.id.btn_ex1_filo);
        Button btnEx2Filo = findViewById(R.id.btn_ex2_filo);
        Button btnEx3Filo = findViewById(R.id.btn_ex3_filo);
        Button btnEx4Filo = findViewById(R.id.btn_ex4_filo);
        Button btnEx5Filo = findViewById(R.id.btn_ex5_filo);
        Button btnEx6Filo= findViewById(R.id.btn_ex6_filo);

        setButtonRedirect(btnfant, "https://www.todamateria.com.br/filosofia-antiga/");
        setButtonRedirect(btnfmed, "https://www.todamateria.com.br/filosofia-medieval/");
        setButtonRedirect(btnfmod, "https://www.todamateria.com.br/filosofia-moderna/");
        setButtonRedirect(btnfcont, "https://www.todamateria.com.br/filosofia-contemporanea/");
        setButtonRedirect(btnetica, "https://www.todamateria.com.br/etica/");
        setButtonRedirect(btnmfbr, "https://mundoeducacao.uol.com.br/filosofia/filosofia-no-brasil.htm");
        setButtonRedirect(btnEx1Filo, "https://www.todamateria.com.br/filosofia-antiga/");
        setButtonRedirect(btnEx2Filo, "https://www.todamateria.com.br/filosofia-medieval/");
        setButtonRedirect(btnEx3Filo, "https://www.todamateria.com.br/filosofia-moderna/");
        setButtonRedirect(btnEx4Filo, "https://www.todamateria.com.br/filosofia-contemporanea/");
        setButtonRedirect(btnEx5Filo, "https://www.todamateria.com.br/etica/");
        setButtonRedirect(btnEx6Filo, "https://mundoeducacao.uol.com.br/filosofia/filosofia-no-brasil.htm");
    }

    private void setButtonRedirect(Button button, String url) {
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}