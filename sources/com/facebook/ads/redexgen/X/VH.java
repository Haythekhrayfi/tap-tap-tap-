package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VH implements FU {
    public final long[] A00;
    public final FT[] A01;

    public VH(FT[] ftArr, long[] jArr) {
        this.A01 = ftArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final List<FT> A6S(long j10) {
        FT ft;
        int iA0B = C0930Hv.A0B(this.A00, j10, true, false);
        if (iA0B == -1 || (ft = this.A01[iA0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(ft);
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final long A6s(int i10) {
        boolean z10 = true;
        HG.A03(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        HG.A03(z10);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A6t() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A7K(long j10) {
        int iA0A = C0930Hv.A0A(this.A00, j10, false, false);
        int index = this.A00.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
