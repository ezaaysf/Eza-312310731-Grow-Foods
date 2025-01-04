package com.example.growsfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class favorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        ImageView btnhsh = findViewById(R.id.hsh);
        ImageView btnfav = findViewById(R.id.fav);
        ImageView btncart = findViewById(R.id.cart);
        ImageView btnprofile = findViewById(R.id.profile);
        ImageView btnback = findViewById(R.id.back);

        btnhsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(favorite.this, home.class);
                startActivity(intent);
            }
        });

        btnfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(favorite.this, favorite.class);
                startActivity(intent);
            }
        });

        btncart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(favorite.this, cart.class);
                startActivity(intent);
            }
        });

        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(favorite.this, profile.class);
                startActivity(intent);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(favorite.this, home.class);
                startActivity(intent);
            }
        });
    }
}