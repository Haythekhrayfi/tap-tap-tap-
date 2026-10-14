package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcus implements zzgwe {
    private final zzcuq zza;
    private final zzgwr zzb;

    public zzcus(zzcuq zzcuqVar, zzgwr zzgwrVar) {
        this.zza = zzcuqVar;
        this.zzb = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = this.zza.zza(((zzcha) this.zzb).zza());
        zzgwm.zzb(contextZza);
        return contextZza;
    }
}
