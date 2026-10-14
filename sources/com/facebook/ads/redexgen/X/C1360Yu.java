package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1360Yu implements InterfaceC06294z {
    public final /* synthetic */ EB A00;

    public C1360Yu(EB eb2) {
        this.A00 = eb2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06294z
    public final void ADo(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2) {
        this.A00.A1o(abstractC06224s, c4v, c4v2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06294z
    public final void ADq(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2) {
        this.A00.A0r.A0c(abstractC06224s);
        this.A00.A1p(abstractC06224s, c4v, c4v2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06294z
    public final void ADs(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2) {
        abstractC06224s.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC06224s, abstractC06224s, c4v, c4v2)) {
                this.A00.A1N();
            }
        } else {
            if (!this.A00.A05.A0G(abstractC06224s, c4v, c4v2)) {
                return;
            }
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06294z
    public final void AFs(AbstractC06224s abstractC06224s) {
        this.A00.A06.A1D(abstractC06224s.A0H, this.A00.A0r);
    }
}
