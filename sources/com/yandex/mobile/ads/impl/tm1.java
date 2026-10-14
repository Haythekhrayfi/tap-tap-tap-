package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class tm1 implements um1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zm1 f25404b;

    public tm1(zm1 zm1Var) {
        this.f25404b = zm1Var;
    }

    public final void a() {
        this.f25404b.a(new dn1(this));
    }

    public final void a(JSONObject jSONObject) {
        this.f25403a = jSONObject;
    }

    public final void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25404b.a(new mn1(this, hashSet, jSONObject, j10));
    }

    public final JSONObject b() {
        return this.f25403a;
    }

    public final void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25404b.a(new jn1(this, hashSet, jSONObject, j10));
    }
}
