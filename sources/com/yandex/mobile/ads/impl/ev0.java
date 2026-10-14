package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ev0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f20340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib f20341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20342c;

    public ev0(Context context, p3 p3Var, l6 l6Var, String str) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(p3Var, "adInfoReportDataProviderFactory");
        fd.j0.i(l6Var, "adType");
        this.f20340a = z8.a(context);
        this.f20341b = new ib(p3Var, l6Var, str);
        this.f20342c = true;
    }

    public final void a() {
        if (this.f20342c) {
            this.f20342c = false;
            return;
        }
        gw0 gw0Var = new gw0(new HashMap());
        Map<String, Object> mapA = this.f20341b.a();
        fd.j0.h(mapA, "reportParametersProvider.commonReportParameters");
        gw0Var.a(mapA);
        this.f20340a.a(new fw0(fw0.b.H, gw0Var.a()));
    }

    public final void a(fw0.a aVar) {
        fd.j0.i(aVar, "reportParameterManager");
        this.f20341b.a(aVar);
    }
}
