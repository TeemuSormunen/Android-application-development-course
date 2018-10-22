package com.example.teemusormunen.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find listview
        ListView listview = findViewById(R.id.listView);

        // generate sume dummy data
        String[] phones = new String[]{
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu",
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu"
        };
        // add data to arraylist
        final ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < phones.length; i++) {
            list.add(phones[i]);
        }

        // add data to ArrayAdapter (default Android Listview style/layout)
        //ArrayAdapter adapter = new ArrayAdapter(this, R.layout.rowlayout, R.id.phoneName, list);

        // create custom adapter
        PhoneArrayAdapter adapter = new PhoneArrayAdapter(this, list);

        // set data to listView with adapter
        listview.setAdapter(adapter);

        // add data to ArrayAdapter (own custom layout)



    }
}
