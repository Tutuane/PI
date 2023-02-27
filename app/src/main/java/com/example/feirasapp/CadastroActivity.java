package com.example.feirasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    Button bt_cadastra;
    EditText et_usuario, et_senha, et_senha2, et_email;

    View viewCadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();

        viewCadastro=findViewById(R.id.viewCadastro);
        bt_cadastra=findViewById(R.id.bt_registraUsuario);
        et_usuario=findViewById(R.id.et_usuarioCadastro);
        et_senha=findViewById(R.id.et_senhaCadastro);
        et_senha2=findViewById(R.id.et_senha2Cadastro);
        et_email=findViewById(R.id.et_emailCadastro);

        viewCadastro.setBackgroundColor(Color.rgb(244, 164, 96));
        bt_cadastra.setBackgroundColor(Color.rgb(128, 128, 0));

        bt_cadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CadastroActivity.this, MainMenuActivity.class);
                startActivity(i);
            }
        });

    }

    public void cadastro(View v){


    }
}