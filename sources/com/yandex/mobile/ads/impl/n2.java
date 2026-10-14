package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final em1 f23205a;

    private n2(em1 em1Var) {
        this.f23205a = em1Var;
    }

    public static n2 a(em1 em1Var) {
        if (em1Var.i().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        if (em1Var.j()) {
            throw new IllegalStateException("AdSession is finished");
        }
        n2 n2Var = new n2(em1Var);
        em1Var.i().a(n2Var);
        return n2Var;
    }

    public final void a() {
        if (this.f23205a.j()) {
            throw new IllegalStateException("AdSession is finished");
        }
        if (!this.f23205a.k()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        if (!this.f23205a.f()) {
            try {
                this.f23205a.b();
            } catch (Exception unused) {
            }
        }
        if (this.f23205a.f()) {
            this.f23205a.d();
        }
    }

    public final void a(za1 za1Var) {
        in1.a(this.f23205a);
        if (!this.f23205a.k()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        this.f23205a.a(za1Var.a());
    }
}
