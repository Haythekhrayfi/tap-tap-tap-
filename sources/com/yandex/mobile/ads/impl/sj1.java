package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sj1 implements uw0<List<ac1>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tj1 f25126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uw0<List<ac1>> f25127b;

    public sj1(Context context, ac1 ac1Var, uw0<List<ac1>> uw0Var) {
        this.f25127b = uw0Var;
        this.f25126a = new tj1(context, ac1Var);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(lc1 lc1Var) {
        this.f25127b.a(lc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(List<ac1> list) {
        this.f25127b.a(this.f25126a.a(list));
    }
}
