package com.yandex.mobile.ads.impl;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f19316a = kc.g0.a("sysconst-update");

    public final boolean a(String str) {
        fd.j0.i(str, "param");
        return !this.f19316a.contains(str);
    }
}
