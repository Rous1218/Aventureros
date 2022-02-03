package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cascentral extends AppCompatActivity {
    private Button cascentral;
    private Button nelson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cascentral);

        cascentral = (Button) findViewById(R.id.siguiente);
        cascentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Siguiente.class);
                startActivity(intent);
            }
        });

        nelson = (Button) findViewById(R.id.regresar5);
        nelson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Rompecabezas.class);
                startActivity(intent);
            }
        });
    }

    public void amibib(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zFJnK_T9AKeA_Ht8wtdi9LSl09_p2qS8/view?usp=sharing"));
        startActivity(i);
    }
    public void animales(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1DtajF8Vuz_cDqhbfGvU2vr3wXGfpbMJz/view?usp=sharing"));
        startActivity(i);
    }

    public void arte(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1wGFy_Ux777n_TlyDb103njSWLNioZLrQ/view?usp=sharing"));
        startActivity(i);
    }
    public void aves(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1wlWyBBIRSkTyKr4KQ-R0Rzw7oblX-zg4/view?usp=sharing"));
        startActivity(i);
    }
    public void hogar(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1UYgr41cLWS5cfyhz20AfqPzN_6dUeuhH/view?usp=sharing"));
        startActivity(i);
    }

    public void cuerpo(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ULZUS4bfUPi5JX5_Q-2UV_BwiMVXNJ3A/view?usp=sharing"));
        startActivity(i);
    }
    public void crayones(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1n5XCyXt-l2RURzxJI8NWd2srGkSAZRNg/view?usp=sharing"));
        startActivity(i);
    }
    public void diversion(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1uqL1OFbuXnWClGaBnMEDE-nbmIyQ0m9C/view?usp=sharing"));
        startActivity(i);
    }
    public void modales(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_WZ9hs-0EmzCDvpXCKUpGQ8gKyDj4fVu/view?usp=sharing"));
        startActivity(i);
    }
    public void estela(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1pd1JvWEOmZWAAk4hZI2suZabBtdtAjGj/view?usp=sharing"));
        startActivity(i);
    }
    public void figuras(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fyvHGb9OZoJ0afzFxuc5VElEo1WiFz7X/view?usp=sharing"));
        startActivity(i);
    }
    public void hogares(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ATsOfKS89hPTflOv-3kflkQKOg8CpcMv/view?usp=sharing"));
        startActivity(i);
    }
    public void izquierda(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1X2CG0Ua-mslQknLc4YrCWDZwp4QZsvxZ/view?usp=sharing"));
        startActivity(i);
    }
    public void juguetes(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Tn4RllEVlPpwGX61oc2kif-D8wYIGgo8/view?usp=sharing"));
        startActivity(i);
    }
    public void masco(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xpYdxMUoO2ur3zaNptXZoR8d7N1C8PGx/view?usp=sharing"));
        startActivity(i);
    }
}