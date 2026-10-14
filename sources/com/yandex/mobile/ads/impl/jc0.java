package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public class jc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22016e;

    public jc0(int i10, long j10, Object obj) {
        this(obj, -1, -1, j10, i10);
    }

    public jc0(jc0 jc0Var) {
        this.f22012a = jc0Var.f22012a;
        this.f22013b = jc0Var.f22013b;
        this.f22014c = jc0Var.f22014c;
        this.f22015d = jc0Var.f22015d;
        this.f22016e = jc0Var.f22016e;
    }

    public jc0(Object obj) {
        this(obj, -1L);
    }

    public jc0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private jc0(Object obj, int i10, int i11, long j10, int i12) {
        this.f22012a = obj;
        this.f22013b = i10;
        this.f22014c = i11;
        this.f22015d = j10;
        this.f22016e = i12;
    }

    public jc0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public final jc0 a(Object obj) {
        return this.f22012a.equals(obj) ? this : new jc0(obj, this.f22013b, this.f22014c, this.f22015d, this.f22016e);
    }

    public final boolean a() {
        return this.f22013b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc0)) {
            return false;
        }
        jc0 jc0Var = (jc0) obj;
        return this.f22012a.equals(jc0Var.f22012a) && this.f22013b == jc0Var.f22013b && this.f22014c == jc0Var.f22014c && this.f22015d == jc0Var.f22015d && this.f22016e == jc0Var.f22016e;
    }

    public final int hashCode() {
        return ((((((((this.f22012a.hashCode() + 527) * 31) + this.f22013b) * 31) + this.f22014c) * 31) + ((int) this.f22015d)) * 31) + this.f22016e;
    }
}
