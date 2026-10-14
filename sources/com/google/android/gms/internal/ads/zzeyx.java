package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzeyx implements zzfvy {
    public final /* synthetic */ zzekb zza;
    public final /* synthetic */ zzffy zzb;
    public final /* synthetic */ zzffn zzc;
    public final /* synthetic */ zzeyz zzd;
    public final /* synthetic */ zzeza zze;

    public zzeyx(zzeza zzezaVar, zzekb zzekbVar, zzffy zzffyVar, zzffn zzffnVar, zzeyz zzeyzVar) {
        this.zze = zzezaVar;
        this.zza = zzekbVar;
        this.zzb = zzffyVar;
        this.zzc = zzffnVar;
        this.zzd = zzeyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzffy zzffyVar;
        zzdmr zzdmrVar = (zzdmr) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdmrVar == null ? zzfbi.zzb(th, null) : zzdmrVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                if (zzdmrVar != null) {
                    zzdmrVar.zza().zza(zzeVarZzb);
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeyx zzeyxVar = this.zza;
                            zzeyxVar.zze.zzd.zza(zzeVarZzb);
                        }
                    });
                } else {
                    this.zze.zzd.zza(zzeVarZzb);
                    this.zze.zzk(this.zzd).zzh().zzb().zzc().zzd();
                }
                zzfbc.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbcy.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgb zzfgbVar = this.zze.zzg;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffy zzffyVar;
        zzdmm zzdmmVar = (zzdmm) obj;
        synchronized (this.zze) {
            zzdmmVar.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdmmVar);
            zzeza zzezaVar = this.zze;
            Executor executor = zzezaVar.zzb;
            final zzeyq zzeyqVar = zzezaVar.zzd;
            Objects.requireNonNull(zzeyqVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyv
                @Override // java.lang.Runnable
                public final void run() {
                    zzeyqVar.zzn();
                }
            });
            this.zze.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbcy.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                zzfgb zzfgbVar = this.zze.zzg;
                zzffn zzffnVar = this.zzc;
                zzffnVar.zzb(zzdmmVar.zzp().zzb);
                zzffnVar.zzd(zzdmmVar.zzl().zzg());
                zzffnVar.zzf(true);
                zzfgbVar.zzb(zzffnVar.zzl());
            } else {
                zzffyVar.zzf(zzdmmVar.zzp().zzb);
                zzffyVar.zze(zzdmmVar.zzl().zzg());
                zzffn zzffnVar2 = this.zzc;
                zzffnVar2.zzf(true);
                zzffyVar.zza(zzffnVar2);
                zzffyVar.zzg();
            }
        }
    }
}
