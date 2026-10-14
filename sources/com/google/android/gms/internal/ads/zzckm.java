package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzckm implements zzezh {
    private final zzciq zza;
    private final zzckm zzb = this;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;
    private final zzgwr zzj;

    public /* synthetic */ zzckm(zzciq zzciqVar, Context context, String str, zzckl zzcklVar) {
        this.zza = zzciqVar;
        zzgwe zzgweVarZza = zzgwf.zza(context);
        this.zzc = zzgweVarZza;
        zzexh zzexhVar = new zzexh(zzgweVarZza, zzciqVar.zzaE, zzciqVar.zzaF);
        this.zzd = zzexhVar;
        zzgwr zzgwrVarZzc = zzgwd.zzc(new zzeyr(zzciqVar.zzaE));
        this.zze = zzgwrVarZzc;
        zzgwr zzgwrVarZzc2 = zzgwd.zzc(zzfaf.zza());
        this.zzf = zzgwrVarZzc2;
        zzgwr zzgwrVarZzc3 = zzgwd.zzc(new zzezb(zzgweVarZza, zzciqVar.zzo, zzciqVar.zzU, zzexhVar, zzgwrVarZzc, zzfak.zza(), zzgwrVarZzc2));
        this.zzg = zzgwrVarZzc3;
        this.zzh = zzgwd.zzc(new zzezl(zzgwrVarZzc3, zzgwrVarZzc, zzgwrVarZzc2));
        zzgwe zzgweVarZzc = zzgwf.zzc(str);
        this.zzi = zzgweVarZzc;
        this.zzj = zzgwd.zzc(new zzezf(zzgweVarZzc, zzgwrVarZzc3, zzgweVarZza, zzgwrVarZzc, zzgwrVarZzc2, zzciqVar.zzh, zzciqVar.zzV, zzciqVar.zzZ));
    }

    @Override // com.google.android.gms.internal.ads.zzezh
    public final zzeze zza() {
        return (zzeze) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzezh
    public final zzezk zzb() {
        return (zzezk) this.zzh.zzb();
    }
}
