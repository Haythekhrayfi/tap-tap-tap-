package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdre {
    private final zzbjg zza;

    public zzdre(zzbjg zzbjgVar) {
        this.zza = zzbjgVar;
    }

    private final void zzs(zzdrd zzdrdVar) throws RemoteException {
        String strZza = zzdrd.zza(zzdrdVar);
        zzbzr.zzi("Dispatching AFMA event on publisher webview: ".concat(strZza));
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdrd("initialize", null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("interstitial", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onAdClicked";
        this.zza.zzb(zzdrd.zza(zzdrdVar));
    }

    public final void zzc(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("interstitial", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onAdClosed";
        zzs(zzdrdVar);
    }

    public final void zzd(long j10, int i10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("interstitial", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onAdFailedToLoad";
        zzdrdVar.zzd = Integer.valueOf(i10);
        zzs(zzdrdVar);
    }

    public final void zze(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("interstitial", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onAdLoaded";
        zzs(zzdrdVar);
    }

    public final void zzf(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("interstitial", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdrdVar);
    }

    public final void zzg(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("interstitial", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onAdOpened";
        zzs(zzdrdVar);
    }

    public final void zzh(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("creation", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "nativeObjectCreated";
        zzs(zzdrdVar);
    }

    public final void zzi(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("creation", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "nativeObjectNotCreated";
        zzs(zzdrdVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onAdClicked";
        zzs(zzdrdVar);
    }

    public final void zzk(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onRewardedAdClosed";
        zzs(zzdrdVar);
    }

    public final void zzl(long j10, zzbvk zzbvkVar) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onUserEarnedReward";
        zzdrdVar.zze = zzbvkVar.zzf();
        zzdrdVar.zzf = Integer.valueOf(zzbvkVar.zze());
        zzs(zzdrdVar);
    }

    public final void zzm(long j10, int i10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onRewardedAdFailedToLoad";
        zzdrdVar.zzd = Integer.valueOf(i10);
        zzs(zzdrdVar);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onRewardedAdFailedToShow";
        zzdrdVar.zzd = Integer.valueOf(i10);
        zzs(zzdrdVar);
    }

    public final void zzo(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onAdImpression";
        zzs(zzdrdVar);
    }

    public final void zzp(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onRewardedAdLoaded";
        zzs(zzdrdVar);
    }

    public final void zzq(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdrdVar);
    }

    public final void zzr(long j10) throws RemoteException {
        zzdrd zzdrdVar = new zzdrd("rewarded", null);
        zzdrdVar.zza = Long.valueOf(j10);
        zzdrdVar.zzc = "onRewardedAdOpened";
        zzs(zzdrdVar);
    }
}
