package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmt;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzfgb;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfwc;
import com.google.android.gms.internal.ads.zzfwm;
import com.google.android.gms.internal.ads.zzfwn;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzbzx zzbzxVar, String str, Runnable runnable, zzfgb zzfgbVar) {
        zzb(context, zzbzxVar, true, null, str, null, runnable, zzfgbVar);
    }

    @VisibleForTesting
    public final void zzb(Context context, zzbzx zzbzxVar, boolean z10, zzbyu zzbyuVar, String str, String str2, Runnable runnable, final zzfgb zzfgbVar) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            zzbzr.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzbyuVar != null && !TextUtils.isEmpty(zzbyuVar.zzc())) {
            if (zzt.zzB().currentTimeMillis() - zzbyuVar.zza() <= ((Long) zzba.zzc().zzb(zzbbm.zzdN)).longValue() && zzbyuVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzbzr.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzbzr.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzffn zzffnVarZza = zzffm.zza(context, 4);
        zzffnVarZza.zzh();
        zzbmz zzbmzVarZza = zzt.zzf().zza(this.zza, zzbzxVar, zzfgbVar);
        zzbmt zzbmtVar = zzbmw.zza;
        zzbmp zzbmpVarZza = zzbmzVarZza.zza("google.afma.config.fetchAppSettings", zzbmtVar, zzbmtVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put("pn", context.getPackageName());
            zzbbe zzbbeVar = zzbbm.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
            jSONObject.put("js", zzbzxVar.zza);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            zzfwm zzfwmVarZzb = zzbmpVarZza.zzb(jSONObject);
            zzfvj zzfvjVar = new zzfvj() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzfvj
                public final zzfwm zza(Object obj) throws JSONException {
                    zzfgb zzfgbVar2 = zzfgbVar;
                    zzffn zzffnVar = zzffnVarZza;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    zzffnVar.zzf(zOptBoolean);
                    zzfgbVar2.zzb(zzffnVar.zzl());
                    return zzfwc.zzh(null);
                }
            };
            zzfwn zzfwnVar = zzcae.zzf;
            zzfwm zzfwmVarZzm = zzfwc.zzm(zzfwmVarZzb, zzfvjVar, zzfwnVar);
            if (runnable != null) {
                zzfwmVarZzb.zzc(runnable, zzfwnVar);
            }
            zzcah.zza(zzfwmVarZzm, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e10) {
            zzbzr.zzh("Error requesting application settings", e10);
            zzffnVarZza.zzg(e10);
            zzffnVarZza.zzf(false);
            zzfgbVar.zzb(zzffnVarZza.zzl());
        }
    }

    public final void zzc(Context context, zzbzx zzbzxVar, String str, zzbyu zzbyuVar, zzfgb zzfgbVar) {
        zzb(context, zzbzxVar, false, zzbyuVar, zzbyuVar != null ? zzbyuVar.zzb() : null, str, null, zzfgbVar);
    }
}
