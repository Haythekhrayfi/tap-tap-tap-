package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1304Wp implements InterfaceC0775Bb {
    public static byte[] A06;
    public static final Constructor<? extends BY> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{38, 83, 83, 80, 83, 1, 74, 79, 84, 85, 66, 79, 85, 74, 66, 85, 74, 79, 72, 1, 39, 45, 34, 36, 1, 70, 89, 85, 70, 79, 84, 74, 80, 79, 42, 67, 58, 77, 69, 58, 56, 73, 58, 57, -11, 58, 71, 71, 68, 71, -11, 56, 71, 58, 54, 73, 62, 67, 60, -11, Ascii.ESC, 33, 22, Ascii.CAN, -11, 58, 77, 73, 71, 54, 56, 73, 68, 71, Ascii.CAN, 36, 34, -29, Ascii.ESC, 22, Ascii.CAN, Ascii.SUB, 23, 36, 36, 32, -29, 22, Ascii.EM, 40, -29, Ascii.RS, 35, 41, Ascii.SUB, 39, 35, 22, 33, -29, Ascii.SUB, 45, 36, 37, 33, 22, 46, Ascii.SUB, 39, -25, -29, Ascii.SUB, 45, 41, -29, Ascii.ESC, 33, 22, Ascii.CAN, -29, -5, 33, 22, Ascii.CAN, -6, 45, 41, 39, 22, Ascii.CAN, 41, 36, 39};
    }

    static {
        A01();
        Constructor<? extends BY> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 61)).asSubclass(BY.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException(A00(0, 34, 105), e10);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0775Bb
    public final synchronized BY[] A4X() {
        BY[] extractors;
        Constructor<? extends BY> constructor = A07;
        extractors = new BY[constructor == null ? 12 : 13];
        extractors[0] = new C1289Wa(this.A01);
        extractors[1] = new WQ(this.A00);
        extractors[2] = new WO(this.A03);
        extractors[3] = new WX(this.A02);
        extractors[4] = new WA();
        extractors[5] = new WD();
        extractors[6] = new C1280Vr(this.A05, this.A04);
        extractors[7] = new C1296Wh();
        extractors[8] = new WI();
        extractors[9] = new C1286Vx();
        extractors[10] = new C1278Vp();
        extractors[11] = new C1299Wk();
        if (constructor != null) {
            try {
                extractors[12] = constructor.newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException(A00(34, 40, 93), e10);
            }
        }
        return extractors;
    }
}
