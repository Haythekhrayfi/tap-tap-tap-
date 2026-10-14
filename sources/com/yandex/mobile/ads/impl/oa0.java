package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class oa0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f23746c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pa0 f23747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final na0 f23748b;

    public oa0(b90 b90Var) {
        fd.j0.i(b90Var, "localStorage");
        this.f23747a = new pa0(b90Var);
        this.f23748b = new na0();
    }

    public final String a() {
        String strA;
        synchronized (f23746c) {
            strA = this.f23747a.a();
            if (strA == null) {
                Objects.requireNonNull(this.f23748b);
                strA = na0.a();
                this.f23747a.a(strA);
            }
        }
        return strA;
    }
}
