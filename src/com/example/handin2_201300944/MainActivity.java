package com.example.handin2_201300944;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
public class MainActivity extends Activity {

	public void setAlarm(View view) {
		   EditText text = (EditText) findViewById(R.id.editText1);
		    final int i = Integer.parseInt(text.getText().toString());
		    Intent intent = new Intent(this, AlarmBroadcastReceiver.class);
		    PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 234324243, intent, 0);
		    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
		    alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
		        + (i * 1000), pendingIntent);
		    Toast.makeText(this, "Alarm set in " + i + " seconds",
		        Toast.LENGTH_SHORT).show();
		    final ProgressBar prog = (ProgressBar)findViewById(R.id.prog);
		    prog.setMax(i);
		    
		    new CountDownTimer((i)*1000, 1000) {
	        	int curVal=0;

		        public void onTick(long millisUntilFinished) {
Log.i(Constants.LOG,String.valueOf(millisUntilFinished));
curVal ++;

		        	prog.setProgress(curVal);
		        	
		        }

		        public void onFinish() {
		        	prog.setProgress(i);
		        }
		     }.start();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		EditText editText = (EditText) findViewById(R.id.editText1);

		editText.setText("5");
		System.out.println("n");
		Log.i(Constants.LOG, "On Create...");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		Context context = getApplicationContext();
		CharSequence text = "Hello toast!";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(Constants.LOG, "On Destroy .....");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(Constants.LOG, "On Pause .....");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onRestart()
	 */
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(Constants.LOG, "On Restart .....");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(Constants.LOG, "On Resume .....");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onStart()
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(Constants.LOG, "On Start .....");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onStop()
	 */
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(Constants.LOG, "On Stop .....");

	}

	public interface Constants {
		String LOG = "com.HI2.applog";
	}
}
