package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tq0 f24972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dc1 f24973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ps0 f24974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r5 f24975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r5 f24976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r5 f24977f;

    public s5(Context context, v50 v50Var, d40 d40Var, s40 s40Var, com.yandex.mobile.ads.instream.e eVar, com.yandex.mobile.ads.instream.d dVar, ec1 ec1Var) {
        this.f24973b = ec1Var;
        this.f24974c = new ps0(eVar);
        this.f24972a = new tq0(context, v50Var, d40Var, s40Var, eVar, dVar);
    }

    public final r5 a() {
        if (this.f24976e == null) {
            r5 r5Var = new r5(this.f24972a.a());
            r5Var.a(this.f24973b);
            this.f24976e = r5Var;
        }
        return this.f24976e;
    }

    public final r5 b() {
        t5 t5VarB;
        if (this.f24977f == null && (t5VarB = this.f24972a.b()) != null) {
            r5 r5Var = new r5(t5VarB);
            r5Var.a(this.f24973b);
            this.f24977f = r5Var;
        }
        return this.f24977f;
    }

    public final r5 c() {
        t5 t5VarC;
        if (this.f24975d == null && this.f24974c.a() && (t5VarC = this.f24972a.c()) != null) {
            r5 r5Var = new r5(t5VarC);
            r5Var.a(this.f24973b);
            this.f24975d = r5Var;
        }
        return this.f24975d;
    }
}
