package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UH extends AbstractC05180p {
    public static byte[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public UH(U7 u10) {
        this.A00 = u10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0B(C1419aS c1419aS) {
        this.A00.A1T(c1419aS);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0C() {
        if (this.A00.A0G != null) {
            this.A00.A0G.AAC();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0F(InterfaceC05170o interfaceC05170o) {
        if (this.A00.A0A != null) {
            this.A00.A0A.A0I();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0G(JD jd2) {
        this.A00.A11().A0E().A2h(LF.A01(this.A00.A00), jd2.A03().getErrorCode(), jd2.A04());
        if (this.A00.A0G != null) {
            this.A00.A0G.AB6(jd2);
        }
    }
}
