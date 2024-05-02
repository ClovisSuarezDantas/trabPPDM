package com.example.trab;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método para abrir a tela de Programação
    public void openProgramacao(View view) {
        Intent intent = new Intent(this, ProgramacaoActivity.class);
        startActivity(intent);
    }

    // Método para abrir a tela de Registro
    public void openRegistro(View view) {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    // Método para abrir a tela de Informação
    public void openInformacao(View view) {
        Intent intent = new Intent(this, InformacaoActivity.class);
        startActivity(intent);
    }
}