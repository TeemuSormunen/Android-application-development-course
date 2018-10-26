package fi.jamk.k9414.notifications;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public int notification_id = 0;




    }
    public void buttonPressed(){
        // create new notification
        Notification notification = new Notification.Builder(this)
                .setCategory(Notification.CATEGORY_MESSAGE)
                .setContentTitle("New message")
                .setContentText("Have a nice day")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setVisibility(Notification.VISIBILITY_PUBLIC)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // increase notification id
        notification_id++;

        notificationManager.notify(notification_id, notification);
    }



}
