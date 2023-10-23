package com.jj.mar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cuento extends AppCompatActivity {

    Button btnPlayTortuga,BtnPlayArrecife,BtnPlayTiburon,BtnPlayRed,BtnPlayBarco, BtnPlayPescador;
    MediaPlayer mpTortuga,mpArrecife,mpTiburon,mpRed,mpBarco,mpPescador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuento);
        btnPlayTortuga=findViewById(R.id.btnPlayTortuga);
        mpTortuga=MediaPlayer.create(this,R.raw.tortuga);
        btnPlayTortuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpTortuga.start();
                //btnPlay.setBackgroundResource(R.drawable.arrecife);
                Toast.makeText(Cuento.this, "Tortuga", Toast.LENGTH_SHORT).show();
            }
        });
        BtnPlayPescador=findViewById(R.id.btnPlayPescador);
        mpPescador=MediaPlayer.create(this,R.raw.pescador);
        BtnPlayPescador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpPescador.start();
                //btnPlay.setBackgroundResource(R.drawable.arrecife);
                Toast.makeText(Cuento.this, "Pescador", Toast.LENGTH_SHORT).show();
            }
        });
        BtnPlayBarco=findViewById(R.id.btnPlayBarco);
        mpBarco=MediaPlayer.create(this,R.raw.barco);
        BtnPlayBarco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpBarco.start();
                //btnPlay.setBackgroundResource(R.drawable.arrecife);
                Toast.makeText(Cuento.this, "Barco", Toast.LENGTH_SHORT).show();
            }
        });
        BtnPlayRed=findViewById(R.id.btnPlayRed);
        mpRed=MediaPlayer.create(this,R.raw.red);
        BtnPlayRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpRed.start();
                //btnPlay.setBackgroundResource(R.drawable.arrecife);
                Toast.makeText(Cuento.this, "Red", Toast.LENGTH_SHORT).show();
            }
        });
        BtnPlayTiburon=findViewById(R.id.btnPlayTiburon);
        mpTiburon=MediaPlayer.create(this,R.raw.tiburon);
        BtnPlayTiburon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpTiburon.start();
                //btnPlay.setBackgroundResource(R.drawable.arrecife);
                Toast.makeText(Cuento.this, "Tiburon", Toast.LENGTH_SHORT).show();
            }
        });
        BtnPlayArrecife=findViewById(R.id.btnPlayArrecife);
        mpArrecife=MediaPlayer.create(this,R.raw.arrecife);
        BtnPlayArrecife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpArrecife.start();
                //btnPlay.setBackgroundResource(R.drawable.arrecife);
                Toast.makeText(Cuento.this, "Arrecife", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
