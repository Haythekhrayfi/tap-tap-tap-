package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VI implements FU {
    public static String[] A02 = {"rC2J7AwmmaBlZB1ox11LDA9ZAB6fxVsC", "FZKyzMmy9TivpD2nKj9z4jyUnxaUeLwM", "SgCjuagBwk99AmsF9yO8OoMMvubs4clZ", "SMyqq5yIGtEsHah", "ZWugu9oJugVg9n7ZMlc8zaFASnxpD2Hj", "S8p9iTCEp8NZOaZR39SQR", "XhPs2dbFqyZTAL6Xfbqo6", "a7gb9qnnbjI1KAE"};
    public final long[] A00;
    public final FT[] A01;

    public VI(FT[] ftArr, long[] jArr) {
        this.A01 = ftArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final List<FT> A6S(long j10) {
        int iA0B = C0930Hv.A0B(this.A00, j10, true, false);
        if (iA0B != -1) {
            FT[] ftArr = this.A01;
            if (A02[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A02[1] = "utRrKVvY3UrlqyIa0tu41Z4MJfpwxdGA";
            FT ft = ftArr[iA0B];
            if (ft != null) {
                return Collections.singletonList(ft);
            }
        }
        return Collections.emptyList();
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
