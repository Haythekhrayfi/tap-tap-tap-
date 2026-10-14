package qd;

import java.util.concurrent.atomic.AtomicReference;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f34938a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f34939b = new v(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<Segment>[] f34941d;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f34940c = iHighestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f34941d = atomicReferenceArr;
    }

    public static final void b(v vVar) {
        AtomicReference<v> atomicReferenceA;
        v vVar2;
        if (!(vVar.f34936f == null && vVar.f34937g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (vVar.f34934d || (vVar2 = (atomicReferenceA = f34938a.a()).get()) == f34939b) {
            return;
        }
        int i10 = vVar2 != null ? vVar2.f34933c : 0;
        if (i10 >= 65536) {
            return;
        }
        vVar.f34936f = vVar2;
        vVar.f34932b = 0;
        vVar.f34933c = i10 + 8192;
        if (atomicReferenceA.compareAndSet(vVar2, vVar)) {
            return;
        }
        vVar.f34936f = null;
    }

    public static final v c() {
        AtomicReference<v> atomicReferenceA = f34938a.a();
        v vVar = f34939b;
        v andSet = atomicReferenceA.getAndSet(vVar);
        if (andSet == vVar) {
            return new v();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new v();
        }
        atomicReferenceA.set(andSet.f34936f);
        andSet.f34936f = null;
        andSet.f34933c = 0;
        return andSet;
    }

    public final AtomicReference<v> a() {
        return f34941d[(int) (Thread.currentThread().getId() & (((long) f34940c) - 1))];
    }
}
