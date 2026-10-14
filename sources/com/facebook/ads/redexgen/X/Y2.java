package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Y2 extends K4 {
    public static byte[] A02;
    public final /* synthetic */ Y1 A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, Ascii.CAN, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public Y2(Y1 y10, AtomicBoolean atomicBoolean) {
        this.A00 = y10;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC0944Ik.A0H);
                C6R.A02(this.A00.A02.A04, this.A00.A01, C6R.A00, A00(11, 14, 17), this.A00.A02.A00);
                this.A00.A02.A0T();
                this.A00.A00.AAl();
                return;
            }
            this.A00.A02.A0I(EnumC0944Ik.A0G);
            C6R.A02(this.A00.A02.A04, this.A00.A01, C6R.A04, A00(0, 11, 41), this.A00.A02.A00);
            this.A00.A02.A0U();
            this.A00.A00.AAc();
        }
    }
}
