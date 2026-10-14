package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbzr;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzz zzzVar, zzx zzxVar, boolean z10) {
        if (z10) {
            return zzc(context, intent.getData(), zzzVar, zzxVar);
        }
        try {
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + intent.toURI());
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzP(context, intent);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
            if (zzxVar != null) {
                zzxVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            zzbzr.zzj(e10.getMessage());
            if (zzxVar != null) {
                zzxVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzz zzzVar, zzx zzxVar) {
        String strConcat;
        int i10 = 0;
        if (zzcVar != null) {
            zzbbm.zza(context);
            Intent intent = zzcVar.zzh;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(zzcVar.zzb)) {
                    strConcat = "Open GMSG did not contain a URL.";
                } else {
                    if (TextUtils.isEmpty(zzcVar.zzc)) {
                        intent.setData(Uri.parse(zzcVar.zzb));
                    } else {
                        intent.setDataAndType(Uri.parse(zzcVar.zzb), zzcVar.zzc);
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(zzcVar.zzd)) {
                        intent.setPackage(zzcVar.zzd);
                    }
                    if (!TextUtils.isEmpty(zzcVar.zze)) {
                        String[] strArrSplit = zzcVar.zze.split(DialogConfigs.DIRECTORY_SEPERATOR, 2);
                        if (strArrSplit.length < 2) {
                            strConcat = "Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze));
                        } else {
                            intent.setClassName(strArrSplit[0], strArrSplit[1]);
                        }
                    }
                    String str = zzcVar.zzf;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            i10 = Integer.parseInt(str);
                        } catch (NumberFormatException unused) {
                            zzbzr.zzj("Could not parse intent flags.");
                        }
                        intent.addFlags(i10);
                    }
                    if (((Boolean) zzba.zzc().zzb(zzbbm.zzel)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbbm.zzek)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzp();
                            com.google.android.gms.ads.internal.util.zzs.zzm(context, intent);
                        }
                    }
                }
            }
            return zza(context, intent, zzzVar, zzxVar, zzcVar.zzj);
        }
        strConcat = "No intent data for launcher overlay.";
        zzbzr.zzj(strConcat);
        return false;
    }

    private static final boolean zzc(Context context, Uri uri, zzz zzzVar, zzx zzxVar) {
        int iZzk;
        try {
            iZzk = com.google.android.gms.ads.internal.zzt.zzp().zzk(context, uri);
            if (zzzVar != null) {
                zzzVar.zzg();
            }
        } catch (ActivityNotFoundException e10) {
            zzbzr.zzj(e10.getMessage());
            iZzk = 6;
        }
        if (zzxVar != null) {
            zzxVar.zzb(iZzk);
        }
        return iZzk == 5;
    }
}
