package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemj implements zzeqy {
    private final zzfwn zza;

    public zzemj(zzfwn zzfwnVar) {
        this.zza = zzfwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemk.zzb();
            }
        });
    }
}
