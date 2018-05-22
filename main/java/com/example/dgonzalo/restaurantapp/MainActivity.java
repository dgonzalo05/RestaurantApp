package com.example.dgonzalo.restaurantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.lang.annotation.Inherited;

public class MainActivity extends AppCompatActivity {
    private Button cartaButton;
    private Button comandaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        comandaButton = (Button) findViewById(R.id.comanda_button);
        cartaButton = (Button) findViewById(R.id.carta_button);
        final MainActivity self = this;

        comandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self, ComandaActivity.class);
                startActivity(intent);
            }
        });
        cartaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self, CartaActivity.class);
                startActivity(intent);
            }
        });
    }

}
