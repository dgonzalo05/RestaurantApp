package com.example.dgonzalo.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;

import java.util.ArrayList;

public class ComandaActivity extends AppCompatActivity {
    private ImageButton homeButton;
    private ArrayList<String> list_items = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComandaActivity self = this;
        homeButton = (ImageButton)findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(self, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
