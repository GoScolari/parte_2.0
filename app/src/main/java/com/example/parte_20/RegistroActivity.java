package com.example.parte_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.PopupWindow;
import android.widget.Switch;
import android.view.ViewGroup;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {

    private Button volverButton;
    private Button inicioButton;
    private PopupWindow popupWindow;
    private Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        volverButton = findViewById(R.id.volverButton);
        inicioButton = findViewById(R.id.inicioButton);
        Switch switch1 = findViewById(R.id.switch1);
        Switch switch2 = findViewById(R.id.switch2);
        Switch switch3 = findViewById(R.id.switch3);
        Switch switch4 = findViewById(R.id.switch4);


        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.motivo, null);
        int width = 400;
        int height = 500;
        popupWindow = new PopupWindow(popupView, width, height, true);
        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                popupWindow.showAsDropDown(switch1);
            } else {
                popupWindow.dismiss();
            }
        });

        switch2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                popupWindow.showAsDropDown(switch2);
            } else {
                popupWindow.dismiss();
            }
        });

        switch3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                popupWindow.showAsDropDown(switch3);
            } else {
                popupWindow.dismiss();
            }
        });

        switch4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                popupWindow.showAsDropDown(switch4);
            } else {
                popupWindow.dismiss();
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
                Intent intent = new Intent(RegistroActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView card1 = findViewById(R.id.card1);
        CardView card2 = findViewById(R.id.card2);
        CardView card3 = findViewById(R.id.card3);
        CardView card4 = findViewById(R.id.card4);

        card4.setOnClickListener(v -> {
            Intent personalIntent = new Intent(RegistroActivity.this, PersonalEscalafonActivity.class);
            startActivity(personalIntent);
        });

        card3.setOnClickListener(v -> {
            Intent personalIntent = new Intent(RegistroActivity.this, PersonalEscalafonActivity.class);
            startActivity(personalIntent);
        });

        card2.setOnClickListener(v -> {
            Intent historialIntent = new Intent(RegistroActivity.this, PersonalEscalafonActivity.class);
            startActivity(historialIntent);
        });

        card1.setOnClickListener(v -> {
            Intent generarParteIntent = new Intent(RegistroActivity.this, PersonalEscalafonActivity.class);
            startActivity(generarParteIntent);
        });
    }
}