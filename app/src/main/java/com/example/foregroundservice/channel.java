package com.example.foregroundservice;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class channel extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        createNotifcationChannel();
    }

    private void createNotifcationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel=new NotificationChannel("1",
                    "MyChannel",
                    NotificationManager.IMPORTANCE_HIGH
            );
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

    }
}

