package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzdpv {
    private final ConcurrentHashMap zza;
    private final zzbze zzb;
    private final zzfai zzc;
    private final String zzd;
    private final String zze;

    public zzdpv(zzdqf zzdqfVar, zzbze zzbzeVar, zzfai zzfaiVar, String str, String str2) {
        ConcurrentHashMap concurrentHashMapZzc = zzdqfVar.zzc();
        this.zza = concurrentHashMapZzc;
        this.zzb = zzbzeVar;
        this.zzc = zzfaiVar;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgN)).booleanValue()) {
            int iZze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfaiVar);
            int i10 = iZze - 1;
            if (i10 == 0) {
                concurrentHashMapZzc.put("scar", "false");
                return;
            }
            concurrentHashMapZzc.put("se", i10 != 1 ? i10 != 2 ? i10 != 3 ? "r_both" : "r_adstring" : "r_adinfo" : "query_g");
            concurrentHashMapZzc.put("scar", "true");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhm)).booleanValue()) {
                concurrentHashMapZzc.put("ad_format", str2);
            }
            if (iZze == 2) {
                concurrentHashMapZzc.put("rid", str);
            }
            zzd("ragent", zzfaiVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfaiVar.zzd)));
        }
    }

    private final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzezz zzezzVar) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (!zzezzVar.zzb.zza.isEmpty()) {
            switch (((zzezn) zzezzVar.zzb.zza.get(0)).zzb) {
                case 1:
                    concurrentHashMap = this.zza;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = this.zza;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = this.zza;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = this.zza;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = this.zza;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzk() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.zza;
                    str = AppLovinMediationProvider.UNKNOWN;
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        zzd("gqi", zzezzVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
