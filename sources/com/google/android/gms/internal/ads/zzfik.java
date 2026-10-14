package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfik implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfin.zzc != null) {
            zzfin.zzc.post(zzfin.zzd);
            zzfin.zzc.postDelayed(zzfin.zze, 200L);
        }
    }
}
