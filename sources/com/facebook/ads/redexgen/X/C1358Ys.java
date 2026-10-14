package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1358Ys implements InterfaceC05993u {
    public final /* synthetic */ EB A00;

    public C1358Ys(EB eb2) {
        this.A00 = eb2;
    }

    private final void A00(C06003v c06003v) {
        switch (c06003v.A00) {
            case 1:
                this.A00.A06.A1Q(this.A00, c06003v.A02, c06003v.A01);
                break;
            case 2:
                this.A00.A06.A1R(this.A00, c06003v.A02, c06003v.A01);
                break;
            case 4:
                this.A00.A06.A1T(this.A00, c06003v.A02, c06003v.A01, c06003v.A03);
                break;
            case 8:
                this.A00.A06.A1S(this.A00, c06003v.A02, c06003v.A01, 1);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05993u
    public final AbstractC06224s A5d(int i10) {
        AbstractC06224s abstractC06224sA1G = this.A00.A1G(i10, true);
        if (abstractC06224sA1G == null || this.A00.A01.A0K(abstractC06224sA1G.A0H)) {
            return null;
        }
        return abstractC06224sA1G;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05993u
    public final void A9o(int i10, int i11, Object obj) {
        this.A00.A1g(i10, i11, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05993u
    public final void AA8(int i10, int i11) {
        this.A00.A1d(i10, i11);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05993u
    public final void AA9(int i10, int i11) {
        this.A00.A1e(i10, i11);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05993u
    public final void AAA(int i10, int i11) {
        this.A00.A1h(i10, i11, true);
        this.A00.A0G = true;
        this.A00.A0s.A00 += i11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05993u
    public final void AAB(int i10, int i11) {
        this.A00.A1h(i10, i11, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05993u
    public final void AAt(C06003v c06003v) {
        A00(c06003v);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05993u
    public final void AAv(C06003v c06003v) {
        A00(c06003v);
    }
}
