package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<qa<?>> f19519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<qh0> f19520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d11 f19521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<g11> f19522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f19523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<yp> f19524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n4 f19525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap f19526i = new HashMap();

    public final void a() {
        this.f19526i.put("status", fw0.c.f20901b);
    }

    public final void a(d11 d11Var) {
        this.f19521d = d11Var;
    }

    public final void a(n4 n4Var) {
        this.f19525h = n4Var;
    }

    public final void a(String str) {
        this.f19518a = str;
    }

    public final void a(ArrayList arrayList) {
        this.f19519b = arrayList;
    }

    public final void a(List<qh0> list) {
        this.f19520c = list;
    }

    public final List<qa<?>> b() {
        return this.f19519b;
    }

    public final void b(ArrayList arrayList) {
        this.f19524g = arrayList;
    }

    public final List<yp> c() {
        return this.f19524g;
    }

    public final void c(ArrayList arrayList) {
        this.f19523f = arrayList;
    }

    public final List<qh0> d() {
        return this.f19520c;
    }

    public final void d(ArrayList arrayList) {
        this.f19522e = arrayList;
    }

    public final HashMap e() {
        return this.f19526i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cj0.class != obj.getClass()) {
            return false;
        }
        cj0 cj0Var = (cj0) obj;
        String str = this.f19518a;
        if (str == null ? cj0Var.f19518a != null : !str.equals(cj0Var.f19518a)) {
            return false;
        }
        List<qa<?>> list = this.f19519b;
        if (list == null ? cj0Var.f19519b != null : !list.equals(cj0Var.f19519b)) {
            return false;
        }
        List<qh0> list2 = this.f19520c;
        if (list2 == null ? cj0Var.f19520c != null : !list2.equals(cj0Var.f19520c)) {
            return false;
        }
        d11 d11Var = this.f19521d;
        if (d11Var == null ? cj0Var.f19521d != null : !d11Var.equals(cj0Var.f19521d)) {
            return false;
        }
        List<g11> list3 = this.f19522e;
        if (list3 == null ? cj0Var.f19522e != null : !list3.equals(cj0Var.f19522e)) {
            return false;
        }
        List<String> list4 = this.f19523f;
        if (list4 == null ? cj0Var.f19523f != null : !list4.equals(cj0Var.f19523f)) {
            return false;
        }
        List<yp> list5 = this.f19524g;
        if (list5 == null ? cj0Var.f19524g != null : !list5.equals(cj0Var.f19524g)) {
            return false;
        }
        n4 n4Var = this.f19525h;
        if (n4Var == null ? cj0Var.f19525h != null : !n4Var.equals(cj0Var.f19525h)) {
            return false;
        }
        HashMap map = this.f19526i;
        HashMap map2 = cj0Var.f19526i;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public final List<String> f() {
        return this.f19523f;
    }

    public final d11 g() {
        return this.f19521d;
    }

    public final List<g11> h() {
        return this.f19522e;
    }

    public final int hashCode() {
        String str = this.f19518a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<qa<?>> list = this.f19519b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<qh0> list2 = this.f19520c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        d11 d11Var = this.f19521d;
        int iHashCode4 = (iHashCode3 + (d11Var != null ? d11Var.hashCode() : 0)) * 31;
        List<g11> list3 = this.f19522e;
        int iHashCode5 = (iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.f19523f;
        int iHashCode6 = (iHashCode5 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<yp> list5 = this.f19524g;
        int iHashCode7 = (iHashCode6 + (list5 != null ? list5.hashCode() : 0)) * 31;
        n4 n4Var = this.f19525h;
        int iHashCode8 = (iHashCode7 + (n4Var != null ? n4Var.hashCode() : 0)) * 31;
        HashMap map = this.f19526i;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }
}
