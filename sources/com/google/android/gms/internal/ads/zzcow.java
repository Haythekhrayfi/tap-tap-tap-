package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcow extends zzavs {
    private final zzcov zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzevl zzc;
    private boolean zzd = false;
    private final zzdqa zze;

    public zzcow(zzcov zzcovVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzevl zzevlVar, zzdqa zzdqaVar) {
        this.zza = zzcovVar;
        this.zzb = zzbuVar;
        this.zzc = zzevlVar;
        this.zze = zzdqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgA)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e10) {
                zzbzr.zzf("Error in making CSI ping for reporting paid event callback", e10);
            }
            this.zzc.zzo(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavt
    public final void zzi(IObjectWrapper iObjectWrapper, zzawa zzawaVar) {
        try {
            this.zzc.zzq(zzawaVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzawaVar, this.zzd);
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
    }
}
