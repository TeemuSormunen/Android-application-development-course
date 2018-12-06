package fi.jamk.k9414.notifications;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

    public int notification_id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void notifyButtonPressed(View view) {
        // create new notification
        NotificationCompat.Builder notification = new NotificationCompat.Builder(this, "test")
                .setCategory(Notification.CATEGORY_MESSAGE)
                .setContentTitle("New message")
                .setContentText("Have a nice day")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setVisibility(Notification.VISIBILITY_PUBLIC).build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        Log.v("test", "test");
        // increase notification id
        notification_id += 1;


            notificationManager.notify(notification_id, notification);




    }


}





