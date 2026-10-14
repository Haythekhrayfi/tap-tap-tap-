package com.yandex.mobile.ads.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class y20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z20 f26677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26679c;

    public y20(z20 z20Var) {
        this.f26677a = z20Var;
    }

    public final void a() {
        this.f26678b = false;
        this.f26679c = false;
    }

    public final void b() {
        if (this.f26678b) {
            return;
        }
        this.f26678b = true;
        this.f26677a.a(fw0.b.f20895v);
    }

    public final void c() {
        if (this.f26679c) {
            return;
        }
        this.f26679c = true;
        HashMap map = new HashMap();
        map.put("failure_tracked", Boolean.FALSE);
        this.f26677a.a(fw0.b.f20896w, map);
    }
}
