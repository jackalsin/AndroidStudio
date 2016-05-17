package com.example.jacka.a17_notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static Button notificationButton;

    /**
     * A numeric value that identifies the notification that we'll be sending.
     * This value needs to be unique within this app, but it doesn't need to be
     * unique system-wide.
     */
    public static final int NOTIFICATION_ID = 1;


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        setUpNotificationButton();
//    }
//
//    private void setUpNotificationButton() {
//        notificationButton = (Button) findViewById(R.id.showNotificationButton);
//        notificationButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
////
////                Intent intent = new Intent();
////                /* This is starting activity */
////                PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this,0, intent, 0);
////                Notification noti = new Notification.Builder(MainActivity.this)
////                        .setContentTitle("Content Title")
////                        .setContentText("This is the content Text\n")
////                        .setContentIntent(pIntent)
////                        .setSmallIcon(R.mipmap.ic_launcher)
////                        .setAutoCancel(true)
////                        .setPriority(Notification.PRIORITY_HIGH).build();
////
////                // BEGIN_INCLUDE(send_notification)
////                /**
////                 * Send the notification. This will immediately display the notification icon in the
////                 * notification bar.
////                 */
////                NotificationManager notificationManager = (NotificationManager) getSystemService(
////                        NOTIFICATION_SERVICE);
////
////                notificationManager.notify(NOTIFICATION_ID, noti);
////                // END_INCLUDE(send_notification)
////
//
//
//                // define sound URI, the sound to be played when there's a notification
////                Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//
//                // intent triggered, you can add other intent for other actions
////                Intent intent = new Intent(MainActivity.this, NotificationReceiver.class);
//                Intent intent = new Intent();
//                PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
//
//                // this is it, we'll build the notification!
//                // in the addAction method, if you don't want any icon, just set the first param to 0
//                Notification mNotification = new Notification.Builder(MainActivity.this)
//
//                        .setContentTitle("New Post!")
//                        .setContentText("Here's an awesome update for you!")
//                        .setSmallIcon(R.mipmap.ic_launcher)
//                        .setContentIntent(pIntent)
//                        .setPriority(Notification.PRIORITY_HIGH)
//                        .addAction(R.mipmap.ic_launcher, "View", pIntent)
//                        .addAction(0, "Remind", pIntent)
//
//                        .build();
//
//                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//
//                // If you want to hide the notification after it was selected, do the code below
//                // myNotification.flags |= Notification.FLAG_AUTO_CANCEL;
//
//                notificationManager.notify(0, mNotification);
//
//            }
//        });
//
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // listener handler
        View.OnClickListener handler = new View.OnClickListener(){
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.showNotificationButton:
                        showNotification();
                        break;
                }
            }
        };

        // we will set the listeners
        findViewById(R.id.showNotificationButton).setOnClickListener(handler);

    }

    public void showNotification(){

        // define sound URI, the sound to be played when there's a notification
        Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        // intent triggered, you can add other intent for other actions
        Intent intent = new Intent(MainActivity.this, NotificationReceiver.class);
        PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

        // this is it, we'll build the notification!
        // in the addAction method, if you don't want any icon, just set the first param to 0
        Notification mNotification = new Notification.Builder(this)

                .setContentTitle("New Post!")
                .setContentText("Here's an awesome update for you!")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(pIntent)
                .setSound(soundUri)

                .addAction(R.mipmap.ic_launcher, "View", pIntent)
                .addAction(0, "Remind", pIntent)

                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        // If you want to hide the notification after it was selected, do the code below
        // myNotification.flags |= Notification.FLAG_AUTO_CANCEL;

        notificationManager.notify(0, mNotification);
    }

    public void cancelNotification(int notificationId){

        if (Context.NOTIFICATION_SERVICE!=null) {
            String ns = Context.NOTIFICATION_SERVICE;
            NotificationManager nMgr = (NotificationManager) getApplicationContext().getSystemService(ns);
            nMgr.cancel(notificationId);
        }
    }

    private class NotificationReceiver extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            TextView tv = new TextView(this);
            tv.setText("Yo!");

            setContentView(tv);
        }
    }
}
