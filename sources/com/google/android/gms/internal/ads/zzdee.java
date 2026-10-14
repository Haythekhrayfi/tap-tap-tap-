package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdee implements zzgwe {
    private final zzddr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdee(zzddr zzddrVar, zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzddrVar;
        this.zzb = zzgwrVar;
        this.zzc = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxe zzb() {
        return new zzbxe(((zzcha) this.zzb).zza(), ((zzcux) this.zzc).zza().zzf);
    }
}
