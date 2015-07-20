package com.mia.notificationdemo;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	 Button b1=(Button)findViewById(R.id.button);
     
     b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           
           NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
           Notification notify=new Notification(R.drawable.ic_launcher,"Title",System.currentTimeMillis());
           PendingIntent pending= PendingIntent.getActivity(getApplicationContext(), 0, new Intent(), 0);
           
           notify.setLatestEventInfo(getApplicationContext(),"Subject","Body",pending);
           notif.notify(0, notify);
        }
     });
	}
}
