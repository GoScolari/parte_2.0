package com.example.parte_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalActivity extends AppCompatActivity {

    private Button volverButton;
    private Button inicioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        volverButton = findViewById(R.id.volverButton);
        inicioButton = findViewById(R.id.inicioButton);

        volverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        inicioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView card1 = findViewById(R.id.card1);
        CardView card2 = findViewById(R.id.card2);
        CardView card3 = findViewById(R.id.card3);
        CardView card4 = findViewById(R.id.card4);

        card4.setOnClickListener(v -> {
            Intent personalIntent = new Intent(PersonalActivity.this, PersonalEscalafonActivity.class);
            startActivity(personalIntent);
        });

        card3.setOnClickListener(v -> {
            Intent personalIntent = new Intent(PersonalActivity.this, PersonalEscalafonActivity.class);
            startActivity(personalIntent);
        });

        card2.setOnClickListener(v -> {
            Intent historialIntent = new Intent(PersonalActivity.this, PersonalEscalafonActivity.class);
            startActivity(historialIntent);
        });

        card1.setOnClickListener(v -> {
            Intent generarParteIntent = new Intent(PersonalActivity.this, PersonalEscalafonActivity.class);
            startActivity(generarParteIntent);
        });
    }
}