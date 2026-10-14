package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HE implements R7 {
    @Override // com.facebook.ads.redexgen.X.R7
    public final long A4u() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void AFU(Object obj, long j10) throws InterruptedException {
        obj.wait(j10);
    }
}
