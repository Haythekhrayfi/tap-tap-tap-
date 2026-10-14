package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1301Wm implements InterfaceC0779Bh {
    public final long A00;
    public final C0778Bg A01;

    public C1301Wm(long j10) {
        this(j10, 0L);
    }

    public C1301Wm(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new C0778Bg(j11 == 0 ? C0780Bi.A03 : new C0780Bi(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final long A6j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final C0778Bg A7k(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final boolean A93() {
        return false;
    }
}
