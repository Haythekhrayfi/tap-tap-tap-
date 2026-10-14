package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeza implements zzekc {
    private final Context zza;
    private final Executor zzb;
    private final zzcgu zzc;
    private final zzeyq zzd;
    private final zzexe zze;
    private final zzfaa zzf;
    private final zzfgb zzg;
    private final zzfag zzh;
    private zzfwm zzi;

    public zzeza(Context context, Executor executor, zzcgu zzcguVar, zzexe zzexeVar, zzeyq zzeyqVar, zzfag zzfagVar, zzfaa zzfaaVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcguVar;
        this.zze = zzexeVar;
        this.zzd = zzeyqVar;
        this.zzh = zzfagVar;
        this.zzf = zzfaaVar;
        this.zzg = zzcguVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdmq zzk(zzexc zzexcVar) {
        zzdmq zzdmqVarZzh = this.zzc.zzh();
        zzcuo zzcuoVar = new zzcuo();
        zzcuoVar.zze(this.zza);
        zzcuoVar.zzi(((zzeyz) zzexcVar).zza);
        zzcuoVar.zzh(this.zzf);
        zzdmqVarZzh.zzd(zzcuoVar.zzj());
        zzdmqVarZzh.zzc(new zzdar().zzn());
        return zzdmqVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeka zzekaVar, zzekb zzekbVar) throws RemoteException {
        zzffy zzffyVar;
        zzbvb zzbvbVar = new zzbvb(zzlVar, str);
        if (zzbvbVar.zzb == null) {
            zzbzr.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
        } else {
            zzfwm zzfwmVar = this.zzi;
            if (zzfwmVar == null || zzfwmVar.isDone()) {
                if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
                    zzexe zzexeVar = this.zze;
                    if (zzexeVar.zzd() != null) {
                        zzffy zzffyVarZzh = ((zzdmr) zzexeVar.zzd()).zzh();
                        zzffyVarZzh.zzh(5);
                        zzffyVarZzh.zzb(zzbvbVar.zza.zzp);
                        zzffyVar = zzffyVarZzh;
                    } else {
                        zzffyVar = null;
                    }
                } else {
                    zzffyVar = null;
                }
                zzfbc.zza(this.zza, zzbvbVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue() && zzbvbVar.zza.zzf) {
                    this.zzc.zzj().zzm(true);
                }
                zzfag zzfagVar = this.zzh;
                zzfagVar.zzs(zzbvbVar.zzb);
                zzfagVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzfagVar.zzE(zzbvbVar.zza);
                zzfai zzfaiVarZzG = zzfagVar.zzG();
                zzffn zzffnVarZzb = zzffm.zzb(this.zza, zzffx.zzf(zzfaiVarZzG), 5, zzbvbVar.zza);
                zzeyz zzeyzVar = new zzeyz(null);
                zzeyzVar.zza = zzfaiVarZzG;
                zzfwm zzfwmVarZzc = this.zze.zzc(new zzexf(zzeyzVar, null), new zzexd() { // from class: com.google.android.gms.internal.ads.zzeyu
                    @Override // com.google.android.gms.internal.ads.zzexd
                    public final zzcum zza(zzexc zzexcVar) {
                        return this.zza.zzk(zzexcVar);
                    }
                }, null);
                this.zzi = zzfwmVarZzc;
                zzfwc.zzq(zzfwmVarZzc, new zzeyx(this, zzekbVar, zzffyVar, zzffnVarZzb, zzeyzVar), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzfbi.zzd(6, null, null));
    }

    public final void zzj(int i10) {
        this.zzh.zzo().zza(i10);
    }
}
