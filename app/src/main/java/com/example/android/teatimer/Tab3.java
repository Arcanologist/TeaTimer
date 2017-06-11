package com.example.android.teatimer;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TimePicker;

import static android.support.v7.appcompat.R.styleable.CompoundButton;

/**
 * Created by maksk on 5/28/2017.
 */

public class Tab3 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3, container, false);
        TimePicker alarmPicker = (TimePicker) view.findViewById(R.id.timePicker);
        return view;
    }

    Switch.OnCheckedChangeListener alarmSwitch = new MyListener();

    //AlarmManager alarmManager = (AlarmManager) getActivity().getSystemService(ALARM_SERVICE);

    Calendar calendar = Calendar.getInstance();


    //Intent alarm_intent = new Intent(getActivity(), AlarmReceiver.class);

    private class MyListener implements Switch.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                Log.d("alarmCheck", "Alarm On");
               // calendar.set(Calendar.HOUR_OF_DAY, alarmPicker.getHour());
                //calendar.set(Calendar.MINUTE, alarmPicker.getMinute());

                //PendingIntent pending_alarm = PendingIntent.getBroadcast(getActivity(), 0,
                // alarm_intent, PendingIntent.FLAG_UPDATE_CURRENT);

                //alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pending_alarm);
            } else {
                Log.d("alarmCheck", "Alarm Off");
               // alarmManager.cancel(pending_alarm);
            }
        }
    }
}





