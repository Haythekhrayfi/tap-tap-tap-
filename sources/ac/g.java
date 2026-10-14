package ac;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public enum g implements me.c {
    CANCELLED;

    public static boolean cancel(AtomicReference<me.c> atomicReference) {
        me.c andSet;
        me.c cVar = atomicReference.get();
        g gVar = CANCELLED;
        if (cVar == gVar || (andSet = atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void deferredRequest(AtomicReference<me.c> atomicReference, AtomicLong atomicLong, long j10) {
        me.c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j10);
            return;
        }
        if (validate(j10)) {
            h9.d.a(atomicLong, j10);
            me.c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<me.c> atomicReference, AtomicLong atomicLong, me.c cVar) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<me.c> atomicReference, me.c cVar) {
        me.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    public static void reportMoreProduced(long j10) {
        dc.a.b(new ob.d(androidx.viewpager2.adapter.a.a("More produced than requested: ", j10)));
    }

    public static void reportSubscriptionSet() {
        dc.a.b(new ob.d("Subscription already set!"));
    }

    public static boolean set(AtomicReference<me.c> atomicReference, me.c cVar) {
        me.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<me.c> atomicReference, me.c cVar) {
        Objects.requireNonNull(cVar, "s is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean setOnce(AtomicReference<me.c> atomicReference, me.c cVar, long j10) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        cVar.request(j10);
        return true;
    }

    public static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        dc.a.b(new IllegalArgumentException(androidx.viewpager2.adapter.a.a("n > 0 required but it was ", j10)));
        return false;
    }

    public static boolean validate(me.c cVar, me.c cVar2) {
        if (cVar2 == null) {
            dc.a.b(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // me.c
    public void cancel() {
    }

    @Override // me.c
    public void request(long j10) {
    }
}
