package ld;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import fd.j0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kd.w;
import kd.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f33071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f33072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z f33074m;
    private volatile /* synthetic */ int _isTerminated;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33075c;
    public volatile /* synthetic */ long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f33077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f33078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ld.d f33079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ld.d f33080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w<c> f33081i;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    public static final class C0351a {
        public C0351a() {
        }

        public C0351a(vc.g gVar) {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33082a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f33082a = iArr;
        }
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f33083j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f33084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f33085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f33086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f33087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f33088g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f33089h;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public c(int i10) {
            setDaemon(true);
            this.f33084c = new n();
            this.f33085d = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f33074m;
            this.f33088g = zc.c.f45275c.b();
            f(i10);
        }

        public final h a(boolean z10) {
            boolean z11;
            h hVarD;
            h hVarE;
            h hVarE2;
            boolean z12;
            if (this.f33085d == d.CPU_ACQUIRED) {
                z11 = true;
            } else {
                a aVar = a.this;
                while (true) {
                    long j10 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z12 = false;
                        break;
                    }
                    if (a.f33072k.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                        z12 = true;
                        break;
                    }
                }
                if (z12) {
                    this.f33085d = d.CPU_ACQUIRED;
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (!z11) {
                if (!z10 || (hVarD = this.f33084c.e()) == null) {
                    hVarD = a.this.f33080h.d();
                }
                return hVarD == null ? i(true) : hVarD;
            }
            if (z10) {
                boolean z13 = d(a.this.f33075c * 2) == 0;
                if (z13 && (hVarE2 = e()) != null) {
                    return hVarE2;
                }
                h hVarE3 = this.f33084c.e();
                if (hVarE3 != null) {
                    return hVarE3;
                }
                if (!z13 && (hVarE = e()) != null) {
                    return hVarE;
                }
            } else {
                h hVarE4 = e();
                if (hVarE4 != null) {
                    return hVarE4;
                }
            }
            return i(false);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f33088g;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f33088g = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final h e() {
            ld.d dVar;
            if (d(2) == 0) {
                h hVarD = a.this.f33079g.d();
                if (hVarD != null) {
                    return hVarD;
                }
                dVar = a.this.f33080h;
            } else {
                h hVarD2 = a.this.f33080h.d();
                if (hVarD2 != null) {
                    return hVarD2;
                }
                dVar = a.this.f33079g;
            }
            return dVar.d();
        }

        public final void f(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f33078f);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(d dVar) {
            d dVar2 = this.f33085d;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f33072k.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f33085d = dVar;
            }
            return z10;
        }

        public final h i(boolean z10) {
            long jH;
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iD = d(i10);
            a aVar = a.this;
            long jMin = RecyclerView.FOREVER_NS;
            for (int i11 = 0; i11 < i10; i11++) {
                iD++;
                if (iD > i10) {
                    iD = 1;
                }
                c cVarB = aVar.f33081i.b(iD);
                if (cVarB != null && cVarB != this) {
                    n nVar = this.f33084c;
                    n nVar2 = cVarB.f33084c;
                    if (z10) {
                        jH = nVar.g(nVar2);
                    } else {
                        Objects.requireNonNull(nVar);
                        h hVarF = nVar2.f();
                        if (hVarF != null) {
                            nVar.a(hVarF, false);
                            jH = -1;
                        } else {
                            jH = nVar.h(nVar2, false);
                        }
                    }
                    if (jH == -1) {
                        return this.f33084c.e();
                    }
                    if (jH > 0) {
                        jMin = Math.min(jMin, jH);
                    }
                }
            }
            if (jMin == RecyclerView.FOREVER_NS) {
                jMin = 0;
            }
            this.f33087f = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (!a.this.isTerminated()) {
                        d dVar = this.f33085d;
                        d dVar2 = d.TERMINATED;
                        if (dVar == dVar2) {
                            break loop0;
                        }
                        h hVarA = a(this.f33089h);
                        if (hVarA != null) {
                            this.f33087f = 0L;
                            int iB = hVarA.f33101d.b();
                            this.f33086e = 0L;
                            if (this.f33085d == d.PARKING) {
                                this.f33085d = d.BLOCKING;
                            }
                            if (iB != 0 && h(d.BLOCKING)) {
                                a.this.j();
                            }
                            a.this.i(hVarA);
                            if (iB != 0) {
                                a.f33072k.addAndGet(a.this, -2097152L);
                                if (this.f33085d == dVar2) {
                                    break;
                                }
                                this.f33085d = d.DORMANT;
                                break;
                            }
                            break;
                        }
                        this.f33089h = false;
                        if (this.f33087f == 0) {
                            if (this.nextParkedWorker != a.f33074m) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != a.f33074m) || this.workerCtl != -1 || a.this.isTerminated()) {
                                        break;
                                    }
                                    d dVar3 = this.f33085d;
                                    d dVar4 = d.TERMINATED;
                                    if (dVar3 == dVar4) {
                                        break;
                                    }
                                    h(d.PARKING);
                                    Thread.interrupted();
                                    if (this.f33086e == 0) {
                                        this.f33086e = System.nanoTime() + a.this.f33077e;
                                    }
                                    LockSupport.parkNanos(a.this.f33077e);
                                    if (System.nanoTime() - this.f33086e >= 0) {
                                        this.f33086e = 0L;
                                        a aVar = a.this;
                                        synchronized (aVar.f33081i) {
                                            if (!aVar.isTerminated() && ((int) (aVar.controlState & 2097151)) > aVar.f33075c && f33083j.compareAndSet(this, -1, 1)) {
                                                int i10 = this.indexInArray;
                                                f(0);
                                                aVar.h(this, i10, 0);
                                                int andDecrement = (int) (a.f33072k.getAndDecrement(aVar) & 2097151);
                                                if (andDecrement != i10) {
                                                    c cVarB = aVar.f33081i.b(andDecrement);
                                                    j0.f(cVarB);
                                                    c cVar = cVarB;
                                                    aVar.f33081i.c(i10, cVar);
                                                    cVar.f(i10);
                                                    aVar.h(cVar, andDecrement, i10);
                                                }
                                                aVar.f33081i.c(andDecrement, null);
                                                this.f33085d = dVar4;
                                            }
                                        }
                                    }
                                }
                            } else {
                                a.this.g(this);
                            }
                        } else {
                            if (z10) {
                                h(d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f33087f);
                                this.f33087f = 0L;
                                break;
                            }
                            z10 = true;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(d.TERMINATED);
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        new C0351a(null);
        f33074m = new z("NOT_IN_STACK");
        f33071j = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
        f33072k = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
        f33073l = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    }

    public a(int i10, int i11, long j10, String str) {
        this.f33075c = i10;
        this.f33076d = i11;
        this.f33077e = j10;
        this.f33078f = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Core pool size ", i10, " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(n1.c.a("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f33079g = new ld.d();
        this.f33080h = new ld.d();
        this.parkedWorkersStack = 0L;
        this.f33081i = new w<>(i10 + 1);
        this.controlState = ((long) i10) << 42;
        this._isTerminated = 0;
    }

    public /* synthetic */ a(int i10, int i11, long j10, String str, int i12, vc.g gVar) {
        this(i10, i11, (i12 & 4) != 0 ? l.f33107d : j10, (i12 & 8) != 0 ? "DefaultDispatcher" : str);
    }

    public final int a() {
        int i10;
        synchronized (this.f33081i) {
            if (this._isTerminated != 0) {
                i10 = -1;
            } else {
                long j10 = this.controlState;
                int i11 = (int) (j10 & 2097151);
                int i12 = i11 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i12 < 0) {
                    i12 = 0;
                }
                if (i12 >= this.f33075c) {
                    return 0;
                }
                if (i11 >= this.f33076d) {
                    return 0;
                }
                int i13 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i13 > 0 && this.f33081i.b(i13) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(i13);
                this.f33081i.c(i13, cVar);
                if (!(i13 == ((int) (2097151 & f33072k.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i10 = i12 + 1;
            }
            return i10;
        }
    }

    public final c b() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !j0.d(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void c(Runnable runnable, i iVar, boolean z10) {
        h kVar;
        h hVarA;
        Objects.requireNonNull((e) l.f33108e);
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            kVar = (h) runnable;
            kVar.f33100c = jNanoTime;
            kVar.f33101d = iVar;
        } else {
            kVar = new k(runnable, jNanoTime, iVar);
        }
        c cVarB = b();
        if (cVarB == null || cVarB.f33085d == d.TERMINATED || (kVar.f33101d.b() == 0 && cVarB.f33085d == d.BLOCKING)) {
            hVarA = kVar;
        } else {
            cVarB.f33089h = true;
            hVarA = cVarB.f33084c.a(kVar, z10);
        }
        if (hVarA != null) {
            if (!(hVarA.f33101d.b() == 1 ? this.f33080h : this.f33079g).a(hVarA)) {
                throw new RejectedExecutionException(androidx.activity.k.a(new StringBuilder(), this.f33078f, " was terminated"));
            }
        }
        boolean z11 = z10 && cVarB != null;
        if (kVar.f33101d.b() == 0) {
            if (z11) {
                return;
            }
            j();
        } else {
            long jAddAndGet = f33072k.addAndGet(this, 2097152L);
            if (z11 || l() || k(jAddAndGet)) {
                return;
            }
            l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        int i10;
        h hVarD;
        boolean z10;
        if (f33073l.compareAndSet(this, 0, 1)) {
            c cVarB = b();
            synchronized (this.f33081i) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c cVarB2 = this.f33081i.b(i11);
                    j0.f(cVarB2);
                    c cVar = cVarB2;
                    if (cVar != cVarB) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(AbstractComponentTracker.LINGERING_TIMEOUT);
                        }
                        n nVar = cVar.f33084c;
                        ld.d dVar = this.f33080h;
                        Objects.requireNonNull(nVar);
                        h hVar = (h) n.f33112b.getAndSet(nVar, null);
                        if (hVar != null) {
                            dVar.a(hVar);
                        }
                        do {
                            h hVarF = nVar.f();
                            if (hVarF == null) {
                                z10 = false;
                            } else {
                                dVar.a(hVarF);
                                z10 = true;
                            }
                        } while (z10);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f33080h.b();
            this.f33079g.b();
            while (true) {
                if (cVarB == null) {
                    hVarD = this.f33079g.d();
                    if (hVarD == null && (hVarD = this.f33080h.d()) == null) {
                        break;
                    }
                } else {
                    hVarD = cVarB.a(true);
                    if (hVarD == null) {
                        hVarD = this.f33079g.d();
                        if (hVarD == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i(hVarD);
            }
            if (cVarB != null) {
                cVarB.h(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final int e(c cVar) {
        int iB;
        do {
            Object objC = cVar.c();
            if (objC == f33074m) {
                return -1;
            }
            if (objC == null) {
                return 0;
            }
            cVar = (c) objC;
            iB = cVar.b();
        } while (iB == 0);
        return iB;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c(runnable, l.f33109f, false);
    }

    public final boolean g(c cVar) {
        long j10;
        int iB;
        if (cVar.c() != f33074m) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            iB = cVar.b();
            cVar.g(this.f33081i.b((int) (2097151 & j10)));
        } while (!f33071j.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iB)));
        return true;
    }

    public final void h(c cVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int iE = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iE == i10) {
                iE = i11 == 0 ? e(cVar) : i11;
            }
            if (iE >= 0 && f33071j.compareAndSet(this, j10, j11 | ((long) iE))) {
                return;
            }
        }
    }

    public final void i(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j() {
        if (l() || k(this.controlState)) {
            return;
        }
        l();
    }

    public final boolean k(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < this.f33075c) {
            int iA = a();
            if (iA == 1 && this.f33075c > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c cVarB = this.f33081i.b((int) (2097151 & j10));
            if (cVarB == null) {
                cVarB = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                int iE = e(cVarB);
                if (iE >= 0 && f33071j.compareAndSet(this, j10, ((long) iE) | j11)) {
                    cVarB.g(f33074m);
                }
            }
            if (cVarB == null) {
                return false;
            }
            if (c.f33083j.compareAndSet(cVarB, -1, 0)) {
                LockSupport.unpark(cVarB);
                return true;
            }
        }
    }

    public String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int iA = this.f33081i.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.f33081i.b(i15);
            if (cVarB != null) {
                int iD = cVarB.f33084c.d();
                int i16 = b.f33082a[cVarB.f33085d.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(iD);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(iD);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (iD > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(iD);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb2.append(c10);
                    arrayList.add(sb2.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = this.controlState;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f33078f);
        sb3.append('@');
        sb3.append(j0.n(this));
        sb3.append("[Pool Size {core = ");
        sb3.append(this.f33075c);
        sb3.append(", max = ");
        v1.b.a(sb3, this.f33076d, "}, Worker States {CPU = ", i10, ", blocking = ");
        v1.b.a(sb3, i11, ", parked = ", i12, ", dormant = ");
        v1.b.a(sb3, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb3.append(arrayList);
        sb3.append(", global CPU queue size = ");
        sb3.append(this.f33079g.c());
        sb3.append(", global blocking queue size = ");
        sb3.append(this.f33080h.c());
        sb3.append(", Control State {created workers= ");
        sb3.append((int) (2097151 & j10));
        sb3.append(", blocking tasks = ");
        sb3.append((int) ((4398044413952L & j10) >> 21));
        sb3.append(", CPUs acquired = ");
        sb3.append(this.f33075c - ((int) ((9223367638808264704L & j10) >> 42)));
        sb3.append("}]");
        return sb3.toString();
    }
}
