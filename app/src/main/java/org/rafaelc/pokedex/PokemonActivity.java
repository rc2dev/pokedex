package org.rafaelc.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PokemonActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView numberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        String name = getIntent().getStringExtra("name");
        int number = getIntent().getIntExtra("number", 0);

        nameTextView = findViewById(R.id.pokemon_name);
        numberTextView = findViewById(R.id.pokemon_number);

        nameTextView.setText(name);
        //numberTextView.setText(Integer.toString(number));
        // Em vez de pôr o número solto, vamos formatá-lo.
        // Esse método tem a mesma sintaxe do printf em C.
        numberTextView.setText(String.format("#%03d", number));
    }
}
