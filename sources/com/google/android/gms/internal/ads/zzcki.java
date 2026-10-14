package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcki implements zzext {
    private final zzciq zza;
    private final zzcki zzb = this;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;

    public /* synthetic */ zzcki(zzciq zzciqVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzckh zzckhVar) {
        this.zza = zzciqVar;
        zzgwe zzgweVarZza = zzgwf.zza(context);
        this.zzc = zzgweVarZza;
        zzgwe zzgweVarZza2 = zzgwf.zza(zzqVar);
        this.zzd = zzgweVarZza2;
        zzgwe zzgweVarZza3 = zzgwf.zza(str);
        this.zze = zzgweVarZza3;
        zzgwr zzgwrVarZzc = zzgwd.zzc(new zzejn(zzciqVar.zzn));
        this.zzf = zzgwrVarZzc;
        zzgwr zzgwrVarZzc2 = zzgwd.zzc(new zzeyr(zzciqVar.zzaE));
        this.zzg = zzgwrVarZzc2;
        zzgwr zzgwrVarZzc3 = zzgwd.zzc(new zzexr(zzgweVarZza, zzciqVar.zzo, zzciqVar.zzU, zzgwrVarZzc, zzgwrVarZzc2, zzfak.zza()));
        this.zzh = zzgwrVarZzc3;
        this.zzi = zzgwd.zzc(new zzejv(zzgweVarZza, zzgweVarZza2, zzgweVarZza3, zzgwrVarZzc3, zzgwrVarZzc, zzgwrVarZzc2, zzciqVar.zzh, zzciqVar.zzV, zzciqVar.zzZ));
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final zzeju zza() {
        return (zzeju) this.zzi.zzb();
    }
}
