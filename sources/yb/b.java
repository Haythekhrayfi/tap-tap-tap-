package yb;

import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends lb.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0480b f44809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f44810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f44812h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f44813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<C0480b> f44814d;

    public static final class a extends lb.l.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final qb.d f44815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final nb.a f44816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final qb.d f44817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c f44818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f44819g;

        public a(c cVar) {
            this.f44818f = cVar;
            qb.d dVar = new qb.d();
            this.f44815c = dVar;
            nb.a aVar = new nb.a();
            this.f44816d = aVar;
            qb.d dVar2 = new qb.d();
            this.f44817e = dVar2;
            dVar2.a(dVar);
            dVar2.a(aVar);
        }

        @Override // lb.l.c
        public nb.b b(Runnable runnable) {
            return this.f44819g ? qb.c.INSTANCE : this.f44818f.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f44815c);
        }

        @Override // lb.l.c
        public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f44819g ? qb.c.INSTANCE : this.f44818f.e(runnable, j10, timeUnit, this.f44816d);
        }

        @Override // nb.b
        public void dispose() {
            if (this.f44819g) {
                return;
            }
            this.f44819g = true;
            this.f44817e.dispose();
        }
    }

    /* JADX INFO: renamed from: yb.b$b, reason: collision with other inner class name */
    public static final class C0480b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f44821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f44822c;

        public C0480b(int i10, ThreadFactory threadFactory) {
            this.f44820a = i10;
            this.f44821b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f44821b[i11] = new c(threadFactory);
            }
        }

        public c a() {
            int i10 = this.f44820a;
            if (i10 == 0) {
                return b.f44812h;
            }
            c[] cVarArr = this.f44821b;
            long j10 = this.f44822c;
            this.f44822c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }
    }

    public static final class c extends f {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f44811g = iAvailableProcessors;
        c cVar = new c(new g("RxComputationShutdown"));
        f44812h = cVar;
        cVar.dispose();
        g gVar = new g("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f44810f = gVar;
        C0480b c0480b = new C0480b(0, gVar);
        f44809e = c0480b;
        for (c cVar2 : c0480b.f44821b) {
            cVar2.dispose();
        }
    }

    public b() {
        this(f44810f);
    }

    public b(ThreadFactory threadFactory) {
        this.f44813c = threadFactory;
        C0480b c0480b = f44809e;
        AtomicReference<C0480b> atomicReference = new AtomicReference<>(c0480b);
        this.f44814d = atomicReference;
        C0480b c0480b2 = new C0480b(f44811g, threadFactory);
        if (atomicReference.compareAndSet(c0480b, c0480b2)) {
            return;
        }
        for (c cVar : c0480b2.f44821b) {
            cVar.dispose();
        }
    }

    @Override // lb.l
    public lb.l.c a() {
        return new a(this.f44814d.get().a());
    }

    @Override // lb.l
    public nb.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarA = this.f44814d.get().a();
        Objects.requireNonNull(cVarA);
        Objects.requireNonNull(runnable, "run is null");
        i iVar = new i(runnable);
        try {
            iVar.a(j10 <= 0 ? cVarA.f44851c.submit(iVar) : cVarA.f44851c.schedule(iVar, j10, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e10) {
            dc.a.b(e10);
            return qb.c.INSTANCE;
        }
    }

    @Override // lb.l
    public nb.b d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarA = this.f44814d.get().a();
        Objects.requireNonNull(cVarA);
        try {
            if (j11 <= 0) {
                yb.c cVar = new yb.c(runnable, cVarA.f44851c);
                cVar.a(j10 <= 0 ? cVarA.f44851c.submit(cVar) : cVarA.f44851c.schedule(cVar, j10, timeUnit));
                return cVar;
            }
            h hVar = new h(runnable);
            hVar.a(cVarA.f44851c.scheduleAtFixedRate(hVar, j10, j11, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e10) {
            dc.a.b(e10);
            return qb.c.INSTANCE;
        }
    }
}
