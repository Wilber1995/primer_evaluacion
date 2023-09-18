package com.example.primer_evaluacion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primer_evaluacion.clases.Publicacion;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnAgregarPublicacion, btnMostrarLista, btnAcercaDe;
    public static ArrayList<Publicacion> lstPublicaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPublicaciones = new ArrayList<Publicacion>();



        btnAgregarPublicacion = findViewById(R.id.btnAgregar);
        btnMostrarLista  = findViewById(R.id.btnMostrarLista);
        btnAcercaDe = findViewById(R.id.btnAcercaDe);

        // Configurando evento

        btnAgregarPublicacion.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ElegirTipoPublicacion.class));
        });
        btnMostrarLista.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MostrarListas.class));
        });
        btnAcercaDe.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AcercaDelProgramador.class));
        });

    }






}