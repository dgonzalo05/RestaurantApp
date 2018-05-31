package com.example.dgonzalo.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ComandaActivity extends AppCompatActivity {
    private Button buyButton;
    private Button deleteButton;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comanda_activity);
        listView = (ListView) findViewById(R.id.list);

        Intent intent = getIntent();
        String[] values = intent.getStringArrayExtra("carta");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        buyButton = (Button) findViewById(R.id.buy_button);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ComandaActivity.this,R.string.buy_toast, Toast.LENGTH_SHORT).show();
                changeIntent(MainActivity.class);
            }

        });
        deleteButton = (Button) findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ComandaActivity.this,R.string.delete_toast, Toast.LENGTH_SHORT).show();
                changeIntent(MainActivity.class);
            }
        });
    }

    public void changeIntent(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
