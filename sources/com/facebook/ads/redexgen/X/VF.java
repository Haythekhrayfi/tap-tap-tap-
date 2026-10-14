package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VF implements FU {
    public static final VF A01 = new VF();
    public final List<FT> A00;

    public VF() {
        this.A00 = Collections.emptyList();
    }

    public VF(FT ft) {
        this.A00 = Collections.singletonList(ft);
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final List<FT> A6S(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final long A6s(int i10) {
        HG.A03(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A6t() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A7K(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
