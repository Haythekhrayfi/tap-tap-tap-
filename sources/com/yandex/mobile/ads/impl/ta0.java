package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ta0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ua0 f25297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ua0 f25298b;

    public ta0(ua0 ua0Var, ua0 ua0Var2) {
        fd.j0.i(ua0Var, "width");
        fd.j0.i(ua0Var2, "height");
        this.f25297a = ua0Var;
        this.f25298b = ua0Var2;
    }

    public final ua0 a() {
        return this.f25298b;
    }

    public final ua0 b() {
        return this.f25297a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta0)) {
            return false;
        }
        ta0 ta0Var = (ta0) obj;
        return fd.j0.d(this.f25297a, ta0Var.f25297a) && fd.j0.d(this.f25298b, ta0Var.f25298b);
    }

    public final int hashCode() {
        return this.f25298b.hashCode() + (this.f25297a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("MeasuredSize(width=");
        sbA.append(this.f25297a);
        sbA.append(", height=");
        sbA.append(this.f25298b);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
