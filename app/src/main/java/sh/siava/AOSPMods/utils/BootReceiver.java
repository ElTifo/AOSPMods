package sh.siava.AOSPMods.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import sh.siava.AOSPMods.BuildConfig;

public class BootReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction()))
		{
			if(BuildConfig.DEBUG)
				Log.d("BootReceiver", "Broadcast received: " + intent.getAction());
			UpdateScheduler.scheduleUpdates(context);
		}
	}
}