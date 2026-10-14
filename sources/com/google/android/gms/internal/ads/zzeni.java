package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeni implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzeni(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemy(((zzerg) this.zza).zzb(), ((Long) zzbcv.zza.zze()).longValue(), (Clock) this.zzb.zzb());
    }
}
