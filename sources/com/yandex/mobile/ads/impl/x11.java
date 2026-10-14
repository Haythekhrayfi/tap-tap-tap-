package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class x11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26407b;

    public x11(int i10, int i11) {
        this.f26406a = i10;
        this.f26407b = i11;
    }

    public final int a() {
        return this.f26407b;
    }

    public final int b() {
        return this.f26406a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x11.class != obj.getClass()) {
            return false;
        }
        x11 x11Var = (x11) obj;
        return this.f26406a == x11Var.f26406a && this.f26407b == x11Var.f26407b;
    }

    public final int hashCode() {
        return (this.f26406a * 31) + this.f26407b;
    }
}
