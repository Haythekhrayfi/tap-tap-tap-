package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public class Y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Y f15534i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dm f15535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1993u0 f15536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1917qn f15537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L1 f15538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2097y f15539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I2 f15540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1695i0 f15541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2072x f15542h;

    private Y() {
        this(new Dm(), new C2097y(), new C1917qn());
    }

    public Y(Dm dm, C1993u0 c1993u0, C1917qn c1917qn, C2072x c2072x, L1 l10, C2097y c2097y, I2 i10, C1695i0 c1695i0) {
        this.f15535a = dm;
        this.f15536b = c1993u0;
        this.f15537c = c1917qn;
        this.f15542h = c2072x;
        this.f15538d = l10;
        this.f15539e = c2097y;
        this.f15540f = i10;
        this.f15541g = c1695i0;
    }

    private Y(Dm dm, C2097y c2097y, C1917qn c1917qn) {
        this(dm, c2097y, c1917qn, new C2072x(c2097y, c1917qn.a()));
    }

    private Y(Dm dm, C2097y c2097y, C1917qn c1917qn, C2072x c2072x) {
        this(dm, new C1993u0(), c1917qn, c2072x, new L1(dm), c2097y, new I2(c2097y, c1917qn.a(), c2072x), new C1695i0(c2097y));
    }

    public static Y g() {
        if (f15534i == null) {
            synchronized (Y.class) {
                if (f15534i == null) {
                    f15534i = new Y(new Dm(), new C2097y(), new C1917qn());
                }
            }
        }
        return f15534i;
    }

    public C2072x a() {
        return this.f15542h;
    }

    public C2097y b() {
        return this.f15539e;
    }

    public InterfaceExecutorC1966sn c() {
        return this.f15537c.a();
    }

    public C1917qn d() {
        return this.f15537c;
    }

    public C1695i0 e() {
        return this.f15541g;
    }

    public C1993u0 f() {
        return this.f15536b;
    }

    public Dm h() {
        return this.f15535a;
    }

    public L1 i() {
        return this.f15538d;
    }

    public Hm j() {
        return this.f15535a;
    }

    public I2 k() {
        return this.f15540f;
    }
}
