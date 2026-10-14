package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f26687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x3 f26688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fw0.a f26689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fw0.a f26690d;

    public y3(Context context, w3 w3Var) {
        this.f26687a = z8.a(context);
        this.f26688b = new x3(w3Var);
    }

    public final void a() {
        HashMap mapA = com.applovin.impl.mediation.b.a.c.a("status", "success");
        mapA.putAll(this.f26688b.a());
        fw0.a aVar = this.f26689c;
        if (aVar != null) {
            mapA.putAll(aVar.a());
        }
        fw0.a aVar2 = this.f26690d;
        if (aVar2 != null) {
            mapA.putAll(aVar2.a());
        }
        this.f26687a.a(new fw0(fw0.b.f20875b.a(), mapA));
    }

    public final void a(fw0.a aVar) {
        this.f26690d = aVar;
    }

    public final void a(String str) {
        HashMap map = new HashMap();
        map.put("status", "error");
        map.put("failure_reason", str);
        map.putAll(this.f26688b.a());
        fw0.a aVar = this.f26689c;
        if (aVar != null) {
            map.putAll(aVar.a());
        }
        fw0.a aVar2 = this.f26690d;
        if (aVar2 != null) {
            map.putAll(aVar2.a());
        }
        this.f26687a.a(new fw0(fw0.b.f20875b.a(), map));
    }

    public final void b(fw0.a aVar) {
        this.f26689c = aVar;
    }
}
