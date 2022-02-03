package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Constructordos extends AppCompatActivity {
    private Button nelsondos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructordos);

        nelsondos = (Button) findViewById(R.id.regresar10);
        nelsondos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Constructoruno.class);
                startActivity(intent);
            }
        });


    }
    public void imauno(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1dRe-RTM9I_7XemBof72cQLWQf94i-prL/view?usp=sharing"));
        startActivity(i);
    }
    public void imados(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Tq-oaqBq5YugN58sk5P8Ju0SwWw_t7Iv/view?usp=sharing"));
        startActivity(i);
    }
    public void lagartos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1IsZzkxWUy2JWFJHz4-B3pMuUWfkUnw7f/view?usp=sharing"));
        startActivity(i);
    }
    public void sabio(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1MBAnSNt_yNKX6N5O8ZGrT7_8QZL_3MHm/view?usp=sharing"));
        startActivity(i);
    }
    public void miel(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1l5kQiaDcLund0sFTIC-4BpWu-4WfYo-M/view?usp=sharing"));
        startActivity(i);
    }
    public void nadadordos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1oze4kJEnOF-fsqxl2DwJGGwNc16TEeya/view?usp=sharing"));
        startActivity(i);
    }
    public void olimpiadas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18SC2mjF4sYe44v4zNf8JdKvW1zx_WpB0/view?usp=sharing"));
        startActivity(i);
    }
    public void oracionesdos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/16dhuEARVD6bS3nodKwGGpgZTmU8PE1oh/view?usp=sharing"));
        startActivity(i);
    }
    public void perlas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/15O6RbUus5qpTy4dEhtu_6dgbo78N5n6q/view?usp=sharing"));
        startActivity(i);
    }
    public void pioneros(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1QHXtM1iRGEtvVM3I6S90fngL3sRgR_7L/view?usp=sharing"));
        startActivity(i);
    }
    public void salvar(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1UkyUEz2tjY84IVTtcaDNKbx0zr2jb_6K/view?usp=sharing"));
        startActivity(i);
    }
    public void chinescas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13tpFUFbM2BVwb2Zi6Q0ZggPAmXmc_xT-/view?usp=sharing"));
        startActivity(i);
    }
    public void tarjetas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Sn2HnXJAoK6gIGwdKm2qRP60O3M-znek/view?usp=sharing"));
        startActivity(i);
    }
    public void temperancia(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1aYqlQaTDgQjAFDCbN-EMm2vCz9UbNjBj/view?usp=sharing"));
        startActivity(i);
    }
    public void trovador(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1EL1dORWUn5jC5l3Cj5AGUzc8Uqud-UpL/view?usp=sharing"));
        startActivity(i);
    }



}