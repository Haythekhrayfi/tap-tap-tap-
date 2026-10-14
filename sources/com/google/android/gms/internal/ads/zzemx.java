package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
final class zzemx {
    public final zzfwm zza;
    private final long zzb;
    private final Clock zzc;

    public zzemx(zzfwm zzfwmVar, long j10, Clock clock) {
        this.zza = zzfwmVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j10;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
