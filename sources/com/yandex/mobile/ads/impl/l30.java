package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class l30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22610c;

    public l30(int i10, int i11, String str) {
        this.f22608a = str;
        this.f22609b = i10;
        this.f22610c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l30.class != obj.getClass()) {
            return false;
        }
        l30 l30Var = (l30) obj;
        if (this.f22609b == l30Var.f22609b && this.f22610c == l30Var.f22610c) {
            return this.f22608a.equals(l30Var.f22608a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f22608a.hashCode() * 31) + this.f22609b) * 31) + this.f22610c;
    }
}
