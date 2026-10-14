package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzdpv;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzfai;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return "7";
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    public static String zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle = zzlVar.zzc;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzc(final zzdqf zzdqfVar, final zzdpv zzdpvVar, final String str, final Pair... pairArr) {
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzgN)).booleanValue()) {
            zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
                @Override // java.lang.Runnable
                public final void run() {
                    zzf.zzd(zzdqfVar, zzdpvVar, str, pairArr);
                }
            });
        }
    }

    public static void zzd(zzdqf zzdqfVar, zzdpv zzdpvVar, String str, Pair... pairArr) {
        Map mapZzc = zzdpvVar == null ? zzdqfVar.zzc() : zzdpvVar.zza();
        zzf(mapZzc, "action", str);
        for (Pair pair : pairArr) {
            zzf(mapZzc, (String) pair.first, (String) pair.second);
        }
        zzdqfVar.zze(mapZzc);
    }

    public static int zze(zzfai zzfaiVar) {
        if (zzfaiVar.zzq) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfaiVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzf(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
