package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dn extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<js0> f19912c;

    public dn(String str, String str2, ArrayList arrayList) {
        super(str);
        this.f19911b = str2;
        this.f19912c = arrayList;
    }

    public final String b() {
        return this.f19911b;
    }

    public final List<js0> c() {
        return this.f19912c;
    }

    @Override // com.yandex.mobile.ads.impl.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dn.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        dn dnVar = (dn) obj;
        if (this.f19911b.equals(dnVar.f19911b)) {
            return this.f19912c.equals(dnVar.f19912c);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.m
    public final int hashCode() {
        return this.f19912c.hashCode() + z11.a(this.f19911b, super.hashCode() * 31, 31);
    }
}
