package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h60 implements rf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mg1 f21312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j60 f21313b;

    public h60(w50 w50Var, sc1 sc1Var, de1 de1Var, i60 i60Var) {
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(de1Var, "statusController");
        fd.j0.i(i60Var, "viewProvider");
        this.f21312a = new mg1(i60Var);
        this.f21313b = new j60(de1Var, w50Var, sc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.rf1
    public final boolean a() {
        return this.f21313b.a() && this.f21312a.a();
    }
}
