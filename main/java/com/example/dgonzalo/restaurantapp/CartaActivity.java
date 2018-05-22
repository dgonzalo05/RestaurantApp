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

import java.util.regex.Pattern;
import java.util.ArrayList;

public class CartaActivity extends AppCompatActivity {
    private Button searchButton;
    private ImageButton homeButton;
    private TextView searchInput;
    private ListView items;
    private String[] carta = {"Ensalada","Macarrones","Paella","Chuleton","Pizza","Pescado al horno","Yogur","Helado","Trufas","Vino","Cola","Cerveza"};
    private ArrayList<String> listItems = new ArrayList<String>();
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carta_activity);

        final CartaActivity self = this;

        searchInput = (TextView) findViewById(R.id.search_input);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        items.setAdapter(adapter);

        items = (ListView)  findViewById(R.id.items);
        items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listItems = findItems(searchInput.getText().toString())
                adapter.notifyDataSetChanged();
            }
        });

        homeButton = (ImageButton) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self ,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public ArrayList<String> findItems (String text){
        ArrayList<String> arr = new ArrayList<String>();
        Pattern pattern = Pattern.compile(text);
        for (String s: carta) {
            if (pattern.matcher(s).matches()) {
                arr.add(s);
            }
        }
        return arr;
    }
}