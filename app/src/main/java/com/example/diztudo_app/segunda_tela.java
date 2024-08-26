package com.example.diztudo_app;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class segunda_tela extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda_tela);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.portugues_act), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        music1_exatas = (Button)findViewById(R.id.music1_exatas);
        music2_exatas = (Button)findViewById(R.id.music2_exatas);
        music3_exatas = (Button)findViewById(R.id.music3_exatas);
        music4_exatas = (Button)findViewById(R.id.music4_exatas);
        music5_exatas = (Button)findViewById(R.id.music5_exatas);
        music6_exatas = (Button)findViewById(R.id.music6_exatas);
        music7_exatas = (Button)findViewById(R.id.music7_exatas);

        //botões de áudio
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.fracao);

        music1_exatas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();

                } else {
                    mediaPlayer.start();

                }

            }
        });

        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.geometria);

        music2_exatas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer1.isPlaying()) {
                    mediaPlayer1.pause();
                } else {
                    mediaPlayer1.start();
                }
            }
        });

        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.logaritmo);

        music3_exatas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.pause();
                } else {
                    mediaPlayer2.start();
                }
            }
        });

        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.hipotenusa);

        music4_exatas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.pause();
                } else {
                    mediaPlayer3.start();
                }
            }
        });

        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.trigonometria);

        music5_exatas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer4.isPlaying()) {
                    mediaPlayer4.pause();
                } else {
                    mediaPlayer4.start();
                }
            }
        });

        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.expressaonumeria);

        music6_exatas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer5.isPlaying()) {
                    mediaPlayer5.pause();
                } else {
                    mediaPlayer5.start();
                }
            }
        });
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.divisibilidade);

        music7_exatas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer6.isPlaying()) {
                    mediaPlayer6.pause();
                } else {
                    mediaPlayer6.start();
                }
            }
        });


    }
    Button music1_exatas;
    Button music2_exatas;
    Button music3_exatas;
    Button music4_exatas;
    Button music5_exatas;
    Button music6_exatas;
    Button music7_exatas;
}
