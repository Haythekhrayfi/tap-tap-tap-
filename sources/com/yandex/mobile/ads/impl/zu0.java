package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zu0 extends vc.l implements uc.a<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu0 f27431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu0(xu0 xu0Var) {
        super(0);
        this.f27431a = xu0Var;
    }

    @Override // uc.a
    public final List<? extends X509Certificate> invoke() {
        ny nyVar = this.f27431a.f26625e;
        fd.j0.f(nyVar);
        List<Certificate> listC = nyVar.c();
        ArrayList arrayList = new ArrayList(kc.m.j(listC, 10));
        for (Certificate certificate : listC) {
            fd.j0.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
