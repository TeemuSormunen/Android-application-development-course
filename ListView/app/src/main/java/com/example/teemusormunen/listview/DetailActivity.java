package com.example.teemusormunen.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // get intent which has used to open this activity
        Intent intent = getIntent();
        //get data from intent
        Bundle bundle = intent.getExtras();
        //get phone name
        String phone = bundle.getString("phone");

        // update text and image views to show data
        TextView phoneTextView = findViewById(R.id.phoneNameView);
        phoneTextView.setText(phone);
        ImageView phoneImageView = findViewById(R.id.phoneImage);

        // show phone image
        switch (phone) {
            case "Android": phoneImageView.setImageResource(R.drawable.android); break;
            case "iPhone": phoneImageView.setImageResource(R.drawable.ios); break;
            case "WindowsMobile": phoneImageView.setImageResource(R.drawable.windows); break;
            case "Blackberry": phoneImageView.setImageResource(R.drawable.blackberry); break;
            case "WebOS": phoneImageView.setImageResource(R.drawable.webos); break;
            case "Ubuntu": phoneImageView.setImageResource(R.drawable.ubuntu); break;
        }


    }
    public void backButtonPressed(View view) {
        // finish and close activity
        finish();
    }

}
