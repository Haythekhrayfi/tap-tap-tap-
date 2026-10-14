package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1225Tk implements L4 {
    public int A00;
    public final L4 A01;

    public C1225Tk(L4 l10, int i10) {
        this.A01 = l10;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void ADn(String str) {
        if (this.A00 > 0) {
            this.A01.ADn(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void flush() {
        this.A01.flush();
    }
}
