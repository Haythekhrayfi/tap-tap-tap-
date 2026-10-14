package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzawf implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzawh zza;

    public zzawf(zzawh zzawhVar) {
        this.zza = zzawhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzawh zzawhVar = this.zza;
                if (zzawhVar.zzd != null) {
                    zzawhVar.zzf = zzawhVar.zzd.zzq();
                }
            } catch (DeadObjectException e10) {
                zzbzr.zzh("Unable to obtain a cache service instance.", e10);
                zzawh.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
