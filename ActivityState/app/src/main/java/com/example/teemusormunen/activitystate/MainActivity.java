package com.example.teemusormunen.activitystate;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements TextEntryDialogFragment.TextEntryDialogListener{

    private final String TEXTVIEW_STATEKEY = "TEXTVIEW_STATEKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView1);
        if(savedInstanceState != null){
            if(savedInstanceState.containsKey(TEXTVIEW_STATEKEY)) {
                String text = savedInstanceState.getString(TEXTVIEW_STATEKEY);
                textView.setText(text);
            }
        }

    }
    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {

        TextView textView = findViewById(R.id.textView1);
        saveInstanceState.putString(TEXTVIEW_STATEKEY,textView.getText().toString());
    }
    @Override
    public  void onDialogPositiveClick(DialogFragment dialog, String text){
        TextView textView =  findViewById(R.id.textView1);
        textView.setText(text);
    }
    @Override
    public void onDialogNegativeClick(DialogFragment dialog){
        Toast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
    }

    public void ButtonClicked(View view){
        TextEntryDialogFragment eDialog = new TextEntryDialogFragment();
        eDialog.show(getFragmentManager(), "Text Dialog");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}