package com.example.dgonzalo.restaurantapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ComandaActivity extends AppCompatActivity {
    private ImageButton cartaButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comanda_activity);
        cartaButton = (ImageButton)findViewById(R.id.carta_button);
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

