package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib f21506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iw0 f21507b;

    public ht(Context context, p3 p3Var, l6 l6Var, String str) {
        this.f21506a = new ib(p3Var, l6Var, str);
        this.f21507b = z8.a(context);
    }

    public final void a(fw0.a aVar) {
        this.f21506a.a(aVar);
    }

    public final void a(ArrayList arrayList) {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(arrayList, "assets");
        gw0 gw0Var2 = new gw0(this.f21506a.a());
        gw0Var2.b("no_view_for_asset", "reason");
        gw0Var.a(gw0Var2.a());
        fw0.b bVar = fw0.b.J;
        this.f21507b.a(new fw0(bVar.a(), gw0Var.a()));
    }
}
