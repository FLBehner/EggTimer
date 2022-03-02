package com.example.eggtimer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Timer extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TextView tV_Timer;
    Button btn_changeText;

    public void buttonClicked(View view) {
        btn_changeText.setText("CLICKED");
        tV_Timer.setText("Button wurde geklickt!");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        // Initialisierung
        btn_changeText = findViewById(R.id.btn_changeText);
        tV_Timer = findViewById(R.id.tV_Timer);
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