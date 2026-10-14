package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class BN extends AbstractC1313Wy<BM, BL, FV> implements VO {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{-68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -53, -52, -54, -42, -53, -52, -121, -52, -39, -39, -42, -39};
    }

    public abstract FU A0b(byte[] bArr, int i10, boolean z10) throws FV;

    public BN(String str) {
        super(new BM[2], new BL[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3A] */
    @Override // com.facebook.ads.redexgen.X.AbstractC1313Wy
    /* JADX INFO: renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C3A A0V() {
        return new BL(this) { // from class: com.facebook.ads.redexgen.X.3A
            public final BN A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.BL
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1313Wy
    /* JADX INFO: renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final FV A0W(BM bm, BL bl, boolean z10) {
        try {
            ByteBuffer inputData = bm.A01;
            bl.A09(((X0) bm).A00, A0b(inputData.array(), inputData.limit(), z10), bm.A00);
            bl.A01(Integer.MIN_VALUE);
            return null;
        } catch (FV e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1313Wy
    /* JADX INFO: renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final FV A0X(Throwable th) {
        return new FV(A0I(0, 23, 36), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1313Wy
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final BM A0T() {
        return new BM();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1313Wy
    /* JADX INFO: renamed from: A0c, reason: merged with bridge method [inline-methods] */
    public final void A0a(BL bl) {
        super.A0a(bl);
    }

    @Override // com.facebook.ads.redexgen.X.VO
    public final void AFF(long j10) {
    }
}
