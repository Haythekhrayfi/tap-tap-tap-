package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26147a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iq0 f26148b = new iq0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f26149c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f26150d = new ArrayList();

    public final void a() {
        synchronized (this.f26147a) {
            this.f26149c.clear();
            this.f26150d.clear();
        }
    }

    public final void a(a7 a7Var) {
        v3 v3Var = v3.f25798a;
        fd.j0.i(v3Var, "adLoadingPhaseType");
        fd.j0.i(a7Var, "parametersProvider");
        a(v3Var, a7Var, null);
    }

    public final void a(v3 v3Var) {
        fd.j0.i(v3Var, "adLoadingPhaseType");
        iq0 iq0Var = this.f26148b;
        fd.j0.i(iq0Var, "parametersProvider");
        a(v3Var, iq0Var, null);
    }

    public final void a(v3 v3Var, jq0 jq0Var, ab1 ab1Var) {
        Long l10;
        fd.j0.i(v3Var, "adLoadingPhaseType");
        fd.j0.i(jq0Var, "parametersProvider");
        synchronized (this.f26147a) {
            Map map = (Map) this.f26149c.get(v3Var);
            Long lValueOf = (map == null || (l10 = (Long) map.get(ab1Var)) == null) ? null : Long.valueOf(SystemClock.elapsedRealtime() - l10.longValue());
            if (lValueOf != null) {
                Map<String, Object> mapA = jq0Var.a(lValueOf.longValue());
                fd.j0.h(mapA, "parametersProvider.getReportParameters(duration)");
                this.f26150d.add(new u3(v3Var, mapA));
            }
            Map map2 = (Map) this.f26149c.get(v3Var);
            if (map2 != null) {
            }
        }
    }

    public final void a(v3 v3Var, Object obj) {
        fd.j0.i(v3Var, "adLoadingPhaseType");
        synchronized (this.f26147a) {
            Map linkedHashMap = (Map) this.f26149c.get(v3Var);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            this.f26149c.put(v3Var, linkedHashMap);
            linkedHashMap.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public final List<u3> b() {
        List<u3> listH;
        synchronized (this.f26147a) {
            listH = kc.t.H(this.f26150d);
        }
        return listH;
    }

    public final void b(v3 v3Var) {
        fd.j0.i(v3Var, "adLoadingPhaseType");
        a(v3Var, null);
    }
}
