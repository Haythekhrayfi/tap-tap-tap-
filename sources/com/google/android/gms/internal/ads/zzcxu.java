package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzcxu implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcxv zzcxvVar = (zzcxv) this.zza.get();
        if (zzcxvVar != null) {
            zzcxvVar.zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcxs
                @Override // com.google.android.gms.internal.ads.zzdap
                public final void zza(Object obj) {
                    ((zzcxw) obj).zza();
                }
            });
        }
    }
}
