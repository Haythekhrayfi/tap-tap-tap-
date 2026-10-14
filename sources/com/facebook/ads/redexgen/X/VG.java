package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VG implements FU {
    public final C0876Fr A00;
    public final Map<String, C0882Fx> A01;
    public final Map<String, C0877Fs> A02;
    public final long[] A03;

    public VG(C0876Fr c0876Fr, Map<String, C0882Fx> map, Map<String, C0877Fs> map2) {
        Map<String, C0882Fx> mapEmptyMap;
        this.A00 = c0876Fr;
        this.A02 = map2;
        if (map != null) {
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.A01 = mapEmptyMap;
        this.A03 = c0876Fr.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final List<FT> A6S(long j10) {
        return this.A00.A0D(j10, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final long A6s(int i10) {
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A6t() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FU
    public final int A7K(long j10) {
        int iA0A = C0930Hv.A0A(this.A03, j10, false, false);
        int index = this.A03.length;
        if (iA0A < index) {
            return iA0A;
        }
        return -1;
    }
}
