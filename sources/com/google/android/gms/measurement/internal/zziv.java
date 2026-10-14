package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zziv implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzjs zzd;

    public zziv(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar, boolean z10) {
        this.zzd = zzjsVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
        this.zzc = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                try {
                    zzjs zzjsVar = this.zzd;
                    zzee zzeeVar = zzjsVar.zzb;
                    if (zzeeVar == null) {
                        zzjsVar.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                        this.zza.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.zzb);
                    this.zza.set(zzeeVar.zze(this.zzb, this.zzc));
                    this.zzd.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.zzd.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e10);
                    atomicReference = this.zza;
                }
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
