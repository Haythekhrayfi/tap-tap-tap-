package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyc implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzbyc(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbyb((Context) this.zza.zzb(), ((zzbwz) this.zzb).zzb());
    }
}
