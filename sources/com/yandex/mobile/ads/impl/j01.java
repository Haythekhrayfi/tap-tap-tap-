package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class j01 implements y91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aa1 f21891a;

    public j01(aa1 aa1Var) {
        fd.j0.i(aa1Var, "userAgentFormatter");
        this.f21891a = aa1Var;
    }

    @Override // com.yandex.mobile.ads.impl.y91
    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21891a.b());
        Objects.requireNonNull(this.f21891a);
        sb2.append(aa1.a());
        return sb2.toString();
    }
}
