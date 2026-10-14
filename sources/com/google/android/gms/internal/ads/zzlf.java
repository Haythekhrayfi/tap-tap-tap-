package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlf {
    private final zzle zza;
    private final zzld zzb;
    private final zzdz zzc;
    private final zzcw zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzlf(zzld zzldVar, zzle zzleVar, zzcw zzcwVar, int i10, zzdz zzdzVar, Looper looper) {
        this.zzb = zzldVar;
        this.zza = zzleVar;
        this.zzd = zzcwVar;
        this.zzg = looper;
        this.zzc = zzdzVar;
        this.zzh = i10;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzle zzc() {
        return this.zza;
    }

    public final zzlf zzd() {
        zzdy.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlf zze(Object obj) {
        zzdy.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzlf zzf(int i10) {
        zzdy.zzf(!this.zzi);
        this.zze = i10;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z10) {
        this.zzj = z10 | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j10) throws InterruptedException, TimeoutException {
        zzdy.zzf(this.zzi);
        zzdy.zzf(this.zzg.getThread() != Thread.currentThread());
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (!this.zzk) {
            if (j10 <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j10);
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
