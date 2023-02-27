package com.example.feirasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button bt_login;
    EditText et_usuario, et_senha;

    View viewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        viewLogin=findViewById(R.id.viewLogin);
        bt_login=findViewById(R.id.bt_logar);
        et_usuario=findViewById(R.id.et_usuarioLogin);
        et_senha=findViewById(R.id.et_senhaLogin);


        viewLogin.setBackgroundColor(Color.rgb(244, 164, 96));
        bt_login.setBackgroundColor(Color.rgb(128, 128, 0));


    }

    public void logar(View v){
        String usuario = et_usuario.getText().toString();
        String senha = et_senha.getText().toString();

        if(usuario.equalsIgnoreCase("ad")){
            Toast.makeText(this, "foi", Toast.LENGTH_LONG);

            if(senha.equalsIgnoreCase("123")){
                Toast.makeText(this, "foi", Toast.LENGTH_LONG);
                        Intent i = new Intent(LoginActivity.this, MainMenuActivity.class);
                        startActivity(i);
            }else{
                Toast.makeText(this, "senha Invalido", Toast.LENGTH_LONG);
            }

        }else{
            Toast.makeText(this, "Usuário Invalido", Toast.LENGTH_LONG);
        }


    }


}