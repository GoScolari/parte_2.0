package com.example.parte_20;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonalEscalafonActivity extends AppCompatActivity {

    private Button volverButton;
    private Button inicioButton;
    private Button modificarButton;
    private EditText gradoValueEditText;


    private boolean isEditing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_escalafon);

        volverButton = findViewById(R.id.volverButton);
        inicioButton = findViewById(R.id.inicioButton);
        modificarButton = findViewById(R.id.modificarButton);

        gradoValueEditText = findViewById(R.id.gradoValueEditText);
        modificarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEditing) {
                    modificarButton.setText("Modificar");
                    gradoValueEditText.setEnabled(false);
                } else {
                    modificarButton.setText("Guardar");
                    gradoValueEditText.setEnabled(true);
                }
                isEditing = !isEditing; // Alterna entre Editar y Guardar
            }
        });


        volverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        inicioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalEscalafonActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
