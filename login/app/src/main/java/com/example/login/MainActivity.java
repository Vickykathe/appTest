package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresar(View view) {
        int a = 10;
        int b = 20;
        if (a == 10 && b == 20){
            Toast.makeText(this, "Ingreso aprobado", Toast.LENGTH_LONG).show();

            Intent siguiente = new Intent(this, menu.class);
            startActivity(siguiente);
        }else{
            Toast.makeText(this, "Usuario o contrasena incorrecta", Toast.LENGTH_LONG).show();

        }
    }
}
