package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends zzbzr {
    public static void zza(String str) {
        if (zzc()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : zzbzr.zza.zzd(str)) {
                if (z10) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return zzbzr.zzm(2) && ((Boolean) zzbdi.zza.zze()).booleanValue();
    }
}
