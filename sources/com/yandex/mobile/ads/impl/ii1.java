package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ii1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21721b;

    public ii1(int i10, int i11) {
        this.f21720a = i10;
        this.f21721b = i11;
    }

    public final void a(View view, boolean z10) {
        Context context = view.getContext();
        int i10 = z10 ? this.f21720a : this.f21721b;
        Object obj = e0.a.f28964a;
        view.setBackground(e0.a.c.b(context, i10));
    }
}
