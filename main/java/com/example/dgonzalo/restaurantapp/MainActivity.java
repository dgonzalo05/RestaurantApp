package com.example.dgonzalo.restaurantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button cartaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cartaButton = (Button)findViewById(R.id.carta_button);
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
