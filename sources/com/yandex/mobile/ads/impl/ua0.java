package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final va0 f25577b;

    public ua0(int i10, va0 va0Var) {
        fd.j0.i(va0Var, "mode");
        this.f25576a = i10;
        this.f25577b = va0Var;
    }

    public final va0 a() {
        return this.f25577b;
    }

    public final int b() {
        return this.f25576a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return this.f25576a == ua0Var.f25576a && this.f25577b == ua0Var.f25577b;
    }

    public final int hashCode() {
        return this.f25577b.hashCode() + (Integer.hashCode(this.f25576a) * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("MeasuredSizeSpec(value=");
        sbA.append(this.f25576a);
        sbA.append(", mode=");
        sbA.append(this.f25577b);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
