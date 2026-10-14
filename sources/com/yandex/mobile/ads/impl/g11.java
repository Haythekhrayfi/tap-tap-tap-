package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class g11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f20930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20932c;

    public final long a() {
        return this.f20930a;
    }

    public final void a(int i10) {
        this.f20932c = i10;
    }

    public final void a(long j10) {
        this.f20930a = j10;
    }

    public final void a(String str) {
        this.f20931b = str;
    }

    public final String b() {
        return this.f20931b;
    }

    public final int c() {
        return this.f20932c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g11.class != obj.getClass()) {
            return false;
        }
        g11 g11Var = (g11) obj;
        if (this.f20930a != g11Var.f20930a || this.f20932c != g11Var.f20932c) {
            return false;
        }
        String str = this.f20931b;
        String str2 = g11Var.f20931b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final int hashCode() {
        long j10 = this.f20930a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f20931b;
        return ((i10 + (str != null ? str.hashCode() : 0)) * 31) + this.f20932c;
    }
}
