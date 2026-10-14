package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class bh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19271b;

    public bh1(int i10, String str) {
        fd.j0.i(str, "adUnitId");
        this.f19270a = str;
        this.f19271b = i10;
    }

    public final String a() {
        return this.f19270a;
    }

    public final int b() {
        return this.f19271b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh1)) {
            return false;
        }
        bh1 bh1Var = (bh1) obj;
        return fd.j0.d(this.f19270a, bh1Var.f19270a) && this.f19271b == bh1Var.f19271b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19271b) + (this.f19270a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("ViewSizeKey(adUnitId=");
        sbA.append(this.f19270a);
        sbA.append(", screenOrientation=");
        return h0.f.a(sbA, this.f19271b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
