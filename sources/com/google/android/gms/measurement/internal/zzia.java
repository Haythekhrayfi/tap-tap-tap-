package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzia implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzic zze;

    public zzia(zzic zzicVar, boolean z10, Uri uri, String str, String str2) {
        this.zze = zzicVar;
        this.zza = z10;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZzs;
        Bundle bundleZzs2;
        zzic zzicVar = this.zze;
        boolean z10 = this.zza;
        Uri uri = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        zzicVar.zza.zzg();
        try {
            zzlh zzlhVarZzv = zzicVar.zza.zzs.zzv();
            if (TextUtils.isEmpty(str2)) {
                bundleZzs = null;
            } else if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid")) {
                bundleZzs = zzlhVarZzv.zzs(Uri.parse("https://google.com/search?".concat(str2)));
                if (bundleZzs != null) {
                    bundleZzs.putString("_cis", "referrer");
                }
            } else {
                zzlhVarZzv.zzs.zzay().zzc().zza("Activity created with data 'referrer' without required params");
                bundleZzs = null;
            }
            if (z10 && (bundleZzs2 = zzicVar.zza.zzs.zzv().zzs(uri)) != null) {
                bundleZzs2.putString("_cis", "intent");
                if (!bundleZzs2.containsKey("gclid") && bundleZzs != null && bundleZzs.containsKey("gclid")) {
                    bundleZzs2.putString("_cer", String.format("gclid=%s", bundleZzs.getString("gclid")));
                }
                zzicVar.zza.zzG(str, "_cmp", bundleZzs2);
                zzicVar.zza.zzb.zza(str, bundleZzs2);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            zzicVar.zza.zzs.zzay().zzc().zzb("Activity created with referrer", str2);
            if (zzicVar.zza.zzs.zzf().zzs(null, zzeb.zzY)) {
                if (bundleZzs != null) {
                    zzicVar.zza.zzG(str, "_cmp", bundleZzs);
                    zzicVar.zza.zzb.zza(str, bundleZzs);
                } else {
                    zzicVar.zza.zzs.zzay().zzc().zzb("Referrer does not contain valid parameters", str2);
                }
                zzicVar.zza.zzW("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                zzicVar.zza.zzs.zzay().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                zzicVar.zza.zzW("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e10) {
            zzicVar.zza.zzs.zzay().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }
}
