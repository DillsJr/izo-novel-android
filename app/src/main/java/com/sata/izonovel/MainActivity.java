package com.sata.izonovel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout menuInfoPengguna;

    LinearLayout InputPengguna;

    LinearLayout FavoritPengguna;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuInfoPengguna = findViewById(R.id.informasi_pengguna);
        menuInfoPengguna.setOnTouchListener((view, motionEvent) -> {
            Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
            startActivity(intent);
            return false;
        });

        FavoritPengguna = findViewById(R.id.favorit_pengguna);
        FavoritPengguna.setOnTouchListener((view, motionEvent) -> {
            Intent intent = new Intent(MainActivity.this, NovFavActivity.class);
            startActivity(intent);
            return false;
        });

        InputPengguna = findViewById(R.id.input_novel);
        InputPengguna.setOnTouchListener((view, motionEvent) -> {
            Intent intent = new Intent(MainActivity.this, FormInptActivity.class);
            startActivity(intent);
            return false;
        });
    }
}