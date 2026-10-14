package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeku implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzeku(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeks((Clock) this.zza.zzb(), ((zzcux) this.zzb).zza());
    }
}
