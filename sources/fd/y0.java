package fd;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y0 extends z0 implements o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29638h = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29639i = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    public final class a extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final i<jc.w> f29640e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, i<? super jc.w> iVar) {
            super(j10);
            this.f29640e = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29640e.A(y0.this, jc.w.f31842a);
        }

        @Override // fd.y0.c
        public String toString() {
            return super.toString() + this.f29640e;
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Runnable f29642e;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f29642e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29642e.run();
        }

        @Override // fd.y0.c
        public String toString() {
            return super.toString() + this.f29642e;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, t0, kd.d0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f29643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29644d = -1;

        public c(long j10) {
            this.f29643c = j10;
        }

        @Override // kd.d0
        public kd.c0<?> a() {
            Object obj = this._heap;
            if (obj instanceof kd.c0) {
                return (kd.c0) obj;
            }
            return null;
        }

        @Override // kd.d0
        public void b(kd.c0<?> c0Var) {
            if (!(this._heap != a1.f29540a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = c0Var;
        }

        @Override // kd.d0
        public void c(int i10) {
            this.f29644d = i10;
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            long j10 = this.f29643c - cVar.f29643c;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // kd.d0
        public int d() {
            return this.f29644d;
        }

        @Override // fd.t0
        public final synchronized void dispose() {
            Object obj = this._heap;
            kd.z zVar = a1.f29540a;
            if (obj == zVar) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                synchronized (dVar) {
                    if (a() != null) {
                        dVar.d(d());
                    }
                }
            }
            this._heap = zVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031 A[Catch: all -> 0x0045, PHI: r8
  0x0031: PHI (r8v3 long) = (r8v0 long), (r8v9 long) binds: [B:14:0x001c, B:21:0x002f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x000a, B:16:0x001f, B:20:0x0029, B:23:0x0033, B:25:0x003c, B:26:0x003e, B:22:0x0031), top: B:37:0x000a, outer: #1 }] */
        public final synchronized int f(long j10, d dVar, y0 y0Var) {
            int i10;
            if (this._heap == a1.f29540a) {
                i10 = 2;
            } else {
                synchronized (dVar) {
                    c cVarB = dVar.b();
                    if (y0.m0(y0Var)) {
                        return 1;
                    }
                    if (cVarB == null) {
                        dVar.f29645b = j10;
                    } else {
                        long j11 = cVarB.f29643c;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - dVar.f29645b > 0) {
                            dVar.f29645b = j10;
                        }
                    }
                    long j12 = this.f29643c;
                    long j13 = dVar.f29645b;
                    if (j12 - j13 < 0) {
                        this.f29643c = j13;
                    }
                    dVar.a(this);
                    i10 = 0;
                }
            }
            return i10;
        }

        public String toString() {
            return o2.a.a(defpackage.a.a("Delayed[nanos="), this.f29643c, ']');
        }
    }

    public static final class d extends kd.c0<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f29645b;

        public d(long j10) {
            this.f29645b = j10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean m0(y0 y0Var) {
        return y0Var._isCompleted;
    }

    @Override // fd.c0
    public final void c0(mc.f fVar, Runnable runnable) {
        n0(runnable);
    }

    public t0 k(long j10, Runnable runnable, mc.f fVar) {
        return l0.f29592b.k(j10, runnable, fVar);
    }

    @Override // fd.o0
    public void l(long j10, i<? super jc.w> iVar) {
        long jA = a1.a(j10);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(jA + jNanoTime, iVar);
            s0(jNanoTime, aVar);
            y8.c0.i(iVar, aVar);
        }
    }

    public void n0(Runnable runnable) {
        if (!o0(runnable)) {
            k0.f29587j.n0(runnable);
            return;
        }
        Thread threadK0 = k0();
        if (Thread.currentThread() != threadK0) {
            LockSupport.unpark(threadK0);
        }
    }

    public final boolean o0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f29638h.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kd.n) {
                kd.n nVar = (kd.n) obj;
                int iA = nVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    f29638h.compareAndSet(this, obj, nVar.e());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == a1.f29541b) {
                    return false;
                }
                kd.n nVar2 = new kd.n(8, true);
                nVar2.a((Runnable) obj);
                nVar2.a(runnable);
                if (f29638h.compareAndSet(this, obj, nVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean p0() {
        kd.a<r0<?>> aVar = this.f29636g;
        if (!(aVar == null || aVar.f32015b == aVar.f32016c)) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof kd.n) {
            return ((kd.n) obj).d();
        }
        return obj == a1.f29541b;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:76:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public long q0() {
        long j10;
        d dVar;
        c cVar;
        long jNanoTime;
        c cVarD;
        if (j0()) {
            return 0L;
        }
        d dVar2 = (d) this._delayed;
        Runnable runnable = null;
        if (dVar2 != null && !dVar2.c()) {
            long jNanoTime2 = System.nanoTime();
            do {
                synchronized (dVar2) {
                    c cVarB = dVar2.b();
                    if (cVarB == null) {
                        cVarD = null;
                    } else {
                        c cVar2 = cVarB;
                        cVarD = ((jNanoTime2 - cVar2.f29643c) > 0L ? 1 : ((jNanoTime2 - cVar2.f29643c) == 0L ? 0 : -1)) >= 0 ? o0(cVar2) : false ? dVar2.d(0) : null;
                    }
                }
            } while (cVarD != null);
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof kd.n)) {
                if (obj == a1.f29541b) {
                    break;
                }
                if (f29638h.compareAndSet(this, obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                kd.n nVar = (kd.n) obj;
                Object objF = nVar.f();
                if (objF != kd.n.f32058h) {
                    runnable = (Runnable) objF;
                    break;
                }
                f29638h.compareAndSet(this, obj, nVar.e());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        kd.a<r0<?>> aVar = this.f29636g;
        if (aVar != null) {
            if (aVar.f32015b == aVar.f32016c) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 0;
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == 0) {
            return 0L;
        }
        Object obj2 = this._queue;
        if (obj2 == null) {
            dVar = (d) this._delayed;
            if (dVar != null) {
                synchronized (dVar) {
                    c cVarB2 = dVar.b();
                }
                cVar = cVarB2;
                if (cVar != null) {
                    jNanoTime = cVar.f29643c - System.nanoTime();
                    if (jNanoTime < 0) {
                        return 0L;
                    }
                    return jNanoTime;
                }
            }
        } else if (obj2 instanceof kd.n) {
            if (!((kd.n) obj2).d()) {
                return 0L;
            }
            dVar = (d) this._delayed;
            if (dVar != null) {
                synchronized (dVar) {
                    c cVarB3 = dVar.b();
                    cVar = cVarB3;
                    if (cVar != null) {
                        jNanoTime = cVar.f29643c - System.nanoTime();
                        if (jNanoTime < 0) {
                            return 0L;
                        }
                        return jNanoTime;
                    }
                }
            }
        } else if (obj2 != a1.f29541b) {
            return 0L;
        }
        return RecyclerView.FOREVER_NS;
    }

    public final void r0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void s0(long j10, c cVar) {
        int iF;
        Thread threadK0;
        c cVarB;
        c cVar2 = null;
        if (this._isCompleted != 0) {
            iF = 1;
        } else {
            d dVar = (d) this._delayed;
            if (dVar == null) {
                f29639i.compareAndSet(this, null, new d(j10));
                Object obj = this._delayed;
                j0.f(obj);
                dVar = (d) obj;
            }
            iF = cVar.f(j10, dVar, this);
        }
        if (iF != 0) {
            if (iF == 1) {
                l0(j10, cVar);
                return;
            } else {
                if (iF != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        d dVar2 = (d) this._delayed;
        if (dVar2 != null) {
            synchronized (dVar2) {
                cVarB = dVar2.b();
            }
            cVar2 = cVarB;
        }
        if (!(cVar2 == cVar) || Thread.currentThread() == (threadK0 = k0())) {
            return;
        }
        LockSupport.unpark(threadK0);
    }

    @Override // fd.x0
    public void shutdown() {
        c cVarE;
        c2 c2Var = c2.f29557a;
        c2.f29558b.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f29638h.compareAndSet(this, null, a1.f29541b)) {
                    break;
                }
            } else if (obj instanceof kd.n) {
                ((kd.n) obj).b();
                break;
            } else {
                if (obj == a1.f29541b) {
                    break;
                }
                kd.n nVar = new kd.n(8, true);
                nVar.a((Runnable) obj);
                if (f29638h.compareAndSet(this, obj, nVar)) {
                    break;
                }
            }
        }
        while (q0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar == null || (cVarE = dVar.e()) == null) {
                return;
            } else {
                l0(jNanoTime, cVarE);
            }
        }
    }
}
