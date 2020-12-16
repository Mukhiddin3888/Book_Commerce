package com.example.bookcommerse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.buttom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);


    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case (R.id.navb_main):{
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            };
            return true;
            case (R.id.navb_search) :{
                Intent intent=new Intent(getApplicationContext(), SearchActivity.class);

                startActivity(intent);
            };
            return true;
        }
        return false;
    }
}