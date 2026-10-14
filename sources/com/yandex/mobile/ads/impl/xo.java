package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<j20> f26574d;

    public xo(String str, String str2, String str3, ArrayList arrayList) {
        this.f26571a = str;
        this.f26572b = str2;
        this.f26573c = str3;
        this.f26574d = arrayList;
    }

    public final List<j20> a() {
        return this.f26574d;
    }

    public final String b() {
        return this.f26573c;
    }

    public final String c() {
        return this.f26572b;
    }

    public final String d() {
        return this.f26571a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xo.class != obj.getClass()) {
            return false;
        }
        xo xoVar = (xo) obj;
        if (!this.f26571a.equals(xoVar.f26571a) || !this.f26572b.equals(xoVar.f26572b) || !this.f26573c.equals(xoVar.f26573c)) {
            return false;
        }
        List<j20> list = this.f26574d;
        List<j20> list2 = xoVar.f26574d;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public final int hashCode() {
        int iA = z11.a(this.f26573c, z11.a(this.f26572b, this.f26571a.hashCode() * 31, 31), 31);
        List<j20> list = this.f26574d;
        return iA + (list != null ? list.hashCode() : 0);
    }
}
