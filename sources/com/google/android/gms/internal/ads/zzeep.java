package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeep implements zzece {
    private final zzdnv zza;

    public zzeep(zzdnv zzdnvVar) {
        this.zza = zzdnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzece
    public final zzecf zza(String str, JSONObject jSONObject) throws zzfan {
        return new zzecf(this.zza.zzc(str, jSONObject), new zzedy(), str);
    }
}
