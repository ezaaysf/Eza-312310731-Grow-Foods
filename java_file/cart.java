package com.example.growsfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ImageView btnhome = findViewById(R.id.fhome);
        ImageView btnfav = findViewById(R.id.ffavorite);
        ImageView btncart = findViewById(R.id.cart);
        ImageView btnprofile = findViewById(R.id.profile);
        ImageView btncekout = findViewById(R.id.addco);
        ImageView btntofavorite = findViewById(R.id.tofavorite);


        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart.this, home.class);
                startActivity(intent);
            }
        });

        btnfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart.this, favorite.class);
                startActivity(intent);
            }
        });

        btncart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart.this, cart.class);
                startActivity(intent);
            }
        });

        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart.this, profile.class);
                startActivity(intent);
            }
        });

        btncekout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart.this, profile.class);
                startActivity(intent);
            }
        });

        btntofavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cart.this, favorite.class);
                startActivity(intent);
            }
        });
    }
}