package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class nb1 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lb1 f23330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23331b;

    /* JADX WARN: Illegal instructions before constructor call */
    public nb1(lb1 lb1Var, int i10) {
        StringBuilder sbA = v60.a("Verification not executed with reason = ");
        sbA.append(mb1.c(i10).toLowerCase(Locale.US));
        super(sbA.toString());
        this.f23330a = lb1Var;
        this.f23331b = i10;
    }

    public final int a() {
        return this.f23331b;
    }

    public final lb1 b() {
        return this.f23330a;
    }
}
