package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbiv implements zzbiw {
    public final /* synthetic */ zzcaj zza;

    public zzbiv(zzbix zzbixVar, zzcaj zzcajVar) {
        this.zza = zzcajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiw
    public final void zza(String str) {
        this.zza.zze(new zzbmo(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbiw
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzd(jSONObject);
    }
}
