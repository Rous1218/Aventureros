package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class brochures extends AppCompatActivity {
    private Button nelsontres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brochures);

        nelsontres = (Button) findViewById(R.id.regresar15);
        nelsontres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), menuPrincipal.class);
                startActivity(intent);
            }
        });
    }
    public void focorderitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1SVfhHidCoT_mf_P0yh9V53pRPnGUS1Dg/view?usp=sharing"));
        startActivity(i);
    }
    public void focastorcitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1TgqMrwI5tn0lvXwes2GpHI9ETeF5toVv/view?usp=sharing"));
        startActivity(i);
    }
    public void focabejitas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1GUata7vtaVRaIMsNFM33qexHk2HUhwRT/view?usp=sharing"));
        startActivity(i);
    }
    public void forayos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xnEhPsN_nvzfQXcWEo1TuBCUjSugNxyJ/view?usp=sharing"));
        startActivity(i);
    }
    public void foconstructores(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1v1x2EU1DNBnFkGbcPrVjAEioRmUQlGtm/view?usp=sharing"));
        startActivity(i);
    }
    public void fomanos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xPM1WmZYByY1us_kJJmQINSESKtVm6gm/view?usp=sharing"));
        startActivity(i);
    }
    public void tacorderitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1RDJAMs3-kDoQNnn961p99ziEEHBzkitO/view?usp=sharing"));
        startActivity(i);
    }
    public void tacastorcitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1GM49e32Q88VCJfhmZSDTMprl4B6lLk5R/view?usp=sharing"));
        startActivity(i);
    }
    public void tabejitas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1F8eWgGvW5fdaEMsaAOPOT84ENwGThFsg/view?usp=sharing"));
        startActivity(i);
    }
    public void tarayos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17-j9VvKcVG6N345nyFhxBs5IUunNqmnu/view?usp=sharing"));
        startActivity(i);
    }
    public void taconstructores(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1814wbKN7THPs0LRTiFIxNQHMP9UdAYim/view?usp=sharing"));
        startActivity(i);
    }
    public void tamanos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ft-7ytJbb-2LDZQv64qGXDMRgEhuXEjo/view?usp=sharing"));
        startActivity(i);
    }
}