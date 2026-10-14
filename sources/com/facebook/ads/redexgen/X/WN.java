package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WN implements InterfaceC0779Bh {
    public final /* synthetic */ WM A00;

    public WN(WM wm) {
        this.A00 = wm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final long A6j() {
        return this.A00.A0B.A03(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final C0778Bg A7k(long granule) {
        if (granule != 0) {
            long jA04 = this.A00.A0B.A04(granule);
            WM wm = this.A00;
            return new C0778Bg(new C0780Bi(granule, wm.A00(wm.A09, jA04, 30000L)));
        }
        return new C0778Bg(new C0780Bi(0L, this.A00.A09));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final boolean A93() {
        return true;
    }
}
