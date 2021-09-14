package com.vijanaweusi.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView malengoCard;
    CardView mahaliCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpOnClickListeners();
        mahaliCard = findViewById(R.id.card_view_mahali);

    }

    private void setUpOnClickListeners() {

        CardView malengoCard = findViewById(R.id.card_view_malengo_yangu);
        CardView mahaliCard = findViewById(R.id.card_view_mahali);

        malengoCard.setOnClickListener(v -> {

            Intent malengoActivityIntent = new Intent(MainActivity.this, MalengoActivity.class);

            startActivity(malengoActivityIntent);
        });

        mahaliCard.setOnClickListener(v -> {

            Intent mahaliActivityIntent = new Intent(MainActivity.this, MahaliActivity.class);

            startActivity(mahaliActivityIntent);
        });
    }
}