package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class xv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kg1 f26639a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zv0 f26641c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ff f26640b = new ff();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vv0 f26642d = new vv0();

    public xv0(kg1 kg1Var, dw0 dw0Var) {
        this.f26639a = kg1Var;
        this.f26641c = new zv0(kg1Var, dw0Var);
    }

    public final void a() {
        em0 em0VarB = this.f26639a.b();
        if (em0VarB != null) {
            yv0 yv0VarB = em0VarB.a().b();
            this.f26641c.a(yv0VarB);
            this.f26640b.a(em0VarB.c().getBitmap(), new wv0(this, em0VarB, yv0VarB));
        }
    }
}
