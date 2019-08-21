package com.novit.moeslemapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class DoaApp extends AppCompatActivity {
    private String[] doa = {"Doa Sebelum Makan" ,"Doa Sesudah Makan" ,"Doa Sebelum Tidur","Doa Bangun Tidur","Doa Turun Hujan","Doa Sebelum Belajar","Doa Sesudah Belajar","Doa Ketika Bercermin"};
    private ArrayList<String> data;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_app);

        ListView listView = findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                String getName = data.get(position);

                Intent sendData = new Intent(DoaApp.this, DoaAdapter.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);

            }
        });


    }

    private void getData () {
        Collections.addAll(data, doa);
    }
}