package com.clubaventureros.clubaventureros;import android.content.Intent;import android.net.Uri;import android.os.Bundle;import android.view.View;import android.widget.Button;import androidx.appcompat.app.AppCompatActivity;public class Manuals extends AppCompatActivity {    private Button maya;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_manuals);        maya = (Button) findViewById(R.id.regresar16);        maya.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View v) {                Intent intent = new Intent(v.getContext(), menuPrincipal.class);                startActivity(intent);            }        });    }    public void nudese(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1IwsKlUaUWbpx5NMRP-2xKS28bJhL2eUu/view?usp=sharing"));        startActivity(i);    }    public void marchas(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1QhsJK3sqIlXmptC762VhuXfU0z42Ii_y/view?usp=sharing"));        startActivity(i);    }    public void aventures(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1O9Rwa11c6g5hnqtf4ivJcIQMKty5MJhX/view?usp=sharing"));        startActivity(i);    }    public void guia(View view){        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1TBKLzCD8fOQNwyIhILSVE2ko8BUhuzTH/view?usp=sharing"));        startActivity(i);    }}