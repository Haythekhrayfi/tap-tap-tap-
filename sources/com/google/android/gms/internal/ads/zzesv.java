package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesv implements zzeqx {
    private final String zza;

    public zzesv(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            jSONObjectZzf.put("attok", this.zza);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting attestation token.", e10);
        }
    }
}
