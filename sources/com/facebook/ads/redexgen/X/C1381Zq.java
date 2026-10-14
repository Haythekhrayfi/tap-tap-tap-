package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1381Zq implements AnonymousClass13 {
    public static byte[] A07;
    public static String[] A08 = {"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ C0845Em A04;
    public final /* synthetic */ C8B A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, 67, 93, 73};
    }

    static {
        A01();
    }

    public C1381Zq(C0845Em c0845Em, Runnable runnable, long j10, C8B c8b) {
        this.A04 = c0845Em;
        this.A06 = runnable;
        this.A03 = j10;
        this.A05 = c8b;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void ABz(C1419aS c1419aS) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A05(this.A05.A03(C8F.A03), null);
        }
        if (this.A04.A06 != null) {
            this.A04.A06.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AC0(C1419aS c1419aS) {
        if (c1419aS != this.A04.A00) {
            return;
        }
        this.A04.A0E().removeCallbacks(this.A06);
        this.A04.A01 = c1419aS;
        this.A04.A06.A0F(c1419aS);
        if (!this.A02) {
            this.A02 = true;
            this.A04.A05(this.A05.A03(C8F.A05), this.A04.A01(this.A03));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AC1(C1419aS c1419aS) {
        if (!this.A01) {
            this.A01 = true;
            C0845Em c0845Em = this.A04;
            C8B c8b = this.A05;
            C8F c8f = C8F.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            c0845Em.A05(c8b.A03(c8f), null);
        }
        this.A04.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass13
    public final void AC3(C1419aS c1419aS, JD jd2) {
        if (c1419aS != this.A04.A00) {
            return;
        }
        this.A04.A0E().removeCallbacks(this.A06);
        this.A04.A0M(c1419aS);
        if (!this.A02) {
            this.A02 = true;
            Map mapA01 = this.A04.A01(this.A03);
            mapA01.put(A00(0, 5, 58), String.valueOf(jd2.A03().getErrorCode()));
            mapA01.put(A00(5, 3, 72), String.valueOf(jd2.A04()));
            this.A04.A05(this.A05.A03(C8F.A05), mapA01);
        }
        this.A04.AB6(jd2);
    }
}
