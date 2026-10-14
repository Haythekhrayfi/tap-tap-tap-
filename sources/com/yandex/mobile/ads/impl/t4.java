package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i01 f25257b = i01.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y6 f25258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x6 f25259d;

    public t4(Context context, y6 y6Var, x6 x6Var) {
        this.f25256a = context;
        this.f25258c = y6Var;
        this.f25259d = x6Var;
    }

    public final boolean a() {
        nz0 nz0VarA = this.f25257b.a(this.f25256a);
        return (nz0VarA != null && !nz0VarA.I() ? this.f25258c.a() : this.f25258c.b()) && this.f25259d.a();
    }
}
