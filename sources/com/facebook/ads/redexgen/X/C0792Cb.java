package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0792Cb {
    public static byte[] A00;
    public static String[] A01 = {"7VlHbmI4sHauhoCWaFlUZM9mZRV70mzp", "LqGkn09UNvdqUAgssIpSCyoRJ1iI6QKK", "ZmFU8Mfu7g0bs6JKYNiQ5l9NQyV6", "IM1BduvbFOrOx4pkelis2wS2axXVXfJJ", "7P5Q", "68Q2Pgf", "FTYWHoYlDOl1N68V4e618z2hAoSaWMYg", "QxGNaBvq4MkZwy6AnQRq9NbnhINTK41p"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0791Ca A04(C0914Hf c0914Hf) throws C07249b {
        A0A(1, c0914Hf, false);
        long jA0K = c0914Hf.A0K();
        int iA0E = c0914Hf.A0E();
        long jA0K2 = c0914Hf.A0K();
        int iA0A = c0914Hf.A0A();
        int iA0A2 = c0914Hf.A0A();
        int iA0A3 = c0914Hf.A0A();
        int iA0E2 = c0914Hf.A0E();
        return new C0791Ca(jA0K, iA0E, jA0K2, iA0A, iA0A2, iA0A3, (int) Math.pow(2.0d, iA0E2 & 15), (int) Math.pow(2.0d, (iA0E2 & 240) >> 4), (c0914Hf.A0E() & 1) > 0, Arrays.copyOf(c0914Hf.A00, c0914Hf.A07()));
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{116, 77, 80, 64, 75, 81, 119, 86, 75, 78, Ascii.FS, 1, 9, Ascii.FS, Ascii.SUB, 13, Ascii.FS, Ascii.GS, 89, Ascii.SUB, 17, Ascii.CAN, 11, Ascii.CAN, Ascii.SUB, 13, Ascii.FS, 11, 10, 89, 94, 15, 22, 11, Ascii.ESC, 16, 10, 94, 87, 74, 66, 87, 81, 70, 87, 86, 18, 81, 93, 86, 87, 18, 80, 93, 93, 89, 18, 70, 93, 18, 65, 70, 83, 64, 70, 18, 69, 91, 70, 90, 18, 105, 2, 74, 7, 4, Ascii.RS, 18, 2, 74, 6, 1, Ascii.RS, 18, 2, 74, 6, 0, 111, 18, 83, 70, 18, 78, 83, 91, 78, 72, 95, 78, 79, 11, 67, 78, 74, 79, 78, 89, 11, 95, 82, 91, 78, 11, 70, 76, 79, 79, 82, 0, 84, 89, 80, 69, 0, 71, 82, 69, 65, 84, 69, 82, 0, 84, 72, 65, 78, 0, 17, 0, 78, 79, 84, 0, 68, 69, 67, 79, 68, 65, 66, 76, 69, Ascii.SUB, 0, 49, 37, 54, 58, 62, 57, 48, 119, 53, 62, 35, 119, 54, 49, 35, 50, 37, 119, 58, 56, 51, 50, 36, 119, 57, 56, 35, 119, 36, 50, 35, 119, 54, 36, 119, 50, 47, 39, 50, 52, 35, 50, 51, 48, 36, 55, 59, 63, 56, 49, 118, 52, 63, 34, 118, 51, 46, 38, 51, 53, 34, 51, 50, 118, 34, 57, 118, 52, 51, 118, 37, 51, 34, 16, 19, 19, 23, 9, 12, 92, 8, 5, 12, Ascii.EM, 92, Ascii.ESC, 14, Ascii.EM, Ascii.GS, 8, Ascii.EM, 14, 92, 8, 20, Ascii.GS, 18, 92, 78, 92, 18, 19, 8, 92, Ascii.CAN, Ascii.EM, Ascii.US, 19, Ascii.CAN, Ascii.GS, Ascii.RS, 16, Ascii.EM, 70, 92, 104, 100, 117, 117, 108, 107, 98, 37, 113, 124, 117, 96, 37, 106, 113, 109, 96, 119, 37, 113, 109, 100, 107, 37, 53, 37, 107, 106, 113, 37, 118, 112, 117, 117, 106, 119, 113, 96, 97, 63, 37, 93, 65, 76, 78, 72, 69, 66, 65, 73, 72, 95, 13, 66, 75, 13, 89, 68, 64, 72, 13, 73, 66, 64, 76, 68, 67, 13, 89, 95, 76, 67, 94, 75, 66, 95, 64, 94, 13, 67, 66, 89, 13, 87, 72, 95, 66, 72, 73, 13, 66, 88, 89, 114, 101, 115, 105, 100, 117, 101, 84, 121, 112, 101, 32, 103, 114, 101, 97, 116, 101, 114, 32, 116, 104, 97, 110, 32, 50, 32, 105, 115, 32, 110, 111, 116, 32, 100, 101, 99, 111, 100, 97, 98, 108, 101, 107, 112, 63, 109, 122, 108, 122, 109, 105, 122, 123, 63, 125, 118, 107, 108, 63, 114, 106, 108, 107, 63, 125, 122, 63, 101, 122, 109, 112, 63, 126, 121, 107, 122, 109, 63, 114, 126, 111, 111, 118, 113, 120, 63, 124, 112, 106, 111, 115, 118, 113, 120, 63, 108, 107, 122, 111, 108, 82, 73, 73, 6, 85, 78, 73, 84, 82, 6, 78, 67, 71, 66, 67, 84, Ascii.FS, 6};
        if (A01[2].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "mgdhOJqoKNbrHZTmAlzuBC741swozh2A";
        strArr[0] = "We2DdWBOrlseFOiGq0myNglhwb5nF2sN";
    }

    static {
        A06();
    }

    public static int A00(int i10) {
        int val = 0;
        while (i10 > 0) {
            val++;
            i10 >>>= 1;
        }
        return val;
    }

    public static long A01(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (r12 <= 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (r12 == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r12 != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        r14.A03(32);
        r14.A03(32);
        r4 = r14.A02(4) + 1;
        r14.A03(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r12 != 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r9 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        r0 = A01(r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        r0 = (int) (((long) r4) * r0);
        r14.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        return new com.facebook.ads.redexgen.X.CX(r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        r0 = ((long) r10) * ((long) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        if (r12 <= 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        throw new com.facebook.ads.redexgen.X.C07249b(A05(228, 42, 126) + r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.CX A02(com.facebook.ads.redexgen.X.CV r14) throws com.facebook.ads.redexgen.X.C07249b {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0792Cb.A02(com.facebook.ads.redexgen.X.CV):com.facebook.ads.redexgen.X.CX");
    }

    public static CY A03(C0914Hf c0914Hf) throws C07249b {
        A0A(3, c0914Hf, false);
        int length = (int) c0914Hf.A0K();
        String strA0S = c0914Hf.A0S(length);
        int length2 = strA0S.length();
        int i10 = 7 + 4 + length2;
        long jA0K = c0914Hf.A0K();
        int length3 = (int) jA0K;
        String[] strArr = new String[length3];
        int i11 = i10 + 4;
        int i12 = 0;
        while (true) {
            long j10 = i12;
            if (A01[3].charAt(18) != 'i') {
                throw new RuntimeException();
            }
            A01[5] = "ziwCMa4";
            if (j10 < jA0K) {
                int length4 = (int) c0914Hf.A0K();
                strArr[i12] = c0914Hf.A0S(length4);
                int length5 = strArr[i12].length();
                i11 = i11 + 4 + length5;
                i12++;
            } else {
                int length6 = c0914Hf.A0E();
                if ((length6 & 1) != 0) {
                    return new CY(strA0S, strArr, i11 + 1);
                }
                String vendor = A05(198, 30, 84);
                throw new C07249b(vendor);
            }
        }
    }

    public static void A07(int i10, CV cv) throws C07249b {
        int j10;
        int iA02 = cv.A02(6) + 1;
        for (int i11 = 0; i11 < iA02; i11++) {
            int iA03 = cv.A02(16);
            switch (iA03) {
                case 0:
                    if (cv.A04()) {
                        j10 = cv.A02(4) + 1;
                    } else {
                        j10 = 1;
                    }
                    if (cv.A04()) {
                        int i12 = cv.A02(8);
                        int i13 = i12 + 1;
                        for (int i14 = 0; i14 < i13; i14++) {
                            int mappingsCount = i10 - 1;
                            cv.A03(A00(mappingsCount));
                            int mappingsCount2 = i10 - 1;
                            cv.A03(A00(mappingsCount2));
                        }
                    }
                    int mappingsCount3 = cv.A02(2);
                    if (mappingsCount3 == 0) {
                        if (j10 > 1) {
                            for (int i15 = 0; i15 < i10; i15++) {
                                cv.A03(4);
                                String[] strArr = A01;
                                String str = strArr[6];
                                String str2 = strArr[0];
                                int iCharAt = str.charAt(31);
                                int mappingsCount4 = str2.charAt(31);
                                if (iCharAt == mappingsCount4) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A01;
                                strArr2[6] = "Wlyx46da0LhUJCMQF7d9pJYsMbXYpIdM";
                                strArr2[0] = "HglI0wxUFDuveiNJ2qiTiY5BYhneBiG1";
                            }
                        }
                        for (int mappingsCount5 = 0; mappingsCount5 < j10; mappingsCount5++) {
                            cv.A03(8);
                            cv.A03(8);
                            cv.A03(8);
                        }
                    } else {
                        throw new C07249b(A05(406, 58, 29));
                    }
                    break;
                default:
                    Log.e(A05(0, 10, 32), A05(270, 41, 7) + iA03);
                    break;
            }
        }
    }

    public static void A08(CV cv) throws C07249b {
        int iA02 = cv.A02(6) + 1;
        for (int maximumClass = 0; maximumClass < iA02; maximumClass++) {
            int floorType = cv.A02(16);
            switch (floorType) {
                case 0:
                    cv.A03(8);
                    cv.A03(16);
                    cv.A03(16);
                    cv.A03(6);
                    cv.A03(8);
                    int floorCount = cv.A02(4);
                    int floorCount2 = floorCount + 1;
                    for (int i10 = 0; i10 < floorCount2; i10++) {
                        cv.A03(8);
                    }
                    break;
                case 1:
                    int count = cv.A02(5);
                    int i11 = -1;
                    int[] iArr = new int[count];
                    for (int floorCount3 = 0; floorCount3 < count; floorCount3++) {
                        iArr[floorCount3] = cv.A02(4);
                        if (iArr[floorCount3] > i11) {
                            i11 = iArr[floorCount3];
                        }
                    }
                    int[] iArr2 = new int[i11 + 1];
                    for (int i12 = 0; i12 < iArr2.length; i12++) {
                        iArr2[i12] = cv.A02(3) + 1;
                        int iA03 = cv.A02(2);
                        if (iA03 > 0) {
                            cv.A03(8);
                        }
                        for (int floorCount4 = 0; floorCount4 < (1 << iA03); floorCount4++) {
                            cv.A03(8);
                        }
                    }
                    cv.A03(2);
                    int partitions = cv.A02(4);
                    int i13 = 0;
                    int floorCount5 = 0;
                    for (int i14 = 0; i14 < count; i14++) {
                        i13 += iArr2[iArr[i14]];
                        while (floorCount5 < i13) {
                            cv.A03(partitions);
                            floorCount5++;
                        }
                    }
                    break;
                default:
                    throw new C07249b(A05(114, 41, 34) + floorType);
            }
        }
    }

    public static void A09(CV cv) throws C07249b {
        int iA02 = cv.A02(6) + 1;
        for (int i10 = 0; i10 < iA02; i10++) {
            int residueCount = cv.A02(16);
            if (residueCount <= 2) {
                cv.A03(24);
                cv.A03(24);
                cv.A03(24);
                int iA03 = cv.A02(6) + 1;
                cv.A03(8);
                int[] iArr = new int[iA03];
                for (int i11 = 0; i11 < iA03; i11++) {
                    int iA04 = 0;
                    int residueCount2 = cv.A02(3);
                    if (cv.A04()) {
                        iA04 = cv.A02(5);
                    }
                    iArr[i11] = (iA04 * 8) + residueCount2;
                }
                for (int i12 = 0; i12 < iA03; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        int residueCount3 = iArr[i12];
                        if ((residueCount3 & (1 << i13)) != 0) {
                            cv.A03(8);
                        }
                    }
                }
            } else {
                throw new C07249b(A05(363, 43, 2));
            }
        }
    }

    public static boolean A0A(int i10, C0914Hf c0914Hf, boolean z10) throws C07249b {
        if (c0914Hf.A04() < 7) {
            if (z10) {
                return false;
            }
            throw new C07249b(A05(464, 18, 36) + c0914Hf.A04());
        }
        if (c0914Hf.A0E() != i10) {
            if (z10) {
                return false;
            }
            throw new C07249b(A05(93, 21, 41) + Integer.toHexString(i10));
        }
        if (c0914Hf.A0E() != 118 || c0914Hf.A0E() != 111 || c0914Hf.A0E() != 114 || c0914Hf.A0E() != 98 || c0914Hf.A0E() != 105 || c0914Hf.A0E() != 115) {
            if (z10) {
                return false;
            }
            throw new C07249b(A05(10, 28, 123));
        }
        return true;
    }

    public static CZ[] A0B(CV cv) {
        int iA02 = cv.A02(6) + 1;
        CZ[] czArr = new CZ[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            boolean zA04 = cv.A04();
            int iA03 = cv.A02(16);
            int i10 = cv.A02(16);
            czArr[windowType] = new CZ(zA04, iA03, i10, cv.A02(8));
        }
        return czArr;
    }

    public static CZ[] A0C(C0914Hf c0914Hf, int i10) throws C07249b {
        A0A(5, c0914Hf, false);
        int iA0E = c0914Hf.A0E() + 1;
        CV cv = new CV(c0914Hf.A00);
        int numberOfBooks = c0914Hf.A06();
        cv.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < iA0E; numberOfBooks2++) {
            A02(cv);
        }
        int numberOfBooks3 = cv.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i11 = 0; i11 < timeCount; i11++) {
            int numberOfBooks4 = cv.A02(16);
            if (numberOfBooks4 != 0) {
                throw new C07249b(A05(311, 52, 47));
            }
        }
        A08(cv);
        A09(cv);
        A07(i10, cv);
        CZ[] czArrA0B = A0B(cv);
        if (cv.A04()) {
            return czArrA0B;
        }
        throw new C07249b(A05(155, 43, 85));
    }
}
