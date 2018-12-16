package com.example.teemusormunen.notificationexercise;

import android.app.Notification;
import android.app.NotificationManager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    public int notification_id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void notifyButtonPressed(View view) {
        // create new notification
        Notification notification = new Notification.Builder(this)
                .setCategory(Notification.CATEGORY_MESSAGE)
                .setContentTitle("New message")
                .setContentText("Have a nice day")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setVisibility(Notification.VISIBILITY_PUBLIC).build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // increase notification id
        notification_id += 1;


        notificationManager.notify(notification_id, notification);




    }


}
