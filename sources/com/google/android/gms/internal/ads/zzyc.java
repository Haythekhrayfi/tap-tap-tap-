package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyc {
    public static final zzxw zza = new zzxw(0, -9223372036854775807L, null);
    public static final zzxw zzb = new zzxw(1, -9223372036854775807L, null);
    public static final zzxw zzc = new zzxw(2, -9223372036854775807L, null);
    public static final zzxw zzd = new zzxw(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzfj.zzA("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzxx zzf;
    private IOException zzg;

    public zzyc(String str) {
    }

    public static zzxw zzb(boolean z10, long j10) {
        return new zzxw(z10 ? 1 : 0, j10, null);
    }

    public final long zza(zzxy zzxyVar, zzxu zzxuVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        zzdy.zzb(looperMyLooper);
        this.zzg = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzxx(this, looperMyLooper, zzxyVar, zzxuVar, i10, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzxx zzxxVar = this.zzf;
        zzdy.zzb(zzxxVar);
        zzxxVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i10) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzxx zzxxVar = this.zzf;
        if (zzxxVar != null) {
            zzxxVar.zzb(i10);
        }
    }

    public final void zzj(zzxz zzxzVar) {
        zzxx zzxxVar = this.zzf;
        if (zzxxVar != null) {
            zzxxVar.zza(true);
        }
        this.zze.execute(new zzya(zzxzVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
