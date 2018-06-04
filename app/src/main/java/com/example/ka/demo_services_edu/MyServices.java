package com.example.ka.demo_services_edu;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;


public class MyServices extends Service {
    public static  MediaPlayer song;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        song = MediaPlayer.create(this, R.raw.wmyb);
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        song.setLooping(true);
        song.start();
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        song.stop();
        song.release();
        super.onDestroy();

    }
}
