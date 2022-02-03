package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Prueba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        Button btn = (Button) findViewById(R.id.regresar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Corderitos.class);
                startActivity(intent);
            }
        });
    }

    public void alimentos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1iZQobJ23wWlbHdlvD7ThbW_Nzt0EQXws/view?usp=sharing"));
        startActivity(i);
    }

    public void amigos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19Gf5FEgYLxikK57gRGZTxmI6JJQraI5-/view?usp=sharing"));
        startActivity(i);
    }
    public void zoologico(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1si_Auzc7ZdX12K95SuriIlRlW-bfIv02/view?usp=sharing"));
        startActivity(i);
    }

    public void ayudante(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Ex4wvkREH-zuBk8DNJWvvo_dQOaP4t8D/view?usp=sharing"));
        startActivity(i);
    }

    public void especial(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1bY8VN1NUQksmTSPa_-bI3ZmKc-dn-P-e/view?usp=sharing"));
        startActivity(i);
    }

    public void lana(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1iTAWsehHaHGilqMEDPZJpW-YKB9EI0Ce/view?usp=sharing"));
        startActivity(i);
    }

    public void estrellas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Kd7BWxsUVsNHTQvnqR8X9me81Sn9RkV2/view?usp=sharing"));
        startActivity(i);
    }
    public void insectos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/164bHXcBbmBdl-ezV1fcJZL06wZoJMrzq/view?usp=sharing"));
        startActivity(i);
    }
    public void musica(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JNVdcLXChOQhlpbqcN94iM_N4AimACSc/view?usp=sharing"));
        startActivity(i);
    }
    public void sano(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_cjHZ8pMnIIawfpGTWQfHZ050fW5AVWI/view?usp=sharing"));
        startActivity(i);
    }
    public void tiempo(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1CKGTUBjC7CbtD7LQ5DO_mjHdur9LieGt/view?usp=sharing"));
        startActivity(i);
    }
    public void trenes(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1M0tabVIdT7IT6dux3ZuqDSNSg61vQ0HF/view?usp=sharing"));
        startActivity(i);
    }
    public void dedos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1giXZWZP8xeIM7Pr5wOG-RQc2gtdrs9fV/view?usp=sharing"));
        startActivity(i);
    }

}