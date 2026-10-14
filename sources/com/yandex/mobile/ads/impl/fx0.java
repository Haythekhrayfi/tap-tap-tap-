package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jx0 f20910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f20911c;

    public fx0(int i10, jx0 jx0Var, Map<String, String> map) {
        fd.j0.i(jx0Var, "body");
        fd.j0.i(map, "headers");
        this.f20909a = i10;
        this.f20910b = jx0Var;
        this.f20911c = map;
    }

    public final jx0 a() {
        return this.f20910b;
    }

    public final Map<String, String> b() {
        return this.f20911c;
    }

    public final int c() {
        return this.f20909a;
    }
}
