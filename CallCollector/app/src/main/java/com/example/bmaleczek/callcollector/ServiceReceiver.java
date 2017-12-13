package com.example.bmaleczek.callcollector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by BMaleczek on 13.12.2017.
 */

public class ServiceReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("incomingNumberxx", "tescik");
        TelephonyManager telephony = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        telephony.listen(new PhoneStateListener(){
            @Override
            public void onCallStateChanged(int state, String incomingNumber) {
                super.onCallStateChanged(state, incomingNumber);
                Log.d("incomingNumberxx", incomingNumber);
//                System.out.println("incomingNumber : "+incomingNumber);
            }
        },PhoneStateListener.LISTEN_CALL_STATE);
    }
}
