package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class dv0 extends ix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.f f19992c;

    public dv0(String str, long j10, qd.f fVar) {
        fd.j0.i(fVar, "source");
        this.f19990a = str;
        this.f19991b = j10;
        this.f19992c = fVar;
    }

    @Override // com.yandex.mobile.ads.impl.ix0
    public final long b() {
        return this.f19991b;
    }

    @Override // com.yandex.mobile.ads.impl.ix0
    public final tc0 c() {
        String str = this.f19990a;
        if (str == null) {
            return null;
        }
        int i10 = tc0.f25339d;
        return tc0.a.b(str);
    }

    @Override // com.yandex.mobile.ads.impl.ix0
    public final qd.f d() {
        return this.f19992c;
    }
}
