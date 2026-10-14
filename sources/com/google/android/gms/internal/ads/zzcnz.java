package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnz implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzcnz(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzatw zzatwVar = (zzatw) this.zza.zzb();
        zzbni zzbniVar = (zzbni) this.zzb.zzb();
        zzfwn zzfwnVarZza = zzfcy.zza();
        zzgwm.zzb(zzfwnVarZza);
        return new zzcns(zzatwVar.zzc(), zzbniVar, zzfwnVarZza);
    }
}
