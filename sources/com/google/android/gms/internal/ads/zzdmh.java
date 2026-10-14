package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmh extends VideoController.VideoLifecycleCallbacks {
    private final zzdha zza;

    public zzdmh(zzdha zzdhaVar) {
        this.zza = zzdhaVar;
    }

    private static com.google.android.gms.ads.internal.client.zzdt zza(zzdha zzdhaVar) {
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzj = zzdhaVar.zzj();
        if (zzdqVarZzj == null) {
            return null;
        }
        try {
            return zzdqVarZzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zze();
        } catch (RemoteException e10) {
            zzbzr.zzk("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zzg();
        } catch (RemoteException e10) {
            zzbzr.zzk("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zzi();
        } catch (RemoteException e10) {
            zzbzr.zzk("Unable to call onVideoEnd()", e10);
        }
    }
}
