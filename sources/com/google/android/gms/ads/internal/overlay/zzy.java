package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzdcu;

/* JADX INFO: loaded from: classes.dex */
public final class zzy extends zzbrs {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (this.zzd) {
            return;
        }
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(4);
        }
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final boolean zzG() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzh(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzl(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzis)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel != null && !z10) {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                zzdcu zzdcuVar = this.zza.zzv;
                if (zzdcuVar != null) {
                    zzdcuVar.zzr();
                }
                if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                    zzoVar.zzb();
                }
            }
            com.google.android.gms.ads.internal.zzt.zzh();
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
                return;
            }
        }
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzm() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzo() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzr() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbF();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzu() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzv() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzx() throws RemoteException {
        this.zze = true;
    }
}
