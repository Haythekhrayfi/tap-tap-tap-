package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbc {
    public static void zza(Context context, boolean z10) {
        String str;
        if (z10) {
            str = "This request is sent from a test device.";
        } else {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            str = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzbzk.zzy(context) + "\")) to get test ads on this device.";
        }
        zzbzr.zzi(str);
    }

    public static void zzb(int i10, Throwable th, String str) {
        zzbzr.zzi("Ad failed to load : " + i10);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i10 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, str);
    }
}
