package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzeki implements zzfvy {
    public final /* synthetic */ zzekb zza;
    public final /* synthetic */ zzffy zzb;
    public final /* synthetic */ zzffn zzc;
    public final /* synthetic */ zzdfk zzd;
    public final /* synthetic */ zzekj zze;

    public zzeki(zzekj zzekjVar, zzekb zzekbVar, zzffy zzffyVar, zzffn zzffnVar, zzdfk zzdfkVar) {
        this.zze = zzekjVar;
        this.zza = zzekbVar;
        this.zzb = zzffyVar;
        this.zzc = zzffnVar;
        this.zzd = zzdfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzffy zzffyVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zzeVarZza);
        this.zze.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // java.lang.Runnable
            public final void run() {
                zzeki zzekiVar = this.zza;
                zzekiVar.zze.zzd.zza().zza(zzeVarZza);
            }
        });
        zzfbc.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbcy.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
            zzfgb zzfgbVar = this.zze.zze;
            zzffn zzffnVar = this.zzc;
            zzffnVar.zza(zzeVarZza);
            zzffnVar.zzg(th);
            zzffnVar.zzf(false);
            zzfgbVar.zzb(zzffnVar.zzl());
            return;
        }
        zzffyVar.zzc(zzeVarZza);
        zzffn zzffnVar2 = this.zzc;
        zzffnVar2.zzg(th);
        zzffnVar2.zzf(false);
        zzffyVar.zza(zzffnVar2);
        zzffyVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffy zzffyVar;
        zzcrd zzcrdVar = (zzcrd) obj;
        synchronized (this.zze) {
            zzcrdVar.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcrdVar);
            this.zze.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze.zzd.zzb().zzn();
                }
            });
            if (!((Boolean) zzbcy.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                zzfgb zzfgbVar = this.zze.zze;
                zzffn zzffnVar = this.zzc;
                zzffnVar.zzb(zzcrdVar.zzp().zzb);
                zzffnVar.zzd(zzcrdVar.zzl().zzg());
                zzffnVar.zzf(true);
                zzfgbVar.zzb(zzffnVar.zzl());
            } else {
                zzffyVar.zzf(zzcrdVar.zzp().zzb);
                zzffyVar.zze(zzcrdVar.zzl().zzg());
                zzffn zzffnVar2 = this.zzc;
                zzffnVar2.zzf(true);
                zzffyVar.zza(zzffnVar2);
                zzffyVar.zzg();
            }
        }
    }
}
