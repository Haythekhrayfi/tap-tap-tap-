package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakw extends Thread {
    private static final boolean zza = zzalw.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaku zzd;
    private volatile boolean zze = false;
    private final zzalx zzf;
    private final zzalb zzg;

    public zzakw(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaku zzakuVar, zzalb zzalbVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzakuVar;
        this.zzg = zzalbVar;
        this.zzf = new zzalx(this, blockingQueue2, zzalbVar);
    }

    private void zzc() throws InterruptedException {
        zzalb zzalbVar;
        zzalk zzalkVar = (zzalk) this.zzb.take();
        zzalkVar.zzm("cache-queue-take");
        zzalkVar.zzt(1);
        try {
            zzalkVar.zzw();
            zzakt zzaktVarZza = this.zzd.zza(zzalkVar.zzj());
            if (zzaktVarZza == null) {
                zzalkVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzalkVar)) {
                    this.zzc.put(zzalkVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zzaktVarZza.zza(jCurrentTimeMillis)) {
                zzalkVar.zzm("cache-hit-expired");
                zzalkVar.zze(zzaktVarZza);
                if (!this.zzf.zzc(zzalkVar)) {
                    this.zzc.put(zzalkVar);
                }
                return;
            }
            zzalkVar.zzm("cache-hit");
            zzalq zzalqVarZzh = zzalkVar.zzh(new zzalg(zzaktVarZza.zza, zzaktVarZza.zzg));
            zzalkVar.zzm("cache-hit-parsed");
            if (!zzalqVarZzh.zzc()) {
                zzalkVar.zzm("cache-parsing-failed");
                this.zzd.zzc(zzalkVar.zzj(), true);
                zzalkVar.zze(null);
                if (!this.zzf.zzc(zzalkVar)) {
                    this.zzc.put(zzalkVar);
                }
                return;
            }
            if (zzaktVarZza.zzf < jCurrentTimeMillis) {
                zzalkVar.zzm("cache-hit-refresh-needed");
                zzalkVar.zze(zzaktVarZza);
                zzalqVarZzh.zzd = true;
                if (this.zzf.zzc(zzalkVar)) {
                    zzalbVar = this.zzg;
                } else {
                    this.zzg.zzb(zzalkVar, zzalqVarZzh, new zzakv(this, zzalkVar));
                }
            }
            zzalbVar = this.zzg;
            zzalbVar.zzb(zzalkVar, zzalqVarZzh, null);
        } finally {
            zzalkVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzalw.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzalw.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
