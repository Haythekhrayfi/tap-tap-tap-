package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class gn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jw0 f21108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yo0 f21109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.k f21110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ns0 f21111d = new ns0();

    public gn(jw0 jw0Var, ok0 ok0Var, com.yandex.mobile.ads.nativeads.k kVar) {
        this.f21108a = jw0Var;
        this.f21109b = ok0Var;
        this.f21110c = kVar;
    }

    public final void a(Context context, dn dnVar) {
        if (!this.f21111d.a(context, dnVar.c())) {
            this.f21109b.a(dnVar.b());
        } else {
            ((gi) this.f21108a).a(fw0.b.D);
            this.f21110c.d();
        }
    }
}
