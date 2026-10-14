package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzeuv implements zzekc {
    public final zzcgu zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzevl zzd;
    private final zzexe zze;
    private final zzbzx zzf;
    private final ViewGroup zzg;
    private final zzfgb zzh;
    private final zzfag zzi;

    @Nullable
    private zzfwm zzj;

    public zzeuv(Context context, Executor executor, zzcgu zzcguVar, zzexe zzexeVar, zzevl zzevlVar, zzfag zzfagVar, zzbzx zzbzxVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcguVar;
        this.zze = zzexeVar;
        this.zzd = zzevlVar;
        this.zzi = zzfagVar;
        this.zzf = zzbzxVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcguVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcum zzm(zzexc zzexcVar) {
        zzeuu zzeuuVar = (zzeuu) zzexcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhK)).booleanValue()) {
            zzcoy zzcoyVar = new zzcoy(this.zzg);
            zzcuo zzcuoVar = new zzcuo();
            zzcuoVar.zze(this.zzb);
            zzcuoVar.zzi(zzeuuVar.zza);
            zzcuq zzcuqVarZzj = zzcuoVar.zzj();
            zzdar zzdarVar = new zzdar();
            zzdarVar.zzc(this.zzd, this.zzc);
            zzdarVar.zzl(this.zzd, this.zzc);
            return zze(zzcoyVar, zzcuqVarZzj, zzdarVar.zzn());
        }
        zzevl zzevlVarZzi = zzevl.zzi(this.zzd);
        zzdar zzdarVar2 = new zzdar();
        zzdarVar2.zzb(zzevlVarZzi, this.zzc);
        zzdarVar2.zzg(zzevlVarZzi, this.zzc);
        zzdarVar2.zzh(zzevlVarZzi, this.zzc);
        zzdarVar2.zzi(zzevlVarZzi, this.zzc);
        zzdarVar2.zzc(zzevlVarZzi, this.zzc);
        zzdarVar2.zzl(zzevlVarZzi, this.zzc);
        zzdarVar2.zzm(zzevlVarZzi);
        zzcoy zzcoyVar2 = new zzcoy(this.zzg);
        zzcuo zzcuoVar2 = new zzcuo();
        zzcuoVar2.zze(this.zzb);
        zzcuoVar2.zzi(zzeuuVar.zza);
        return zze(zzcoyVar2, zzcuoVar2.zzj(), zzdarVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zza() {
        zzfwm zzfwmVar = this.zzj;
        return (zzfwmVar == null || zzfwmVar.isDone()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    @Override // com.google.android.gms.internal.ads.zzekc
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeka zzekaVar, zzekb zzekbVar) throws RemoteException {
        boolean z10;
        zzffy zzffyVar;
        if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjJ)).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjK)).intValue() || !z10) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        if (str == null) {
            zzbzr.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeup
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
            return false;
        }
        if (this.zzj != null) {
            return false;
        }
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            zzexe zzexeVar = this.zze;
            if (zzexeVar.zzd() != null) {
                zzffy zzffyVarZzh = ((zzcol) zzexeVar.zzd()).zzh();
                zzffyVarZzh.zzh(7);
                zzffyVarZzh.zzb(zzlVar.zzp);
                zzffyVar = zzffyVarZzh;
            } else {
                zzffyVar = null;
            }
        } else {
            zzffyVar = null;
        }
        zzfbc.zza(this.zzb, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue() && zzlVar.zzf) {
            this.zza.zzj().zzm(true);
        }
        zzfag zzfagVar = this.zzi;
        zzfagVar.zzs(str);
        zzfagVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
        zzfagVar.zzE(zzlVar);
        zzfai zzfaiVarZzG = zzfagVar.zzG();
        zzffn zzffnVarZzb = zzffm.zzb(this.zzb, zzffx.zzf(zzfaiVarZzG), 7, zzlVar);
        zzeuu zzeuuVar = new zzeuu(null);
        zzeuuVar.zza = zzfaiVarZzG;
        zzfwm zzfwmVarZzc = this.zze.zzc(new zzexf(zzeuuVar, null), new zzexd() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // com.google.android.gms.internal.ads.zzexd
            public final zzcum zza(zzexc zzexcVar) {
                return this.zza.zzm(zzexcVar);
            }
        }, null);
        this.zzj = zzfwmVarZzc;
        zzfwc.zzq(zzfwmVarZzc, new zzeus(this, zzekbVar, zzffyVar, zzffnVarZzb, zzeuuVar), this.zzc);
        return true;
    }

    public abstract zzcum zze(zzcoy zzcoyVar, zzcuq zzcuqVar, zzdat zzdatVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzfbi.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
