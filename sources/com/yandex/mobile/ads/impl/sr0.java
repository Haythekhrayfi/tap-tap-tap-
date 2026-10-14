package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class sr0 implements dt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pf1 f25175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vu0 f25176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uu0 f25177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ur0 f25178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25179e;

    public sr0(pf1 pf1Var, vu0 vu0Var, uu0 uu0Var, ur0 ur0Var) {
        this.f25175a = pf1Var;
        this.f25176b = vu0Var;
        this.f25177c = uu0Var;
        this.f25178d = ur0Var;
    }

    public final void a() {
        if (this.f25179e) {
            return;
        }
        this.f25179e = true;
        this.f25175a.a(this);
        this.f25175a.a();
    }

    public final void a(long j10) {
        w50 w50VarA = this.f25177c.a(j10);
        if (w50VarA != null) {
            ((se0) this.f25178d).a(w50VarA);
            return;
        }
        w50 w50VarA2 = this.f25176b.a(j10);
        if (w50VarA2 != null) {
            ((se0) this.f25178d).b(w50VarA2);
        }
    }

    public final void b() {
        if (this.f25179e) {
            this.f25175a.a((dt0) null);
            this.f25175a.b();
            this.f25179e = false;
        }
    }
}
