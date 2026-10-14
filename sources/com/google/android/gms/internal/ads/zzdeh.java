package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdeh implements zzgwe {
    private final zzddr zza;
    private final zzgwr zzb;

    public zzdeh(zzddr zzddrVar, zzgwr zzgwrVar) {
        this.zza = zzddrVar;
        this.zzb = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
