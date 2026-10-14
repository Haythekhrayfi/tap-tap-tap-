package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<sc1<vl0>> f27277a;

    public zb1(ArrayList arrayList) {
        this.f27277a = arrayList;
    }

    public final sc1<vl0> a() {
        return this.f27277a.get(0);
    }

    public final List<sc1<vl0>> b() {
        return this.f27277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zb1.class != obj.getClass()) {
            return false;
        }
        return this.f27277a.equals(((zb1) obj).f27277a);
    }

    public final int hashCode() {
        return this.f27277a.hashCode();
    }
}
