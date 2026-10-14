package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevz implements zzekc {
    private final Context zza;
    private final Executor zzb;
    private final zzcgu zzc;
    private final zzejm zzd;
    private final zzejq zze;
    private final ViewGroup zzf;
    private zzbck zzg;
    private final zzcxv zzh;
    private final zzfgb zzi;
    private final zzdac zzj;
    private final zzfag zzk;
    private zzfwm zzl;

    public zzevz(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcgu zzcguVar, zzejm zzejmVar, zzejq zzejqVar, zzfag zzfagVar, zzdac zzdacVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcguVar;
        this.zzd = zzejmVar;
        this.zze = zzejqVar;
        this.zzk = zzfagVar;
        this.zzh = zzcguVar.zze();
        this.zzi = zzcguVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdacVar;
        zzfagVar.zzr(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zza() {
        zzfwm zzfwmVar = this.zzl;
        return (zzfwmVar == null || zzfwmVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekc
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeka zzekaVar, zzekb zzekbVar) throws RemoteException {
        zzcpx zzcpxVarZzd;
        zzcoy zzcoyVar;
        zzffy zzffyVar;
        if (str == null) {
            zzbzr.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm();
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
        zzfag zzfagVar = this.zzk;
        zzfagVar.zzs(str);
        zzfagVar.zzE(zzlVar);
        zzfai zzfaiVarZzG = zzfagVar.zzG();
        zzffn zzffnVarZzb = zzffm.zzb(this.zza, zzffx.zzf(zzfaiVarZzG), 3, zzlVar);
        if (((Boolean) zzbdk.zzd.zze()).booleanValue() && this.zzk.zzg().zzk) {
            zzejm zzejmVar = this.zzd;
            if (zzejmVar != null) {
                zzejmVar.zza(zzfbi.zzd(7, null, null));
            }
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhJ)).booleanValue()) {
            zzcpxVarZzd = this.zzc.zzd();
            zzcuo zzcuoVar = new zzcuo();
            zzcuoVar.zze(this.zza);
            zzcuoVar.zzi(zzfaiVarZzG);
            zzcpxVarZzd.zzi(zzcuoVar.zzj());
            zzdar zzdarVar = new zzdar();
            zzdarVar.zzj(this.zzd, this.zzb);
            zzdarVar.zzk(this.zzd, this.zzb);
            zzcpxVarZzd.zzf(zzdarVar.zzn());
            zzcpxVarZzd.zze(new zzehv(this.zzg));
            zzcpxVarZzd.zzd(new zzdff(zzdhl.zza, null));
            zzcpxVarZzd.zzg(new zzcqv(this.zzh, this.zzj));
            zzcoyVar = new zzcoy(this.zzf);
        } else {
            zzcpxVarZzd = this.zzc.zzd();
            zzcuo zzcuoVar2 = new zzcuo();
            zzcuoVar2.zze(this.zza);
            zzcuoVar2.zzi(zzfaiVarZzG);
            zzcpxVarZzd.zzi(zzcuoVar2.zzj());
            zzdar zzdarVar2 = new zzdar();
            zzdarVar2.zzj(this.zzd, this.zzb);
            zzdarVar2.zza(this.zzd, this.zzb);
            zzdarVar2.zza(this.zze, this.zzb);
            zzdarVar2.zzl(this.zzd, this.zzb);
            zzdarVar2.zzd(this.zzd, this.zzb);
            zzdarVar2.zze(this.zzd, this.zzb);
            zzdarVar2.zzf(this.zzd, this.zzb);
            zzdarVar2.zzb(this.zzd, this.zzb);
            zzdarVar2.zzk(this.zzd, this.zzb);
            zzdarVar2.zzi(this.zzd, this.zzb);
            zzcpxVarZzd.zzf(zzdarVar2.zzn());
            zzcpxVarZzd.zze(new zzehv(this.zzg));
            zzcpxVarZzd.zzd(new zzdff(zzdhl.zza, null));
            zzcpxVarZzd.zzg(new zzcqv(this.zzh, this.zzj));
            zzcoyVar = new zzcoy(this.zzf);
        }
        zzcpxVarZzd.zzc(zzcoyVar);
        zzcpy zzcpyVarZzk = zzcpxVarZzd.zzh();
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            zzffy zzffyVarZzj = zzcpyVarZzk.zzj();
            zzffyVarZzj.zzh(3);
            zzffyVarZzj.zzb(zzlVar.zzp);
            zzffyVar = zzffyVarZzj;
        } else {
            zzffyVar = null;
        }
        zzcsk zzcskVarZzd = zzcpyVarZzk.zzd();
        zzfwm zzfwmVarZzi = zzcskVarZzd.zzi(zzcskVarZzd.zzj());
        this.zzl = zzfwmVarZzi;
        zzfwc.zzq(zzfwmVarZzi, new zzevy(this, zzekbVar, zzffyVar, zzffnVarZzb, zzcpyVarZzk), this.zzb);
        return true;
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfag zzi() {
        return this.zzk;
    }

    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzfbi.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final void zzp(zzcxw zzcxwVar) {
        this.zzh.zzm(zzcxwVar, this.zzb);
    }

    public final void zzq(zzbck zzbckVar) {
        this.zzg = zzbckVar;
    }

    public final boolean zzr() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzS(view, view.getContext());
    }
}
