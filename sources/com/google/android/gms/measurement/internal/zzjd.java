package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzjd implements Runnable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    public final /* synthetic */ zzjs zzd;

    public zzjd(zzjs zzjsVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjsVar;
        this.zza = zzawVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzu = null;
        try {
            try {
                zzjs zzjsVar = this.zzd;
                zzee zzeeVar = zzjsVar.zzb;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrZzu = zzeeVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                }
            } catch (RemoteException e10) {
                this.zzd.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e10);
            }
        } finally {
            this.zzd.zzs.zzv().zzS(this.zzc, bArrZzu);
        }
    }
}
