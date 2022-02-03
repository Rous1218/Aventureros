package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Corderitos extends AppCompatActivity {
    private Button abel;
    private Button florida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corderitos);

        Button btn = (Button) findViewById(R.id.btncentral);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Prueba.class);
                startActivity(intent);
            }
        });

        Button button = (Button) findViewById(R.id.btnregresar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), menuPrincipal.class);
                startActivity(intent);
            }
        });

        abel = (Button) findViewById(R.id.abel);
        abel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Norte.class);
                startActivity(intent);
            }
        });

        florida =(Button) findViewById(R.id.florida);
        florida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), Florida.class);
                startActivity(intent);
            }
        });



    }

}