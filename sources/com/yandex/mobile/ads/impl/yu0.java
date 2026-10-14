package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class yu0 extends vc.l implements uc.a<List<? extends Certificate>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mh f27101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ny f27102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e7 f27103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(mh mhVar, ny nyVar, e7 e7Var) {
        super(0);
        this.f27101a = mhVar;
        this.f27102b = nyVar;
        this.f27103c = e7Var;
    }

    @Override // uc.a
    public final List<? extends Certificate> invoke() {
        lh lhVarA = this.f27101a.a();
        fd.j0.f(lhVarA);
        return lhVarA.a(this.f27103c.k().g(), this.f27102b.c());
    }
}
