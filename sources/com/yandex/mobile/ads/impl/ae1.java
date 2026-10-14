package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ae1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f18912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd1 f18913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fw0.a f18914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fw0.a f18915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, ? extends Object> f18916e;

    public ae1(Context context, w3 w3Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        this.f18912a = z8.a(context);
        this.f18913b = new zd1(w3Var);
    }

    public final void a() {
        Map mapF = kc.f0.f(new jc.h("status", "success"));
        mapF.putAll(this.f18913b.a());
        Object obj = this.f18916e;
        if (obj == null) {
            obj = kc.x.f32010c;
        }
        mapF.putAll(obj);
        fw0.a aVar = this.f18914c;
        Map<String, Object> mapA = aVar != null ? aVar.a() : null;
        if (mapA == null) {
            mapA = kc.x.f32010c;
        }
        mapF.putAll(mapA);
        fw0.a aVar2 = this.f18915d;
        Map<String, Object> mapA2 = aVar2 != null ? aVar2.a() : null;
        if (mapA2 == null) {
            mapA2 = kc.x.f32010c;
        }
        mapF.putAll(mapA2);
        this.f18912a.a(new fw0(fw0.b.M, (Map<String, Object>) mapF));
    }

    public final void a(fw0.a aVar) {
        this.f18915d = aVar;
    }

    public final void a(Map<String, ? extends Object> map) {
        this.f18916e = map;
    }

    public final void b(fw0.a aVar) {
        this.f18914c = aVar;
    }

    public final void a(String str, String str2) {
        fd.j0.i(str, "failureReason");
        fd.j0.i(str2, "errorMessage");
        Map mapF = kc.f0.f(new jc.h("status", "error"), new jc.h("failure_reason", str), new jc.h("error_message", str2));
        Object obj = this.f18916e;
        if (obj == null) {
            obj = kc.x.f32010c;
        }
        mapF.putAll(obj);
        fw0.a aVar = this.f18914c;
        Map<String, Object> mapA = aVar != null ? aVar.a() : null;
        if (mapA == null) {
            mapA = kc.x.f32010c;
        }
        mapF.putAll(mapA);
        fw0.a aVar2 = this.f18915d;
        Map<String, Object> mapA2 = aVar2 != null ? aVar2.a() : null;
        if (mapA2 == null) {
            mapA2 = kc.x.f32010c;
        }
        mapF.putAll(mapA2);
        this.f18912a.a(new fw0(fw0.b.M, (Map<String, Object>) mapF));
    }
}
