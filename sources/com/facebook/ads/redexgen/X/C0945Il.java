package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0945Il {
    public static byte[] A02;
    public static String[] A03 = {"0EK1zjbC0rvKFRySirHuNeKu7O6M1c2K", "EZ3WTNSY5ayWns4cE", "iOTwBXJJn2mTXQ1MI7WizzznsNyhmcwj", "DnXRTJeCR1MDANpnyW3y9Xegmk", "0BaBrbX1x0DXsftKwoONmcZPElrNX48m", "JdhHjDAP4IE4TNrXk8Fag99Jau", "kO1FJ5pbtA78NTGKnINecVB8MAIDEUuG", "0uD1E8KeZOnBJibGqVh9DEewsO4i87jr"};
    public final InterfaceC0937Id A00;
    public final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[4].charAt(5) != 'b') {
                throw new RuntimeException();
            }
            A03[4] = "OpSsMbmoyiuJLyOxEkBMoj5ebplLMUgU";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 40);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{Ascii.CAN, Ascii.RS, 9, Ascii.US, 18, Ascii.ESC, 14};
    }

    static {
        A01();
    }

    public C0945Il(String str, InterfaceC0937Id interfaceC0937Id) {
        this.A01 = str;
        this.A00 = interfaceC0937Id;
    }

    public static void A02(EnumC0944Ik enumC0944Ik, Map<String, String> map, String str, InterfaceC0937Id interfaceC0937Id) {
        A03(enumC0944Ik.A02(), map, str, interfaceC0937Id);
    }

    public static void A03(String str, Map<String, String> map, String str2, InterfaceC0937Id interfaceC0937Id) {
        if (!C0947In.A0B(str2, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 67), str);
        interfaceC0937Id.A9N(str2, map);
    }

    public final void A04(EnumC0944Ik enumC0944Ik, Map<String, String> data) {
        A05(enumC0944Ik.A02(), data);
    }

    public final void A05(String str, Map<String, String> data) {
        A03(str, data, this.A01, this.A00);
    }
}
