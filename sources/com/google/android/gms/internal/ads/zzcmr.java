package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmr implements zzcmk {
    private final zzdsx zza;

    public zzcmr(zzdsx zzdsxVar) {
        this.zza = zzdsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziK)).booleanValue()) {
                this.zza.zzl(jSONObject);
            }
        }
    }
}
