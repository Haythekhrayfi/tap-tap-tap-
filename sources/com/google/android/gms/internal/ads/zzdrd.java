package com.google.android.gms.internal.ads;

import androidx.fragment.app.w;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzdrd {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdrd(String str, zzdrc zzdrcVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdrd zzdrdVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzje);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdrdVar.zza);
            jSONObject.put("eventCategory", zzdrdVar.zzb);
            jSONObject.putOpt("event", zzdrdVar.zzc);
            jSONObject.putOpt("errorCode", zzdrdVar.zzd);
            jSONObject.putOpt("rewardType", zzdrdVar.zze);
            jSONObject.putOpt("rewardAmount", zzdrdVar.zzf);
        } catch (JSONException unused) {
            zzbzr.zzj("Could not convert parameters to JSON.");
        }
        return w.a(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
