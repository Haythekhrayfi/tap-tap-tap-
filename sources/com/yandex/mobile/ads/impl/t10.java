package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class t10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xr f25230a;

    public interface a {
        void a(r10 r10Var);
    }

    public t10(xr xrVar) {
        this.f25230a = xrVar;
    }

    public final void a(a aVar) {
        u10 u10VarB = this.f25230a.b();
        aVar.a(new r10(u10VarB.b(), u10VarB.d(), u10VarB.c()));
    }
}
