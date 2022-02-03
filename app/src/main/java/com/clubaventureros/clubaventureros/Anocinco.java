package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Anocinco extends AppCompatActivity {
    private Button sandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anocinco);

        sandia= (Button) findViewById(R.id.regresar25);
        sandia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Plainings.class);
                startActivity(intent);
            }
        });
    }

    public void cuatrocorderitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1RNv8MIlX-bdeZo7IOJkT1yRxLMZfsXDM/view?usp=sharing"));
        startActivity(i);
    }
    public void cuatrocastorcitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1hoaTVkU6wcrCsIDuVG1SrCSb2OIGRtmI/view?usp=sharing"));
        startActivity(i);
    }
    public void cuatroabejas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1oOcdwWGJERgcXqsHwBvVzEAwWxR55uwA/view?usp=sharing"));
        startActivity(i);
    }
    public void cuatrorayos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1t16LXqKxu-BrMLyOp_QU4WfwL1TCFYrN/view?usp=sharing"));
        startActivity(i);
    }
    public void cuatroconstructores(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WqwYMtdGzzozw7ggxBHlin3F3iEfNa48/view?usp=sharing"));
        startActivity(i);
    }
    public void cuatromanos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zh-edEuO5Qs3uh4J__h1wvjpeOxRV6c5/view?usp=sharing"));
        startActivity(i);
    }
}