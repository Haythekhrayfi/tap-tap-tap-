package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1671h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Om f16250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R2 f16251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I9 f16252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2141zi f16254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W0 f16255f;

    public C1671h1(I9 i10, C2141zi c2141zi, Om om, R2 r10, W0 w10) {
        this.f16252c = i10;
        this.f16254e = c2141zi;
        this.f16253d = i10.d(0L);
        this.f16250a = om;
        this.f16251b = r10;
        this.f16255f = w10;
    }

    public void a() {
        C2141zi c2141zi = this.f16254e;
        if (c2141zi == null || !this.f16251b.b(this.f16253d, c2141zi.f18038a, "should send EVENT_IDENTITY_LIGHT")) {
            return;
        }
        this.f16255f.b();
        long jB = this.f16250a.b();
        this.f16253d = jB;
        this.f16252c.i(jB);
    }

    public void a(C2141zi c2141zi) {
        this.f16254e = c2141zi;
    }
}
