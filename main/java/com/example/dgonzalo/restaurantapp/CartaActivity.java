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
    private String[] values;
    private ArrayList<String> cart = new ArrayList<String>();
    private ItemAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carta_activity);

        // Get ListView object from xml
        listView = findViewById(R.id.list);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        adapter = new ItemAdapter(this, crearCarta());


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item value
                ItemList item   = (ItemList) listView.getItemAtPosition(position);
                String nombre = item.getNombre();
                if (!item.isTitol() && !nombre.isEmpty()) {

                    cart.add(nombre);
                    // Show Alert
                    Toast.makeText(getApplicationContext(),
                            nombre + " añadido", Toast.LENGTH_LONG)
                            .show();
                }
            }

        });

        homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeIntent(MainActivity.class);
            }
        });

        comandaButton = findViewById(R.id.comanda_button);
        comandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] arr = new String[cart.size()];
                changeIntent(ComandaActivity.class, cart.toArray(arr));
            }
        });
    }

    public void changeIntent(Class c, String[] values){
        Intent intent = new Intent(this, c);
        intent.putExtra("carta", values);
        startActivity(intent);
    }

    public void changeIntent(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }

    private ArrayList<ItemList> crearCarta() {
        ArrayList<ItemList> items = new ArrayList<ItemList>();

        items.add(new ItemList("Primers", true));
        items.add(new ItemList("Amanida" ));
        items.add(new ItemList("Macarrons" ));
        items.add(new ItemList("Paella" ));
        items.add(new ItemList());
        items.add(new ItemList("Segons", true ));
        items.add(new ItemList("Entrecot" ));
        items.add(new ItemList("Pizza" ));
        items.add(new ItemList("Peix al forn" ));
        items.add(new ItemList());
        items.add(new ItemList("Postres", true ));
        items.add(new ItemList("Iogurt" ));
        items.add(new ItemList("Gelat"));
        items.add(new ItemList("Trufes"));
        items.add(new ItemList());
        items.add(new ItemList("Begudes", true));
        items.add(new ItemList("Cola"));
        items.add(new ItemList("Vi"));
        items.add(new ItemList("Cervesa"));

        return items;
    }
}