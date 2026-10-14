package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzjg implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzjs zzb;

    public zzjg(zzjs zzjsVar, zzq zzqVar) {
        this.zzb = zzjsVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.zzb;
        zzee zzeeVar = zzjsVar.zzb;
        if (zzeeVar == null) {
            a.a(zzjsVar.zzs, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzeeVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send consent settings to the service", e10);
        }
    }
}
