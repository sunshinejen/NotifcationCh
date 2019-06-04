package com.example.notifcationch;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {

    public static final String CHANNEL_1_ID = "channel1";
    public static final String CHANNEL_2_ID = "channel2";




    @Override
    public void onCreate(){
        super.onCreate();
    }

    public void createNotificationChannels() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel1 = new NotificationChannel(
                    CHANNEL_1_ID,
                    "channel1",
                    NotificationManager.IMPORTANCE_HIGH
            );
            channel1.setDescription("This is Channel1");

            NotificationChannel channel2 = new NotificationChannel(
                    CHANNEL_2_ID,
                    "channel2",
                    NotificationManager.IMPORTANCE_LOW
            );
            channel1.setDescription("This is Channel2");

            NotificationManager manager = getSystemService(NotificationManager.class);
                manager.createNotificationChannel(channel1);
                manager.createNotificationChannel(channel2);



        }
    }
}

