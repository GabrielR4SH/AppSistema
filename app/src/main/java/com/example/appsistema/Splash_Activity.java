package com.example.appsistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
//Método para rodar processo em tempo determinado
    Handler handler=new Handler();

    handler.postDelayed(new Runnable() {
        @Override
        public void run() {

            abrirJanela();
        }
    },2000);

    }





    public void abrirJanela() {

       // Toast.makeText(getApplicationContext(), text:"Cliquei na Imagem!", Toast.LENGTH_LONG).show();

        Intent abrir = new Intent(Splash_Activity.this,Login_Activity.class);
        startActivity(abrir);
    }
}
