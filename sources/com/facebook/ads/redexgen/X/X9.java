package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class X9 implements InterfaceC0751Ad {
    public final X3 A00;
    public final X2 A01;
    public final AH[] A02;

    public X9(AH... ahArr) {
        AH[] ahArr2 = (AH[]) Arrays.copyOf(ahArr, ahArr.length + 2);
        this.A02 = ahArr2;
        X3 x10 = new X3();
        this.A00 = x10;
        X2 x11 = new X2();
        this.A01 = x11;
        ahArr2[ahArr.length] = x10;
        ahArr2[ahArr.length + 1] = x11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Ad
    public final C07269d A3W(C07269d c07269d) {
        this.A00.A0B(c07269d.A02);
        return new C07269d(this.A01.A01(c07269d.A01), this.A01.A00(c07269d.A00), c07269d.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Ad
    public final AH[] A5y() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Ad
    public final long A7G(long j10) {
        return this.A01.A02(j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Ad
    public final long A7r() {
        return this.A00.A0A();
    }
}
