package com.example.tarea3;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Cines extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cine_layout);
        String localizacion = getIntent().getStringExtra("location");
        String[] cinemas = getCinemas(localizacion);
        TextView cinemasTextView = findViewById(R.id.cinemasTextView);

        cinemasTextView.setText("CDMX " + localizacion + ":\n");
        for (String cinema : cinemas) {
            cinemasTextView.append(cinema + "\n");
        }
    }

    private String[] getCinemas(String localizacion) {
        switch (localizacion) {
            case "Centro":
                return new String[]{"Cine Plaza Tlatelolco", "Cine Fórum Buenavista", "Cine Diana"};
            case "Norte":
                return new String[]{"Cine Plaza Cuitlahuac", "Cine Pedregal Atizapán"};
            case "Sur":
                return new String[]{"Cine Gran Terraza Coapa", "Cine Copilco", "Cine Universidad"};
            case "Poniente":
                return new String[]{"Cine Parque Toreo", "Cine Paseo Interlomas", "Cine Portal Centenario"};
            case "Oriente":
                return new String[]{"Cine Viaducto", "Cine Las Antenas", "Cine Ermita"};
            default:
                return new String[]{};
        }
    }
}
