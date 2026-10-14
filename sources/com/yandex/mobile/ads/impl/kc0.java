package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class kc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nc0.b f22375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22383i;

    public kc0(nc0.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        pa.a(!z13 || z11);
        pa.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        pa.a(z14);
        this.f22375a = bVar;
        this.f22376b = j10;
        this.f22377c = j11;
        this.f22378d = j12;
        this.f22379e = j13;
        this.f22380f = z10;
        this.f22381g = z11;
        this.f22382h = z12;
        this.f22383i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kc0.class != obj.getClass()) {
            return false;
        }
        kc0 kc0Var = (kc0) obj;
        return this.f22376b == kc0Var.f22376b && this.f22377c == kc0Var.f22377c && this.f22378d == kc0Var.f22378d && this.f22379e == kc0Var.f22379e && this.f22380f == kc0Var.f22380f && this.f22381g == kc0Var.f22381g && this.f22382h == kc0Var.f22382h && this.f22383i == kc0Var.f22383i && da1.a(this.f22375a, kc0Var.f22375a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f22375a.hashCode() + 527) * 31) + ((int) this.f22376b)) * 31) + ((int) this.f22377c)) * 31) + ((int) this.f22378d)) * 31) + ((int) this.f22379e)) * 31) + (this.f22380f ? 1 : 0)) * 31) + (this.f22381g ? 1 : 0)) * 31) + (this.f22382h ? 1 : 0)) * 31) + (this.f22383i ? 1 : 0);
    }
}
