package com.example.dgonzalo.restaurantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;
import java.util.ArrayList;

public class CartaActivity extends AppCompatActivity {
    private Button comandaButton;
    private ImageButton homeButton;
    private ListView listView;
    private String[] values = {"Ensalada","Macarrones","Paella","Chuleton","Pizza","Pescado al horno","Yogur","Helado","Trufas","Vino","Cola","Cerveza"};
    private ArrayList<String> cart = new ArrayList<String>();
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carta_activity);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item value
                String  itemValue   = (String) listView.getItemAtPosition(position);

                cart.add(itemValue);
                // Show Alert
                Toast.makeText(getApplicationContext(),
                        itemValue +" afegit", Toast.LENGTH_LONG)
                        .show();
            }

        });

        homeButton = (ImageButton) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeIntent(MainActivity.class);
            }
        });

        comandaButton = (Button) findViewById(R.id.comanda_button);
        comandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeIntent(ComandaActivity.class);
            }
        });
    }

    public void changeIntent(Class c, String[] values){
        Intent intent = new Intent(this, c);
        intent.putExtra("carta", values);
        startActivity(intent);
    }
}