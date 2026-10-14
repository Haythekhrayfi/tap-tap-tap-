package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwz extends zzfvs {

    @CheckForNull
    private zzfwm zza;

    @CheckForNull
    private ScheduledFuture zzb;

    private zzfwz(zzfwm zzfwmVar) {
        Objects.requireNonNull(zzfwmVar);
        this.zza = zzfwmVar;
    }

    public static zzfwm zzg(zzfwm zzfwmVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfwz zzfwzVar = new zzfwz(zzfwmVar);
        zzfww zzfwwVar = new zzfww(zzfwzVar);
        zzfwzVar.zzb = scheduledExecutorService.schedule(zzfwwVar, j10, timeUnit);
        zzfwmVar.zzc(zzfwwVar, zzfvq.INSTANCE);
        return zzfwzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    @CheckForNull
    public final String zza() {
        zzfwm zzfwmVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfwmVar == null) {
            return null;
        }
        String strA = j.a("inputFuture=[", zzfwmVar.toString(), "]");
        if (scheduledFuture == null) {
            return strA;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strA;
        }
        return strA + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
