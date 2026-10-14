package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzero implements zzeqx {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfme zzc;

    public zzero(AdvertisingIdClient.Info info, String str, zzfme zzfmeVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectZzf.put("pdid", str);
                    jSONObjectZzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzf.put("rdid", this.zza.getId());
            jSONObjectZzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            jSONObjectZzf.put("idtype", "adid");
            zzfme zzfmeVar = this.zzc;
            if (zzfmeVar.zzc()) {
                jSONObjectZzf.put("paidv1_id_android_3p", zzfmeVar.zzb());
                jSONObjectZzf.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e10);
        }
    }
}
