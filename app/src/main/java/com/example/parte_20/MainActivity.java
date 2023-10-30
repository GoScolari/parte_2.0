package com.example.parte_20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button salirButton = findViewById(R.id.salirButton);

        salirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        CardView card1 = findViewById(R.id.card1);
        CardView card2 = findViewById(R.id.card2);
        CardView card3 = findViewById(R.id.card3);
        CardView card4 = findViewById(R.id.card4);

        card4.setOnClickListener(v -> {
            Intent exportarIntent = new Intent(MainActivity.this, ExportarActivity.class);
            startActivity(exportarIntent);
        });

        card3.setOnClickListener(v -> {
            Intent personalIntent = new Intent(MainActivity.this, PersonalActivity.class);
            startActivity(personalIntent);
        });

        card2.setOnClickListener(v -> {
            Intent historialIntent = new Intent(MainActivity.this, HistorialMesActivity.class);
            startActivity(historialIntent);
        });

        card1.setOnClickListener(v -> {
            Intent generarParteIntent = new Intent(MainActivity.this, GenerarParteActivity.class);
            startActivity(generarParteIntent);
        });

    }
}
