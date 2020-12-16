package com.example.appmemory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonjugar, buttonsalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonjugar = (Button)findViewById(R.id.btnJugar);
        buttonsalir = (Button)findViewById(R.id.btnSalir);

        buttonjugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Loading..");
                iniciarJuego();
            }
        });

        buttonsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    //Metodo de Inicio
    private void iniciarJuego(){
        Intent i = new Intent(this, Memory.class);
        startActivity(i);
    }





}