package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeha implements zzece {
    private final zzeie zza;

    public zzeha(zzeie zzeieVar) {
        this.zza = zzeieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzece
    public final zzecf zza(String str, JSONObject jSONObject) throws zzfan {
        zzbpt zzbptVarZza = this.zza.zza(str);
        if (zzbptVarZza == null) {
            return null;
        }
        return new zzecf(zzbptVarZza, new zzedy(), str);
    }
}
