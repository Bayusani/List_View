package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView lvItem;
    private String [] namanegara = new String[]
            {
                    "Indonesia",
                    "Malaysia",
                    "Singapore",
                    "Italia",
                    "Inggris",
                    "Belanda",
                    "Argentina",
                    "Chile",
                    "Mesir",
                    "Uganda"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = (ListView)findViewById(R.id.list_view);


    }
}