package com.example.tarea3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                // Crear un Intent para cambiar a la Segunda Activity
                Intent intent = new Intent(MainActivity.this, Pelicula.class);
                startActivity(intent);
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opciones, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_image_options) {
           displayToast(getString(R.string.espectacular));
            return true;
        } else if (id == R.id.p2) {
            displayToast("Redirigiendo...");
        } else if (id == R.id.p3){
            displayToast("Ha seleccionado promociones");
        }
        return super.onOptionsItemSelected(item);
    }

    private void displayToast(String mensaje) {
        Toast.makeText(getApplicationContext(), mensaje,
                Toast.LENGTH_SHORT).show();
    }

    private void showCinemas(String localizacion) {
//        Intent intent = new Intent(this, Cines.class);
//        intent.putExtra("localizacion", localizacion);
//        startActivity(intent);
        Toast.makeText(getApplicationContext(), localizacion,
                Toast.LENGTH_SHORT).show();
    }
}
