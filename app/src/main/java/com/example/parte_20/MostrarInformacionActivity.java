package com.example.parte_20;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
public class MostrarInformacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_informacion);

        TextView informacionTextView = findViewById(R.id.informacionTextView);

        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String rut = getIntent().getStringExtra("rut");
        String texto = getIntent().getStringExtra("texto");

        String informacion = "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "RUT: " + rut + "\n"
                + "Texto: " + texto;
        informacionTextView.setText(informacion);
    }
}