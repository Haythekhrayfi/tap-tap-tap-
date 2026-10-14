package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcja implements zzeuo {
    private final zzciq zza;
    private final zzcja zzb = this;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;

    public /* synthetic */ zzcja(zzciq zzciqVar, Context context, String str, zzciz zzcizVar) {
        this.zza = zzciqVar;
        zzgwe zzgweVarZza = zzgwf.zza(context);
        this.zzc = zzgweVarZza;
        zzgwe zzgweVarZza2 = zzgwf.zza(str);
        this.zzd = zzgweVarZza2;
        zzexg zzexgVar = new zzexg(zzgweVarZza, zzciqVar.zzaE, zzciqVar.zzaF);
        this.zze = zzexgVar;
        zzgwr zzgwrVarZzc = zzgwd.zzc(new zzevm(zzciqVar.zzaE));
        this.zzf = zzgwrVarZzc;
        zzgwr zzgwrVarZzc2 = zzgwd.zzc(new zzevo(zzgweVarZza, zzciqVar.zzo, zzciqVar.zzU, zzexgVar, zzgwrVarZzc, zzfak.zza(), zzciqVar.zzh));
        this.zzg = zzgwrVarZzc2;
        this.zzh = zzgwd.zzc(new zzevu(zzciqVar.zzU, zzgweVarZza, zzgweVarZza2, zzgwrVarZzc2, zzgwrVarZzc, zzciqVar.zzh, zzciqVar.zzZ));
    }

    @Override // com.google.android.gms.internal.ads.zzeuo
    public final zzevt zza() {
        return (zzevt) this.zzh.zzb();
    }
}
