package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmi implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzcmi(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcmh zzb() {
        return new zzcmh(((zzgwi) this.zza).zzb(), ((zzgwi) this.zzb).zzb());
    }
}
