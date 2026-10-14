package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class xz0 implements ke.a<nz0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sz0 f26667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rz0.a f26668c;

    public xz0(Context context, sz0 sz0Var, rz0.a aVar) {
        this.f26666a = context.getApplicationContext();
        this.f26667b = sz0Var;
        this.f26668c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.gx0.a
    public final void a(bi1 bi1Var) {
        this.f26668c.a(bi1Var);
    }

    @Override // com.yandex.mobile.ads.impl.gx0.b
    public final void a(Object obj) {
        this.f26667b.a(this.f26666a, (nz0) obj);
        this.f26668c.a();
    }
}
