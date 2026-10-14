package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzjf implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzjs zzb;

    public zzjf(zzjs zzjsVar, zzq zzqVar) {
        this.zzb = zzjsVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.zzb;
        zzee zzeeVar = zzjsVar.zzb;
        if (zzeeVar == null) {
            a.a(zzjsVar.zzs, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzeeVar.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e10);
        }
    }
}
