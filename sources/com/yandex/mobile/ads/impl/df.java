package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib f19852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iw0 f19853b;

    public df(Context context, p3 p3Var, l6 l6Var, String str) {
        this.f19852a = new ib(p3Var, l6Var, str);
        this.f19853b = z8.a(context);
    }

    public final void a(fw0.a aVar) {
        this.f19852a.a(aVar);
    }

    public final void a(String str) {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(str, "asset_name");
        gw0 gw0Var2 = new gw0(this.f19852a.a());
        gw0Var2.b("no_view_for_asset", "reason");
        gw0Var.a(gw0Var2.a());
        fw0.b bVar = fw0.b.I;
        this.f19853b.a(new fw0(bVar.a(), gw0Var.a()));
    }
}
