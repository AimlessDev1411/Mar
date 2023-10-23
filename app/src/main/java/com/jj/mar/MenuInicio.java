package com.jj.mar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuInicio extends AppCompatActivity {

    Button btnSalir,btnCuentos,btnMemorama,btnTesoro, btnImitame,btnEjercicios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_inicio);
        btnEjercicios=findViewById(R.id.btnEjercicios);
        btnEjercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuInicio.this,Ejercicios.class));
            }
        });
        btnImitame=findViewById(R.id.btnImitame);
        btnImitame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuInicio.this,Imitame.class));
            }
        });
        btnSalir=findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
                /*No funciona como deberia*/
            }
        });
        btnCuentos=findViewById(R.id.btnCuentos);
        btnCuentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuInicio.this,MenuCuentos.class));
            }
        });
        btnMemorama=findViewById(R.id.btnMemorama);
        btnMemorama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuInicio.this,MenuMemorama.class));
            }
        });
        btnTesoro=findViewById(R.id.btnTesoro);
        btnTesoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuInicio.this,Tesoro.class));
            }
        });
    }
}
