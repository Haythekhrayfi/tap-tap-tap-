package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f23724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ad f23725b;

    public interface a {
        void a();
    }

    public final ad a() {
        return (ad) pa.b(this.f23725b);
    }

    public abstract p71 a(qv0[] qv0VarArr, i71 i71Var, nc0.b bVar, v61 v61Var) throws ns;

    public final void a(a aVar, ad adVar) {
        this.f23724a = aVar;
        this.f23725b = adVar;
    }

    public void a(ub ubVar) {
    }

    public abstract void a(Object obj);

    public final void b() {
        a aVar = this.f23724a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean c() {
        return this instanceof po;
    }

    public void d() {
        this.f23724a = null;
        this.f23725b = null;
    }
}
