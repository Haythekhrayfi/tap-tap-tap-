package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdji implements zzgwe {
    private final zzdjb zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdji(zzdjb zzdjbVar, zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzdjbVar;
        this.zzb = zzgwrVar;
        this.zzc = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcm(((zzdmi) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
