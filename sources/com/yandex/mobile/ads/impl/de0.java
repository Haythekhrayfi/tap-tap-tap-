package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class de0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd0 f19846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.mediation.base.b f19847b = new com.yandex.mobile.ads.mediation.base.b();

    public de0(qd0 qd0Var) {
        this.f19846a = qd0Var;
    }

    public final void a(Context context, ce0 ce0Var, com.yandex.mobile.ads.mediation.base.a aVar) {
        HashMap mapA = com.applovin.impl.mediation.b.a.c.a("status", "success");
        if (aVar != null) {
            Objects.requireNonNull(this.f19847b);
            mapA.putAll(com.yandex.mobile.ads.mediation.base.b.a(aVar));
        }
        this.f19846a.f(context, ce0Var, mapA);
    }

    public final void a(Context context, ce0 ce0Var, com.yandex.mobile.ads.mediation.base.a aVar, String str, Long l10) {
        HashMap map = new HashMap();
        map.put("failure_reason", str);
        map.put("status", "error");
        if (l10 != null) {
            map.put("response_time", l10);
        }
        if (aVar != null) {
            Objects.requireNonNull(this.f19847b);
            map.putAll(com.yandex.mobile.ads.mediation.base.b.a(aVar));
        }
        this.f19846a.f(context, ce0Var, map);
    }
}
