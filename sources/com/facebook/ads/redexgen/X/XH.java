package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XH implements HW {
    public static byte[] A04;
    public static String[] A05 = {"Xobc5aSRFsnlTfq950Hm2L3uP2yqTx5R", "l", "qpzLH3olNTSgnmEJfqgMoILAygrv9Gvu", "rA2kHVtwjUdxF3LXQtoL786BdYvsVYLD", "0rBDFyThd5IBv1Jp4I3rS", "drj1vvUtkoX3RGiyI02l8il3i3aSfPCy", "cZlTLMFk7RrLemAAhuy1ARzIYrj9DMLk", "NSM"};
    public XE A00;
    public HW A01;
    public final C9F A02;
    public final C1246Ug A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-84, -44, -53, -45, -56, -49, -53, -60, Ascii.DEL, -47, -60, -51, -61, -60, -47, -60, -47, Ascii.DEL, -52, -60, -61, -56, -64, Ascii.DEL, -62, -53, -50, -62, -54, -46, Ascii.DEL, -60, -51, -64, -63, -53, -60, -61, -115};
    }

    static {
        A02();
    }

    public XH(C9F c9f, HJ hj) {
        this.A02 = c9f;
        this.A03 = new C1246Ug(hj);
    }

    private void A01() {
        this.A03.A02(this.A01.A7b());
        C07269d c07269dA7Y = this.A01.A7Y();
        if (!c07269dA7Y.equals(this.A03.A7Y())) {
            this.A03.AFE(c07269dA7Y);
            this.A02.ACD(c07269dA7Y);
        }
    }

    private boolean A03() {
        XE xe2 = this.A00;
        if (xe2 != null && !xe2.A8p()) {
            boolean zA8z = this.A00.A8z();
            if (A05[1].length() == 23) {
                throw new RuntimeException();
            }
            A05[1] = "Da4vHoBMew1xMnwVwhw0NxQudcM";
            if (zA8z || !this.A00.A8P()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            long jA7b = this.A01.A7b();
            if (A05[7].length() == 18) {
                throw new RuntimeException();
            }
            A05[7] = "L098bBK7xK";
            return jA7b;
        }
        return this.A03.A7b();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j10) {
        this.A03.A02(j10);
    }

    public final void A08(XE xe2) {
        if (xe2 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(XE xe2) throws C9I {
        HW hwA7E = xe2.A7E();
        if (hwA7E != null) {
            HW hw = this.A01;
            if (A05[0].charAt(12) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "G6KpX7Ur5Z0x6RCw4xSrHpY3l6NonZ5O";
            strArr[3] = "DkiI2Rz4cuYvxyrSRslfvXTI6PdAzLXl";
            if (hwA7E != hw) {
                if (hw == null) {
                    this.A01 = hwA7E;
                    this.A00 = xe2;
                    HW rendererMediaClock = this.A03;
                    hwA7E.AFE(rendererMediaClock.A7Y());
                    A01();
                    return;
                }
                throw C9I.A02(new IllegalStateException(A00(0, 39, 31)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final C07269d A7Y() {
        HW hw = this.A01;
        if (hw != null) {
            return hw.A7Y();
        }
        return this.A03.A7Y();
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final long A7b() {
        if (A03()) {
            return this.A01.A7b();
        }
        return this.A03.A7b();
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final C07269d AFE(C07269d c07269d) {
        HW hw = this.A01;
        if (hw != null) {
            c07269d = hw.AFE(c07269d);
        }
        this.A03.AFE(c07269d);
        this.A02.ACD(c07269d);
        return c07269d;
    }
}
