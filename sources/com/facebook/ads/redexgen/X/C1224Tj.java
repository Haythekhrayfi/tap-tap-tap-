package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1224Tj implements L4 {
    public final L3 A00;
    public final L4 A01;

    public C1224Tj(L4 l10, int i10, int i11) {
        this.A01 = l10;
        this.A00 = new L3(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void ADn(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && L6.A08(this.A00)) {
            this.A01.ADn(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (L6.A08(this.A00)) {
                this.A01.ADn(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
