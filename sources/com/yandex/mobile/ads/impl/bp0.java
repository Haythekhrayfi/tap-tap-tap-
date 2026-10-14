package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class bp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdResponse<String> f19305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f19306c;

    public bp0(Context context, AdResponse adResponse, a1 a1Var) {
        this.f19304a = context.getApplicationContext();
        this.f19305b = adResponse;
        this.f19306c = a1Var;
    }

    public final void a() {
        if (this.f19305b.L()) {
            return;
        }
        new fv(this.f19304a, this.f19305b.G(), this.f19306c).a();
    }
}
