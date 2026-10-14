package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WU implements C1 {
    public final int A00;
    public final int A01;
    public final C0914Hf A02;

    public WU(WV wv) {
        C0914Hf c0914Hf = wv.A00;
        this.A02 = c0914Hf;
        c0914Hf.A0Y(12);
        this.A00 = c0914Hf.A0H();
        this.A01 = c0914Hf.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.C1
    public final int A7f() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C1
    public final boolean A8r() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.X.C1
    public final int AE4() {
        int i10 = this.A00;
        return i10 == 0 ? this.A02.A0H() : i10;
    }
}
