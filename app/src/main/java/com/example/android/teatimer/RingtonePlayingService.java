package com.example.android.teatimer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by maksk on 6/10/2017.
 */

public class RingtonePlayingService extends Service{

    MediaPlayer mp_alarm ;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public int onStartCommand(Intent intent){
        mp_alarm = MediaPlayer.create(this.R.sound.submarine);
        mp_alarm.start();

        return START_NOT_STICKY
    }

}
