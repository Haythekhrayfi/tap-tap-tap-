package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class sb1 implements ob1, vc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb1 f25038a;

    public sb1(tb1 tb1Var) {
        this.f25038a = tb1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ob1
    public final void a(nb1 nb1Var) {
        fd.j0.i(nb1Var, "p0");
        tb1.a(this.f25038a, nb1Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ob1) && (obj instanceof vc.h)) {
            return fd.j0.d(getFunctionDelegate(), ((vc.h) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // vc.h
    public final jc.b<?> getFunctionDelegate() {
        return new vc.k(1, this.f25038a, tb1.class, "trackVerificationNotExecuted", "trackVerificationNotExecuted(Lcom/yandex/mobile/ads/verification/error/VerificationNotExecutedException;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
