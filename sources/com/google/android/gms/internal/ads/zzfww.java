package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfww implements Runnable {

    @CheckForNull
    public zzfwz zza;

    public zzfww(zzfwz zzfwzVar) {
        this.zza = zzfwzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfwm zzfwmVar;
        zzfwz zzfwzVar = this.zza;
        if (zzfwzVar == null || (zzfwmVar = zzfwzVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (zzfwmVar.isDone()) {
            zzfwzVar.zzt(zzfwmVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzfwzVar.zzb;
            zzfwzVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzfwzVar.zze(new zzfwy(str, null));
                    throw th;
                }
            }
            zzfwzVar.zze(new zzfwy(str + ": " + zzfwmVar.toString(), null));
            zzfwmVar.cancel(true);
        } catch (Throwable th2) {
            zzfwmVar.cancel(true);
            throw th2;
        }
    }
}
