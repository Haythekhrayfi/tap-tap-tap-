package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class re0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f24679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d40 f24680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p40 f24681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s40 f24682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dc1 f24683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f24684g = new HashMap();

    public re0(Context context, x1 x1Var, d40 d40Var, p40 p40Var, s40 s40Var, ec1 ec1Var) {
        this.f24678a = context.getApplicationContext();
        this.f24679b = x1Var;
        this.f24680c = d40Var;
        this.f24681d = p40Var;
        this.f24682e = s40Var;
        this.f24683f = ec1Var;
    }

    public final t1 a(w50 w50Var) {
        t1 t1Var = (t1) this.f24684g.get(w50Var);
        if (t1Var != null) {
            return t1Var;
        }
        t1 t1Var2 = new t1(this.f24678a, w50Var, this.f24680c, this.f24681d, this.f24682e, this.f24679b);
        t1Var2.a(this.f24683f);
        this.f24684g.put(w50Var, t1Var2);
        return t1Var2;
    }
}
