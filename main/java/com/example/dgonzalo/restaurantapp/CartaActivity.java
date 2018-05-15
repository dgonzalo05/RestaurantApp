package com.example.dgonzalo.restaurantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class CartaActivity extends AppCompatActivity {
    private Button searchButton;
    private Button homeButton;
    private TextView searchText;
    private ListView showCarta;
    private String[] carta = {"Ensalada","Macarrones","Paella","Chuleton","Pizza","Pescado al horno","Yogurd","Helado","Trufas","Vino","Cola","Cerveza"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carta_activity);
    }
}
