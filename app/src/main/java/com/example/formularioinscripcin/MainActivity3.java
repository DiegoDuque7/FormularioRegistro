package com.example.formularioinscripcin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tvnombre, tvapellido, tvedad, tvcorreo;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvnombre   = (TextView) findViewById(R.id.tvNombre);
        tvapellido = (TextView) findViewById(R.id.tvApellido);
        tvedad     = (TextView) findViewById(R.id.tvEdad);
        tvcorreo   = (TextView) findViewById(R.id.tvCorreo);
        btnOk      = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mostrarDatos();

    }

    private void mostrarDatos() {
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("name");
        String apellido = datos.getString("ape");
        String edad = datos.getString("age");
        String correo = datos.getString("email");

        tvnombre.setText(nombre);
        tvapellido.setText(apellido);
        tvedad.setText(edad);
        tvcorreo.setText(correo);
    }
}