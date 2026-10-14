package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class lh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r50 f22708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l4 f22709b;

    public lh0(r50 r50Var) {
        this.f22708a = r50Var;
        this.f22709b = new l4(r50Var);
    }

    public final void a(fc1 fc1Var, a50 a50Var) {
        float fA = a50Var.a();
        boolean zD = a50Var.d();
        jh0 jh0VarI = fc1Var.i();
        kh0 kh0Var = new kh0(this.f22708a, this.f22709b, a50Var, jh0VarI);
        if (jh0VarI != null) {
            jh0VarI.setOnClickListener(kh0Var);
            jh0VarI.setMuted(zD);
        }
        this.f22709b.a(fA, zD);
    }
}
