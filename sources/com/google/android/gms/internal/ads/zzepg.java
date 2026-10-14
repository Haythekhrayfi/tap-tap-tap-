package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepg implements zzeqy {
    private final zzeqy zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzepg(zzeqy zzeqyVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeqyVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        zzfwm zzfwmVarZzb = this.zza.zzb();
        long j10 = this.zzb;
        if (j10 > 0) {
            zzfwmVarZzb = zzfwc.zzn(zzfwmVarZzb, j10, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfwc.zzf(zzfwmVarZzb, Throwable.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzepf
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzh(null);
            }
        }, zzcae.zzf);
    }
}
