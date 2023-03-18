package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraActivity extends AppCompatActivity {

    EditText txtn1, txtn2;
    Button btnCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        txtn1 = findViewById(R.id.txtn1);
        txtn2 = findViewById(R.id.txtn2);
        btnCalculo = findViewById(R.id.btnCalculo);

        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Calculos calculos = new Calculos();
                calculos.setNum1(txtn1.getText().toString());
                calculos.setNum2(txtn2.getText().toString());



            }
        });
    }
}