package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G6 implements Comparable<G6> {
    public final int A00;
    public final G2 A01;

    public G6(int i10, G2 g10) {
        this.A00 = i10;
        this.A01 = g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(G6 g10) {
        return this.A00 - g10.A00;
    }
}
