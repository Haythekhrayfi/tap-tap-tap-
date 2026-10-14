package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzjb implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ zzjs zzc;

    public zzjb(zzjs zzjsVar, zzq zzqVar, Bundle bundle) {
        this.zzc = zzjsVar;
        this.zza = zzqVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.zzc;
        zzee zzeeVar = zzjsVar.zzb;
        if (zzeeVar == null) {
            a.a(zzjsVar.zzs, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzeeVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e10) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e10);
        }
    }
}
