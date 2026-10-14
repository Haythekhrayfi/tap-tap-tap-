package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeju extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzq zza;
    private final Context zzb;
    private final zzexq zzc;
    private final String zzd;
    private final zzbzx zze;
    private final zzejm zzf;
    private final zzeyq zzg;
    private final zzaqs zzh;
    private final zzdqa zzi;
    private zzddn zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaD)).booleanValue();

    public zzeju(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzexq zzexqVar, zzejm zzejmVar, zzeyq zzeyqVar, zzbzx zzbzxVar, zzaqs zzaqsVar, zzdqa zzdqaVar) {
        this.zza = zzqVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzexqVar;
        this.zzf = zzejmVar;
        this.zzg = zzeyqVar;
        this.zze = zzbzxVar;
        this.zzh = zzaqsVar;
        this.zzi = zzdqaVar;
    }

    private final synchronized boolean zze() {
        zzddn zzddnVar;
        zzddnVar = this.zzj;
        return (zzddnVar == null || zzddnVar.zza()) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzddn zzddnVar = this.zzj;
        if (zzddnVar != null) {
            zzddnVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zze(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzi(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzavw zzavwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.zzt(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsc zzbscVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbck zzbckVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbckVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e10) {
            zzbzr.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzf.zzg(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsf zzbsfVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbva zzbvaVar) {
        this.zzg.zzf(zzbvaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            zzbzr.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzfbi.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcr)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            zzbzr.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzfbi.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcr)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        boolean z10;
        if (((Boolean) zzbdd.zzi.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjJ)).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (this.zze.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjK)).intValue() || !z10) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzb) && zzlVar.zzs == null) {
            zzbzr.zzg("Failed to load the ad because app ID is missing.");
            zzejm zzejmVar = this.zzf;
            if (zzejmVar != null) {
                zzejmVar.zza(zzfbi.zzd(4, null, null));
            }
            return false;
        }
        if (zze()) {
            return false;
        }
        zzfbc.zza(this.zzb, zzlVar.zzf);
        this.zzj = null;
        return this.zzc.zzb(zzlVar, this.zzd, new zzexj(this.zza), new zzejt(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzf.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgA)).booleanValue()) {
            return null;
        }
        zzddn zzddnVar = this.zzj;
        if (zzddnVar == null) {
            return null;
        }
        return zzddnVar.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zzddn zzddnVar = this.zzj;
        if (zzddnVar == null || zzddnVar.zzl() == null) {
            return null;
        }
        return zzddnVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        zzddn zzddnVar = this.zzj;
        if (zzddnVar == null || zzddnVar.zzl() == null) {
            return null;
        }
        return zzddnVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzddn zzddnVar = this.zzj;
        if (zzddnVar != null) {
            zzddnVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.zzf(zzbkVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzddn zzddnVar = this.zzj;
        if (zzddnVar != null) {
            zzddnVar.zzm().zzb(null);
        }
    }
}
