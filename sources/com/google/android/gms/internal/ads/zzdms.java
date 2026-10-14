package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdms implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdms(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* synthetic */ Object zzb() {
        zzgwr zzgwrVar = this.zza;
        zzgwr zzgwrVar2 = this.zzb;
        int i10 = ((zzcux) this.zzc).zza().zzo.zza;
        int i11 = i10 - 1;
        if (i10 != 0) {
            return i11 != 0 ? ((zzehi) zzgwrVar2).zzb() : ((zzehi) zzgwrVar).zzb();
        }
        throw null;
    }
}
