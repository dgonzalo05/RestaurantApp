package com.example.dgonzalo.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ComandaActivity extends AppCompatActivity {
    private ImageButton homeButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comanda_activity);
        homeButton = (ImageButton) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
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

