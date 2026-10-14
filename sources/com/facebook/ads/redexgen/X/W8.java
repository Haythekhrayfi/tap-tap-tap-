package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0803Cr {
    public static byte[] A02;
    public static String[] A03 = {"W3zpeZwD9Fi1kBaR", "uMdULlbYt84VxY86rM0TiEJbhaqKcXZ1", "Usin4k2UYlEJmIUoIPMyl4MixoDpG9ii", "hBZpg4XSGRsBFeFqV0aqL6EoVOREEldE", "UimonN4w5kzXtUMO8SJw69s6gFNeuD2Z", "uuKAqm4Yer5CcRyJ", "zRTcmdaM3Tn4RRVoPrSr5tVrwuK6PMWw", "taTU185R1PVUiY2ntZzDAqagtcVNoAEE"};
    public final int A00;
    public final List<Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C0800Cn A00(C0802Cq c0802Cq) {
        String strA01;
        int i10;
        if (A03(32)) {
            return new C0800Cn(this.A01);
        }
        C0914Hf c0914Hf = new C0914Hf(c0802Cq.A03);
        List<Format> arrayList = this.A01;
        while (c0914Hf.A04() > 0) {
            int iA0E = c0914Hf.A0E();
            int iA06 = c0914Hf.A06() + c0914Hf.A0E();
            if (iA0E == 134) {
                arrayList = new ArrayList<>();
                int iA0E2 = c0914Hf.A0E() & 31;
                for (int i11 = 0; i11 < iA0E2; i11++) {
                    String strA0S = c0914Hf.A0S(3);
                    int iA0E3 = c0914Hf.A0E();
                    if ((iA0E3 & 128) != 0) {
                        strA01 = A01(19, 19, 101);
                        i10 = iA0E3 & 63;
                    } else {
                        strA01 = A01(0, 19, 66);
                        i10 = 1;
                    }
                    arrayList.add(Format.A08(null, strA01, null, -1, 0, strA0S, i10, null));
                    c0914Hf.A0Z(2);
                }
            }
            c0914Hf.A0Y(iA06);
        }
        return new C0800Cn(arrayList);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{16, 1, 1, Ascii.GS, Ascii.CAN, 18, 16, 5, Ascii.CAN, Ascii.RS, Ascii.US, 94, 18, 20, 16, 92, 71, 65, 73, 55, 38, 38, 58, 63, 53, 55, 34, 63, 57, 56, 121, 53, 51, 55, 123, 97, 102, 110};
    }

    static {
        A02();
    }

    public W8() {
        this(0);
    }

    public W8(int i10) {
        this(i10, Collections.emptyList());
    }

    public W8(int i10, List<Format> list) {
        this.A00 = i10;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 66), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0803Cr
    public final SparseArray<InterfaceC0805Ct> A4Z() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0803Cr
    public final InterfaceC0805Ct A4e(int i10, C0802Cq c0802Cq) {
        switch (i10) {
            case 2:
                return new C1288Vz(new W5());
            case 3:
            case 4:
                return new C1288Vz(new W0(c0802Cq.A01));
            case 15:
                if (A03(2)) {
                    return null;
                }
                return new C1288Vz(new W9(false, c0802Cq.A01));
            case 17:
                boolean zA03 = A03(2);
                String[] strArr = A03;
                if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "Zsc3HcoanD4hgKlowrimr1mcCeCJ4aqm";
                strArr2[6] = "fbfbpCk06enibsJo0cAFVF7ae3oKLvDz";
                if (zA03) {
                    return null;
                }
                return new C1288Vz(new W1(c0802Cq.A01));
            case 21:
                return new C1288Vz(new W2());
            case 27:
                boolean zA04 = A03(4);
                String[] strArr3 = A03;
                if (strArr3[7].charAt(13) != strArr3[1].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[2] = "MnHqmUaQQZIE89AoLzdx0BMakHNAXRZh";
                strArr4[6] = "UBVzW5fdc0gZ9W3oa8if0wBLwl14wyCB";
                if (zA04) {
                    return null;
                }
                return new C1288Vz(new W4(A00(c0802Cq), A03(1), A03(8)));
            case 36:
                return new C1288Vz(new W3(A00(c0802Cq)));
            case 89:
                return new C1288Vz(new W6(c0802Cq.A02));
            case 129:
            case 135:
                return new C1288Vz(new WC(c0802Cq.A01));
            case 130:
            case 138:
                return new C1288Vz(new W7(c0802Cq.A01));
            case 134:
                if (A03(16)) {
                    return null;
                }
                return new C1285Vw(new C1284Vv());
            default:
                return null;
        }
    }
}
