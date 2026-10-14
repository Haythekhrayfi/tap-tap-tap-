package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05431o {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            bArrCopyOfRange[i13] = b10;
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD, boolean z10, InterfaceC05411m interfaceC05411m) {
        if (!IN.A1g(c1337Xw)) {
            C6O c6o = new C6O(c1337Xw);
            C1Y c1yA06 = abstractC1404aD.A0n().A0D().A06();
            c6o.A0d(new C0945Il(abstractC1404aD.A0s(), c1337Xw.A09()));
            if (c1yA06 == null) {
                interfaceC05411m.ACB(AdError.CACHE_ERROR);
                return;
            }
            if (c1yA06.A0J()) {
                interfaceC05411m.ACC();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C6K c6k = new C6K(c1yA06.A0E(), abstractC1404aD.A0M(), abstractC1404aD.A0K());
            c6k.A04 = true;
            if (IN.A1Z(c1337Xw)) {
                c6k.A03 = A00(0, 5, 22);
            }
            switch (C05401l.A00[c1yA06.A09().ordinal()]) {
                case 1:
                case 2:
                    c6o.A0X(c6k);
                    break;
            }
            c6o.A0b(new C6M(abstractC1404aD.A0q().A01(), -1, -1, abstractC1404aD.A0M(), abstractC1404aD.A0K()));
            c6o.A0b(new C6M(c1yA06.A0D(), -1, -1, abstractC1404aD.A0M(), abstractC1404aD.A0K()));
            c6o.A0W(new C1391a0(c1337Xw, interfaceC05411m, c6o, c1yA06, z10), new C6H(abstractC1404aD.A0M(), abstractC1404aD.A0K()));
            return;
        }
        interfaceC05411m.ACC();
    }
}
