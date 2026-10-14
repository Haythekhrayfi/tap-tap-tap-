package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w3 f27280b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wc1 f27282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ua1 f27283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h01 f27284f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k2 f27281c = new k2(l6.f22631f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mc1 f27285g = new mc1();

    public zc1(Context context, w3 w3Var) {
        this.f27279a = context.getApplicationContext();
        this.f27280b = w3Var;
        this.f27282d = wc1.a(context);
        this.f27283e = new ua1(w3Var);
        this.f27284f = new h01(context, a90.a().b(), w3Var);
    }

    public static void a(zc1 zc1Var, d8 d8Var, wr wrVar) {
        zc1Var.f27281c.a(d8Var);
        zc1Var.f27281c.a(wrVar);
    }

    public final void a(ab1 ab1Var, Object obj, db1 db1Var) {
        ta1 ta1VarA = this.f27283e.a(this.f27279a, ab1Var, db1Var);
        this.f27280b.a(v3.f25808k, ab1Var);
        this.f27282d.a(this.f27279a, this.f27281c, ab1Var, obj, ta1VarA);
    }

    public final void a(wh1 wh1Var, Object obj, k40 k40Var) {
        this.f27284f.a(new yc1(this, k40Var, wh1Var, obj));
    }
}
