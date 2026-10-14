package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1226Tl implements L4 {
    public static byte[] A03;
    public static String[] A04 = {"3JpGgMVfhEKs4h1tr8RMzDA7DOHokops", "dXqQ9QAcXKU8whF3kmnzOWjNbVMrrIOv", "otwaAvusvekoag06qMT5pISHPHVrRcMV", "WpvUEDFnYdSXMC7RGaJnlQQN5lPpeUoV", "uIVwlH6eBNHvEYk4kE6nlnhEt8muXj04", "pYVE6LchgLxW1usH7NIdAbU6pOe1Iyyx", "cgHZB3wyyqxQlT2ShG9pTXiCyg", "w9qB75SnMFWvoXL9CpdnGLUKrWLPOybN"};
    public int A00;
    public String A01;
    public final L4 A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            String[] strArr = A04;
            if (strArr[5].charAt(25) == strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "Ai5XpAh7M4hRkPfPQf54GYnUnAkHicBv";
            strArr2[3] = "aIcIWiLMc3Hy2WApHOm5eO35KvTaoUWD";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-117, -117, 125, -128};
    }

    static {
        A02();
    }

    public C1226Tl(L4 l10) {
        this.A02 = l10;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.ADn(this.A01 + A00(0, 4, 10) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void ADn(String str) {
        if (!L6.A0A(str)) {
            String strA04 = L6.A04(str);
            String filtered = this.A01;
            if (strA04.equals(filtered)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = strA04;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.ADn(str);
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
