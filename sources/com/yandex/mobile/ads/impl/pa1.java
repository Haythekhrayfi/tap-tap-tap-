package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class pa1 extends r71<ab1, sa1> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final va1 f24021u;

    public pa1(Context context, String str, gi1.b bVar, ab1 ab1Var, eb1 eb1Var) {
        super(context, 0, str, bVar, ab1Var, eb1Var);
        this.f24021u = new va1(context);
        x60.e("Loading data ... url: %s", str);
    }

    @Override // com.yandex.mobile.ads.impl.r71
    public final gx0<sa1> a(wm0 wm0Var, int i10) {
        sa1 sa1VarA = this.f24021u.a(wm0Var);
        if (sa1VarA != null) {
            return !sa1VarA.b().b().isEmpty() ? gx0.a(sa1VarA, null) : gx0.a(new pr());
        }
        return gx0.a(new op0("Can't parse VAST response."));
    }
}
