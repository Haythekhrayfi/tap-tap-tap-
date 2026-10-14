package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbzk;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public class zzu extends zzt {
    public static final boolean zzf(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeB)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeD)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        int iZzx = zzbzk.zzx(activity, configuration.screenHeightDp);
        int iZzx2 = zzbzk.zzx(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics displayMetricsZzq = zzs.zzq(windowManager);
        int i10 = displayMetricsZzq.heightPixels;
        int i11 = displayMetricsZzq.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzez)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
        return (zzf(i10, iZzx + dimensionPixelSize, iIntValue) && zzf(i11, iZzx2, iIntValue)) ? false : true;
    }
}
