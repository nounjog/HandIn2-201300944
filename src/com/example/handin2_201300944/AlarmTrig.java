package com.example.handin2_201300944;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AlarmTrig extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm_trig);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alarm_trig, menu);
		return true;
	}

}
