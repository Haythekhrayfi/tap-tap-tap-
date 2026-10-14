package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfwl extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzfwk(null);
    private static final Runnable zzb = new zzfwk(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzfwi zzfwiVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof zzfwi)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzfwiVar = (zzfwi) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(zzfwiVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z10 = !zzg();
            if (z10) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        zzfwu.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzc(threadCurrentThread);
            }
            if (z10) {
                zze(objZza);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strA;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            strA = "running=[DONE]";
        } else if (runnable instanceof zzfwi) {
            strA = "running=[INTERRUPTED]";
        } else {
            strA = runnable instanceof Thread ? j.a("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
        }
        return j.a(strA, ", ", zzb());
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzfwi zzfwiVar = new zzfwi(this, null);
            zzfwiVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzfwiVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                    }
                } finally {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }
}
