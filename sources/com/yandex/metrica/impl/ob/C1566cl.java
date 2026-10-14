package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1566cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1541bl f15892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1541bl f15893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1541bl f15894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1541bl f15895d;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.cl$a */
    public static class a {
    }

    public C1566cl(C1516al c1516al, Il il) {
        this(new C1541bl(c1516al.c(), a(il.f14236e)), new C1541bl(c1516al.b(), a(il.f14237f)), new C1541bl(c1516al.d(), a(il.f14239h)), new C1541bl(c1516al.a(), a(il.f14238g)));
    }

    public C1566cl(C1541bl c1541bl, C1541bl c1541bl2, C1541bl c1541bl3, C1541bl c1541bl4) {
        this.f15892a = c1541bl;
        this.f15893b = c1541bl2;
        this.f15894c = c1541bl3;
        this.f15895d = c1541bl4;
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C1541bl a() {
        return this.f15895d;
    }

    public C1541bl b() {
        return this.f15893b;
    }

    public C1541bl c() {
        return this.f15892a;
    }

    public C1541bl d() {
        return this.f15894c;
    }
}
