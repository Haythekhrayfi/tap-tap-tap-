package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1Z {
    public static byte[] A01;
    public static final /* synthetic */ C1Z[] A02;
    public static final C1Z A03;
    public static final C1Z A04;
    public static final C1Z A05;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{Ascii.CAN, 23, 18, Ascii.ESC, 1, 14, 12, Ascii.ESC, Ascii.GS, Ascii.US, Ascii.GS, 22, Ascii.ESC, 3, 1, Ascii.FS, 11, 10, 12, 3, 1, 22, 16, 18, 16, Ascii.ESC, 22, 119, 101, 98, 118, 105, 101, 119, Ascii.DEL, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        C1Z c1z = new C1Z(strA01, 0, strA01);
        A05 = c1z;
        String strA02 = A01(13, 14, 115);
        C1Z c1z2 = new C1Z(strA02, 1, strA02);
        A04 = c1z2;
        String strA03 = A01(0, 13, 126);
        C1Z c1z3 = new C1Z(strA03, 2, strA03);
        A03 = c1z3;
        A02 = new C1Z[]{c1z, c1z2, c1z3};
    }

    public C1Z(String str, int i10, String str2) {
        super(str, i10);
        this.A00 = str2;
    }

    public static C1Z A00(String str) {
        for (C1Z c1z : values()) {
            if (c1z.A00.equalsIgnoreCase(str)) {
                return c1z;
            }
        }
        return A03;
    }

    public static C1Z valueOf(String str) {
        return (C1Z) Enum.valueOf(C1Z.class, str);
    }

    public static C1Z[] values() {
        return (C1Z[]) A02.clone();
    }
}
