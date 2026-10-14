package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzevy implements zzfvy {
    public final /* synthetic */ zzekb zza;
    public final /* synthetic */ zzffy zzb;
    public final /* synthetic */ zzffn zzc;
    public final /* synthetic */ zzcpy zzd;
    public final /* synthetic */ zzevz zze;

    public zzevy(zzevz zzevzVar, zzekb zzekbVar, zzffy zzffyVar, zzffn zzffnVar, zzcpy zzcpyVar) {
        this.zze = zzevzVar;
        this.zza = zzekbVar;
        this.zzb = zzffyVar;
        this.zzc = zzffnVar;
        this.zzd = zzcpyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzffy zzffyVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhJ)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzevy zzevyVar = this.zza;
                        zzevyVar.zze.zzd.zza(zzeVarZza);
                    }
                });
            }
            zzevz zzevzVar = this.zze;
            zzevzVar.zzh.zzd(zzevzVar.zzj.zzc());
            zzfbc.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcy.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                zzfgb zzfgbVar = this.zze.zzi;
                zzffn zzffnVar = this.zzc;
                zzffnVar.zza(zzeVarZza);
                zzffnVar.zzg(th);
                zzffnVar.zzf(false);
                zzfgbVar.zzb(zzffnVar.zzl());
            } else {
                zzffyVar.zzc(zzeVarZza);
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
        zzcpb zzcpbVar = (zzcpb) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcpbVar.zzc() != null) {
                ViewParent parent = zzcpbVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    zzbzr.zzj("Banner view provided from " + (zzcpbVar.zzl() != null ? zzcpbVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcpbVar.zzc());
                }
            }
            zzbbe zzbbeVar = zzbbm.zzhJ;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue()) {
                zzczl zzczlVarZzn = zzcpbVar.zzn();
                zzczlVarZzn.zza(this.zze.zzd);
                zzczlVarZzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcpbVar.zzc());
            this.zza.zzb(zzcpbVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue()) {
                zzevz zzevzVar = this.zze;
                Executor executor = zzevzVar.zzb;
                final zzejm zzejmVar = zzevzVar.zzd;
                Objects.requireNonNull(zzejmVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejmVar.zzn();
                    }
                });
            }
            this.zze.zzh.zzd(zzcpbVar.zza());
            if (!((Boolean) zzbcy.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                zzfgb zzfgbVar = this.zze.zzi;
                zzffn zzffnVar = this.zzc;
                zzffnVar.zzb(zzcpbVar.zzp().zzb);
                zzffnVar.zzd(zzcpbVar.zzl().zzg());
                zzffnVar.zzf(true);
                zzfgbVar.zzb(zzffnVar.zzl());
            } else {
                zzffyVar.zzf(zzcpbVar.zzp().zzb);
                zzffyVar.zze(zzcpbVar.zzl().zzg());
                zzffn zzffnVar2 = this.zzc;
                zzffnVar2.zzf(true);
                zzffyVar.zza(zzffnVar2);
                zzffyVar.zzg();
            }
        }
    }
}
