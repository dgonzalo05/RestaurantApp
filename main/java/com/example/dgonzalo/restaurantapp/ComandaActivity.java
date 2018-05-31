package com.example.dgonzalo.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ComandaActivity extends AppCompatActivity {
    private Button buyButton;
    private Button deleteButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comanda_activity);

        buyButton = (Button) findViewById(R.id.buy_button);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ComandaActivity.this,R.string.buy_toast, Toast.LENGTH_SHORT).show();
                //changeIntent(MainActivity.class);
            }

        });
        deleteButton = (Button) findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ComandaActivity.this,R.string.delete_toast, Toast.LENGTH_SHORT).show();
                //changeIntent(MainActivity.class);
            }
        });
    }

    public void changeIntent(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
