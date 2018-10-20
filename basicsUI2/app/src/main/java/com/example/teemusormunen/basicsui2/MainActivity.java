package com.example.teemusormunen.basicsui2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    // AutoCompleteTextView
    AutoCompleteTextView actv = (AutoCompleteTextView)
    findViewById(R.id.login);
    // add stings to control
    ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,
                    new String[]{"Pasi", "Juha", "Kari", "Jouni", "Esa", "Hannu"});
    actv.setAdapter(aa);


}
