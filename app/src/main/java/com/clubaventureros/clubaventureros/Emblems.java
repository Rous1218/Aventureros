package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Emblems extends AppCompatActivity {
    private Button besos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emblems);

        besos = (Button) findViewById(R.id.regresar18);
        besos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), menuPrincipal.class);
                startActivity(intent);
            }
        });
    }
    public void campaments(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tP5jpNs9NehuTnZy9CxAB_Esrtb5gi6R/view?usp=sharing"));
        startActivity(i);
    }
}