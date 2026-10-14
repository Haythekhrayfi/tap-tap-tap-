package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j1.d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxy {
    public static Uri zza(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(str.substring(0, i10));
        d.a(sb2, str2, "=", str3, "&");
        sb2.append(str.substring(i10));
        return Uri.parse(sb2.toString());
    }

    public static String zzb(Uri uri, Context context) {
        String strZza;
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(context) && (strZza = com.google.android.gms.ads.internal.zzt.zzn().zza(context)) != null) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaf);
            String string = uri.toString();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzae)).booleanValue() && string.contains(str)) {
                com.google.android.gms.ads.internal.zzt.zzn().zzm(context, strZza);
                return zzd(string, context).replace(str, strZza);
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                return string;
            }
            String string2 = zza(zzd(string, context), "fbs_aeid", strZza).toString();
            com.google.android.gms.ads.internal.zzt.zzn().zzm(context, strZza);
            return string2;
        }
        return uri.toString();
    }

    public static String zzc(String str, Context context, boolean z10) {
        String strZza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzam)).booleanValue() && !z10) || !com.google.android.gms.ads.internal.zzt.zzn().zzu(context) || TextUtils.isEmpty(str) || (strZza = com.google.android.gms.ads.internal.zzt.zzn().zza(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzae)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzp().zzg(str)) {
                com.google.android.gms.ads.internal.zzt.zzn().zzm(context, strZza);
                return zzd(str, context).replace(str2, strZza);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzp().zzh(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzn().zzn(context, strZza);
            return zzd(str, context).replace(str2, strZza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzp().zzg(str)) {
            com.google.android.gms.ads.internal.zzt.zzn().zzm(context, strZza);
            return zza(zzd(str, context), "fbs_aeid", strZza).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzp().zzh(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzn().zzn(context, strZza);
        return zza(zzd(str, context), "fbs_aeid", strZza).toString();
    }

    private static String zzd(String str, Context context) {
        String strZze = com.google.android.gms.ads.internal.zzt.zzn().zze(context);
        String strZzc = com.google.android.gms.ads.internal.zzt.zzn().zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZze)) {
            str = zza(str, "gmp_app_id", strZze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzc)) ? str : zza(str, "fbs_aiid", strZzc).toString();
    }
}
