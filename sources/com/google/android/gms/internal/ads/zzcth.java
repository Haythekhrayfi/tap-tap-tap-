package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcth implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzcth(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcm((zzczn) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
