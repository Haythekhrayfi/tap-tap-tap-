package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1997u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G9 f17500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I8 f17501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2024v6 f17502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1976t8 f17503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1792ln f17504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A f17505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1699i4 f17506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f17507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Om f17508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f17509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f17510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f17511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17512m;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u4$a */
    public interface a {
    }

    public C1997u4(G9 g10, I8 i10, C2024v6 c2024v6, C1976t8 c1976t8, A a10, C1792ln c1792ln, int i11, a aVar, C1699i4 c1699i4, Om om) {
        this.f17500a = g10;
        this.f17501b = i10;
        this.f17502c = c2024v6;
        this.f17503d = c1976t8;
        this.f17505f = a10;
        this.f17504e = c1792ln;
        this.f17509j = i11;
        this.f17506g = c1699i4;
        this.f17508i = om;
        this.f17507h = aVar;
        this.f17510k = g10.b(0L);
        this.f17511l = g10.k();
        this.f17512m = g10.h();
    }

    public long a() {
        return this.f17511l;
    }

    public void a(C1744k0 c1744k0) {
        this.f17502c.c(c1744k0);
    }

    public void a(C1744k0 c1744k0, C2054w6 c2054w6) {
        if (TextUtils.isEmpty(c1744k0.o())) {
            c1744k0.e(this.f17500a.m());
        }
        c1744k0.d(this.f17500a.l());
        c1744k0.a(Integer.valueOf(this.f17501b.g()));
        this.f17503d.a(this.f17504e.a(c1744k0).a(c1744k0), c1744k0.n(), c2054w6, this.f17505f.a(), this.f17506g);
        ((C1649g4.a) this.f17507h).f16177a.g();
    }

    public void b() {
        int i10 = this.f17509j;
        this.f17512m = i10;
        this.f17500a.a(i10).c();
    }

    public void b(C1744k0 c1744k0) {
        a(c1744k0, this.f17502c.b(c1744k0));
    }

    public void c(C1744k0 c1744k0) {
        a(c1744k0, this.f17502c.b(c1744k0));
        int i10 = this.f17509j;
        this.f17512m = i10;
        this.f17500a.a(i10).c();
    }

    public boolean c() {
        return this.f17512m < this.f17509j;
    }

    public void d(C1744k0 c1744k0) {
        a(c1744k0, this.f17502c.b(c1744k0));
        long jB = this.f17508i.b();
        this.f17510k = jB;
        this.f17500a.c(jB).c();
    }

    public boolean d() {
        return this.f17508i.b() - this.f17510k > C1949s6.f17279a;
    }

    public void e(C1744k0 c1744k0) {
        a(c1744k0, this.f17502c.b(c1744k0));
        long jB = this.f17508i.b();
        this.f17511l = jB;
        this.f17500a.e(jB).c();
    }

    public void f(C1744k0 c1744k0) {
        a(c1744k0, this.f17502c.f(c1744k0));
    }
}
