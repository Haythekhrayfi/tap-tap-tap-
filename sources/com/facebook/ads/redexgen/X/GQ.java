package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GQ {
    public static String[] A04 = {"1e59kXQlLqMkYu", "73uDxCsdQKWLV7ukq8JJdZs18UKd6swo", "mCuMZDHsEtXcrT2f0", "82", "pR5c7vVXcuaoTTpQp", "OeCOW4uYvzA4LVqnaAabDbQ1U", "2mUnq0j6yY0W6wQrn1U3Lg5rNBUJPBqf", "6oWLaazoE5vpCSBDL9uHOzoNvgEAVE9"};
    public final int A00;
    public final GN A01;
    public final Object A02;
    public final C07409r[] A03;

    public GQ(C07409r[] c07409rArr, GM[] gmArr, Object obj) {
        this.A03 = c07409rArr;
        this.A01 = new GN(gmArr);
        this.A02 = obj;
        this.A00 = c07409rArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(GQ gq) {
        if (gq == null || gq.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i10 = 0; i10 < this.A01.A01; i10++) {
            if (!A02(gq, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(GQ gq, int i10) {
        if (gq == null) {
            return false;
        }
        C07409r[] c07409rArr = this.A03;
        String[] strArr = A04;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "XY11p18RHVDFci";
        strArr2[3] = "x2";
        return C0930Hv.A0g(c07409rArr[i10], gq.A03[i10]) && C0930Hv.A0g(this.A01.A00(i10), gq.A01.A00(i10));
    }
}
