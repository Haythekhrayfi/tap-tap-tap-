package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
class Zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R2 f15692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Om f15693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xh f15694d;

    public Zh(String str, R2 r10, Om om, Xh xh) {
        this.f15691a = str;
        this.f15692b = r10;
        this.f15693c = om;
        this.f15694d = xh;
    }

    public Zh(String str, Wh wh) {
        this(str, new R2(), new Nm(), new Xh(wh));
    }

    public void a(InterfaceC1663gi interfaceC1663gi, int i10, Ei ei) {
        this.f15694d.a(ei.f13919g);
        R2 r10 = this.f15692b;
        long jA = this.f15694d.a(i10);
        long j10 = ei.f13919g;
        StringBuilder sbA = defpackage.a.a("report ");
        sbA.append(this.f15691a);
        if (r10.b(jA, j10, sbA.toString())) {
            ((RunnableC1737ji) interfaceC1663gi).a(this.f15691a, Integer.valueOf(i10));
            this.f15694d.a(i10, this.f15693c.b());
        }
    }
}
