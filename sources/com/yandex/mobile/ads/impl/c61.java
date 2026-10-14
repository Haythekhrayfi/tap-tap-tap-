package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class c61 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c61 f19395h = new c61(new c(ea1.a(ea1.f20137g + " TaskRunner", true)));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Logger f19396i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f19401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f19402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d61 f19403g;

    public interface a {
        long a();

        void a(c61 c61Var);

        void a(c61 c61Var, long j10);

        void execute(Runnable runnable);
    }

    public static final class b {
        public static Logger a() {
            return c61.f19396i;
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f19404a;

        public c(ThreadFactory threadFactory) {
            fd.j0.i(threadFactory, "threadFactory");
            this.f19404a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.yandex.mobile.ads.impl.c61.a
        public final long a() {
            return System.nanoTime();
        }

        @Override // com.yandex.mobile.ads.impl.c61.a
        public final void a(c61 c61Var) {
            fd.j0.i(c61Var, "taskRunner");
            c61Var.notify();
        }

        @Override // com.yandex.mobile.ads.impl.c61.a
        public final void a(c61 c61Var, long j10) throws InterruptedException {
            fd.j0.i(c61Var, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                c61Var.wait(j11, (int) j12);
            }
        }

        @Override // com.yandex.mobile.ads.impl.c61.a
        public final void execute(Runnable runnable) {
            fd.j0.i(runnable, "runnable");
            this.f19404a.execute(runnable);
        }
    }

    static {
        Logger logger = Logger.getLogger(c61.class.getName());
        fd.j0.h(logger, "getLogger(TaskRunner::class.java.name)");
        f19396i = logger;
    }

    public c61(c cVar) {
        fd.j0.i(cVar, "backend");
        this.f19397a = cVar;
        this.f19398b = 10000;
        this.f19401e = new ArrayList();
        this.f19402f = new ArrayList();
        this.f19403g = new d61(this);
    }

    public static final void a(c61 c61Var, y51 y51Var) {
        Objects.requireNonNull(c61Var);
        if (ea1.f20136f && Thread.holdsLock(c61Var)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(c61Var);
            throw new AssertionError(sbA.toString());
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(y51Var.b());
        try {
            long jE = y51Var.e();
            synchronized (c61Var) {
                c61Var.a(y51Var, jE);
            }
        } finally {
            synchronized (c61Var) {
                c61Var.a(y51Var, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    private final void a(y51 y51Var, long j10) {
        if (ea1.f20136f && !Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        b61 b61VarD = y51Var.d();
        fd.j0.f(b61VarD);
        if (!(b61VarD.c() == y51Var)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zD = b61VarD.d();
        b61VarD.i();
        b61VarD.a(null);
        this.f19401e.remove(b61VarD);
        if (j10 != -1 && !zD && !b61VarD.g()) {
            b61VarD.a(y51Var, j10, true);
        }
        if (!b61VarD.e().isEmpty()) {
            this.f19402f.add(b61VarD);
        }
    }

    public final void a(b61 b61Var) {
        fd.j0.i(b61Var, "taskQueue");
        if (ea1.f20136f && !Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        if (b61Var.c() == null) {
            if (!b61Var.e().isEmpty()) {
                ea1.a(this.f19402f, b61Var);
            } else {
                this.f19402f.remove(b61Var);
            }
        }
        if (this.f19399c) {
            this.f19397a.a(this);
        } else {
            this.f19397a.execute(this.f19403g);
        }
    }

    public final y51 b() {
        long j10;
        boolean z10;
        if (ea1.f20136f && !Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        while (!this.f19402f.isEmpty()) {
            long jA = this.f19397a.a();
            long jMin = RecyclerView.FOREVER_NS;
            Iterator it = this.f19402f.iterator();
            y51 y51Var = null;
            while (true) {
                if (!it.hasNext()) {
                    j10 = jA;
                    z10 = false;
                    break;
                }
                y51 y51Var2 = (y51) ((b61) it.next()).e().get(0);
                j10 = jA;
                long jMax = Math.max(0L, y51Var2.c() - jA);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (y51Var != null) {
                        z10 = true;
                        break;
                    }
                    y51Var = y51Var2;
                }
                jA = j10;
            }
            if (y51Var != null) {
                if (ea1.f20136f && !Thread.holdsLock(this)) {
                    StringBuilder sbA2 = v60.a("Thread ");
                    sbA2.append(Thread.currentThread().getName());
                    sbA2.append(" MUST hold lock on ");
                    sbA2.append(this);
                    throw new AssertionError(sbA2.toString());
                }
                y51Var.a(-1L);
                b61 b61VarD = y51Var.d();
                fd.j0.f(b61VarD);
                b61VarD.e().remove(y51Var);
                this.f19402f.remove(b61VarD);
                b61VarD.a(y51Var);
                this.f19401e.add(b61VarD);
                if (z10 || (!this.f19399c && (!this.f19402f.isEmpty()))) {
                    this.f19397a.execute(this.f19403g);
                }
                return y51Var;
            }
            if (this.f19399c) {
                if (jMin >= this.f19400d - j10) {
                    return null;
                }
                this.f19397a.a(this);
                return null;
            }
            this.f19399c = true;
            this.f19400d = j10 + jMin;
            try {
                try {
                    this.f19397a.a(this, jMin);
                } catch (InterruptedException unused) {
                    c();
                }
                this.f19399c = false;
            } catch (Throwable th) {
                this.f19399c = false;
                throw th;
            }
        }
        return null;
    }

    public final void c() {
        int size = this.f19401e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((b61) this.f19401e.get(size)).b();
            }
        }
        for (int size2 = this.f19402f.size() - 1; -1 < size2; size2--) {
            b61 b61Var = (b61) this.f19402f.get(size2);
            b61Var.b();
            if (b61Var.e().isEmpty()) {
                this.f19402f.remove(size2);
            }
        }
    }

    public final a d() {
        return this.f19397a;
    }

    public final b61 e() {
        int i10;
        synchronized (this) {
            i10 = this.f19398b;
            this.f19398b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new b61(this, sb2.toString());
    }
}
