package com.example.trab;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends Activity {

    private EditText editNome;
    private EditText editEmail;
    private EditText editAtividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editNome = findViewById(R.id.editNome);
        editEmail = findViewById(R.id.editEmail);
        editAtividade = findViewById(R.id.editAtividade);

        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish(); // Opcional: encerra a tela atual para liberar recursos
            }
        });

    }

    public void registrar(View view) {
        // Aqui você pode adicionar a lógica para salvar os dados ou fazer alguma validação
        String nome = editNome.getText().toString();
        String email = editEmail.getText().toString();
        String atividade = editAtividade.getText().toString();

        // Exemplo de exibição de mensagem
        Toast.makeText(this, "Registrado com sucesso!", Toast.LENGTH_SHORT).show();
    }
}
