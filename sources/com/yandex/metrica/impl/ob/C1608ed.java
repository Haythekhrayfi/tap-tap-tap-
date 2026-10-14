package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1608ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1941rn f16053a = P0.i().s().c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8 f16054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A8 f16055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1783le f16056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1634fe f16057e;

    public C1608ed(Context context) {
        this.f16054b = Qa.a(context).f();
        this.f16055c = Qa.a(context).e();
        C1783le c1783le = new C1783le();
        this.f16056d = c1783le;
        this.f16057e = new C1634fe(c1783le.a());
    }

    public C1941rn a() {
        return this.f16053a;
    }

    public A8 b() {
        return this.f16055c;
    }

    public B8 c() {
        return this.f16054b;
    }

    public C1634fe d() {
        return this.f16057e;
    }

    public C1783le e() {
        return this.f16056d;
    }
}
