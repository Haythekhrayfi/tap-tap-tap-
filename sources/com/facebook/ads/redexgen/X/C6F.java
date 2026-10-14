package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6F {
    public static byte[] A03;
    public static String[] A04 = {"fwnF9NqGlDDvd3tmLjHzlBLQ0vKEWHbi", "JyVh64c57ZQhNNoyVwIaBwBMCWCp47TX", "NiVjB9zhlvCIBmozr5iuMf4XPmRpTykj", "aMEAUKQnrJbxe7", "r8tEg4U8ig5A4Tipsx9WF382DZkzVk0N", "", "NXFd2c7X4J9ga52f6GNSRbndM6EeYerJ", "Iv2mUp4tdjLGTNz"};
    public static final AtomicBoolean A05;
    public C1336Xv A00;
    public String A01;
    public final C1006Kz A02 = new C1006Kz(300000000000L, new Y3(this));

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{114, 125, 114, Ascii.DEL, 124, 116, 42, 33, 48, 51, 43, 54, 47, 59, 48, 61, 52, 33, 75, 93, 75, 75, 81, 87, 86, 71, 76, 81, 85, 93};
    }

    static {
        A04();
        A05 = new AtomicBoolean(false);
    }

    public static C8N A00(C1336Xv c1336Xv) {
        if (IN.A10(c1336Xv)) {
            return C8O.A01(A01(0, 6, 104), A01(18, 12, 67), A01(6, 12, 63));
        }
        XT xtA00 = C8O.A00();
        String[] strArr = A04;
        if (strArr[2].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        A04[0] = "UkANKLN4N59lG96lj5R5seL3Uvk1PYyc";
        return xtA00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1336Xv c1336Xv;
        synchronized (this) {
            c1336Xv = this.A00;
        }
        if (c1336Xv == null) {
            return;
        }
        String strA0B = C8Q.A00().A01(c1336Xv, true).A0B(A00(c1336Xv));
        synchronized (this) {
            this.A01 = strA0B;
        }
    }

    public static void A03() {
        A05.set(true);
    }

    public final synchronized String A06(C1336Xv c1336Xv) {
        this.A00 = c1336Xv;
        c1336Xv.A07().A9q();
        if (this.A00.A06().AFN() || ((A05.get() && IN.A1Y(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A05.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
