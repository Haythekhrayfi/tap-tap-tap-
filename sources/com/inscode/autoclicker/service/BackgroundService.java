package com.inscode.autoclicker.service;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.inscode.autoclicker.R;
import d0.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class BackgroundService extends Service {
    public static boolean a(Context context) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (BackgroundService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, getPackageManager().getLaunchIntentForPackage(getPackageName()).setFlags(270532608), 201326592);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("background_service", "Background service", 2);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        t tVar = new t(this, "background_service");
        tVar.N.icon = R.drawable.ic_notification;
        tVar.d(getString(R.string.app_uses_accessibility));
        tVar.f28585g = activity;
        tVar.e(getString(R.string.app_name));
        startForeground(555, tVar.a());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }
}
