package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0984Kb {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<JG, JI> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, Ascii.EM, 74, Ascii.RS, 93, 76, 91, 95, 74, 91, Ascii.RS, Ascii.DEL, 90, 109, 87, 68, 91, Ascii.RS, 75, 77, 87, 80, 89, Ascii.RS, 74, 86, 87, 77, Ascii.RS, 73, 87, 90, 74, 86, Ascii.RS, 95, 80, 90, Ascii.RS, 86, 91, 87, 89, 86, 74, 16, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        HashMap map = new HashMap();
        A02 = map;
        map.put(JG.A08, JI.A0C);
        map.put(JG.A06, JI.A0E);
        map.put(JG.A05, JI.A0D);
    }

    public static AdSize A00(JG jg) {
        return AdSize.fromWidthAndHeight(jg.A03(), jg.A02());
    }

    public static AdSize A01(JI ji) {
        for (Map.Entry<JG, JI> entry : A02.entrySet()) {
            if (entry.getValue() == ji) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static JG A02(int i10) {
        switch (i10) {
            case 4:
                return JG.A04;
            case 5:
                return JG.A05;
            case 6:
                return JG.A06;
            case 7:
                return JG.A08;
            case 100:
                return JG.A07;
            default:
                throw new IllegalArgumentException(A06(48, 20, 63));
        }
    }

    public static JG A03(int i10, int i11) {
        if (JG.A07.A02() == i11 && JG.A07.A03() == i10) {
            JG jg = JG.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return jg;
        }
        if (JG.A04.A02() == i11 && JG.A04.A03() == i10) {
            return JG.A04;
        }
        if (JG.A05.A02() == i11 && JG.A05.A03() == i10) {
            JG jg2 = JG.A05;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
            strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
            return jg2;
        }
        if (JG.A06.A02() == i11 && JG.A06.A03() == i10) {
            return JG.A06;
        }
        if (JG.A08.A02() == i11 && JG.A08.A03() == i10) {
            return JG.A08;
        }
        throw new IllegalArgumentException(A06(0, 48, 39));
    }

    public static JG A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static JI A05(JG jg) {
        JI adTemplate = A02.get(jg);
        if (adTemplate == null) {
            JI ji = JI.A0F;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
            strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
            return ji;
        }
        return adTemplate;
    }
}
