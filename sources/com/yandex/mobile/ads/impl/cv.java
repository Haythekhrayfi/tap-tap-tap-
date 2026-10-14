package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<l30> f19628a;

    public cv(ArrayList arrayList) {
        this.f19628a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cv.class != obj.getClass()) {
            return false;
        }
        return this.f19628a.equals(((cv) obj).f19628a);
    }

    public final int hashCode() {
        return this.f19628a.hashCode();
    }
}
