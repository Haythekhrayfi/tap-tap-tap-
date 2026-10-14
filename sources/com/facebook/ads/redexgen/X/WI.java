package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WI implements BY {
    public static byte[] A03;
    public static final InterfaceC0775Bb A04;
    public InterfaceC0774Ba A00;
    public CU A01;
    public boolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{108, -121, -113, -110, -117, -118, 70, -102, -107, 70, -118, -117, -102, -117, -104, -109, -113, -108, -117, 70, -120, -113, -102, -103, -102, -104, -117, -121, -109, 70, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new WJ();
    }

    public static C0914Hf A00(C0914Hf c0914Hf) {
        c0914Hf.A0Y(0);
        return c0914Hf;
    }

    private boolean A03(BZ bz) throws InterruptedException, IOException {
        CQ cq = new CQ();
        if (!cq.A03(bz, true) || (cq.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(cq.A00, 8);
        C0914Hf c0914Hf = new C0914Hf(length);
        bz.ADa(c0914Hf.A00, 0, length);
        if (WK.A04(A00(c0914Hf))) {
            this.A01 = new WK();
        } else if (WF.A06(A00(c0914Hf))) {
            this.A01 = new WF();
        } else {
            if (!WH.A04(A00(c0914Hf))) {
                return false;
            }
            this.A01 = new WH();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A00 = interfaceC0774Ba;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        if (this.A01 == null) {
            if (A03(bz)) {
                bz.AEb();
            } else {
                throw new C07249b(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            InterfaceC0782Bk interfaceC0782BkAFm = this.A00.AFm(0, 1);
            this.A00.A5S();
            this.A01.A06(this.A00, interfaceC0782BkAFm);
            this.A02 = true;
        }
        return this.A01.A02(bz, c0777Bf);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        CU cu = this.A01;
        if (cu != null) {
            cu.A05(j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        try {
            return A03(bz);
        } catch (C07249b unused) {
            return false;
        }
    }
}
