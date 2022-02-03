package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Norte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_norte);

        Button btn = (Button) findViewById(R.id.regresar1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Corderitos.class);
                startActivity(intent);
            }
        });
    }

    public void abc(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14XHS01xOYomDIcoK1BKN64MuNWrEZPNN/view?usp=sharing"));
        startActivity(i);
    }
    public void colores(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xmm60H7i5sby-IOYP2ZxiFY11Z1bXawA/view?usp=sharing"));
        startActivity(i);
    }
    public void compartir(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12fWm3z4qPmCOvkP-9B-GkhkAtUHrVGIX/view?usp=sharing"));
        startActivity(i);
    }
    public void agua(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VuDo-ipdMgVYuvAz2Lzdrdl3-6dh_yHg/view?usp=sharing"));
        startActivity(i);
    }

    public void jesus(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1aORvfdsTg_ZRVtg-3EYNV0Eu2-9mZFyK/view?usp=sharing"));
        startActivity(i);
    }
    public void nino(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1PdGgidGmtZjgYn33it-cazTbl0q1xszS/view?usp=sharing"));
        startActivity(i);
    }
    public void numeros(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Gqw3lF4sAaLE_CGzuNHTi0jcZbU818hh/view?usp=sharing"));
        startActivity(i);
    }

    public void bici(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qJ95321IQIPzjcqQwPTW81WFWGY-COsU/view?usp=sharing"));
        startActivity(i);
    }

    public void adra(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1HIyzSY_tiVjAtV_JzXLeS6aMZJC1DXKT/view?usp=sharing"));
        startActivity(i);
    }


}