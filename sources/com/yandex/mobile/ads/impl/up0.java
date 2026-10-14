package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class up0 implements o91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vp0 f25724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sr f25725b;

    public up0(vp0 vp0Var) {
        fd.j0.i(vp0Var, "passbackUrlParametersProvider");
        this.f25724a = vp0Var;
        this.f25725b = new sr();
    }

    @Override // com.yandex.mobile.ads.impl.o91
    public final int a() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.impl.o91
    public final String a(Context context, k2 k2Var, w01 w01Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(w01Var, "sensitiveModeChecker");
        String strA = yu.a(context, k2Var, w01Var).a(this.f25724a.a()).a();
        fd.j0.h(strA, "configureFetchUrlBuilder…ers)\n            .build()");
        return this.f25725b.a(context, strA);
    }

    @Override // com.yandex.mobile.ads.impl.o91
    public final String a(k2 k2Var) {
        fd.j0.i(k2Var, "adConfiguration");
        return yu.a(k2Var);
    }
}
