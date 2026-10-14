package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1516al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2044vl f15766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ll f15767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ll f15768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ll f15769d;

    public C1516al(Il il) {
        this(new C2044vl(il == null ? null : il.f14236e), new Ll(il == null ? null : il.f14237f), new Ll(il == null ? null : il.f14239h), new Ll(il != null ? il.f14238g : null));
    }

    public C1516al(C2044vl c2044vl, Ll ll, Ll ll2, Ll ll3) {
        this.f15766a = c2044vl;
        this.f15767b = ll;
        this.f15768c = ll2;
        this.f15769d = ll3;
    }

    public synchronized Zk<?> a() {
        return this.f15769d;
    }

    public void a(Il il) {
        this.f15766a.d(il.f14236e);
        this.f15767b.d(il.f14237f);
        this.f15768c.d(il.f14239h);
        this.f15769d.d(il.f14238g);
    }

    public Zk<?> b() {
        return this.f15767b;
    }

    public Zk<?> c() {
        return this.f15766a;
    }

    public Zk<?> d() {
        return this.f15768c;
    }
}
