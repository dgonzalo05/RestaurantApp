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
        cartaButton = (Button)findViewById(R.id.carta_button);
        comandaButton = (Button)findViewById(R.id.comanda_button);

        comandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeIntent(ComandaActivity.class);
            }
        });

        cartaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeIntent(CartaActivity.class);
            }
        });

    }
    public void changeIntent(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
