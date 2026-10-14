package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzboq implements InitializationCompleteCallback {
    public final /* synthetic */ zzbkj zza;

    public zzboq(zzbow zzbowVar, zzbkj zzbkjVar) {
        this.zza = zzbkjVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
    }
}
