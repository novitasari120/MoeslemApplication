package com.novit.moeslemapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  {
private ImageView produk, showRide, doa;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showRide = (ImageView) findViewById(R.id.sholat);
        produk = (ImageView) findViewById(R.id.produk);
        doa = (ImageView) findViewById(R.id.doa);


 ;







        showRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SholatApp.class);
                startActivity(intent);
            }
        });
        produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HalalApp.class);
                startActivity(intent);
            }
        });
        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoaApp.class);
                startActivity(intent);
            }
        });
    }


}
