package com.yandex.mobile.ads.impl;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class bv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b61 f19330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final av0 f19331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue<xu0> f19332e;

    public bv0(c61 c61Var, TimeUnit timeUnit) {
        fd.j0.i(c61Var, "taskRunner");
        fd.j0.i(timeUnit, "timeUnit");
        this.f19328a = 5;
        this.f19329b = timeUnit.toNanos(5L);
        this.f19330c = c61Var.e();
        this.f19331d = new av0(this, androidx.activity.k.a(new StringBuilder(), ea1.f20137g, " ConnectionPool"));
        this.f19332e = new ConcurrentLinkedQueue<>();
    }

    private final int a(xu0 xu0Var, long j10) {
        if (ea1.f20136f && !Thread.holdsLock(xu0Var)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(xu0Var);
            throw new AssertionError(sbA.toString());
        }
        ArrayList arrayListB = xu0Var.b();
        int i10 = 0;
        while (i10 < arrayListB.size()) {
            Reference reference = (Reference) arrayListB.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                StringBuilder sbA2 = v60.a("A connection to ");
                sbA2.append(xu0Var.k().a().k());
                sbA2.append(" was leaked. Did you forget to close a response body?");
                String string = sbA2.toString();
                int i11 = qq0.f24561c;
                qq0.a.b().a(((wu0.b) reference).a(), string);
                arrayListB.remove(i10);
                xu0Var.l();
                if (arrayListB.isEmpty()) {
                    xu0Var.a(j10 - this.f19329b);
                    return 0;
                }
            }
        }
        return arrayListB.size();
    }

    public final long a(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        xu0 xu0Var = null;
        int i11 = 0;
        for (xu0 xu0Var2 : this.f19332e) {
            fd.j0.h(xu0Var2, "connection");
            synchronized (xu0Var2) {
                if (a(xu0Var2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jC = j10 - xu0Var2.c();
                    if (jC > j11) {
                        xu0Var = xu0Var2;
                        j11 = jC;
                    }
                }
            }
        }
        long j12 = this.f19329b;
        if (j11 < j12 && i10 <= this.f19328a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        fd.j0.f(xu0Var);
        synchronized (xu0Var) {
            if (!xu0Var.b().isEmpty()) {
                return 0L;
            }
            if (xu0Var.c() + j11 != j10) {
                return 0L;
            }
            xu0Var.l();
            this.f19332e.remove(xu0Var);
            ea1.a(xu0Var.m());
            if (this.f19332e.isEmpty()) {
                this.f19330c.a();
            }
            return 0L;
        }
    }

    public final boolean a(e7 e7Var, wu0 wu0Var, List<oy0> list, boolean z10) {
        fd.j0.i(e7Var, "address");
        fd.j0.i(wu0Var, "call");
        for (xu0 xu0Var : this.f19332e) {
            fd.j0.h(xu0Var, "connection");
            synchronized (xu0Var) {
                if (z10) {
                    if (!xu0Var.h()) {
                        continue;
                    }
                }
                if (xu0Var.a(e7Var, list)) {
                    wu0Var.a(xu0Var);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(xu0 xu0Var) {
        fd.j0.i(xu0Var, "connection");
        if (ea1.f20136f && !Thread.holdsLock(xu0Var)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(xu0Var);
            throw new AssertionError(sbA.toString());
        }
        if (!xu0Var.d() && this.f19328a != 0) {
            this.f19330c.a(this.f19331d, 0L);
            return false;
        }
        xu0Var.l();
        this.f19332e.remove(xu0Var);
        if (this.f19332e.isEmpty()) {
            this.f19330c.a();
        }
        return true;
    }

    public final void b(xu0 xu0Var) {
        fd.j0.i(xu0Var, "connection");
        if (!ea1.f20136f || Thread.holdsLock(xu0Var)) {
            this.f19332e.add(xu0Var);
            this.f19330c.a(this.f19331d, 0L);
        } else {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(xu0Var);
            throw new AssertionError(sbA.toString());
        }
    }
}
