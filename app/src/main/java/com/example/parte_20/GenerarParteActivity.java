package com.example.parte_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class GenerarParteActivity extends AppCompatActivity {
    TextView tv;

    private Button volverButton;
    private Button inicioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar_parte);

        tv = findViewById(R.id.textView);
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
                Intent intent = new Intent(GenerarParteActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView card2 = findViewById(R.id.card2);

        card2.setOnClickListener(v -> {
            Intent generarParteIntent = new Intent(GenerarParteActivity.this, RegistroActivity.class);
            startActivity(generarParteIntent);
        });

    }

    public void abrirCalendario(View view) {
        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(GenerarParteActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String fecha = dayOfMonth + "/" + month + "/" + year;
                tv.setText(fecha);
            }
        },anio, mes, dia);
        dpd.show();
    }
}
