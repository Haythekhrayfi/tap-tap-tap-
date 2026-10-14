package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzix implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzjs zzc;

    public zzix(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar) {
        this.zzc = zzjsVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                try {
                    if (!this.zzc.zzs.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                        this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        this.zzc.zzs.zzq().zzO(null);
                        this.zzc.zzs.zzm().zze.zzb(null);
                        this.zza.set(null);
                        this.zza.notify();
                        return;
                    }
                    zzjs zzjsVar = this.zzc;
                    zzee zzeeVar = zzjsVar.zzb;
                    if (zzeeVar == null) {
                        zzjsVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                        this.zza.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.zzb);
                    this.zza.set(zzeeVar.zzd(this.zzb));
                    String str = (String) this.zza.get();
                    if (str != null) {
                        this.zzc.zzs.zzq().zzO(str);
                        this.zzc.zzs.zzm().zze.zzb(str);
                    }
                    this.zzc.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e10);
                    atomicReference = this.zza;
                }
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
