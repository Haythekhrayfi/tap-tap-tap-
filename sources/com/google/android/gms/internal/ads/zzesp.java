package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesp implements zzeqx {
    public final String zza;
    public final int zzb;

    public zzesp(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii");
            jSONObjectZzf.put("pvid", this.zza);
            jSONObjectZzf.put("pvid_s", this.zzb);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e10);
        }
    }
}
