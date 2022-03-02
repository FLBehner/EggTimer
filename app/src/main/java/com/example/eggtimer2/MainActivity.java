package com.example.eggtimer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.timer:
                    startActivity(new Intent(getApplicationContext(), Timer.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.knowledge:
                    startActivity(new Intent(getApplicationContext(), Knowledge.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.quiz:
                    startActivity(new Intent(getApplicationContext(), Quiz.class));
                    overridePendingTransition(0, 0);
                    return true;
            }
            return false;
        });

    }
}