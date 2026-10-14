package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class rj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wc1 f24749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qa1 f24750b;

    public rj1(Context context, qa1 qa1Var) {
        this.f24750b = qa1Var;
        this.f24749a = wc1.a(context);
    }

    public final void a(Context context, ac1 ac1Var, uw0<List<ac1>> uw0Var) {
        this.f24749a.a(context, ac1Var, this.f24750b, new sj1(context, ac1Var, uw0Var));
    }
}
