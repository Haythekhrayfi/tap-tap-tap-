package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpt implements zzgwe {
    private final zzcpi zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzcpt(zzcpi zzcpiVar, zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzcpiVar;
        this.zzb = zzgwrVar;
        this.zzc = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxe zzb() {
        return new zzbxe(((zzcha) this.zzb).zza(), ((zzcux) this.zzc).zza().zzf);
    }
}
