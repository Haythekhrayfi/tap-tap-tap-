package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0806Cu {
    public final int A00;
    public final long A01;

    public C0806Cu(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static C0806Cu A00(BZ bz, C0914Hf c0914Hf) throws InterruptedException, IOException {
        bz.ADa(c0914Hf.A00, 0, 8);
        c0914Hf.A0Y(0);
        int iA08 = c0914Hf.A08();
        long size = c0914Hf.A0K();
        return new C0806Cu(iA08, size);
    }
}
