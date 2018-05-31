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
    private Button searchButton;
    private ImageButton homeButton;
    private TextView searchInput;
    private ListView listView;
    private String[] values = {"Ensalada","Macarrones","Paella","Chuleton","Pizza","Pescado al horno","Yogur","Helado","Trufas","Vino","Cola","Cerveza"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carta_activity);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        /*String[] values = new String[] { "Ensalada",
                "Macarrones",
                "Paella",
                "Chuleton",
                "Pizza",
                "Pescado al horno",
                "Yogur",
                "Helado",
                "Trufas",
                "Vino",
                "Cola",
                "Cerveza"
        };*/

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

    public ArrayList<String> findItems (String text){
        ArrayList<String> arr = new ArrayList<String>();
        Pattern pattern = Pattern.compile(text);
        for (String s: values) {
            if (pattern.matcher(s).matches()) {
                arr.add(s);
            }
        }
        return arr;
    }
}