package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjk implements zzewc {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzciq zzd;
    private final zzcjk zze = this;
    private final zzgwr zzf;
    private final zzgwr zzg;
    private final zzgwr zzh;
    private final zzgwr zzi;
    private final zzgwr zzj;
    private final zzgwr zzk;

    public /* synthetic */ zzcjk(zzciq zzciqVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjj zzcjjVar) {
        this.zzd = zzciqVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgwe zzgweVarZza = zzgwf.zza(context);
        this.zzf = zzgweVarZza;
        zzgwe zzgweVarZza2 = zzgwf.zza(zzqVar);
        this.zzg = zzgweVarZza2;
        zzgwr zzgwrVarZzc = zzgwd.zzc(new zzejn(zzciqVar.zzn));
        this.zzh = zzgwrVarZzc;
        zzgwr zzgwrVarZzc2 = zzgwd.zzc(zzejs.zza());
        this.zzi = zzgwrVarZzc2;
        zzgwr zzgwrVarZzc3 = zzgwd.zzc(zzdae.zza());
        this.zzj = zzgwrVarZzc3;
        this.zzk = zzgwd.zzc(new zzewa(zzgweVarZza, zzciqVar.zzo, zzgweVarZza2, zzciqVar.zzU, zzgwrVarZzc, zzgwrVarZzc2, zzfak.zza(), zzgwrVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzewc
    public final zzeis zza() {
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzevz zzevzVar = (zzevz) this.zzk.zzb();
        zzejm zzejmVar = (zzejm) this.zzh.zzb();
        zzbzx zzbzxVarZzd = this.zzd.zza.zzd();
        zzgwm.zzb(zzbzxVarZzd);
        return new zzeis(context, zzqVar, str, zzevzVar, zzejmVar, zzbzxVarZzd, (zzdqa) this.zzd.zzZ.zzb());
    }
}
