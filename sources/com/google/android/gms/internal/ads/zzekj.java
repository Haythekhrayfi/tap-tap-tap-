package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekj implements zzekc {
    private final zzfag zza;
    private final zzcgu zzb;
    private final Context zzc;
    private final zzejz zzd;
    private final zzfgb zze;
    private zzcrr zzf;

    public zzekj(zzcgu zzcguVar, Context context, zzejz zzejzVar, zzfag zzfagVar) {
        this.zzb = zzcguVar;
        this.zzc = context;
        this.zzd = zzejzVar;
        this.zza = zzfagVar;
        this.zze = zzcguVar.zzy();
        zzfagVar.zzu(zzejzVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zza() {
        zzcrr zzcrrVar = this.zzf;
        return zzcrrVar != null && zzcrrVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeka zzekaVar, zzekb zzekbVar) throws RemoteException {
        zzffy zzffyVar;
        Executor executorZzA;
        Runnable runnable;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
            zzbzr.zzg("Failed to load the ad because app ID is missing.");
            executorZzA = this.zzb.zzA();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeke
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            };
        } else {
            if (str != null) {
                zzfbc.zza(this.zzc, zzlVar.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue() && zzlVar.zzf) {
                    this.zzb.zzj().zzm(true);
                }
                int i10 = ((zzekd) zzekaVar).zza;
                zzfag zzfagVar = this.zza;
                zzfagVar.zzE(zzlVar);
                zzfagVar.zzz(i10);
                zzfai zzfaiVarZzG = zzfagVar.zzG();
                zzffn zzffnVarZzb = zzffm.zzb(this.zzc, zzffx.zzf(zzfaiVarZzG), 8, zzlVar);
                com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzfaiVarZzG.zzn;
                if (zzcbVar != null) {
                    this.zzd.zzd().zzi(zzcbVar);
                }
                zzdfj zzdfjVarZzg = this.zzb.zzg();
                zzcuo zzcuoVar = new zzcuo();
                zzcuoVar.zze(this.zzc);
                zzcuoVar.zzi(zzfaiVarZzG);
                zzdfjVarZzg.zzf(zzcuoVar.zzj());
                zzdar zzdarVar = new zzdar();
                zzdarVar.zzk(this.zzd.zzd(), this.zzb.zzA());
                zzdfjVarZzg.zze(zzdarVar.zzn());
                zzdfjVarZzg.zzd(this.zzd.zzc());
                zzdfjVarZzg.zzc(new zzcoy(null));
                zzdfk zzdfkVarZzg = zzdfjVarZzg.zzg();
                if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
                    zzffy zzffyVarZzf = zzdfkVarZzg.zzf();
                    zzffyVarZzf.zzh(8);
                    zzffyVarZzf.zzb(zzlVar.zzp);
                    zzffyVar = zzffyVarZzf;
                } else {
                    zzffyVar = null;
                }
                this.zzb.zzw().zzc(1);
                zzfwn zzfwnVar = zzcae.zza;
                zzgwm.zzb(zzfwnVar);
                ScheduledExecutorService scheduledExecutorServiceZzB = this.zzb.zzB();
                zzcsk zzcskVarZza = zzdfkVarZzg.zza();
                zzcrr zzcrrVar = new zzcrr(zzfwnVar, scheduledExecutorServiceZzB, zzcskVarZza.zzi(zzcskVarZza.zzj()));
                this.zzf = zzcrrVar;
                zzcrrVar.zze(new zzeki(this, zzekbVar, zzffyVar, zzffnVarZzb, zzdfkVarZzg));
                return true;
            }
            zzbzr.zzg("Ad unit ID should not be null for NativeAdLoader.");
            executorZzA = this.zzb.zzA();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzekf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            };
        }
        executorZzA.execute(runnable);
        return false;
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzfbi.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzfbi.zzd(6, null, null));
    }
}
