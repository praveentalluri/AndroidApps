package com.kittu.praveendroid.sendsms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendSMS(View v) {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage("8169086466", "8169086466", "SMS sent from App", null, null);
        // ("5556", null, "Hello from careerRide", null, null);
    }
}
