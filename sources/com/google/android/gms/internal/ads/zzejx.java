package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejx {
    private final zzekc zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdn zzc;

    public zzejx(zzekc zzekcVar, String str) {
        this.zza = zzekcVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        try {
            zzdnVar = this.zzc;
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        try {
            zzdnVar = this.zzc;
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i10) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(zzlVar, this.zzb, new zzekd(i10), new zzejw(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
