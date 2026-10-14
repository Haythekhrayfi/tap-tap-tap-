package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class db1 implements uw0<sa1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uw0<List<ac1>> f19817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fb1 f19818b;

    public db1(Context context, xa1 xa1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(xa1Var, "adsRequestListener");
        this.f19817a = xa1Var;
        this.f19818b = new fb1(context);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(lc1 lc1Var) {
        fd.j0.i(lc1Var, "error");
        this.f19817a.a(lc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(sa1 sa1Var) {
        sa1 sa1Var2 = sa1Var;
        fd.j0.i(sa1Var2, "result");
        List<ac1> listB = sa1Var2.b().b();
        fd.j0.h(listB, "result.vast.videoAds");
        this.f19818b.a(listB, new cb1(this, listB));
    }
}
