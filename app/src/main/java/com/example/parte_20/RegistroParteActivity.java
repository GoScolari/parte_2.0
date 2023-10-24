package com.example.parte_20;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroParteActivity extends AppCompatActivity {

    private EditText nombreEditText;
    private EditText apellidoEditText;
    private EditText rutEditText;
    private EditText ComentarioEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_parte);

        nombreEditText = findViewById(R.id.nombreEditText);
        apellidoEditText = findViewById(R.id.apellidoEditText);
        rutEditText = findViewById(R.id.rutEditText);
        ComentarioEditText = findViewById(R.id.ComentarioEditText);


        Button guardarButton = findViewById(R.id.guardarButton);

        guardarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombreEditText.getText().toString();
                String apellido = apellidoEditText.getText().toString();
                String rut = rutEditText.getText().toString();
                String texto = ComentarioEditText.getText().toString();

                Intent intent = new Intent(RegistroParteActivity.this, MostrarInformacionActivity.class);
                intent.putExtra("nombre", nombre);
                intent.putExtra("apellido", apellido);
                intent.putExtra("rut", rut);
                intent.putExtra("texto", texto);
                startActivity(intent);
            }
        });
    }
}
