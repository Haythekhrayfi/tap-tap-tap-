package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexq implements zzekc {
    private final Context zza;
    private final Executor zzb;
    private final zzcgu zzc;
    private final zzejm zzd;
    private final zzeyq zze;
    private zzbck zzf;
    private final zzfgb zzg;
    private final zzfag zzh;
    private zzfwm zzi;

    public zzexq(Context context, Executor executor, zzcgu zzcguVar, zzejm zzejmVar, zzeyq zzeyqVar, zzfag zzfagVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcguVar;
        this.zzd = zzejmVar;
        this.zzh = zzfagVar;
        this.zze = zzeyqVar;
        this.zzg = zzcguVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zza() {
        zzfwm zzfwmVar = this.zzi;
        return (zzfwmVar == null || zzfwmVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeka zzekaVar, zzekb zzekbVar) {
        zzdeo zzdeoVarZzf;
        zzffy zzffyVar;
        if (str == null) {
            zzbzr.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzj().zzm(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzexj) zzekaVar).zza;
        zzfag zzfagVar = this.zzh;
        zzfagVar.zzs(str);
        zzfagVar.zzr(zzqVar);
        zzfagVar.zzE(zzlVar);
        zzfai zzfaiVarZzG = zzfagVar.zzG();
        zzffn zzffnVarZzb = zzffm.zzb(this.zza, zzffx.zzf(zzfaiVarZzG), 4, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhL)).booleanValue()) {
            zzden zzdenVarZzf = this.zzc.zzf();
            zzcuo zzcuoVar = new zzcuo();
            zzcuoVar.zze(this.zza);
            zzcuoVar.zzi(zzfaiVarZzG);
            zzdenVarZzf.zze(zzcuoVar.zzj());
            zzdar zzdarVar = new zzdar();
            zzdarVar.zzj(this.zzd, this.zzb);
            zzdarVar.zzk(this.zzd, this.zzb);
            zzdenVarZzf.zzd(zzdarVar.zzn());
            zzdenVarZzf.zzc(new zzehv(this.zzf));
            zzdeoVarZzf = zzdenVarZzf.zzh();
        } else {
            zzdar zzdarVar2 = new zzdar();
            zzeyq zzeyqVar = this.zze;
            if (zzeyqVar != null) {
                zzdarVar2.zze(zzeyqVar, this.zzb);
                zzdarVar2.zzf(this.zze, this.zzb);
                zzdarVar2.zzb(this.zze, this.zzb);
            }
            zzden zzdenVarZzf2 = this.zzc.zzf();
            zzcuo zzcuoVar2 = new zzcuo();
            zzcuoVar2.zze(this.zza);
            zzcuoVar2.zzi(zzfaiVarZzG);
            zzdenVarZzf2.zze(zzcuoVar2.zzj());
            zzdarVar2.zzj(this.zzd, this.zzb);
            zzdarVar2.zze(this.zzd, this.zzb);
            zzdarVar2.zzf(this.zzd, this.zzb);
            zzdarVar2.zzb(this.zzd, this.zzb);
            zzdarVar2.zza(this.zzd, this.zzb);
            zzdarVar2.zzl(this.zzd, this.zzb);
            zzdarVar2.zzk(this.zzd, this.zzb);
            zzdarVar2.zzi(this.zzd, this.zzb);
            zzdarVar2.zzc(this.zzd, this.zzb);
            zzdenVarZzf2.zzd(zzdarVar2.zzn());
            zzdenVarZzf2.zzc(new zzehv(this.zzf));
            zzdeoVarZzf = zzdenVarZzf2.zzh();
        }
        zzdeo zzdeoVar = zzdeoVarZzf;
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            zzffy zzffyVarZzf = zzdeoVar.zzf();
            zzffyVarZzf.zzh(4);
            zzffyVarZzf.zzb(zzlVar.zzp);
            zzffyVar = zzffyVarZzf;
        } else {
            zzffyVar = null;
        }
        zzcsk zzcskVarZza = zzdeoVar.zza();
        zzfwm zzfwmVarZzi = zzcskVarZza.zzi(zzcskVarZza.zzj());
        this.zzi = zzfwmVarZzi;
        zzfwc.zzq(zzfwmVarZzi, new zzexp(this, zzekbVar, zzffyVar, zzffnVarZzb, zzdeoVar), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzfbi.zzd(6, null, null));
    }

    public final void zzi(zzbck zzbckVar) {
        this.zzf = zzbckVar;
    }
}
