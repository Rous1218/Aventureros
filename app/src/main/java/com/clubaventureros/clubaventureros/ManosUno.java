package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ManosUno extends AppCompatActivity {
    private Button papis;
    private Button bruno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manos_uno);

        papis = (Button) findViewById(R.id.siguiuente12);
        papis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ManosDos.class);
                startActivity(intent);
            }
        });

        bruno = (Button) findViewById(R.id.regresar12);
        bruno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Especialidades.class);
                startActivity(intent);
            }
        });

    }

    public void abejase(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1TdjCW2LvieGpGOnxbr84FYRMbEaaVxqG/view?usp=sharing"));
        startActivity(i);
    }
    public void fotos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YR5wMncN6_IoE8qVx7fE91zg8pJQo_7s/view?usp=sharing"));
        startActivity(i);
    }
    public void cariñoso(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1bd8ffd6TdZ0vtmKvmYnWOYLk-w0sNkgW/view?usp=sharing"));
        startActivity(i);
    }
    public void canastero(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1mzNXhN3A8xDNahtXAHjIEQCzHt3OZON5/view?usp=sharing"));
        startActivity(i);
    }
    public void canotaje(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ZSu01K6OeAdUWNs5T-P1FetuCZwBpX3g/view?usp=sharing"));
        startActivity(i);
    }
    public void carpintero(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1cznofXKj3cR5JM8WohF3RIerWncLcQUS/view?usp=sharing"));
        startActivity(i);
    }
    public void naciones(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qgQezTYQq7q4xGL2tQD1LayR3sAgFsCa/view?usp=sharing"));
        startActivity(i);
    }
    public void ecologo(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1s2uRhvo7OJrIyBl-UgVoMQVbV8A8ThqL/view?usp=sharing"));
        startActivity(i);
    }
    public void equitacion(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19cGd_wQBlKHvtwzOBG6m4RWP6JuEJO34/view?usp=sharing"));
        startActivity(i);
    }
    public void espiritu(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1F4Qjc4WmvAD4Q9N14SMvGRgcFve9Xa1_/view?usp=sharing"));
        startActivity(i);
    }
    public void bibliados(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1axAT2Id4pdjW3qUlSwzyZzjAOHLdTnWR/view?usp=sharing"));
        startActivity(i);
    }
    public void explorador(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1M4lIKmFpy2_83e_FDA8uxa08J7av7PIe/view?usp=sharing"));
        startActivity(i);
    }
    public void fruto(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1X1IO4MkhcAfwAxEkwBOp7tYewjwhiOv0/view?usp=sharing"));
        startActivity(i);
    }
    public void geologo(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Nf4yKEOaT6qIiHIp4NBtF_kE9X4TIQYb/view?usp=sharing"));
        startActivity(i);
    }
    public void signos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/10hg-oLGCWeSF2AKnCb10u3lGJdxKbe3C/view?usp=sharing"));
        startActivity(i);
    }
    public void habitat(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VO0wyV2khs_JqlQ6RR-gbzF222S-WG8y/view?usp=sharing"));
        startActivity(i);
    }
    public void higienes(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1c21vDLYYnJGPmKTv-S4AZr37IXevnQVi/view?usp=sharing"));
        startActivity(i);
    }
    public void iglesia(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1g2vIcDXscm8kAeN1bejlhQJznGDmPcOF/view?usp=sharing"));
        startActivity(i);
    }
    public void nudos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VConoZFvww6n9FfcfAh-uTcbI3-_3nJz/view?usp=sharing"));
        startActivity(i);
    }
    public void paladin(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1BCb8F617yYsL-dRKX7joJ3Q-kLMKEIF5/view?usp=sharing"));
        startActivity(i);
    }
}