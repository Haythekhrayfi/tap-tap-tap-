package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A6 {
    public static byte[] A00;
    public static String[] A01 = {"sCxx5L5gWudXPe4xp1ThsNryHSmynjHF", "9Nf9uybzHO2S6jQpjiGasa9ZwcLHyUhN", "2aneS77IEDbgq", "fX6HyBPcmxgssJA51nXZ3qA", "", "AlikR2RGcjs8IOnjMv6bsO9qZZebDHqD", "DHEXyDlkH8L0aTNQHdBgfWGXbAOYtdTx", "PJLs5pK7Ccf4tt9LWMwQ38VoV6l96kFD"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A07(C0914Hf c0914Hf, String str, String str2, DrmInitData drmInitData) {
        int i10 = A05[(c0914Hf.A0E() & 192) >> 6];
        int iA0E = c0914Hf.A0E();
        int i11 = A04[(iA0E & 56) >> 3];
        if ((iA0E & 4) != 0) {
            i11++;
        }
        return Format.A07(str, A0A(0, 9, 26), null, -1, -1, i11, i10, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A08(C0914Hf c0914Hf, String str, String str2, DrmInitData drmInitData) {
        c0914Hf.A0Z(2);
        int i10 = A05[(c0914Hf.A0E() & 192) >> 6];
        int iA0E = c0914Hf.A0E();
        int i11 = A04[(iA0E & 14) >> 1];
        if ((iA0E & 1) != 0) {
            i11++;
        }
        if (((c0914Hf.A0E() & 30) >> 1) > 0 && (c0914Hf.A0E() & 2) != 0) {
            i11 += 2;
        }
        String strA0A = A0A(9, 10, 48);
        if (c0914Hf.A04() > 0 && (c0914Hf.A0E() & 1) != 0) {
            strA0A = A0A(19, 14, 124);
        }
        return Format.A07(str, strA0A, null, -1, -1, i11, i10, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0207  */
    /* JADX WARN: Code duplicated, block: B:160:0x0273  */
    /* JADX WARN: Code duplicated, block: B:162:0x027d  */
    /* JADX WARN: Code duplicated, block: B:164:0x028e  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a9  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static A5 A09(C0913He c0913He) {
        String strA0A;
        int iA01;
        int i10;
        int i11;
        int i12;
        int i13;
        int iA04;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iA03 = c0913He.A03();
        c0913He.A08(40);
        boolean z10 = c0913He.A04(5) == 16;
        c0913He.A07(iA03);
        int i20 = -1;
        if (!z10) {
            strA0A = A0A(0, 9, 26);
            c0913He.A08(32);
            int iA05 = c0913He.A04(2);
            iA01 = A01(iA05, c0913He.A04(6));
            c0913He.A08(8);
            int iA06 = c0913He.A04(3);
            if ((iA06 & 1) == 0 || iA06 == 1) {
                i10 = 2;
            } else {
                i10 = 2;
                c0913He.A08(2);
            }
            if ((iA06 & 4) != 0) {
                c0913He.A08(i10);
            }
            if (iA06 == i10) {
                c0913He.A08(i10);
            }
            i11 = A05[iA05];
            i12 = 1536;
            boolean zA0F = c0913He.A0F();
            int[] iArr = A04;
            if (A01[6].charAt(31) != 'Q') {
                A01[2] = "4KahRN";
                i13 = iArr[iA06] + (zA0F ? 1 : 0);
                return new A5(strA0A, i20, i13, i11, iA01, i12);
            }
            throw new RuntimeException();
        }
        c0913He.A08(16);
        switch (c0913He.A04(2)) {
            case 0:
                i20 = 0;
                break;
            case 1:
                i20 = 1;
                break;
            case 2:
                i20 = 2;
                break;
            default:
                i20 = -1;
                break;
        }
        c0913He.A08(3);
        iA01 = (c0913He.A04(11) + 1) * 2;
        int iA07 = c0913He.A04(2);
        if (iA07 == 3) {
            iA04 = 3;
            i11 = A06[c0913He.A04(2)];
            i14 = 6;
        } else {
            iA04 = c0913He.A04(2);
            String[] strArr = A01;
            if (strArr[3].length() != strArr[4].length()) {
                String[] strArr2 = A01;
                strArr2[7] = "8hYjpgfNHnAwS9QM7NBT3rLslQs0BeQi";
                strArr2[5] = "JdPcmmaJKVXmYa4gXJhhMISDBvQK9V8e";
                i14 = A03[iA04];
                i11 = A05[iA07];
            } else {
                i14 = A03[iA04];
                i11 = A05[iA07];
            }
        }
        i12 = i14 * 256;
        int iA08 = c0913He.A04(3);
        boolean zA0F2 = c0913He.A0F();
        i13 = A04[iA08] + (zA0F2 ? 1 : 0);
        c0913He.A08(10);
        if (c0913He.A0F()) {
            c0913He.A08(8);
        }
        if (iA08 == 0) {
            c0913He.A08(5);
            if (c0913He.A0F()) {
                c0913He.A08(8);
            }
        }
        if (i20 == 1 && c0913He.A0F()) {
            c0913He.A08(16);
        }
        if (c0913He.A0F()) {
            if (iA08 > 2) {
                c0913He.A08(2);
            }
            if ((iA08 & 1) == 0 || iA08 <= 2) {
                i18 = 6;
            } else {
                i18 = 6;
                c0913He.A08(6);
            }
            if ((iA08 & 4) != 0) {
                c0913He.A08(i18);
            }
            if (zA0F2 && c0913He.A0F()) {
                c0913He.A08(5);
            }
            if (i20 == 0) {
                if (c0913He.A0F()) {
                    i19 = 6;
                    c0913He.A08(6);
                } else {
                    i19 = 6;
                }
                if (iA08 == 0 && c0913He.A0F()) {
                    c0913He.A08(i19);
                }
                if (c0913He.A0F()) {
                    c0913He.A08(i19);
                }
                int iA09 = c0913He.A04(2);
                if (iA09 == 1) {
                    c0913He.A08(5);
                } else if (iA09 == 2) {
                    c0913He.A08(12);
                } else if (iA09 == 3) {
                    int iA010 = c0913He.A04(5);
                    if (c0913He.A0F()) {
                        c0913He.A08(5);
                        if (c0913He.A0F()) {
                            c0913He.A08(4);
                        }
                        if (c0913He.A0F()) {
                            c0913He.A08(4);
                        }
                        boolean zA0F3 = c0913He.A0F();
                        String[] strArr3 = A01;
                        if (strArr3[1].charAt(20) != strArr3[0].charAt(20)) {
                            A01[2] = "kC";
                            if (zA0F3) {
                                c0913He.A08(4);
                            }
                        } else {
                            A01[2] = "vcp8LN0Hh9uJKmo";
                            if (zA0F3) {
                                c0913He.A08(4);
                            }
                        }
                        if (c0913He.A0F()) {
                            c0913He.A08(4);
                        }
                        if (c0913He.A0F()) {
                            c0913He.A08(4);
                        }
                        if (c0913He.A0F()) {
                            c0913He.A08(4);
                        }
                        if (c0913He.A0F()) {
                            c0913He.A08(4);
                        }
                        if (c0913He.A0F()) {
                            if (c0913He.A0F()) {
                                c0913He.A08(4);
                            }
                            if (c0913He.A0F()) {
                                c0913He.A08(4);
                            }
                        }
                    }
                    if (c0913He.A0F()) {
                        c0913He.A08(5);
                        String[] strArr4 = A01;
                        if (strArr4[3].length() != strArr4[4].length()) {
                            String[] strArr5 = A01;
                            strArr5[1] = "LWpchFhzl4zZLaolhYStszHUjMzJpa2W";
                            strArr5[0] = "6uYdOttcy9rqBmgvIK07scrDJCGtgIZT";
                            if (c0913He.A0F()) {
                                c0913He.A08(7);
                                if (c0913He.A0F()) {
                                    if (A01[6].charAt(31) != 'Q') {
                                        String[] strArr6 = A01;
                                        strArr6[3] = "efqTs5tkRdGBLzL99Y2zBy0";
                                        strArr6[4] = "";
                                        c0913He.A08(8);
                                    } else {
                                        c0913He.A08(8);
                                    }
                                }
                            }
                        } else if (c0913He.A0F()) {
                            c0913He.A08(7);
                            if (c0913He.A0F()) {
                                if (A01[6].charAt(31) != 'Q') {
                                    String[] strArr7 = A01;
                                    strArr7[3] = "efqTs5tkRdGBLzL99Y2zBy0";
                                    strArr7[4] = "";
                                    c0913He.A08(8);
                                } else {
                                    c0913He.A08(8);
                                }
                            }
                        }
                    }
                    c0913He.A08((iA010 + 2) * 8);
                    c0913He.A05();
                }
                if (iA08 < 2) {
                    if (c0913He.A0F()) {
                        c0913He.A08(14);
                    }
                    if (iA08 == 0 && c0913He.A0F()) {
                        c0913He.A08(14);
                    }
                }
                if (c0913He.A0F()) {
                    if (iA04 == 0) {
                        c0913He.A08(5);
                    } else {
                        for (int i21 = 0; i21 < i14; i21++) {
                            if (c0913He.A0F()) {
                                c0913He.A08(5);
                            }
                        }
                    }
                }
            }
        }
        if (c0913He.A0F()) {
            c0913He.A08(5);
            if (iA08 == 2) {
                c0913He.A08(4);
            }
            if (iA08 >= 6) {
                c0913He.A08(2);
            }
            boolean zA0F4 = c0913He.A0F();
            if (A01[6].charAt(31) != 'Q') {
                A01[6] = "dl0wWt6J8L8AikPCmNhR7kaZE8RAZ0S5";
                if (zA0F4) {
                    i17 = 8;
                    c0913He.A08(8);
                } else {
                    i17 = 8;
                }
                if (iA08 == 0 && c0913He.A0F()) {
                    c0913He.A08(i17);
                }
                i15 = 3;
                if (iA07 < 3) {
                    c0913He.A06();
                }
            }
            throw new RuntimeException();
        }
        i15 = 3;
        if (i20 == 0 && iA04 != i15) {
            c0913He.A06();
        }
        if (i20 != 2) {
            i16 = 6;
        } else if (iA04 == i15 || c0913He.A0F()) {
            i16 = 6;
            c0913He.A08(6);
        } else {
            i16 = 6;
        }
        strA0A = A0A(9, 10, 48);
        if (c0913He.A0F()) {
            int iA011 = c0913He.A04(i16);
            String[] strArr8 = A01;
            if (strArr8[3].length() == strArr8[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr9 = A01;
            strArr9[1] = "3ApKKtyzWMiiSaP5bzYqsGtpnyYQD1rl";
            strArr9[0] = "8bIrpLiP8D9Hp4mjJ2yCsEloJ1XyNCEo";
            if (iA011 == 1 && c0913He.A04(8) == 1) {
                strA0A = A0A(19, 14, 124);
            }
        }
        return new A5(strA0A, i20, i13, i11, iA01, i12);
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-69, -49, -66, -61, -55, -119, -69, -67, -115, -47, -27, -44, -39, -33, -97, -43, -47, -45, -93, Ascii.GS, 49, 32, 37, 43, -21, 33, Ascii.GS, Ascii.US, -17, -23, 38, 43, Ascii.US};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, SyslogConstants.LOG_LOCAL4, 192, 224, 256, 320, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    public static int A01(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = A05;
        int halfFrmsizecod = iArr.length;
        if (i10 >= halfFrmsizecod || i11 < 0) {
            return -1;
        }
        int[] iArr2 = A07;
        int halfFrmsizecod2 = iArr2.length;
        if (i12 >= halfFrmsizecod2) {
            return -1;
        }
        int bitrate = iArr[i10];
        if (bitrate == 44100) {
            int halfFrmsizecod3 = i11 % 2;
            return (iArr2[i12] + halfFrmsizecod3) * 2;
        }
        int sampleRate = A02[i12];
        if (bitrate == 32000) {
            int i13 = sampleRate * 6;
            if (A01[6].charAt(31) == 81) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "qimZQilZsB2lt3Dt1pYE9Xl";
            strArr[4] = "";
            return i13;
        }
        int halfFrmsizecod4 = sampleRate * 4;
        return halfFrmsizecod4;
    }

    public static int A02(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i10 = startIndex - 10;
        for (int i11 = iPosition; i11 <= i10; i11++) {
            int startIndex2 = i11 + 4;
            int endIndex = byteBuffer.getInt(startIndex2);
            if ((endIndex & (-16777217)) == -1167101192) {
                return i11 - iPosition;
            }
        }
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[5];
        int endIndex2 = str.charAt(29);
        int startIndex3 = str2.charAt(29);
        if (endIndex2 == startIndex3) {
            throw new RuntimeException();
        }
        A01[2] = "FkGXqBuH9rf";
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        int i10 = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            int[] iArr = A03;
            int fscod = byteBuffer.position();
            i10 = iArr[(byteBuffer.get(fscod + 4) & 48) >> 4];
        }
        int fscod2 = i10 * 256;
        return fscod2;
    }

    public static int A04(ByteBuffer byteBuffer, int i10) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int fscod = (bArr[4] & 192) >> 6;
        int frmsizecod = bArr[4] & 63;
        return A01(fscod, frmsizecod);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        boolean isMlp = (bArr[7] & 255) == 187;
        byte b10 = bArr[isMlp ? '\t' : '\b'];
        String[] strArr = A01;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "Qkic1459317rghhXW1uTsPZAwlwTKIiV";
        strArr2[0] = "TPYz26W0Cq4ZALktt0QhsmVlkvC9xybr";
        return 40 << ((b10 >> 4) & 7);
    }
}
