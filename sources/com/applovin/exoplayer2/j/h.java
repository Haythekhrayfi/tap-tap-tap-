package com.applovin.exoplayer2.j;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g[] f7266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7267c;

    public h(g... gVarArr) {
        this.f7266b = gVarArr;
        this.f7265a = gVarArr.length;
    }

    public g a(int i10) {
        return this.f7266b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7266b, ((h) obj).f7266b);
    }

    public int hashCode() {
        if (this.f7267c == 0) {
            this.f7267c = 527 + Arrays.hashCode(this.f7266b);
        }
        return this.f7267c;
    }
}
