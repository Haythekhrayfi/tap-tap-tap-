package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class d50 implements yo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i50 f19762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f19763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v91 f19764c = new v91();

    public d50(Context context, i50 i50Var) {
        this.f19763b = context;
        this.f19762a = i50Var;
    }

    @Override // com.yandex.mobile.ads.impl.yo0
    public final void a(String str) {
        if (this.f19764c.a(this.f19763b, str)) {
            this.f19762a.a();
        }
    }
}
