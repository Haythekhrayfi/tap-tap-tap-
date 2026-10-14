package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1228Tn implements L4 {
    public int A00;
    public final L4 A01;
    public final L4 A02;

    public C1228Tn(L4 l10, int i10, L4 l11) {
        this.A01 = l10;
        this.A00 = i10;
        this.A02 = l11;
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void ADn(String str) {
        if (this.A00 > 0) {
            this.A01.ADn(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ADn(str);
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void flush() {
        this.A02.flush();
    }
}
