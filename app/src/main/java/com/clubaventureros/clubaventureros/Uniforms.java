package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Uniforms extends AppCompatActivity {
    private Button casaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniforms);

        casaca = (Button) findViewById(R.id.regresar17);
        casaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), menuPrincipal.class);
                startActivity(intent);
            }
        });
    }
    public void uniformes(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/114He8hpn0TQaiHgCnqV2xV8m-hOwYDpY/view?usp=sharing"));
        startActivity(i);
    }
}