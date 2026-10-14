package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class BL extends AbstractC1314Wz implements FU {
    public long A00;
    public FU A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.X.AbstractC0761An
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j10, FU fu, long j11) {
        super.A01 = j10;
        this.A01 = fu;
        if (j11 == RecyclerView.FOREVER_NS) {
            j11 = super.A01;
        }
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final List<FT> A6S(long j10) {
        return this.A01.A6S(j10 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final long A6s(int i10) {
        return this.A01.A6s(i10) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A6t() {
        return this.A01.A6t();
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A7K(long j10) {
        return this.A01.A7K(j10 - this.A00);
    }
}
