package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpp implements zzgwe {
    private final zzcpi zza;
    private final zzgwr zzb;

    public zzcpp(zzcpi zzcpiVar, zzgwr zzgwrVar) {
        this.zza = zzcpiVar;
        this.zzb = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzg = zzcpi.zzg((zzcqs) this.zzb.zzb());
        zzgwm.zzb(setZzg);
        return setZzg;
    }
}
