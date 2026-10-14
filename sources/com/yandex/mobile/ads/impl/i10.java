package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class i10 extends ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f21571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final do0 f21572b;

    public i10(q91 q91Var, SSLSocketFactory sSLSocketFactory) {
        this.f21571a = sSLSocketFactory;
        this.f21572b = new do0(q91Var);
    }

    @Override // com.yandex.mobile.ads.impl.ie
    public final z00 a(mw0<?> mw0Var, Map<String, String> map) throws fc, IOException {
        fd.j0.i(mw0Var, "request");
        fd.j0.i(map, "additionalHeaders");
        int iK = mw0Var.k();
        int i10 = zn0.f27375c;
        ex0 ex0VarB = zn0.a(iK, iK, this.f21571a).a(this.f21572b.a(mw0Var, map)).b();
        int iE = ex0VarB.e();
        ArrayList arrayListA = fn0.a(ex0VarB.h().c());
        if (!fn0.a(mw0Var.g(), iE)) {
            return new z00(iE, arrayListA);
        }
        ix0 ix0VarA = ex0VarB.a();
        return new z00(iE, arrayListA, ix0VarA != null ? (int) ix0VarA.b() : 0, fn0.a(ex0VarB));
    }
}
