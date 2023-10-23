package com.jj.mar;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class Ejercicios extends AppCompatActivity {

    VideoView VVEjercicio;
    TextView TxtTitulo,Txt1;
    ImageView ImageV1;
    Button BtnE1,BtnE2,BtnE3,BtnE4,BtnE5,BtnE6,BtnE7,BtnPlayPause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);
        BtnPlayPause=findViewById(R.id.btnPlayPause);
        BtnPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(VVEjercicio.isPlaying()){
                    VVEjercicio.pause();
                    BtnPlayPause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(Ejercicios.this,"Pausa",Toast.LENGTH_LONG).show();
                }
                else{
                    VVEjercicio.start();
                    BtnPlayPause.setBackgroundResource(R.drawable.pause);
                    Toast.makeText(Ejercicios.this,"Play",Toast.LENGTH_LONG).show();
                }
            }
        });
        /*-----------------------------------------------------------------------------------------------------------*/
        VVEjercicio=findViewById(R.id.VVEjercicios);
        VVEjercicio.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.instructivo));
        VVEjercicio.start();
        /*-----------------------------------------------------------------------------------------------------------*/
        BtnE1=findViewById(R.id.btnPlay1);
        BtnE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VVEjercicio=findViewById(R.id.VVEjercicios);
                VVEjercicio.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.eje1));
                VVEjercicio.start();
                TxtTitulo=findViewById(R.id.TxtTitulo);
                TxtTitulo.setText(R.string.ejercicio1_1);
                Txt1=findViewById(R.id.Txt1);
                Txt1.setText(R.string.ejercicio1_2);
                ImageV1=findViewById(R.id.ImageV1);
                ImageV1.setBackgroundResource(R.drawable.praxias);

            }
        });
        BtnE2=findViewById(R.id.btnPlay2);
        BtnE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VVEjercicio=findViewById(R.id.VVEjercicios);
                VVEjercicio.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.eje2));
                VVEjercicio.start();

                TxtTitulo=findViewById(R.id.TxtTitulo);
                TxtTitulo.setText(R.string.ejercicio2_1);
                Txt1=findViewById(R.id.Txt1);
                Txt1.setText(R.string.ejercicio2_2);
                ImageV1=findViewById(R.id.ImageV1);
                ImageV1.setBackgroundResource(R.drawable.eje1);

            }
        });

        BtnE3=findViewById(R.id.btnPlay3);
        BtnE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VVEjercicio=findViewById(R.id.VVEjercicios);
                VVEjercicio.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.eje3));
                VVEjercicio.start();

                TxtTitulo=findViewById(R.id.TxtTitulo);
                TxtTitulo.setText(R.string.ejercicio3_1);
                Txt1=findViewById(R.id.Txt1);
                Txt1.setText(R.string.ejercicio3_2);
                ImageV1=findViewById(R.id.ImageV1);
                ImageV1.setBackgroundResource(R.drawable.eje3);

            }
        });
        BtnE4=findViewById(R.id.btnPlay4);
        BtnE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VVEjercicio=findViewById(R.id.VVEjercicios);
                VVEjercicio.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.eje4));
                VVEjercicio.start();

                TxtTitulo=findViewById(R.id.TxtTitulo);
                TxtTitulo.setText(R.string.ejercicio4_1);
                Txt1=findViewById(R.id.Txt1);
                Txt1.setText(R.string.ejercicio4_2);
                ImageV1=findViewById(R.id.ImageV1);
                ImageV1.setBackgroundResource(R.drawable.eje4);

            }
        });
        BtnE5=findViewById(R.id.btnPlay5);
        BtnE5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VVEjercicio=findViewById(R.id.VVEjercicios);
                VVEjercicio.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.eje5));
                VVEjercicio.start();

                TxtTitulo=findViewById(R.id.TxtTitulo);
                TxtTitulo.setText(R.string.ejercicio5_1);
                Txt1=findViewById(R.id.Txt1);
                Txt1.setText(R.string.ejercicio5_2);
                ImageV1=findViewById(R.id.ImageV1);
                ImageV1.setBackgroundResource(R.drawable.eje5);

            }
        });
        BtnE6=findViewById(R.id.btnPlay6);
        BtnE6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VVEjercicio=findViewById(R.id.VVEjercicios);
                VVEjercicio.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.eje6));
                VVEjercicio.start();

                TxtTitulo=findViewById(R.id.TxtTitulo);
                TxtTitulo.setText(R.string.ejercicio6_1);
                Txt1=findViewById(R.id.Txt1);
                Txt1.setText(R.string.ejercicio6_2);
                ImageV1=findViewById(R.id.ImageV1);
                ImageV1.setBackgroundResource(R.drawable.eje6);

            }
        });
        BtnE7=findViewById(R.id.btnPlay7);
        BtnE7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VVEjercicio=findViewById(R.id.VVEjercicios);
                VVEjercicio.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.eje7));
                VVEjercicio.start();

                TxtTitulo=findViewById(R.id.TxtTitulo);
                TxtTitulo.setText(R.string.ejercicio7_1);
                Txt1=findViewById(R.id.Txt1);
                Txt1.setText(R.string.ejercicio7_2);
                ImageV1=findViewById(R.id.ImageV1);
                ImageV1.setBackgroundResource(R.drawable.eje7);

            }
        });
    }
}
