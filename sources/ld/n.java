package ld;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33112b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33113c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33114d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33115e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<h> f33116a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f33112b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (hVar.f33101d.b() == 1) {
            f33115e.incrementAndGet(this);
        }
        if (c() == 127) {
            return hVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f33116a.get(i10) != null) {
            Thread.yield();
        }
        this.f33116a.lazySet(i10, hVar);
        f33113c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final h e() {
        h hVar = (h) f33112b.getAndSet(this, null);
        return hVar == null ? f() : hVar;
    }

    public final h f() {
        h andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f33114d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f33116a.getAndSet(i11, null)) != null) {
                if (andSet.f33101d.b() == 1) {
                    f33115e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long g(n nVar) {
        int i10 = nVar.consumerIndex;
        int i11 = nVar.producerIndex;
        AtomicReferenceArray<h> atomicReferenceArray = nVar.f33116a;
        while (true) {
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = atomicReferenceArray.get(i12);
            if (hVar != null) {
                if ((hVar.f33101d.b() == 1) && atomicReferenceArray.compareAndSet(i12, hVar, null)) {
                    f33115e.decrementAndGet(nVar);
                    a(hVar, false);
                    return -1L;
                }
            }
            i10++;
        }
        return h(nVar, true);
    }

    public final long h(n nVar, boolean z10) {
        h hVar;
        do {
            hVar = (h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2L;
            }
            if (z10) {
                if (!(hVar.f33101d.b() == 1)) {
                    return -2L;
                }
            }
            Objects.requireNonNull((e) l.f33108e);
            long jNanoTime = System.nanoTime() - hVar.f33100c;
            long j10 = l.f33104a;
            if (jNanoTime < j10) {
                return j10 - jNanoTime;
            }
        } while (!f33112b.compareAndSet(nVar, hVar, null));
        a(hVar, false);
        return -1L;
    }
}
