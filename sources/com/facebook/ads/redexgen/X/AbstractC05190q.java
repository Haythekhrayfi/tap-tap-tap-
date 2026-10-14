package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05190q {
    public static byte[] A04;
    public static String[] A05 = {"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    public boolean A00;
    public final C1337Xw A01;
    public final AbstractC05200r A02;
    public final QR A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public abstract void A06(Map<String, String> map);

    static {
        A01();
    }

    public AbstractC05190q(C1337Xw c1337Xw, AbstractC05200r abstractC05200r, QR qr) {
        this.A01 = c1337Xw;
        this.A02 = abstractC05200r;
        this.A03 = qr;
    }

    public final void A02() {
        if (this.A00) {
            return;
        }
        AbstractC05200r abstractC05200r = this.A02;
        if (abstractC05200r != null) {
            abstractC05200r.A00();
        }
        Map<String, String> extraData = new ND().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        C0985Kc.A02(this.A01, A00(0, 17, 20));
        AbstractC05200r abstractC05200r2 = this.A02;
    }
}
