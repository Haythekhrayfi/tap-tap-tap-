package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjy implements zzdrj {
    private final Context zza;
    private final zzbjg zzb;
    private final zzciq zzc;
    private final zzcjy zzd = this;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;

    public /* synthetic */ zzcjy(zzciq zzciqVar, Context context, zzbjg zzbjgVar, zzcjx zzcjxVar) {
        this.zzc = zzciqVar;
        this.zza = context;
        this.zzb = zzbjgVar;
        zzgwe zzgweVarZza = zzgwf.zza(this);
        this.zze = zzgweVarZza;
        zzgwe zzgweVarZza2 = zzgwf.zza(zzbjgVar);
        this.zzf = zzgweVarZza2;
        zzdrf zzdrfVar = new zzdrf(zzgweVarZza2);
        this.zzg = zzdrfVar;
        this.zzh = zzgwd.zzc(new zzdrh(zzgweVarZza, zzdrfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdrj
    public final zzdra zzb() {
        return new zzcjs(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdrj
    public final zzdrg zzd() {
        return (zzdrg) this.zzh.zzb();
    }
}
