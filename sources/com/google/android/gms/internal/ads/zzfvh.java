package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfvh extends zzfuq.zzi {
    private static final zzfvd zzbb;
    private static final Logger zzbc = Logger.getLogger(zzfvh.class.getName());
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzfvd zzfvgVar;
        zzfvf zzfvfVar = null;
        try {
            zzfvgVar = new zzfve(AtomicReferenceFieldUpdater.newUpdater(zzfvh.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfvh.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e10) {
            th = e10;
            zzfvgVar = new zzfvg(zzfvfVar);
        }
        zzbb = zzfvgVar;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzfvh(int i10) {
        this.remaining = i10;
    }

    public final int zzB() {
        return zzbb.zza(this);
    }

    public final Set zzD() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbb.zzb(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final void zzG() {
        this.seenExceptions = null;
    }

    public abstract void zzf(Set set);
}
