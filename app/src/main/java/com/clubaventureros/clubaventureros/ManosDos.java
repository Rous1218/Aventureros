package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ManosDos extends AppCompatActivity {
    private Button brunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manos_dos);

        brunos = (Button) findViewById(R.id.regresar13);
        brunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ManosUno.class);
                startActivity(intent);
            }
        });
    }
    public void pasos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-NVPWKaIC_kgC5M5Jkh2EAnYIGTG08Bk/view?usp=sharing"));
        startActivity(i);
    }
    public void patinador(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KiUzWtVCeWDZuXOCI_oxSzswKzuSaJTp/view?usp=sharing"));
        startActivity(i);
    }
    public void promesas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Ch-R9hNyRA8DkozTIoQZ6KoPpqeM5R6A/view?usp=sharing"));
        startActivity(i);
    }
    public void puertas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1cYwLbh0ipfVxsOk8OwpXoVKMDmsfGlQT/view?usp=sharing"));
        startActivity(i);
    }
    public void puereza(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1pEWDjnRqhxMH9f2GGW4UfIwkR7ZNdRjU/view?usp=sharing"));
        startActivity(i);
    }
    public void tabernaculo(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/15rA8DQydU-WvK7-Svr6ZthO0wvadaswT/view?usp=sharing"));
        startActivity(i);
    }
    public void tecnologia(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NTUHYwBIw68I28GrhX6Px0mDzvbxjR9V/view?usp=sharing"));
        startActivity(i);
    }
    public void tiemposs(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1AY2kyxwqqwHDc_IBt1iezYh14epka_ru/view?usp=sharing"));
        startActivity(i);
    }
    public void tiro(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1HQaujnRQ6fiyKGtApoY_zEw4VArjQL4O/view?usp=sharing"));
        startActivity(i);
    }
}