package com.example.parte_20;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startParteButton = findViewById(R.id.startParteButton);
        startParteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de registro de partes
                Intent intent = new Intent(MainActivity.this, RegistroParteActivity.class);
                startActivity(intent);
            }
        });
    }
}