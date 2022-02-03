package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Rompecabezas extends AppCompatActivity {
    private Button cascentral;
    private Button casnorte;
    private Button mami;
    private Button koala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rompecabezas);


        cascentral = (Button) findViewById(R.id.cascentral);
        cascentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Cascentral.class);
                startActivity(intent);
            }
        });

        casnorte = (Button) findViewById(R.id.casnorte);
        casnorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), casnorte.class);
                startActivity(intent);
            }
        });

        mami = (Button) findViewById(R.id.regresar4);
        mami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Especialidades.class);
                startActivity(intent);
            }
        });
        koala= (Button) findViewById(R.id.cassur);
        koala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Koala.class);
                startActivity(intent);
            }
        });
    }
}