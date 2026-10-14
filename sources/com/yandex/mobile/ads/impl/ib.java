package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b1 f21661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l6 f21662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q5 f21663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fw0.a f21664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21665e;

    public ib(p3 p3Var, l6 l6Var, String str) {
        this.f21661a = p3Var.a();
        this.f21663c = p3Var.b();
        this.f21662b = l6Var;
        this.f21665e = str;
    }

    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(this.f21662b.a(), "ad_type");
        gw0Var.a(this.f21665e, "ad_id");
        gw0Var.a(this.f21661a.a());
        gw0Var.a(this.f21663c.a());
        fw0.a aVar = this.f21664d;
        if (aVar != null) {
            gw0Var.a(aVar.a());
        }
        return gw0Var.a();
    }

    public final void a(fw0.a aVar) {
        this.f21664d = aVar;
    }
}
