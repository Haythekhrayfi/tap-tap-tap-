package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CI {
    public static byte[] A00;
    public static String[] A01 = {"bdaFL9zMZ", "I63pCoSBBbO7fDlHhIa7BrZ6Ava1cIF3", "x5nJfB3W8HSDeHix", "yyLZDQNtNFC811gZWNvs8tiPSoT", "kE4kWLsRx96QKHczqOKboI9lp", "rJUZcTDeN", "z735Hr0viTdtcy9jRTmcNapxWooAX9zU", "rl5X7GmnpjWHRCYLou0FtooQfFV"};
    public static final int[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "MWn";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 122);
            if (A01[7].length() == 12) {
                throw new RuntimeException();
            }
            A01[7] = "KMAr4";
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-44, 8, -45, 2, Ascii.EM, 77, Ascii.CAN, 72, -8, 44, 42, -5, 22, 74, 74, Ascii.EM, -49, 3, 12, -20, 32, 43, -17, 14, 66, 78, 17, -42, -67, -54, -87, 63, 38, 72, 18, 63, 38, 72, 66, -41, -35, -40, -32, 4, Ascii.EM, 6, -44, 19, -31, 35, -51, Ascii.ESC, Ascii.CAN, 41, -28, 12, Ascii.SUB, 7, -43, 23, 33, Ascii.GS, -32, 55, 65, 61, 1, 62, 72, 68, 9, -9, 1, -3, -61, 9, 19, 15, -42, 40, 50, 46, 44, 14, 7, 7, 12, Ascii.CAN, Ascii.ESC, -33, -36, 97, 100, 40, 38, -10, -7, -91, -91};
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A05(BZ bz, boolean z10) throws InterruptedException, IOException {
        boolean z11;
        long jA7A = bz.A7A();
        long j10 = 4096;
        long j11 = -1;
        if (jA7A != -1 && jA7A <= 4096) {
            j10 = jA7A;
        }
        int i10 = (int) j10;
        C0914Hf c0914Hf = new C0914Hf(64);
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            if (i11 >= i10) {
                z11 = false;
                break;
            }
            int i12 = 8;
            c0914Hf.A0W(8);
            bz.ADa(c0914Hf.A00, 0, 8);
            long jA0M = c0914Hf.A0M();
            int iA08 = c0914Hf.A08();
            if (jA0M == 1) {
                i12 = 16;
                bz.ADa(c0914Hf.A00, 8, 8);
                if (A01[3].length() == 21) {
                    throw new RuntimeException();
                }
                A01[3] = "x";
                c0914Hf.A0X(16);
                jA0M = c0914Hf.A0N();
            } else if (jA0M == 0) {
                long jA7A2 = bz.A7A();
                if (jA7A2 != j11) {
                    jA0M = (jA7A2 - bz.A7Z()) + ((long) 8);
                }
            }
            if (jA0M < i12) {
                if (A01[6].length() != 14) {
                    A01[6] = "xNdZT7PF3cfE5U51qI7qEUy5Bn2I1n4";
                    return false;
                }
                A01[6] = "uC";
                return false;
            }
            i11 += i12;
            if (iA08 != AbstractC0790Bz.A0k) {
                if (iA08 == AbstractC0790Bz.A0j) {
                    z11 = false;
                } else if (iA08 == AbstractC0790Bz.A0n) {
                    z11 = false;
                } else {
                    if ((((long) i11) + jA0M) - ((long) i12) >= i10) {
                        z11 = false;
                        break;
                    }
                    int i13 = (int) (jA0M - ((long) i12));
                    i11 += i13;
                    if (iA08 == AbstractC0790Bz.A0V) {
                        if (i13 < 8) {
                            return false;
                        }
                        c0914Hf.A0W(i13);
                        bz.ADa(c0914Hf.A00, 0, i13);
                        int i14 = i13 / 4;
                        for (int i15 = 0; i15 < i14; i15++) {
                            if (A01[3].length() != 21) {
                                String[] strArr = A01;
                                strArr[2] = "gohG7oAKJXd788dq";
                                strArr[4] = "s0tItg43zYN2kAKL8Ko7hXkhv";
                                if (i15 != 1) {
                                    if (A02(c0914Hf.A08())) {
                                        z12 = true;
                                        break;
                                    }
                                } else {
                                    if (A01[7].length() != 12) {
                                        throw new RuntimeException();
                                    }
                                    A01[7] = "X5YHVW4uSpKOduvkf9RISQBbBxib";
                                    c0914Hf.A0Z(4);
                                }
                            } else {
                                if (i15 != 1) {
                                    if (A02(c0914Hf.A08())) {
                                        z12 = true;
                                        break;
                                    }
                                } else {
                                    if (A01[7].length() != 12) {
                                        throw new RuntimeException();
                                    }
                                    A01[7] = "X5YHVW4uSpKOduvkf9RISQBbBxib";
                                    c0914Hf.A0Z(4);
                                }
                            }
                        }
                        if (!z12) {
                            return false;
                        }
                    } else if (i13 != 0) {
                        bz.A3R(i13);
                    }
                    j11 = -1;
                }
                z13 = true;
                break;
            }
            j11 = -1;
        }
        if (z12 && z10 == z13) {
            return true;
        }
        return z11;
    }

    static {
        A01();
        A02 = new int[]{C0930Hv.A08(A00(79, 4, 69)), C0930Hv.A08(A00(59, 4, 52)), C0930Hv.A08(A00(63, 4, 84)), C0930Hv.A08(A00(67, 4, 91)), C0930Hv.A08(A00(71, 4, 20)), C0930Hv.A08(A00(75, 4, 38)), C0930Hv.A08(A00(43, 4, 41)), C0930Hv.A08(A00(55, 4, 42)), C0930Hv.A08(A00(51, 4, 57)), C0930Hv.A08(A00(87, 4, 49)), C0930Hv.A08(A00(91, 4, 122)), C0930Hv.A08(A00(0, 4, 39)), C0930Hv.A08(A00(4, 4, 108)), C0930Hv.A08(A00(19, 4, 63)), C0930Hv.A08(A00(23, 4, 97)), C0930Hv.A08(A00(8, 4, 75)), C0930Hv.A08(A00(12, 4, 105)), C0930Hv.A08(A00(31, 4, 120)), C0930Hv.A08(A00(27, 4, 15)), C0930Hv.A08(A00(47, 4, 51)), C0930Hv.A08(A00(83, 4, 41)), C0930Hv.A08(A00(35, 4, 120)), C0930Hv.A08(A00(95, 4, 11)), C0930Hv.A08(A00(39, 4, 16))};
    }

    public static boolean A02(int i10) {
        if ((i10 >>> 8) == C0930Hv.A08(A00(16, 3, 34))) {
            return true;
        }
        for (int i11 : A02) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(BZ bz) throws InterruptedException, IOException {
        return A05(bz, true);
    }

    public static boolean A04(BZ bz) throws InterruptedException, IOException {
        return A05(bz, false);
    }
}
