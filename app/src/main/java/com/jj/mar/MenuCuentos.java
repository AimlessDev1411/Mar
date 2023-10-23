package com.jj.mar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuCuentos extends AppCompatActivity {

    Button btnCuento1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cuentos);

        btnCuento1=findViewById(R.id.btnCuento1);
        btnCuento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuCuentos.this,Cuento.class));
            }
        });
    }
}
