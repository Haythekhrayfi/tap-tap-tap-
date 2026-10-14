package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f25115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib f25116b;

    public sh0(Context context, p3 p3Var, l6 l6Var, String str) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(p3Var, "adInfoReportDataProviderFactory");
        fd.j0.i(l6Var, "adType");
        this.f25115a = z8.a(context);
        this.f25116b = new ib(p3Var, l6Var, str);
    }

    public final void a(fw0.a aVar) {
        fd.j0.i(aVar, "reportParameterManager");
        this.f25116b.a(aVar);
    }

    public final void a(ArrayList arrayList, fw0.b bVar) {
        fd.j0.i(arrayList, "assetNames");
        fd.j0.i(bVar, "reportType");
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(arrayList, "assets");
        Map<String, Object> mapA = this.f25116b.a();
        fd.j0.h(mapA, "reportParametersProvider.commonReportParameters");
        gw0Var.a(mapA);
        this.f25115a.a(new fw0(bVar, gw0Var.a()));
    }
}
