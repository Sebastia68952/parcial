package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sqlite.DB.DBHelper;

public class MainActivity extends AppCompatActivity
{

    Button btnCrearDB, btnRegistrarse, btnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCrearDB = findViewById(R.id.btnCrearDB);
        btnRegistrarse = findViewById(R.id.btnRegistrarse);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);

        DBHelper pruebita = new DBHelper(MainActivity.this);

        btnCrearDB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                SQLiteDatabase baseDatos = pruebita.getWritableDatabase();
                if(baseDatos!=null)
                {
                    Toast.makeText(MainActivity.this, "SE CREO LA BASE DE DATOS", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "NO SE CREO LA BASE DE DATOS", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MuestraActivity.class);
                startActivity(intent);
            }
        });
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, CalculadoraActivity.class);
            }
        });


    }
}