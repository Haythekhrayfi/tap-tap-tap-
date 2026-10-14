package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y21 f21933e;

    public final int a() {
        return this.f21930b;
    }

    public final void a(int i10) {
        this.f21930b = i10;
    }

    public final void a(y21 y21Var) {
        this.f21933e = y21Var;
    }

    public final void a(String str) {
        this.f21932d = str;
    }

    public final String b() {
        return this.f21932d;
    }

    public final void b(int i10) {
        this.f21929a = i10;
    }

    public final void b(String str) {
        this.f21931c = str;
    }

    public final y21 c() {
        return this.f21933e;
    }

    public final String d() {
        return this.f21931c;
    }

    public final int e() {
        return this.f21929a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j20.class != obj.getClass()) {
            return false;
        }
        j20 j20Var = (j20) obj;
        if (this.f21929a != j20Var.f21929a || this.f21930b != j20Var.f21930b) {
            return false;
        }
        String str = this.f21931c;
        if (str == null ? j20Var.f21931c != null : !str.equals(j20Var.f21931c)) {
            return false;
        }
        String str2 = this.f21932d;
        if (str2 == null ? j20Var.f21932d != null : !str2.equals(j20Var.f21932d)) {
            return false;
        }
        y21 y21Var = this.f21933e;
        y21 y21Var2 = j20Var.f21933e;
        if (y21Var != null) {
            return y21Var.equals(y21Var2);
        }
        return y21Var2 == null;
    }

    public final int hashCode() {
        int i10 = ((this.f21929a * 31) + this.f21930b) * 31;
        String str = this.f21931c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21932d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        y21 y21Var = this.f21933e;
        return iHashCode2 + (y21Var != null ? y21Var.hashCode() : 0);
    }
}
