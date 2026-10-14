package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzeqv;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class zzr {
    private final Context zza;
    private final String zzb;
    private final Map zzc = new TreeMap();
    private String zzd;
    private String zze;
    private final String zzf;

    public zzr(Context context, String str) {
        String strConcat;
        this.zza = context.getApplicationContext();
        this.zzb = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            zzbzr.zzh("Unable to get package version name for reporting", e10);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.zzf = strConcat;
    }

    public final String zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbzx zzbzxVar) {
        this.zzd = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) zzbct.zzc.zze();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.zze = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.zzc.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.zzc.put("SDKVersion", zzbzxVar.zza);
        if (((Boolean) zzbct.zza.zze()).booleanValue()) {
            try {
                Bundle bundleZzc = zzeqv.zzc(this.zza, new JSONArray((String) zzbct.zzb.zze()));
                for (String str3 : bundleZzc.keySet()) {
                    this.zzc.put(str3, bundleZzc.get(str3).toString());
                }
            } catch (JSONException e10) {
                zzbzr.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e10);
            }
        }
    }
}
