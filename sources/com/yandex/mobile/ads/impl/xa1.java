package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xa1 implements uw0<List<ac1>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f26484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uw0<w50> f26485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x50 f26486c;

    public xa1(Context context, q1 q1Var, uw0<w50> uw0Var) {
        this.f26484a = q1Var;
        this.f26485b = uw0Var;
        this.f26486c = new x50(context);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(lc1 lc1Var) {
        this.f26485b.a(lc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(List<ac1> list) {
        w50 w50VarA = this.f26486c.a(this.f26484a, list);
        if (w50VarA != null) {
            this.f26485b.a(w50VarA);
        } else {
            this.f26485b.a(lc1.b("Failed to parse ad break"));
        }
    }
}
