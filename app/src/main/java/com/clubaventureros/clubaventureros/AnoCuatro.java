package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AnoCuatro extends AppCompatActivity {
    private Button jirafa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ano_cuatro);


        jirafa= (Button) findViewById(R.id.regresar22);
        jirafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Plainings.class);
                startActivity(intent);
            }
        });
    }

    public void trescorderitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18K43saZRs-Rf2W-I2o60OZOr7LI5DdJh/view?usp=sharing"));
        startActivity(i);
    }
    public void trescastorcitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1B0EQQx17XbmN3KpyW8Xpi4enYXkULu8d/view?usp=sharing"));
        startActivity(i);
    }
    public void tresabejas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1sDV5CZrM8iwe5GYojj56bLgtCtrYdFQS/view?usp=sharing"));
        startActivity(i);
    }
    public void tresrayos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1pcOy4E42N1F9sjBOcfghop_q0bAsI1mP/view?usp=sharing"));
        startActivity(i);
    }
    public void tresconstructores(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yafCff_kRPi92AYB79E7LhlloJjvA7tN/view?usp=sharing"));
        startActivity(i);
    }
    public void tresmanos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fseo_3ghqxrh589UkF2xkNua9sHUBxXC/view?usp=sharing"));
        startActivity(i);
    }
}