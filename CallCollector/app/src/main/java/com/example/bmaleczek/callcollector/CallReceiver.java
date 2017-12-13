package com.example.bmaleczek.callcollector;

import android.content.Context;
import android.util.Log;

import java.util.Date;

/**
 * Created by BMaleczek on 13.12.2017.
 */

public class CallReceiver extends PhonecallReceiver {

    @Override
    protected void onIncomingCallStarted(Context ctx, String number, Date start) {
        Log.d("incomingNumberxx", "tescik");
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
        Log.d("incomingNumberxx", "tescik");
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {
        Log.d("incomingNumberxx", "tescik");
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start) {
    }

}
