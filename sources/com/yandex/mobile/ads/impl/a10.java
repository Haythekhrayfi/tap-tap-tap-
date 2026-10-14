package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class a10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final af0 f18756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xy0 f18757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f18758c;

    public a10(Context context, yy0 yy0Var) {
        this.f18757b = yy0Var;
        this.f18758c = context.getApplicationContext();
        this.f18756a = b10.a(context);
    }

    public final c10 a() {
        return new c10(this.f18758c, this.f18756a.a(this.f18757b.a(this.f18758c)));
    }
}
