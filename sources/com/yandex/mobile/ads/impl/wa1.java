package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class wa1<T> implements td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mg1 f26233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc1<T> f26234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eg1 f26235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd1<T> f26236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26237e;

    public wa1(sc1<T> sc1Var, lg1 lg1Var, eg1 eg1Var, dd1<T> dd1Var) {
        this.f26234b = sc1Var;
        this.f26235c = eg1Var;
        this.f26236d = dd1Var;
        this.f26233a = new mg1(lg1Var);
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        boolean zA = this.f26233a.a();
        if (this.f26237e || !zA) {
            return;
        }
        this.f26237e = true;
        this.f26235c.h();
        this.f26236d.c(this.f26234b);
    }
}
