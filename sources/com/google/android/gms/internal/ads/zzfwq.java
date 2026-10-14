package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwq extends zzfvw implements ScheduledFuture {
    private final ScheduledFuture zza;

    public zzfwq(zzfwm zzfwmVar, ScheduledFuture scheduledFuture) {
        super(zzfwmVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzfvv, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = zzb().cancel(z10);
        if (zCancel) {
            this.zza.cancel(z10);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
