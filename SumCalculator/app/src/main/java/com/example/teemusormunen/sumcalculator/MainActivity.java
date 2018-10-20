package com.example.teemusormunen.sumcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View view){
        // Get numbers
        EditText number1 = (EditText) findViewById(R.id.editText);
        EditText number2 = (EditText) findViewById(R.id.editText2);
        String numberOne = number1.getText().toString();
        String numberTwo = number2.getText().toString();
        // parse to int
        int finalNumberOne = Integer.parseInt(numberOne);
        int finalNumberTwo = Integer.parseInt(numberTwo);
        int sum = finalNumberOne + finalNumberTwo;
        // parse sum to string
        TextView textView = (TextView) findViewById(R.id.textView);
        String sumText = Integer.toString(sum);
        textView.setText(sumText);


        //String sumText = Integer.toString(sum);
        // Toast sum
        //Toast.makeText(getApplicationContext(), sumText, Toast.LENGTH_SHORT).show();


    }

}
