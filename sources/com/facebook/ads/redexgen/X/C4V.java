package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4V {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C4V A00(AbstractC06224s abstractC06224s, int i10) {
        View view = abstractC06224s.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C4V A01(AbstractC06224s abstractC06224s) {
        return A00(abstractC06224s, 0);
    }
}
