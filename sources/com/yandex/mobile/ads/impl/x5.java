package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ip0 f26419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ip0 f26420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vl f26422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b30 f26423e;

    private x5() {
        vl vlVar = vl.f26008b;
        b30 b30Var = b30.f19104b;
        ip0 ip0Var = ip0.f21787b;
        this.f26422d = vlVar;
        this.f26423e = b30Var;
        this.f26419a = ip0Var;
        this.f26420b = ip0Var;
        this.f26421c = false;
    }

    public static x5 a() {
        return new x5();
    }

    public final boolean b() {
        return ip0.f21787b == this.f26419a;
    }

    public final boolean c() {
        return ip0.f21787b == this.f26420b;
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        rm1.a(jSONObject, "impressionOwner", this.f26419a);
        rm1.a(jSONObject, "mediaEventsOwner", this.f26420b);
        rm1.a(jSONObject, "creativeType", this.f26422d);
        rm1.a(jSONObject, "impressionType", this.f26423e);
        rm1.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f26421c));
        return jSONObject;
    }
}
