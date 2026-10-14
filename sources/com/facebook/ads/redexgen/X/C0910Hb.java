package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0910Hb {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"NtIRWyZV8H4fZGcEpCmcKf3IqD05aRmR", "GeJrrdqpTOChTmOZ0a7zD9rW5xWuwwPC", "fB9woPX", "60Ey3AJYIgulbHGVt5ok32wwr6OtRAhs", "ywmal8sml3QBlriqnsJwUXbJL0wOA6tO", "h15JbuXclRunjao1u8Y3u6XMQgnEqNxE", "VnL2Csv3rCYD2ISe0PbhclEmcnjJ2Dil", "pqWxkCx1Owc6AlIW11IRV9LZfrwFezHs"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01de  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:94:0x0203 A[LOOP:0: B:92:0x01fe->B:94:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0909Ha A06(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iA04;
        int iA05;
        boolean zA0A;
        long jA04;
        int i15;
        boolean zA0A2;
        int i16;
        int i17;
        String[] strArr;
        float f10;
        int iA06;
        float[] fArr;
        int iA07;
        int iA08;
        int iA09;
        int iA010;
        int i18;
        int i19;
        int i20;
        C0915Hg c0915Hg = new C0915Hg(bArr, i10, i11);
        c0915Hg.A07(8);
        int iA011 = c0915Hg.A05(8);
        c0915Hg.A07(16);
        int iA012 = c0915Hg.A04();
        int iA013 = 1;
        boolean zA0A3 = false;
        if (iA011 == 100) {
            iA013 = c0915Hg.A04();
            zA0A3 = iA013 == 3 ? c0915Hg.A0A() : false;
            c0915Hg.A04();
            c0915Hg.A04();
            c0915Hg.A06();
            if (c0915Hg.A0A()) {
                if (iA013 != 3) {
                    i12 = 8;
                } else {
                    i12 = 12;
                }
                for (i13 = 0; i13 < i12; i13++) {
                    if (c0915Hg.A0A()) {
                        if (i13 < 6) {
                            i14 = 16;
                        } else {
                            i14 = 64;
                        }
                        A09(c0915Hg, i14);
                    }
                }
            }
            int iA014 = c0915Hg.A04() + 4;
            iA04 = c0915Hg.A04();
            iA05 = 0;
            zA0A = false;
            if (iA04 == 0) {
                iA05 = c0915Hg.A04() + 4;
                if (A02[4].charAt(6) == 's') {
                    String[] strArr2 = A02;
                    strArr2[6] = "0FcrA39w8cpWUUBY0PhZdDl2WVIzmr3H";
                    strArr2[1] = "bEwoHyJue3o3gWd30VLAmFgh8fIWiG5R";
                }
            } else if (iA04 == 1) {
                zA0A = c0915Hg.A0A();
                c0915Hg.A03();
                c0915Hg.A03();
                jA04 = c0915Hg.A04();
                for (i15 = 0; i15 < jA04; i15++) {
                    c0915Hg.A04();
                }
            }
            c0915Hg.A04();
            c0915Hg.A06();
            int iA015 = c0915Hg.A04() + 1;
            int iA016 = c0915Hg.A04() + 1;
            zA0A2 = c0915Hg.A0A();
            int i21 = (2 - (zA0A2 ? 1 : 0)) * iA016;
            if (!zA0A2) {
                c0915Hg.A06();
            }
            c0915Hg.A06();
            i16 = iA015 * 16;
            i17 = i21 * 16;
            if (c0915Hg.A0A()) {
                int iA017 = c0915Hg.A04();
                int iA018 = c0915Hg.A04();
                iA09 = c0915Hg.A04();
                iA010 = c0915Hg.A04();
                if (iA013 == 0) {
                    i18 = 1;
                    i19 = 2 - (zA0A2 ? 1 : 0);
                } else {
                    if (iA013 == 3) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    i19 = (2 - (zA0A2 ? 1 : 0)) * (iA013 == 1 ? 2 : 1);
                }
                i20 = (iA017 + iA018) * i18;
                if (A02[2].length() != 30) {
                    String[] strArr3 = A02;
                    strArr3[6] = "K9ZSRxGlh7Ws8i4c0lKuIdr8XNNG4vGX";
                    strArr3[1] = "z3Vhx6GLQ83q5V050JhbnsU4vD8C98vT";
                    i16 -= i20;
                    i17 -= (iA09 + iA010) * i19;
                }
            } else {
                strArr = A02;
                if (strArr[6].charAt(16) != strArr[1].charAt(16)) {
                    String[] strArr4 = A02;
                    strArr4[6] = "rEmuJ6sFB5gWWdCI0T7L47ZB03FBkEHD";
                    strArr4[1] = "kUZJy2qQtWdVgeJj0t3oDkGmETEmhFuj";
                } else {
                    String[] strArr5 = A02;
                    strArr5[5] = "DSl3hQKuabn38CmnzrECcwmRq5HwdYpG";
                    strArr5[0] = "fA6X51zRtxq1lySt2ARPPLPLlCaXaXco";
                }
            }
            f10 = 1.0f;
            if (c0915Hg.A0A() && c0915Hg.A0A()) {
                iA06 = c0915Hg.A05(8);
                if (iA06 == 255) {
                    iA07 = c0915Hg.A05(16);
                    iA08 = c0915Hg.A05(16);
                    if (iA07 != 0 && iA08 != 0) {
                        f10 = iA07 / iA08;
                    }
                } else {
                    fArr = A04;
                    if (iA06 < fArr.length) {
                        f10 = fArr[iA06];
                    } else {
                        Log.w(A07(0, 11, 38), A07(11, 35, 89) + iA06);
                    }
                }
            }
            return new C0909Ha(iA012, i16, i17, f10, zA0A3, zA0A2, iA014, iA04, iA05, zA0A);
        }
        if (A02[4].charAt(6) == 's') {
            String[] strArr6 = A02;
            strArr6[5] = "yVhhMtRnqXgY1Kb3O7KmUsZDbX87nSR0";
            strArr6[0] = "CScaMkkS4ynj4HoVSfcs8Df7mB4vIw2E";
            if (iA011 == 110 || iA011 == 122 || iA011 == 244 || iA011 == 44 || iA011 == 83 || iA011 == 86) {
                iA013 = c0915Hg.A04();
                if (iA013 == 3) {
                }
                c0915Hg.A04();
                c0915Hg.A04();
                c0915Hg.A06();
                if (c0915Hg.A0A()) {
                    if (iA013 != 3) {
                        i12 = 8;
                    } else {
                        i12 = 12;
                    }
                    while (i13 < i12) {
                        if (c0915Hg.A0A()) {
                            if (i13 < 6) {
                                i14 = 16;
                            } else {
                                i14 = 64;
                            }
                            A09(c0915Hg, i14);
                        }
                    }
                }
            } else {
                String[] strArr7 = A02;
                if (strArr7[5].charAt(21) != strArr7[0].charAt(21)) {
                    A02[2] = "JhuiEkWh4gR2K7eJg";
                    if (iA011 != 118) {
                        if (iA011 != 128 || iA011 == 138) {
                        }
                    }
                } else if (iA011 != 118) {
                    if (iA011 != 128) {
                    }
                }
                iA013 = c0915Hg.A04();
                if (iA013 == 3) {
                }
                c0915Hg.A04();
                c0915Hg.A04();
                c0915Hg.A06();
                if (c0915Hg.A0A()) {
                    if (iA013 != 3) {
                        i12 = 8;
                    } else {
                        i12 = 12;
                    }
                    while (i13 < i12) {
                        if (c0915Hg.A0A()) {
                            if (i13 < 6) {
                                i14 = 16;
                            } else {
                                i14 = 64;
                            }
                            A09(c0915Hg, i14);
                        }
                    }
                }
            }
            int iA019 = c0915Hg.A04() + 4;
            iA04 = c0915Hg.A04();
            iA05 = 0;
            zA0A = false;
            if (iA04 == 0) {
                iA05 = c0915Hg.A04() + 4;
                if (A02[4].charAt(6) == 's') {
                    String[] strArr8 = A02;
                    strArr8[6] = "0FcrA39w8cpWUUBY0PhZdDl2WVIzmr3H";
                    strArr8[1] = "bEwoHyJue3o3gWd30VLAmFgh8fIWiG5R";
                }
            } else if (iA04 == 1) {
                zA0A = c0915Hg.A0A();
                c0915Hg.A03();
                c0915Hg.A03();
                jA04 = c0915Hg.A04();
                while (i15 < jA04) {
                    c0915Hg.A04();
                }
            }
            c0915Hg.A04();
            c0915Hg.A06();
            int iA0110 = c0915Hg.A04() + 1;
            int iA0111 = c0915Hg.A04() + 1;
            zA0A2 = c0915Hg.A0A();
            int i22 = (2 - (zA0A2 ? 1 : 0)) * iA0111;
            if (!zA0A2) {
                c0915Hg.A06();
            }
            c0915Hg.A06();
            i16 = iA0110 * 16;
            i17 = i22 * 16;
            if (c0915Hg.A0A()) {
                int iA0112 = c0915Hg.A04();
                int iA0113 = c0915Hg.A04();
                iA09 = c0915Hg.A04();
                iA010 = c0915Hg.A04();
                if (iA013 == 0) {
                    i18 = 1;
                    i19 = 2 - (zA0A2 ? 1 : 0);
                } else {
                    if (iA013 == 3) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    i19 = (2 - (zA0A2 ? 1 : 0)) * (iA013 == 1 ? 2 : 1);
                }
                i20 = (iA0112 + iA0113) * i18;
                if (A02[2].length() != 30) {
                    String[] strArr9 = A02;
                    strArr9[6] = "K9ZSRxGlh7Ws8i4c0lKuIdr8XNNG4vGX";
                    strArr9[1] = "z3Vhx6GLQ83q5V050JhbnsU4vD8C98vT";
                    i16 -= i20;
                    i17 -= (iA09 + iA010) * i19;
                }
            } else {
                strArr = A02;
                if (strArr[6].charAt(16) != strArr[1].charAt(16)) {
                    String[] strArr10 = A02;
                    strArr10[6] = "rEmuJ6sFB5gWWdCI0T7L47ZB03FBkEHD";
                    strArr10[1] = "kUZJy2qQtWdVgeJj0t3oDkGmETEmhFuj";
                } else {
                    String[] strArr11 = A02;
                    strArr11[5] = "DSl3hQKuabn38CmnzrECcwmRq5HwdYpG";
                    strArr11[0] = "fA6X51zRtxq1lySt2ARPPLPLlCaXaXco";
                }
            }
            f10 = 1.0f;
            if (c0915Hg.A0A()) {
                iA06 = c0915Hg.A05(8);
                if (iA06 == 255) {
                    iA07 = c0915Hg.A05(16);
                    iA08 = c0915Hg.A05(16);
                    if (iA07 != 0) {
                        f10 = iA07 / iA08;
                    }
                } else {
                    fArr = A04;
                    if (iA06 < fArr.length) {
                        f10 = fArr[iA06];
                    } else {
                        Log.w(A07(0, 11, 38), A07(11, 35, 89) + iA06);
                    }
                }
            }
            return new C0909Ha(iA012, i16, i17, f10, zA0A3, zA0A2, iA019, iA04, iA05, zA0A);
        }
        throw new RuntimeException();
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{117, 90, 87, 110, 85, 82, 79, 110, 79, 82, 87, 17, 42, 33, 60, 52, 33, 39, 48, 33, 32, 100, 37, 55, 52, 33, 39, 48, Ascii.ESC, 54, 37, 48, 45, 43, Ascii.ESC, 45, 32, 39, 100, 50, 37, 40, 49, 33, 126, 100, Ascii.RS, 1, 12, 13, 7, 71, 9, Ascii.RS, 11, 85, 74, 71, 70, 76, 12, 75, 70, 85, 64};
    }

    static {
        A08();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static int A02(byte[] bArr, int i10) {
        int i11;
        synchronized (A05) {
            int scratchEscapeCount = 0;
            int i12 = 0;
            while (scratchEscapeCount < i10) {
                scratchEscapeCount = A03(bArr, scratchEscapeCount, i10);
                if (scratchEscapeCount < i10) {
                    int[] iArr = A01;
                    if (iArr.length <= i12) {
                        A01 = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    A01[i12] = scratchEscapeCount;
                    scratchEscapeCount += 3;
                    i12++;
                }
            }
            i11 = i10 - i12;
            int unescapedPosition = 0;
            int escapedPosition = 0;
            for (int unescapedLength = 0; unescapedLength < i12; unescapedLength++) {
                int scratchEscapeCount2 = A01[unescapedLength];
                int scratchEscapeCount3 = scratchEscapeCount2 - unescapedPosition;
                System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, scratchEscapeCount3);
                int escapedPosition2 = escapedPosition + scratchEscapeCount3;
                int position = escapedPosition2 + 1;
                bArr[escapedPosition2] = 0;
                escapedPosition = position + 1;
                bArr[position] = 0;
                unescapedPosition += scratchEscapeCount3 + 3;
            }
            System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, i11 - escapedPosition);
        }
        return i11;
    }

    public static int A03(byte[] bArr, int i10, int i11) {
        while (i10 < i) {
            int i12 = bArr[i10];
            if (i12 == 0) {
                int i13 = i10 + 1;
                if (bArr[i13] == 0) {
                    int i14 = i10 + 2;
                    if (bArr[i14] == 3) {
                        return i10;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0129  */
    /* JADX WARN: Code duplicated, block: B:94:0x012b  */
    public static int A04(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        int i12 = i11 - i10;
        HG.A04(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr != null) {
            if (zArr[0]) {
                A0B(zArr);
                int length = i10 - 3;
                return length;
            }
            if (i12 > 1 && zArr[1]) {
                int length2 = bArr[i10];
                if (length2 == 1) {
                    A0B(zArr);
                    int length3 = i10 - 2;
                    return length3;
                }
            }
            if (i12 > 2 && zArr[2]) {
                int length4 = bArr[i10];
                if (length4 == 0) {
                    int length5 = i10 + 1;
                    if (bArr[length5] == 1) {
                        A0B(zArr);
                        int length6 = i10 - 1;
                        return length6;
                    }
                }
            }
        }
        int limit = i11 - 1;
        int i13 = i10 + 2;
        while (i13 < limit) {
            int length7 = bArr[i13];
            if ((length7 & 254) == 0) {
                int length8 = i13 - 2;
                if (bArr[length8] == 0) {
                    int length9 = i13 - 1;
                    if (bArr[length9] == 0) {
                        int length10 = bArr[i13];
                        if (length10 == 1) {
                            if (zArr != null) {
                                A0B(zArr);
                            }
                            int i14 = i13 - 2;
                            if (A02[2].length() != 30) {
                                String[] strArr = A02;
                                strArr[5] = "cwZIqZ1AW63JkQ3pIqo9DKAUVDIU8B2n";
                                strArr[0] = "C4ULzJ2O8tT1dK0koFoE4t7X4OAunQC5";
                                return i14;
                            }
                            throw new RuntimeException();
                        }
                    }
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        if (zArr != null) {
            if (i12 > 2) {
                int length11 = i11 - 3;
                if (bArr[length11] == 0) {
                    int length12 = i11 - 2;
                    byte b10 = bArr[length12];
                    String[] strArr2 = A02;
                    String str = strArr2[6];
                    String str2 = strArr2[1];
                    int iCharAt = str.charAt(16);
                    int length13 = str2.charAt(16);
                    if (iCharAt == length13) {
                        String[] strArr3 = A02;
                        strArr3[5] = "3nijOMlfzKgjywxgx1aIEuQEOVvcrnGF";
                        strArr3[0] = "mhxYTAHU7iRAJ8bI14cg8xnokscJO5gc";
                        if (b10 == 0) {
                            int length14 = i11 - 1;
                            byte b11 = bArr[length14];
                            String[] strArr4 = A02;
                            String str3 = strArr4[5];
                            String str4 = strArr4[0];
                            int iCharAt2 = str3.charAt(21);
                            int length15 = str4.charAt(21);
                            if (iCharAt2 == length15) {
                                throw new RuntimeException();
                            }
                            String[] strArr5 = A02;
                            strArr5[3] = "9ZCFGjZIw1dXFFVp2oTHQfikOa97hWgs";
                            strArr5[7] = "4W5bkIHCCYZDsaIH6FljQxOPKIhpSySs";
                            if (b11 == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    throw new RuntimeException();
                }
                z10 = false;
            } else if (i12 == 2) {
                if (zArr[2]) {
                    int length16 = i11 - 2;
                    if (bArr[length16] == 0) {
                        int length17 = i11 - 1;
                        if (bArr[length17] == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else if (zArr[1]) {
                int length18 = i11 - 1;
                if (bArr[length18] == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            zArr[0] = z10;
            if (i12 > 1) {
                int length19 = i11 - 2;
                if (bArr[length19] == 0) {
                    int length20 = i11 - 1;
                    if (bArr[length20] == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            } else if (zArr[2]) {
                int length21 = i11 - 1;
                if (bArr[length21] == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            zArr[1] = z11;
            int length22 = i11 - 1;
            zArr[2] = bArr[length22] == 0;
        }
        return i11;
    }

    public static HZ A05(byte[] bArr, int i10, int i11) {
        C0915Hg c0915Hg = new C0915Hg(bArr, i10, i11);
        c0915Hg.A07(8);
        int iA04 = c0915Hg.A04();
        int seqParameterSetId = c0915Hg.A04();
        c0915Hg.A06();
        return new HZ(iA04, seqParameterSetId, c0915Hg.A0A());
    }

    public static void A09(C0915Hg c0915Hg, int i10) {
        int i11 = 8;
        int deltaScale = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (deltaScale != 0) {
                int lastScale = c0915Hg.A03();
                deltaScale = ((lastScale + i11) + 256) % 256;
            }
            if (deltaScale != 0) {
                i11 = deltaScale;
            }
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[1];
            int nextScale = str.charAt(16);
            int lastScale2 = str2.charAt(16);
            if (nextScale != lastScale2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "KXMRoqtdhshm8G74asFo5uqDFob0Iegs";
            strArr2[7] = "VTZDrARlCd8p2vM8k7YrNOP12vylJmks";
        }
    }

    public static void A0A(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (length < iPosition) {
            int length = byteBuffer.get(i11);
            int value = length & 255;
            if (i10 == 3) {
                int consecutiveZeros = A02[4].charAt(6);
                if (consecutiveZeros != 115) {
                    throw new RuntimeException();
                }
                A02[2] = "cLm552F16buuPP9xMufxVHaN";
                if (value == 1) {
                    int length2 = i11 + 1;
                    int consecutiveZeros2 = byteBuffer.get(length2) & 31;
                    if (consecutiveZeros2 == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        int length3 = i11 - 3;
                        byteBufferDuplicate.position(length3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        int consecutiveZeros3 = A02[4].charAt(6);
                        if (consecutiveZeros3 != 115) {
                            String[] strArr = A02;
                            strArr[3] = "6nmXEFQWU8IXvuDOHtOk9CPNFswxHRRs";
                            strArr[7] = "sRzFReGlCKeKmBP91kaLZyOllIcQLpOs";
                            return;
                        } else {
                            String[] strArr2 = A02;
                            strArr2[5] = "MM5ABksrrLy98KCtfJajpuklss5i1OmF";
                            strArr2[0] = "sCLzk23Fd4ag3qXWex39LdUh6FJSiknG";
                            return;
                        }
                    }
                }
            } else if (value == 0) {
                i10++;
            }
            if (value != 0) {
                i10 = 0;
            }
            i11++;
        }
        byteBuffer.clear();
    }

    public static void A0B(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0C(String str, byte b10) {
        if (A07(46, 9, 117).equals(str) && (b10 & Ascii.US) == 6) {
            return true;
        }
        return A07(55, 10, 62).equals(str) && ((b10 & 126) >> 1) == 39;
    }
}
