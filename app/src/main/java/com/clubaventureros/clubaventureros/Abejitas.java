package com.clubaventureros.clubaventureros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Abejitas extends AppCompatActivity {
    private Button salsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abejitas);

        salsa = (Button) findViewById(R.id.regresar28);
        salsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Especialidades.class);
                startActivity(intent);
            }
        });
    }

    public void amix(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1e3ACYOPeAO5bBovwdQw5SXt8RGVZzMst/view?usp=sharing"));
        startActivity(i);
    }
    public void arenix(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zqUWTcM_I5nUebCkyHqDosg4SFKcS9aP/view?usp=sharing"));
        startActivity(i);
    }
    public void artix(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JH_Qk4TcCcInihosn6b5qsFSgX5cTwN3/view?usp=sharing"));
        startActivity(i);
    }
    public void hogarix(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1r8UYJia3eLbsdfBlEDzvoBehlY64un3R/view?usp=sharing"));
        startActivity(i);
    }
    public void botonex(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1lrdXg9I3__0GXL7y4No1VimNhBJ8wt5x/view?usp=sharing"));
        startActivity(i);
    }
    public void seguridadx(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1iyeioI2g8bODUAb69madA3foRuVMGVQm/view?usp=sharing"));
        startActivity(i);
    }

    public void salux(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1DlKu3LXbXLyPBWPsYi1uJS87oc06rhpY/view?usp=sharing"));
        startActivity(i);
    }

    public void bibliax(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/10UeKiCFOgnJXWxp5o6OBrnhs4iSg5Sn3/view?usp=sharing"));
        startActivity(i);
    }

    public void florex(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vNJ8KAlgo8XwxEva3JaSM5KNUkWNIFxz/view?usp=sharing"));
        startActivity(i);
    }

    public void guiax(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zWuqU2FRUtIELTRcfnkxAbnYxHwTs8mf/view?usp=sharing"));
        startActivity(i);
    }

    public void mariposax(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1jEhPhXG3MovAQl1E8ShR0xXNImkvSnfv/view?usp=sharing"));
        startActivity(i);
    }

    public void musicox(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1thrSlLMT9rrHyJrLG1PFGa77gYrqOltD/view?usp=sharing"));
        startActivity(i);
    }

    public void nadax(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1OR26DHjfpSFHjHjkhY6NDQnihAg-wUtk/view?usp=sharing"));
        startActivity(i);
    }

    public void observadorx(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1OnI1bdNjh6NT1YRk2J3jIu7spwaNM6GB/view?usp=sharing"));
        startActivity(i);
    }

    public void papasx(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Xe5c69ShJY1W8wyonbkLxxHqYqkqLMjd/view?usp=sharing"));
        startActivity(i);
    }

    public void pecex(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_SmxKTfLiXXSgpWhU3GJYXYQvMwZS1Kz/view?usp=sharing"));
        startActivity(i);
    }






}