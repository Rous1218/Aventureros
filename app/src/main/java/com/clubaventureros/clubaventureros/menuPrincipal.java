package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menuPrincipal extends AppCompatActivity {
    private Button celestes;
    private Button manuales;
    private Button uniformes;
    private Button emblemas;
    private Button plains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);


        Button btn = (Button) findViewById(R.id.btnespecialidades);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Especialidades.class);
                startActivity(intent);
            }
        });

        celestes = (Button) findViewById(R.id.btnfolletos);
        celestes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), brochures.class);
                startActivity(intent);
            }
        });
        manuales = (Button) findViewById(R.id.btnmanuales);
        manuales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Manuals.class);
                startActivity(intent);
            }
        });

        uniformes = (Button) findViewById(R.id.btnuniformes);
        uniformes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Uniforms.class);
                startActivity(intent);
            }
        });

        emblemas = (Button) findViewById(R.id.btnactividades);
        emblemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Emblems.class);
                startActivity(intent);
            }
        });

        plains = (Button) findViewById(R.id.btnplanificador);
        plains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Plainings.class);
                startActivity(intent);
            }
        });
    }
}