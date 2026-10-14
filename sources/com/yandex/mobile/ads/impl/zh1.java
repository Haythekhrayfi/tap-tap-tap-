package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class zh1 implements uw0<rh1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w3 f27339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uw0<rh1> f27340b;

    public zh1(w3 w3Var, uw0<rh1> uw0Var) {
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(uw0Var, "requestListener");
        this.f27339a = w3Var;
        this.f27340b = uw0Var;
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(lc1 lc1Var) {
        fd.j0.i(lc1Var, "error");
        this.f27339a.a(v3.f25811n);
        this.f27340b.a(lc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(rh1 rh1Var) {
        rh1 rh1Var2 = rh1Var;
        fd.j0.i(rh1Var2, "vmap");
        this.f27339a.a(v3.f25811n);
        this.f27340b.a(rh1Var2);
    }
}
