package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07429t {
    public static final C07429t A02;
    public static final C07429t A03;
    public static final C07429t A04;
    public static final C07429t A05;
    public static final C07429t A06;
    public final long A00;
    public final long A01;

    static {
        C07429t c07429t = new C07429t(0L, 0L);
        A04 = c07429t;
        A02 = new C07429t(RecyclerView.FOREVER_NS, RecyclerView.FOREVER_NS);
        A06 = new C07429t(RecyclerView.FOREVER_NS, 0L);
        A05 = new C07429t(0L, RecyclerView.FOREVER_NS);
        A03 = c07429t;
    }

    public C07429t(long j10, long j11) {
        HG.A03(j10 >= 0);
        HG.A03(j11 >= 0);
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C07429t c07429t = (C07429t) obj;
        return this.A01 == c07429t.A01 && this.A00 == c07429t.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
