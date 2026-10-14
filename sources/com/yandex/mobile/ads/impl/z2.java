package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2 f27186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p40 f27187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d3 f27188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b3 f27189d;

    public z2(w2 w2Var, p40 p40Var, d3 d3Var, b3 b3Var) {
        fd.j0.i(w2Var, "adGroupController");
        fd.j0.i(p40Var, "uiElementsManager");
        fd.j0.i(d3Var, "adGroupPlaybackEventsListener");
        fd.j0.i(b3Var, "adGroupPlaybackController");
        this.f27186a = w2Var;
        this.f27187b = p40Var;
        this.f27188c = d3Var;
        this.f27189d = b3Var;
    }

    public final void a() {
        s50 s50VarC = this.f27186a.c();
        if (s50VarC != null) {
            s50VarC.a();
        }
        e3 e3VarF = this.f27186a.f();
        if (e3VarF == null) {
            this.f27187b.a();
            ((t1.a) this.f27188c).a();
            return;
        }
        this.f27187b.a(e3VarF.c());
        int iOrdinal = e3VarF.b().a().ordinal();
        if (iOrdinal == 0) {
            this.f27189d.b();
            this.f27187b.a();
            t1.a aVar = (t1.a) this.f27188c;
            t1.this.f25223b.a(t1.this.f25222a, w1.f26125b);
            this.f27189d.e();
            return;
        }
        if (iOrdinal == 1) {
            this.f27189d.b();
            this.f27187b.a();
            t1.a aVar2 = (t1.a) this.f27188c;
            t1.this.f25223b.a(t1.this.f25222a, w1.f26125b);
            return;
        }
        if (iOrdinal == 2) {
            t1.a aVar3 = (t1.a) this.f27188c;
            if (t1.this.f25223b.a(t1.this.f25222a).equals(w1.f26126c)) {
                t1.this.f25223b.a(t1.this.f25222a, w1.f26131h);
            }
            this.f27189d.d();
            return;
        }
        if (iOrdinal != 4 && iOrdinal != 5) {
            if (iOrdinal == 6) {
                t1.a aVar4 = (t1.a) this.f27188c;
                if (t1.this.f25223b.a(t1.this.f25222a).equals(w1.f26130g)) {
                    t1.this.f25223b.a(t1.this.f25222a, w1.f26131h);
                }
                this.f27189d.f();
                return;
            }
            if (iOrdinal != 8 && iOrdinal != 9) {
                return;
            }
        }
        a();
    }
}
