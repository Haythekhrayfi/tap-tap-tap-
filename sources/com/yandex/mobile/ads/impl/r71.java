package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r71<R, T> extends ke<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final R f24612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final zw0<R, T> f24613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iw0 f24614t;

    public r71(Context context, int i10, String str, ke.a<T> aVar, R r10, zw0<R, T> zw0Var) {
        super(i10, str, aVar);
        this.f24612r = r10;
        this.f24613s = zw0Var;
        this.f24614t = z8.a(context);
        a(context);
        t();
    }

    private void a(Context context) {
        a(new d5().a(context));
    }

    private void t() {
        this.f24614t.a(this.f24613s.a(this.f24612r));
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    public final gx0<T> a(wm0 wm0Var) {
        int i10 = wm0Var.f26319a;
        gx0<T> gx0VarA = a(wm0Var, i10);
        fw0 fw0VarA = this.f24613s.a(gx0VarA, i10, this.f24612r);
        new gw0(fw0VarA.a()).a(wm0Var.f26321c.get(t00.b(21)), "server_log_id");
        this.f24614t.a(fw0VarA);
        return gx0VarA;
    }

    public abstract gx0<T> a(wm0 wm0Var, int i10);

    @Override // com.yandex.mobile.ads.impl.mw0
    public bi1 b(bi1 bi1Var) {
        wm0 wm0Var = bi1Var.f19272a;
        this.f24614t.a(this.f24613s.a(null, wm0Var != null ? wm0Var.f26319a : -1, this.f24612r));
        return bi1Var;
    }
}
