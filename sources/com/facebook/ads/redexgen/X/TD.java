package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TD implements MM {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ MK A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public TD(MK mk) {
        this.A00 = mk;
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void A4H() {
        if (this.A00.A07 != null) {
            this.A00.A07.A3y(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void A4I() {
        this.A00.A0M();
        if (this.A00.A08 != null) {
            this.A00.A08.ACY(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void A8E() {
        if (this.A00.A03 == null) {
            A4I();
            return;
        }
        MK.A01(this.A00);
        if (this.A00.A03.A02() == null) {
            MK mk = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            mk.A0C();
        } else {
            MK mk2 = this.A00;
            mk2.A0E(mk2.A03.A02());
        }
        if (Build.VERSION.SDK_INT >= 16 && IN.A1y(this.A00.A05)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void A97() {
        if (!TextUtils.isEmpty(this.A00.A04.A0I())) {
            KV.A0L(new KV(), this.A00.A05, KW.A00(this.A00.A04.A0I()), this.A00.A09);
        }
        this.A00.A02.A04();
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void A98() {
        this.A00.A0M();
        if (this.A00.A08 != null) {
            this.A00.A08.ACY(true);
        }
        if (!TextUtils.isEmpty(this.A00.A04.A0C())) {
            KV.A0L(new KV(), this.A00.A05, KW.A00(this.A00.A04.A0C()), this.A00.A09);
        }
        this.A00.A02.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void ABv(C2G c2g) {
        MK.A00(this.A00);
        this.A00.A01 = c2g;
        this.A00.A0E(this.A00.A01 == C2G.A03 ? this.A00.A04.A0A() : this.A00.A04.A0B());
    }

    @Override // com.facebook.ads.redexgen.X.MM
    public final void AC4(C2I c2i) {
        MK.A00(this.A00);
        this.A00.A02.A07(c2i.A01());
        if (!c2i.A05().isEmpty()) {
            this.A00.A0E(c2i);
        } else {
            this.A00.A0D(c2i);
        }
    }
}
