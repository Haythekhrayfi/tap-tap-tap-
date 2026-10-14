package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class lf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f22702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jd1 f22703b;

    public lf1(Context context, AdResponse adResponse, k2 k2Var) {
        this.f22702a = z8.a(context);
        this.f22703b = new jd1(k2Var, adResponse);
    }

    public final void a(String str) {
        gw0 gw0Var = new gw0(this.f22703b.a());
        gw0Var.b(str, "error_message");
        this.f22702a.a(new fw0(fw0.b.f20891r.a(), gw0Var.a()));
    }
}
