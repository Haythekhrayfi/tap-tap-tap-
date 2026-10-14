package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class b61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c61 f19126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y51 f19129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f19130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19131f;

    public b61(c61 c61Var, String str) {
        fd.j0.i(c61Var, "taskRunner");
        fd.j0.i(str, "name");
        this.f19126a = c61Var;
        this.f19127b = str;
        this.f19130e = new ArrayList();
    }

    public final void a() {
        if (ea1.f20136f && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this.f19126a) {
            if (b()) {
                this.f19126a.a(this);
            }
        }
    }

    public final void a(y51 y51Var) {
        this.f19129d = y51Var;
    }

    public final void a(y51 y51Var, long j10) {
        fd.j0.i(y51Var, "task");
        synchronized (this.f19126a) {
            if (!this.f19128c) {
                if (a(y51Var, j10, false)) {
                    this.f19126a.a(this);
                }
            } else if (y51Var.a()) {
                c61 c61Var = c61.f19395h;
                if (c61.b.a().isLoggable(Level.FINE)) {
                    z51.a(y51Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                c61 c61Var2 = c61.f19395h;
                if (c61.b.a().isLoggable(Level.FINE)) {
                    z51.a(y51Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean a(y51 y51Var, long j10, boolean z10) {
        fd.j0.i(y51Var, "task");
        y51Var.a(this);
        long jA = this.f19126a.d().a();
        long j11 = jA + j10;
        int iIndexOf = this.f19130e.indexOf(y51Var);
        if (iIndexOf != -1) {
            if (y51Var.c() <= j11) {
                c61 c61Var = c61.f19395h;
                if (c61.b.a().isLoggable(Level.FINE)) {
                    z51.a(y51Var, this, "already scheduled");
                }
                return false;
            }
            this.f19130e.remove(iIndexOf);
        }
        y51Var.a(j11);
        c61 c61Var2 = c61.f19395h;
        if (c61.b.a().isLoggable(Level.FINE)) {
            StringBuilder sbA = v60.a(z10 ? "run again after " : "scheduled after ");
            sbA.append(z51.a(j11 - jA));
            z51.a(y51Var, this, sbA.toString());
        }
        Iterator it = this.f19130e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((y51) it.next()).c() - jA > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f19130e.size();
        }
        this.f19130e.add(size, y51Var);
        return size == 0;
    }

    public final boolean b() {
        y51 y51Var = this.f19129d;
        if (y51Var != null && y51Var.a()) {
            this.f19131f = true;
        }
        boolean z10 = false;
        for (int size = this.f19130e.size() - 1; -1 < size; size--) {
            if (((y51) this.f19130e.get(size)).a()) {
                y51 y51Var2 = (y51) this.f19130e.get(size);
                c61 c61Var = c61.f19395h;
                if (c61.b.a().isLoggable(Level.FINE)) {
                    z51.a(y51Var2, this, "canceled");
                }
                this.f19130e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final y51 c() {
        return this.f19129d;
    }

    public final boolean d() {
        return this.f19131f;
    }

    public final ArrayList e() {
        return this.f19130e;
    }

    public final String f() {
        return this.f19127b;
    }

    public final boolean g() {
        return this.f19128c;
    }

    public final c61 h() {
        return this.f19126a;
    }

    public final void i() {
        this.f19131f = false;
    }

    public final void j() {
        if (ea1.f20136f && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this.f19126a) {
            this.f19128c = true;
            if (b()) {
                this.f19126a.a(this);
            }
        }
    }

    public final String toString() {
        return this.f19127b;
    }
}
