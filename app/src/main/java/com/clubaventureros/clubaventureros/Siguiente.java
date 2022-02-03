package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Siguiente extends AppCompatActivity {
    private Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente);

        atras = (Button) findViewById(R.id.atras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Cascentral.class);
                startActivity(intent);
            }
        });
    }

    public void medidas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1F2o2_wdQMtWv0Y5wXxYU-oHbtD9Wfe58/view?usp=sharing"));
        startActivity(i);
    }
    public void friend(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xrrBRnIoiNaiDb7ZfF8d17alyUBPZCSr/view?usp=sharing"));
        startActivity(i);
    }
    public void mundo(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ZklK8SphQ4TW5u28xvZziEHY6YX9PoxW/view?usp=sharing"));
        startActivity(i);
    }
    public void ciclismo(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vwhqlbl3dACASjqzSrzTpv_EbPpEm_4_/view?usp=sharing"));
        startActivity(i);
    }
    public void principiante(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1jgE1vFJy1LUMbnmnPvCuwGQh32P9Tdc_/view?usp=sharing"));
        startActivity(i);
    }
    public void rompe(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Fj8_iAiepk8sPQNcr1M4PYwa49G15r5l/view?usp=sharing"));
        startActivity(i);
    }
    public void incendios(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FsqdHEbmr55WJAoLzUAGaT8syN5MD6JC/view?usp=sharing"));
        startActivity(i);
    }
    public void tesoro(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NggPLGniDQYSwjhsMCu-APbMUa6LKMmW/view?usp=sharing"));
        startActivity(i);
    }

}