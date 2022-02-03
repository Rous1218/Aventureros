package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Yeartwo extends AppCompatActivity {
    private Button nina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeartwo);

        nina= (Button) findViewById(R.id.regresar20);
        nina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Plainings.class);
                startActivity(intent);
            }
        });
    }

    public void yeatwocorderitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14BJP_GQ5P7mXiP4bjaSos7xGC54-V1z4/view?usp=sharing"));
        startActivity(i);
    }
    public void yeatwocastorcitos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1wX17cWrqlGHUlQqBSFcDEqPAIOBtcD0j/view?usp=sharing"));
        startActivity(i);
    }
    public void yeatwoabejas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17waK6T6MYWjPXwcGaSpsIii8tYGU8JGR/view?usp=sharing"));
        startActivity(i);
    }
    public void yeatworayos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fPW385cKZIYzswgWxjten3hvLftfFg8W/view?usp=sharing"));
        startActivity(i);
    }
    public void yeatwoconstructores(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1bL4Tm9wswtA5QafaGpTMVPqjh-xg1Exc/view?usp=sharing"));
        startActivity(i);
    }
    public void yeatwomanos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rN-6ny6Pmoz0nR4kzdDMFqMNQI0AxpQH/view?usp=sharing"));
        startActivity(i);
    }

}