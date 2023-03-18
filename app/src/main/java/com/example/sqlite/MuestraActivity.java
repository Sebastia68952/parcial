package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sqlite.DB.DBinformacion;

public class MuestraActivity extends AppCompatActivity {
    EditText txtCorreo, txtContraseña;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra);

        txtCorreo = findViewById(R.id.txtCorreo);
        txtContraseña = findViewById(R.id.txtContraseña);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBinformacion dBinformacion = new DBinformacion(MuestraActivity.this);
                long id = dBinformacion.insertInfo(txtCorreo.getText().toString(), txtContraseña.getText().toString());
                if(id>0){
                    Toast.makeText(MuestraActivity.this, "Se envio la informacion", Toast.LENGTH_SHORT).show();
                    limpiar();
                }else{
                    Toast.makeText(MuestraActivity.this, "No se envio la informacion", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private  void limpiar(){
        txtCorreo.setText("");
        txtContraseña.setText("");
    }
}