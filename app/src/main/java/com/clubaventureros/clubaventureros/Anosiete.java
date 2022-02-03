package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Anosiete extends AppCompatActivity {
    private Button cacahuate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anosiete);

        cacahuate= (Button) findViewById(R.id.regresar26);
        cacahuate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Plainings.class);
                startActivity(intent);
            }
        });

    }

    public void seiscorderitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1hzL68XCT5Ucd1rOYCkzkhm1yntn5ASKN/view?usp=sharing"));
        startActivity(i);
    }
    public void seiscastorcitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vQAdTVP5wKuOSERi8Tq96avmO5ZTcOuV/view?usp=sharing"));
        startActivity(i);
    }
    public void seisbejas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Zi26JcuFgubcI9tAIBMTNpTqFNOf67qg/view?usp=sharing"));
        startActivity(i);
    }
    public void seisrayos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/15ub2B_drYjMYrjatdkMdYdibdvzQ9Z7q/view?usp=sharing"));
        startActivity(i);
    }
    public void seisconstructores(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KuVqUolRMZONJqcwlDmoF3vxiiXfW3q_/view?usp=sharing"));
        startActivity(i);
    }
    public void seismanos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11JcbimFbLIA0zNquhF6y46kx-K8QfXBX/view?usp=sharing"));
        startActivity(i);
    }
}