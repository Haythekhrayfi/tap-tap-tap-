package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class q21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24306e;

    public q21(int i10, int i11, int i12, int i13) {
        this.f24302a = i10;
        this.f24303b = i11;
        this.f24304c = i12;
        this.f24305d = i13;
        this.f24306e = i12 * i13;
    }

    public final int a() {
        return this.f24306e;
    }

    public final int b() {
        return this.f24305d;
    }

    public final int c() {
        return this.f24304c;
    }

    public final int d() {
        return this.f24302a;
    }

    public final int e() {
        return this.f24303b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q21)) {
            return false;
        }
        q21 q21Var = (q21) obj;
        return this.f24302a == q21Var.f24302a && this.f24303b == q21Var.f24303b && this.f24304c == q21Var.f24304c && this.f24305d == q21Var.f24305d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24305d) + r6.a.a(this.f24304c, r6.a.a(this.f24303b, Integer.hashCode(this.f24302a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("SmartCenter(x=");
        sbA.append(this.f24302a);
        sbA.append(", y=");
        sbA.append(this.f24303b);
        sbA.append(", width=");
        sbA.append(this.f24304c);
        sbA.append(", height=");
        return h0.f.a(sbA, this.f24305d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
