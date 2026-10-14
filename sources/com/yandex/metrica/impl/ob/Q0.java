package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q0<T> implements R0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O<T> f14731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private R0 f14732b;

    public Q0(long j10, long j11) {
        this.f14731a = new O<>(j10, j11);
    }

    public abstract long a(C1887pi c1887pi);

    public T a() {
        R0 r10;
        if (b() && (r10 = this.f14732b) != null) {
            r10.b();
        }
        if (this.f14731a.c()) {
            this.f14731a.a(null);
        }
        return this.f14731a.a();
    }

    public void a(R0 r10) {
        this.f14732b = r10;
    }

    public abstract boolean a(T t10);

    public abstract long b(C1887pi c1887pi);

    public void b(T t10) {
        if (a(t10)) {
            this.f14731a.a(t10);
            R0 r10 = this.f14732b;
            if (r10 != null) {
                r10.a();
            }
        }
    }

    public abstract boolean b();

    public void c(C1887pi c1887pi) {
        this.f14731a.a(b(c1887pi), a(c1887pi));
    }
}
