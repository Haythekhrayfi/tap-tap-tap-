package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23209b;

    public n3(int i10, int i11) {
        this.f23208a = i10;
        this.f23209b = i11;
    }

    public final int a() {
        return this.f23208a;
    }

    public final int b() {
        return this.f23209b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.f23208a == n3Var.f23208a && this.f23209b == n3Var.f23209b;
    }

    public final int hashCode() {
        return (this.f23208a * 31) + this.f23209b;
    }
}
