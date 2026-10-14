package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzaur implements Runnable {
    public final /* synthetic */ zzaus zza;

    public zzaur(zzaus zzausVar) {
        this.zza = zzausVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            zzaus zzausVar = this.zza;
            if (zzausVar.zzd && zzausVar.zze) {
                zzausVar.zzd = false;
                zzbzr.zze("App went background");
                Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzaut) it.next()).zza(false);
                    } catch (Exception e10) {
                        zzbzr.zzh("", e10);
                    }
                }
            } else {
                zzbzr.zze("App is still foreground");
            }
        }
    }
}
