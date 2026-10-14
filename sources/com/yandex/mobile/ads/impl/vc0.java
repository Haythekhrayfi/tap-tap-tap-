package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wa0 f25959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zb1 f25960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<j20> f25961c;

    public vc0(wa0 wa0Var, zb1 zb1Var, ArrayList arrayList) {
        this.f25959a = wa0Var;
        this.f25960b = zb1Var;
        this.f25961c = arrayList;
    }

    public final List<j20> a() {
        return this.f25961c;
    }

    public final wa0 b() {
        return this.f25959a;
    }

    public final zb1 c() {
        return this.f25960b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc0)) {
            return false;
        }
        vc0 vc0Var = (vc0) obj;
        wa0 wa0Var = this.f25959a;
        if (wa0Var == null ? vc0Var.f25959a != null : !wa0Var.equals(vc0Var.f25959a)) {
            return false;
        }
        zb1 zb1Var = this.f25960b;
        if (zb1Var == null ? vc0Var.f25960b != null : !zb1Var.equals(vc0Var.f25960b)) {
            return false;
        }
        List<j20> list = this.f25961c;
        List<j20> list2 = vc0Var.f25961c;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public final int hashCode() {
        wa0 wa0Var = this.f25959a;
        int iHashCode = (wa0Var != null ? wa0Var.hashCode() : 0) * 31;
        zb1 zb1Var = this.f25960b;
        int iHashCode2 = (iHashCode + (zb1Var != null ? zb1Var.hashCode() : 0)) * 31;
        List<j20> list = this.f25961c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
