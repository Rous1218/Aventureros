package com.clubaventureros.clubaventureros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Manu extends AppCompatActivity {

    public static final String nombres = "nombre";
    // public static final String idUsuario= "idusuario";
    TextView txtBienvenido;
    //TextView textIdusuario;
    private String nombre, idusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manu);

        txtBienvenido=(TextView)findViewById(R.id.txtBienvenido);
        String usuario=getIntent().getStringExtra("nombre");
        txtBienvenido.setText("¡Bienvenido "+ usuario + "!");

        //textIdusuario=(TextView)findViewById(R.id.txtIdUsuario);
        // String idusuario=getIntent().getStringExtra("idusuario");
        //textIdusuario.setText("¡idusuario "+ idusuario + "!");



        Button btn = (Button) findViewById(R.id.menu);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), menuPrincipal.class);
                startActivity(intent);
            }
        });
    }
}