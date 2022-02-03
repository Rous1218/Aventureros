package com.clubaventureros.clubaventureros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        Animation animacion1= AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        ImageView imageView2 = findViewById(R.id.imageView2);

        textView4.setAnimation(animacion2);
        textView5.setAnimation(animacion2);
        imageView2.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent (MainActivity2.this, menuPrincipal.class);
                startActivity(intent);
                finish();

            }


        }, 4000);



    }
}