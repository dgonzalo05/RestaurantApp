package com.example.dgonzalo.restaurantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class CartaActivity extends AppCompatActivity {
    private Button searchButton;
    private Button homeButton;
    private TextView searchText;
    private ListView viewCarta;
    private String[] carta = {"Ensalada","Macarrones","Paella","Chuleton","Pizza","Pescado al horno","Yogur","Helado","Trufas","Vino","Cola","Cerveza"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carta_activity);

        searchText = (TextView) findViewById(R.id.search_input);

        viewCarta = (ListView)  findViewById(R.id.items);
        viewCarta.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        homeButton = (Button) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
