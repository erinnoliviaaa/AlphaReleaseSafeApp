package com.example.safeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button_911;
    private Button button_112;
    private Button button_hT;
    private Menu mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_911 = findViewById(R.id.button911);
        button_112 = findViewById(R.id.button112);
        button_hT = findViewById(R.id.buttonHT);

        button_911.setOnClickListener(this::on911Click);
        button_112.setOnClickListener(this::on112Click);
        button_hT.setOnClickListener(this::onHtClick);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.context_menu, menu);
        mMenu = menu;
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        if(item.getItemId() == R.id.location){
            Intent intent = new Intent(this, location.class);
            startActivity(intent);
            Toast.makeText(this,"This activity page will display a map and have various size pins based on how many cases were reported", Toast.LENGTH_LONG).show();
            Toast.makeText(this,"You will be able to scroll and pinch and zoom on this activity page", Toast.LENGTH_LONG).show();
            return true;
        }
        else if(item.getItemId() == R.id.moreInfo){
            Intent intent = new Intent(this,moreInfo.class);
            startActivity(intent);
            Toast.makeText(this, "This activity page will display more information about the incident each victim reported with their call", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.about){
            Intent intent = new Intent(this, about.class);
            startActivity(intent);
            Toast.makeText(this,"This activity page will display what our app is about and the SDG goal it is connected to", Toast.LENGTH_LONG).show();
            return true;
        }
        return true;
    }

    private void on911Click(View view){
        // call 911
        // drop a pin on location
        Toast.makeText(this,"This button will call 911 and drop a pin on the map", Toast.LENGTH_SHORT).show();
    }

    private void on112Click(View view){
        // call 112
        // drop a pin on location
        Toast.makeText(this,"This button will call 112 and drop a pin on the map", Toast.LENGTH_SHORT).show();
    }

    private void onHtClick(View view){
        // call human trafficking
        // drop a pin on location
        Toast.makeText(this,"This button will call the human trafficking line and drop a pin on the map", Toast.LENGTH_SHORT).show();
    }

    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }


}