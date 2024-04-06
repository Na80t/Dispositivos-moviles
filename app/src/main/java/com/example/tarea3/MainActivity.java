package com.example.tarea3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        Button centroButton = findViewById(R.id.button);
        Button norteButton = findViewById(R.id.button1);
        Button surButton = findViewById(R.id.button2);
        Button ponienteButton = findViewById(R.id.button3);
        Button orienteButton = findViewById(R.id.button4);

        centroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCinemas("Centro");
            }
        });

        norteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCinemas("Norte");
            }
        });

        surButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCinemas("Sur");
            }
        });

        ponienteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCinemas("Poniente");
            }
        });

        orienteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCinemas("Oriente");
            }
        });
    }

    private void showCinemas(String localizacion) {
        Intent intent = new Intent(this, Cines.class);
        intent.putExtra("localizacion", localizacion);
        startActivity(intent);
    }
}
