package com.google.android.play.core.assetpacks;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public class AssetPackExtractionService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f11808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f11809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bb f11810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.core.internal.af f11811d = new com.google.android.play.core.internal.af("AssetPackExtractionService");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f11812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NotificationManager f11813f;

    private final synchronized void b(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j10 = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i10 >= 26 ? new Notification.Builder(this.f11808a, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j10) : new Notification.Builder(this.f11808a).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false).setContentTitle(string).setSubText(string2);
        timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        Notification notificationBuild = timeoutAfter.build();
        this.f11811d.c("Starting foreground service.", new Object[0]);
        this.f11809b.a(true);
        if (i10 >= 26) {
            this.f11813f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, notificationBuild);
    }

    public final synchronized Bundle a(Bundle bundle) {
        int i10 = bundle.getInt("action_type");
        com.google.android.play.core.internal.af afVar = this.f11811d;
        Integer numValueOf = Integer.valueOf(i10);
        afVar.a("updateServiceState: %d", numValueOf);
        if (i10 == 1) {
            b(bundle);
        } else if (i10 == 2) {
            a();
        } else {
            this.f11811d.b("Unknown action type received: %d", numValueOf);
        }
        return new Bundle();
    }

    public final synchronized void a() {
        this.f11811d.c("Stopping service.", new Object[0]);
        this.f11809b.a(false);
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f11812e;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f11811d.a("onCreate", new Object[0]);
        db.a(getApplicationContext()).a(this);
        this.f11812e = new b(this.f11808a, this, this.f11810c);
        this.f11813f = (NotificationManager) this.f11808a.getSystemService("notification");
    }
}
