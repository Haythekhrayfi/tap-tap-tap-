package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzale extends Thread {
    private final BlockingQueue zza;
    private final zzald zzb;
    private final zzaku zzc;
    private volatile boolean zzd = false;
    private final zzalb zze;

    public zzale(BlockingQueue blockingQueue, zzald zzaldVar, zzaku zzakuVar, zzalb zzalbVar) {
        this.zza = blockingQueue;
        this.zzb = zzaldVar;
        this.zzc = zzakuVar;
        this.zze = zzalbVar;
    }

    private void zzb() throws InterruptedException {
        zzalk zzalkVar = (zzalk) this.zza.take();
        SystemClock.elapsedRealtime();
        zzalkVar.zzt(3);
        try {
            zzalkVar.zzm("network-queue-take");
            zzalkVar.zzw();
            TrafficStats.setThreadStatsTag(zzalkVar.zzc());
            zzalg zzalgVarZza = this.zzb.zza(zzalkVar);
            zzalkVar.zzm("network-http-complete");
            if (zzalgVarZza.zze && zzalkVar.zzv()) {
                zzalkVar.zzp("not-modified");
                zzalkVar.zzr();
                return;
            }
            zzalq zzalqVarZzh = zzalkVar.zzh(zzalgVarZza);
            zzalkVar.zzm("network-parse-complete");
            if (zzalqVarZzh.zzb != null) {
                this.zzc.zzd(zzalkVar.zzj(), zzalqVarZzh.zzb);
                zzalkVar.zzm("network-cache-written");
            }
            zzalkVar.zzq();
            this.zze.zzb(zzalkVar, zzalqVarZzh, null);
            zzalkVar.zzs(zzalqVarZzh);
        } catch (zzalt e10) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzalkVar, e10);
            zzalkVar.zzr();
        } catch (Exception e11) {
            zzalw.zzc(e11, "Unhandled exception %s", e11.toString());
            zzalt zzaltVar = new zzalt(e11);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzalkVar, zzaltVar);
            zzalkVar.zzr();
        } finally {
            zzalkVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzalw.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
