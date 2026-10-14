package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0795Ch {
    public static String[] A0G = {"pHpyHP8S", "m7Dm6DzF3JrYgJb8r3aBvOiHYZnTgqFt", "HDu7bLu972VfHIygI4M5b4TuY4lqC4yg", "iivH24vaI3kkb3LFmloVx1IOyWVuKza4", "KZ0yf6ou6J0TqVPjqp3i5DSivFyU8bNM", "Pc4fHgH2fAOt1gCYCPntkv807xx", "lUKVzHZS", "o3UNUm1DzZwOBzkgZiuDkjMNM5U"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public C0909Ha A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public C0795Ch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A00(C0795Ch c0795Ch) {
        if (this.A0F) {
            if (!c0795Ch.A0F || this.A03 != c0795Ch.A03 || this.A07 != c0795Ch.A07 || this.A0C != c0795Ch.A0C) {
                return true;
            }
            boolean z10 = this.A0B;
            String[] strArr = A0G;
            if (strArr[1].charAt(29) == strArr[4].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[7] = "XDMSMjR4OOJ5qpPgon6YqbblugR";
            strArr2[5] = "5xZUmDJH2T0z2hm3Lt8QCiFJvrf";
            if (z10 && c0795Ch.A0B && this.A0A != c0795Ch.A0A) {
                return true;
            }
            int i10 = this.A05;
            int i11 = c0795Ch.A05;
            if (i10 != i11 && (i10 == 0 || i11 == 0)) {
                return true;
            }
            if (this.A09.A04 == 0 && c0795Ch.A09.A04 == 0 && (this.A06 != c0795Ch.A06 || this.A02 != c0795Ch.A02)) {
                return true;
            }
            if (this.A09.A04 == 1 && c0795Ch.A09.A04 == 1) {
                int i12 = this.A00;
                if (A0G[2].length() == 32) {
                    String[] strArr3 = A0G;
                    strArr3[7] = "XRlTxrvrNP0CnKRouPcFPiOcqOY";
                    strArr3[5] = "BA8SrIsjDMc450dTESwcliSODCW";
                    if (i12 != c0795Ch.A00) {
                        return true;
                    }
                } else if (i12 != c0795Ch.A00) {
                    return true;
                }
                if (this.A01 != c0795Ch.A01) {
                    return true;
                }
            }
            boolean z11 = this.A0E;
            boolean z12 = c0795Ch.A0E;
            if (z11 != z12) {
                return true;
            }
            if (z11 && z12 && this.A04 != c0795Ch.A04) {
                return true;
            }
        }
        return false;
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i10) {
        this.A08 = i10;
        this.A0D = true;
    }

    public final void A04(C0909Ha c0909Ha, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
        this.A09 = c0909Ha;
        this.A05 = i10;
        this.A08 = i11;
        this.A03 = i12;
        this.A07 = i13;
        this.A0C = z10;
        this.A0B = z11;
        this.A0A = z12;
        this.A0E = z13;
        this.A04 = i14;
        this.A06 = i15;
        this.A02 = i16;
        this.A00 = i17;
        this.A01 = i18;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        int i10;
        return this.A0D && ((i10 = this.A08) == 7 || i10 == 2);
    }
}
