package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Plainings extends AppCompatActivity {
    private Button chang;
    private Button uno;
    private Button zanahoria;
    private Button uva;
    private Button pitaya;
    private Button aguacate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plainings);

        chang = (Button) findViewById(R.id.regresar19);
        chang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), menuPrincipal.class);
                startActivity(intent);
            }
        });
        uno= (Button) findViewById(R.id.yeartwo);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Yeartwo.class);
                startActivity(intent);
            }
        });


        zanahoria= (Button) findViewById(R.id.btntres);
        zanahoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AnoCuatro.class);
                startActivity(intent);
            }
        });
        uva= (Button) findViewById(R.id.btncuatro);
        uva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Anocinco.class);
                startActivity(intent);
            }
        });

        pitaya= (Button) findViewById(R.id.btncuatros);
        pitaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AnoSeis.class);
                startActivity(intent);
            }
        });
        aguacate= (Button) findViewById(R.id.btnseis);
        aguacate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Anosiete.class);
                startActivity(intent);
            }
        });


    }
}