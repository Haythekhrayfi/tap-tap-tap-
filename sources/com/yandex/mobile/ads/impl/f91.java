package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class f91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w30 f20582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o50 f20583b = o50.a();

    public f91(w30 w30Var) {
        this.f20582a = w30Var;
    }

    public final e91 a(Context context, w50 w50Var, sc1 sc1Var, r50 r50Var, eg1 eg1Var, eq0 eq0Var, ec1 ec1Var) {
        return !this.f20583b.c() ? new wh(context, w50Var, r50Var, ec1Var, sc1Var, eg1Var) : new fl(context, this.f20582a, r50Var, w50Var, sc1Var, eg1Var, eq0Var, ec1Var);
    }
}
