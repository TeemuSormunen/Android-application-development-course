package com.example.teemusormunen.imagelibaryexcercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.squareup.picasso.Callback;

public class MainActivity extends AppCompatActivity implements
View.OnClickListener{

    ImageView imageview;
    Button cat1,cat2,cat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }
    private void initView(){

        imageview = (ImageView) findViewById(R.id.imageView);
        cat1 = (Button) findViewById(R.id.button);
        cat2 = (Button) findViewById(R.id.button2);
        cat3 = (Button) findViewById(R.id.button3);

        cat1.setOnClickListener(this);
        cat2.setOnClickListener(this);
        cat3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button:
                Picasso.get().load("https://student.labranet.jamk.fi/~K9414/androidKuvat/image1.jpg").into(imageview);
                break;
            case R.id.button2:
                Picasso.get().load("https://student.labranet.jamk.fi/~K9414/androidKuvat/image2.jpg").into(imageview);
                break;
            case R.id.button3:
                Picasso.get().load("https://student.labranet.jamk.fi/~K9414/androidKuvat/image3.jpg").into(imageview);
                break;
        }

    }
}
