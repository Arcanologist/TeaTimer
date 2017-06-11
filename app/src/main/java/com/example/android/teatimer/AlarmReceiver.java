package com.example.android.teatimer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by maksk on 6/10/2017.
 */

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("in reciever","success");
        Intent service_intent = new Intent(context, RingtonePlayingService.class);

        context.startService(service_intent);


    }
}
