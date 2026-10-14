package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzeus implements zzfvy {
    public final /* synthetic */ zzekb zza;
    public final /* synthetic */ zzffy zzb;
    public final /* synthetic */ zzffn zzc;
    public final /* synthetic */ zzeuu zzd;
    public final /* synthetic */ zzeuv zze;

    public zzeus(zzeuv zzeuvVar, zzekb zzekbVar, zzffy zzffyVar, zzffn zzffnVar, zzeuu zzeuuVar) {
        this.zze = zzeuvVar;
        this.zza = zzekbVar;
        this.zzb = zzffyVar;
        this.zzc = zzffnVar;
        this.zzd = zzeuuVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcun, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzffy zzffyVar;
        zzcol zzcolVar = (zzcol) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcolVar == null ? zzfbi.zzb(th, null) : zzcolVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcolVar != null) {
                zzcolVar.zzc().zza(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhK)).booleanValue()) {
                    this.zze.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeur
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeus zzeusVar = this.zza;
                            zzeusVar.zze.zzd.zza(zzeVarZzb);
                        }
                    });
                }
            } else {
                this.zze.zzd.zza(zzeVarZzb);
                this.zze.zzm(this.zzd).zzh().zzb().zzc().zzd();
            }
            zzfbc.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcy.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                zzfgb zzfgbVar = this.zze.zzh;
                zzffn zzffnVar = this.zzc;
                zzffnVar.zza(zzeVarZzb);
                zzffnVar.zzg(th);
                zzffnVar.zzf(false);
                zzfgbVar.zzb(zzffnVar.zzl());
            } else {
                zzffyVar.zzc(zzeVarZzb);
                zzffn zzffnVar2 = this.zzc;
                zzffnVar2.zzg(th);
                zzffnVar2.zzf(false);
                zzffyVar.zza(zzffnVar2);
                zzffyVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffy zzffyVar;
        zzcrd zzcrdVar = (zzcrd) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhK)).booleanValue()) {
                zzcrdVar.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcrdVar);
            if (!((Boolean) zzbcy.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                zzfgb zzfgbVar = this.zze.zzh;
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
