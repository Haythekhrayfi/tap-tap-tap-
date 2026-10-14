package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class vg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25980b;

    public vg1(int i10, int i11) {
        this.f25979a = i10;
        this.f25980b = i11;
    }

    public final int a() {
        return this.f25980b;
    }

    public final int b() {
        return this.f25979a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg1)) {
            return false;
        }
        vg1 vg1Var = (vg1) obj;
        return this.f25979a == vg1Var.f25979a && this.f25980b == vg1Var.f25980b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25980b) + (Integer.hashCode(this.f25979a) * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("ViewSize(width=");
        sbA.append(this.f25979a);
        sbA.append(", height=");
        return h0.f.a(sbA, this.f25980b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
