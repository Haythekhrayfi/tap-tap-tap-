package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class sq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d40 f25168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.e f25169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s40 f25170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p40 f25171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.d f25172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y1 f25173g;

    public sq0(Context context, d40 d40Var, com.yandex.mobile.ads.instream.e eVar, com.yandex.mobile.ads.instream.d dVar, s40 s40Var, i40 i40Var) {
        Context applicationContext = context.getApplicationContext();
        this.f25167a = applicationContext;
        this.f25168b = d40Var;
        this.f25169c = eVar;
        this.f25170d = s40Var;
        this.f25172f = dVar;
        this.f25171e = new p40(applicationContext, s40Var, eVar, d40Var);
        this.f25173g = new y1(i40Var);
    }

    public final se0 a(g40 g40Var) {
        return new se0(this.f25167a, g40Var, this.f25173g.a(), this.f25168b, this.f25171e, this.f25170d, this.f25169c, this.f25172f);
    }

    public final u11 a(w50 w50Var) {
        return new u11(this.f25167a, w50Var, this.f25168b, this.f25171e, this.f25170d, this.f25173g.a());
    }
}
