package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class x90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f26476b;

    public x90(Context context, v50 v50Var) {
        this.f26475a = context.getApplicationContext();
        this.f26476b = new x1(v50Var.getAdBreaks());
    }

    public final w90 a(w50 w50Var) {
        return new w90(this.f26475a, w50Var, this.f26476b);
    }
}
