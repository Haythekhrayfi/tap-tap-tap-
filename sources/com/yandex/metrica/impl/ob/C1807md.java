package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1807md<T> implements Xc<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1782ld<T> f16890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1955sc<T> f16891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1857od f16892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2085xc<T> f16893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f16894e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T f16895f;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.md$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1807md.this.b();
        }
    }

    public C1807md(AbstractC1782ld<T> abstractC1782ld, InterfaceC1955sc<T> interfaceC1955sc, InterfaceC1857od interfaceC1857od, InterfaceC2085xc<T> interfaceC2085xc, T t10) {
        this.f16890a = abstractC1782ld;
        this.f16891b = interfaceC1955sc;
        this.f16892c = interfaceC1857od;
        this.f16893d = interfaceC2085xc;
        this.f16895f = t10;
    }

    public void a() {
        T t10 = this.f16895f;
        if (t10 != null && this.f16891b.a(t10) && this.f16890a.a(this.f16895f)) {
            this.f16892c.a();
            this.f16893d.a(this.f16894e, this.f16895f);
        }
    }

    public void a(T t10) {
        if (U2.a(this.f16895f, t10)) {
            return;
        }
        this.f16895f = t10;
        b();
        a();
    }

    public void b() {
        this.f16893d.a();
        this.f16890a.a();
    }

    public void c() {
        T t10 = this.f16895f;
        if (t10 != null && this.f16891b.b(t10)) {
            this.f16890a.b();
        }
        a();
    }
}
