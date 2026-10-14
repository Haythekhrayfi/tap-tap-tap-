package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class q01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q01 f24288c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24290b;

    static {
        q01 q01Var = new q01(0L, 0L);
        new q01(RecyclerView.FOREVER_NS, RecyclerView.FOREVER_NS);
        new q01(RecyclerView.FOREVER_NS, 0L);
        new q01(0L, RecyclerView.FOREVER_NS);
        f24288c = q01Var;
    }

    public q01(long j10, long j11) {
        pa.a(j10 >= 0);
        pa.a(j11 >= 0);
        this.f24289a = j10;
        this.f24290b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q01.class != obj.getClass()) {
            return false;
        }
        q01 q01Var = (q01) obj;
        return this.f24289a == q01Var.f24289a && this.f24290b == q01Var.f24290b;
    }

    public final int hashCode() {
        return (((int) this.f24289a) * 31) + ((int) this.f24290b);
    }
}
