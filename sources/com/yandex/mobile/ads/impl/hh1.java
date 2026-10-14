package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f21437a;

    public hh1(ArrayList arrayList) {
        this.f21437a = arrayList;
    }

    public final List<String> a() {
        return this.f21437a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hh1.class != obj.getClass()) {
            return false;
        }
        return this.f21437a.equals(((hh1) obj).f21437a);
    }

    public final int hashCode() {
        return this.f21437a.hashCode();
    }
}
