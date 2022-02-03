package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Koala extends AppCompatActivity {
    private Button luz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koala);

        luz = (Button) findViewById(R.id.regresar7);
        luz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Rompecabezas.class);
                startActivity(intent);
            }
        });
    }

    public void amigui(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LRagYV6Ug7Az35q1Z8h2W5ntADFfSKXE/view?usp=sharing"));
        startActivity(i);
    }
    public void cici(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NAlNLMI9fSZGp5kw6qVMyN4-ki3fQhmc/view?usp=sharing"));
        startActivity(i);
    }
    public void higiene(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1omQTq02stykTdJQyi5tna7bDimx7jilc/view?usp=sharing"));
        startActivity(i);
    }
    public void hoja(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yF-hl0YbsuOHugxZLGBMV0iAaYlTAQKZ/view?usp=sharing"));
        startActivity(i);
    }
    public void jardineritos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ohnVIGdC9-71URfjfZLos0-Z-9bEccb3/view?usp=sharing"));
        startActivity(i);
    }
    public void panaderitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1DtasU07p6rP4ofXzkzMBCWTfSx31Rnu4/view?usp=sharing"));
        startActivity(i);
    }
    public void koala(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Gb5Wq7LTJIWVrtSRj6myqWZBSHuMUEjm/view?usp=sharing"));
        startActivity(i);
    }
    public void adras(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zOtV-TFkiz_IMsoCthCO1Lt77HA9SHmB/view?usp=sharing"));
        startActivity(i);
    }
}