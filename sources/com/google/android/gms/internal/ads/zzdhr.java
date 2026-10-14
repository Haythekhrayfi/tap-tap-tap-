package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhr implements zzgwe {
    private final zzdhm zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdhr(zzdhm zzdhmVar, zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzdhmVar;
        this.zzb = zzgwrVar;
        this.zzc = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxe zzb() {
        return new zzbxe(((zzcha) this.zzb).zza(), ((zzcux) this.zzc).zza().zzf);
    }
}
