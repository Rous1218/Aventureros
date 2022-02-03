package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Especialidades extends AppCompatActivity {
    private Button castores;
    private Button papi;
    private Button rayos;
    private Button wilfreda;
    private Button manos;
    private Button abejas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especialidades);


        Button btn = (Button) findViewById(R.id.btncorderitos);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Corderitos.class);
                startActivity(intent);
            }
        });

        castores =(Button) findViewById(R.id.castorcitos);
        castores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), Rompecabezas.class);
                startActivity(intent);
            }
        });

        papi =(Button) findViewById(R.id.regresar3);
        papi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), menuPrincipal.class);
                startActivity(intent);
            }
        });

        rayos =(Button) findViewById(R.id.rayos);
        rayos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), rayosuno.class);
                startActivity(intent);
            }
        });

        wilfreda =(Button) findViewById(R.id.btnconstructores);
        wilfreda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), Constructoruno.class);
                startActivity(intent);
            }
        });
        manos = (Button) findViewById(R.id.btnmanos);
        manos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ManosUno.class );
                startActivity(intent);
            }
        });

        abejas = (Button) findViewById(R.id.btnabejas);
        abejas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Abejitas.class );
                startActivity(intent);
            }
        });




    }
}