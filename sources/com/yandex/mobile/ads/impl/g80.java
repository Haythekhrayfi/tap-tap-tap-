package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class g80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f20975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f20976b;

    public g80(Integer num, Integer num2) {
        this.f20975a = num;
        this.f20976b = num2;
    }

    public final Integer a() {
        return this.f20976b;
    }

    public final Integer b() {
        return this.f20975a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return fd.j0.d(this.f20975a, g80Var.f20975a) && fd.j0.d(this.f20976b, g80Var.f20976b);
    }

    public final int hashCode() {
        Integer num = this.f20975a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20976b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("LayoutParamsSize(width=");
        sbA.append(this.f20975a);
        sbA.append(", height=");
        sbA.append(this.f20976b);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
