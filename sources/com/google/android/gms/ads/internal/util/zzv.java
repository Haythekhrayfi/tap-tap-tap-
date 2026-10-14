package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(26)
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzh(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzi(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzj(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzp();
        return (zzs.zzw(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
