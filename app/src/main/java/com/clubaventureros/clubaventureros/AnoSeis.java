package com.clubaventureros.clubaventureros;import android.content.Intent;import android.net.Uri;import android.os.Bundle;import android.view.View;import android.widget.Button;import androidx.appcompat.app.AppCompatActivity;public class AnoSeis extends AppCompatActivity {    private Button banano;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_ano_seis);        banano= (Button) findViewById(R.id.regresar27);        banano.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View v) {                Intent intent = new Intent(v.getContext(), Plainings.class);                startActivity(intent);            }        });    }    public void cincocorderitos(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_Xtvp0WumgSK6H_xdNkHaLQDAWJEmkXu/view?usp=sharing"));        startActivity(i);    }    public void cincocastorcitos(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VUNjPN7cXaOhvVeivTmZLd__4haDTUZG/view?usp=sharing"));        startActivity(i);    }    public void cincobejas(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11MFxa4JAeBlw58ACGeT1noE0bFiISWqj/view?usp=sharing"));        startActivity(i);    }    public void cincorayos(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1PJDxaKImucTj8cQntGkTIcpsv7UMfwfN/view?usp=sharing"));        startActivity(i);    }    public void cincoconstructores(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11yV92RL5pAt3orgm4B6c41QJvRbRCtU6/view?usp=sharing"));        startActivity(i);    }    public void cincomanos(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1H7008ktEbZHdmCYf6cMYn3fT3tQCuXNg/view?usp=sharing"));        startActivity(i);    }}