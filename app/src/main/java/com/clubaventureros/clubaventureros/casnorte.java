package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class casnorte extends AppCompatActivity {
    private Button ross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casnorte);

        ross = (Button) findViewById(R.id.regresar6);
        ross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Rompecabezas.class);
                startActivity(intent);
            }
        });
    }

    public void cast(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YFLnn5Rtrj25xtSZe38YAjewBwlGuUcE/view?usp=sharing"));
        startActivity(i);
    }
    public void cena(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Sj_CpJg_diSb_lD9CD-GV7QwPGTtbm8S/view?usp=sharing"));
        startActivity(i);
    }
    public void corazones(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vvsb0KcARLuuarhoz6MxtZQH0hzdp8a6/view?usp=sharing"));
        startActivity(i);
    }
    public void sellos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ldAoVdZqUED3WKzprhW63Y_Dm6pun8__/view?usp=sharing"));
        startActivity(i);
    }
    public void jugando(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/16fYOQVVW76PDjFPigcLHkk60ch6zAfx4/view?usp=sharing"));
        startActivity(i);
    }

    public void palabra(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1lRmg37BZ5gNZCwMEMPcPVXcNPLYORHRK/view?usp=sharing"));
        startActivity(i);
    }
}