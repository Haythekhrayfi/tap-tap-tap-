package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XU implements C7S {
    public static XU A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public C0V A00;
    public C6S A01;
    public C7R A02;
    public C7h A03;
    public C8L A04;
    public InterfaceC0949Ip A05;
    public InterfaceC0887Gc A06;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A09;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i14 = bArrCopyOfRange[i13] - i12;
            String[] strArr3 = A09;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A09;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            bArrCopyOfRange[i13] = (byte) (i14 - 98);
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A07() {
        A08 = new byte[]{-58, -12, -63, -59, -61, -63, -58, -59, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, Ascii.US, Ascii.RS, 33, 35, 2, 20, 34, 34, Ascii.CAN, Ascii.RS, Ascii.GS, -13, 16, 35, 16, -8, Ascii.GS, Ascii.CAN, 35, Ascii.CAN, 16, Ascii.ESC, Ascii.CAN, 41, 20, 19};
        if (A09[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1336Xv c1336Xv) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1336Xv);
        InterfaceC0887Gc interfaceC0887GcA05 = A05(c1336Xv, this.A03, A03(c1336Xv));
        this.A06 = interfaceC0887GcA05;
        A09(c1336Xv, A00(c1336Xv, interfaceC0887GcA05));
        A0A(c1336Xv, this.A06);
        A0B(c1336Xv, this.A06);
        InterfaceC0887Gc interfaceC0887Gc = this.A06;
        if (interfaceC0887Gc != null) {
            interfaceC0887Gc.A5h();
        }
    }

    static {
        A07();
    }

    public static InterfaceC06485s A00(C1336Xv c1336Xv, InterfaceC0887Gc interfaceC0887Gc) {
        if (!IN.A1P(c1336Xv) || interfaceC0887Gc == null) {
            return null;
        }
        return AbstractC06495t.A00().A00(interfaceC0887Gc);
    }

    public static C7h A01(C1336Xv c1336Xv) {
        return AbstractC06817i.A00().A00(c1336Xv, new C1316Xb());
    }

    public static synchronized XU A02() {
        if (A07 == null) {
            A07 = new XU();
        }
        return A07;
    }

    public static QX A03(C1336Xv c1336Xv) {
        if (!IN.A1L(c1336Xv)) {
            return null;
        }
        return C1152Qp.A01(c1336Xv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C7S
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0887Gc A7x() {
        return this.A06;
    }

    public static InterfaceC0887Gc A05(C1336Xv c1336Xv, C7h c7h, QX qx) {
        if (!IN.A29(c1336Xv) || qx == null) {
            return null;
        }
        return RC.A00().A00(c1336Xv, c7h, qx, C0968Jk.A04(c1336Xv), new XV(new C0962Jd(c1336Xv, A06(0, 0, 122), null, JI.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(c1336Xv), AdSettings.isMixedAudience(), new JN(), L6.A01(IN.A0J(c1336Xv)), null, null), c1336Xv), RA.A00().A00());
    }

    public static void A08() {
        String strA06 = A06(32, 28, 77);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        JR.A05(strA06, A06(8, 24, 59), A06(0, 8, 46));
    }

    public static void A09(C1336Xv c1336Xv, InterfaceC06485s interfaceC06485s) {
        if (!IN.A1P(c1336Xv) || interfaceC06485s == null) {
            return;
        }
        AbstractC06465q.A00().A00(interfaceC06485s, c1336Xv);
    }

    public static void A0A(C1336Xv c1336Xv, InterfaceC0887Gc interfaceC0887Gc) {
        if (!IN.A0k(c1336Xv) || interfaceC0887Gc == null) {
            return;
        }
        new C6D(c1336Xv, interfaceC0887Gc, new C6E(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1336Xv c1336Xv, InterfaceC0887Gc interfaceC0887Gc) {
        if (interfaceC0887Gc == null) {
            return;
        }
        IQ.A00(c1336Xv, interfaceC0887Gc);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final InterfaceC0937Id A5p(C1336Xv c1336Xv) {
        return UT.A01(c1336Xv);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized C7R A64(C7Q c7q) {
        if (this.A02 == null) {
            this.A02 = new XW(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized C6S A6F() {
        if (this.A01 == null) {
            this.A01 = new C1338Xx();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized C7h A6c(C7Q c7q) {
        if (this.A03 == null) {
            this.A03 = A01(c7q.A01());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized InterfaceC06927u A6d(C7Q c7q) {
        return new C1325Xk(c7q);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized C7T A6n(C7Q c7q) {
        return new C0825Ds(this, c7q);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized C0V A6z(C7Q c7q) {
        if (!IN.A0w(c7q)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0W.A00().A00(new XZ(c7q));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized C7V A7h(C7Q c7q) {
        return new XX(c7q);
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final C1336Xv A7i(Context context) {
        C1336Xv sdkContext = C7P.A00();
        if (sdkContext == null) {
            C1336Xv sdkContext2 = new C1336Xv(context, this);
            C7P.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized InterfaceC0949Ip A7j(C1336Xv c1336Xv) {
        if (this.A05 == null) {
            this.A05 = new C1240Ua(c1336Xv);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.C7S
    public final synchronized C8L A7p() {
        if (this.A04 == null) {
            this.A04 = new C8L();
            A08();
        }
        return this.A04;
    }
}
