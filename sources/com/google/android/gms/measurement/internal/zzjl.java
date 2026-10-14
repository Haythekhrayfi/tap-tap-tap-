package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzjl implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzq zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzjs zzf;

    public zzjl(zzjs zzjsVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z10) {
        this.zzf = zzjsVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzqVar;
        this.zze = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List listZzi;
        synchronized (this.zza) {
            try {
                try {
                    zzjs zzjsVar = this.zzf;
                    zzee zzeeVar = zzjsVar.zzb;
                    if (zzeeVar == null) {
                        zzjsVar.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                        this.zza.set(Collections.emptyList());
                        this.zza.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.zzd);
                        atomicReference2 = this.zza;
                        listZzi = zzeeVar.zzh(this.zzb, this.zzc, this.zze, this.zzd);
                    } else {
                        atomicReference2 = this.zza;
                        listZzi = zzeeVar.zzi(null, this.zzb, this.zzc, this.zze);
                    }
                    atomicReference2.set(listZzi);
                    this.zzf.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.zzf.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e10);
                    this.zza.set(Collections.emptyList());
                    atomicReference = this.zza;
                }
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
