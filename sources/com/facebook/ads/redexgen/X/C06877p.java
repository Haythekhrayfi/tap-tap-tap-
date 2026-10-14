package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06877p {
    public static SparseIntArray A00;
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    public static final List<Integer> A06;
    public static final List<C06887q> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<InterfaceC06857n> A0A;
    public static final AtomicReference<InterfaceC06867o> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, -39, -39, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, 114, -98, -109, -108, 79, 108, 79, 116, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, 110, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, -31, -115, -28, -42, -31, -43, -115, -32, -30, -49, -31, -26, -35, -46, -115, -86, -115, 108, -97, -118, -116, -116, -117, -116, -117, 71, -112, -107, 84, -108, -116, -108, -106, -103, -96, 71, -109, -106, -114, 71, -109, -112, -108, -112, -101, 72, 71, 115, -120, -102, -101, 71, -116, -99, -116, -107, -101, 97, 71, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, 122, -66, -49, -52, -61, -56, -63, 122, -58, -55, -63, -63, -61, -56, -63, 122, -66, -65, -68, -49, -63, 122, -65, -48, -65, -56, -50, -120, -27, Ascii.CAN, 3, 5, 16, 20, 9, 15, 14, -64, 19, 8, 15, 21, 12, 4, -64, 14, 15, 20, -64, 8, 1, 16, 16, 5, 14, -64, 8, 5, 18, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, 16, 2, -69, -32, 17, 0, 9, 15, -69, 18, 4, 15, 3, -69, 14, 16, -3, 15, 20, 11, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, -39, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -56, -62, -49, -46, -54, -54, -52, -47, -54, -2, 13, 6, 6, -3, 4, -49, -42, -55, -59, -36, -57, -46, -49, -54, -57, -38, -49, -43, -44, -36, -45, -30, -27, -35, -32, -39};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i10, C7Q c7q) {
        if ((A01(457, 7, 71).equals(str) && C06937v.A1z == i10) || A01(422, 5, 56).equals(str) || A01(437, 6, 113).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return IP.A05(c7q);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        A05[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C06887q> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A05[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
        return list;
    }

    public static void A05(C7Q c7q, int i10, int i11) {
        c7q.A07().A9K(A01(427, 10, 60), C06937v.A2W, new C06947w(A01(338, 33, 80) + i10, A01(87, 9, 13) + i11));
    }

    @Deprecated
    public static void A06(C7Q c7q, String str, int i10, C06947w c06947w) {
        if (c7q == null) {
            A0F(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        C7P.A01(c7q.A01());
        if (A02 && c06947w.A00() == 0) {
            A0D(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i10, c06947w));
        }
        try {
            if (A0I(c7q, str, i10, Math.random(), c06947w)) {
                A09(c7q, str, i10, c06947w);
            }
        } catch (Throwable t10) {
            A0F(t10);
        }
    }

    @Deprecated
    public static void A07(C7Q c7q, String str, int i10, C06947w c06947w) {
        try {
            c06947w.A03(2);
            c06947w.A08(false);
            c06947w.A04(1);
            if (IP.A0Q(c7q)) {
                c06947w.A06(true);
            } else {
                c06947w.A06(false);
            }
            A06(c7q, str, i10, c06947w);
        } catch (Throwable t10) {
            A0F(t10);
        }
    }

    @Deprecated
    public static void A08(C7Q c7q, String str, int i10, C06947w c06947w) {
        try {
            c06947w.A03(2);
            c06947w.A06(false);
            A06(c7q, str, i10, c06947w);
        } catch (Throwable t10) {
            A0F(t10);
        }
    }

    public static void A09(C7Q c7q, String str, int i10, C06947w c06947w) {
        synchronized (C06877p.class) {
            if (!A03) {
                int iA01 = IP.A01(c7q);
                AtomicInteger atomicInteger = A09;
                int threshold = atomicInteger.getAndIncrement();
                if (threshold < iA01 - 1) {
                    A07.add(new C06887q(str, i10, c06947w));
                } else if (atomicInteger.get() == iA01) {
                    A07.add(new C06887q(A01(427, 10, 60), C06937v.A2T, new C06947w(A01(140, 42, 0) + str + A01(47, 1, 19) + i10)));
                }
            } else {
                A0A(c7q, str, i10, c06947w, true);
            }
        }
    }

    public static void A0A(C7Q c7q, String str, int i10, C06947w c06947w, boolean z10) throws Throwable {
        InterfaceC06867o interfaceC06867o = A0B.get();
        boolean z11 = interfaceC06867o != null && interfaceC06867o.A91();
        if (A08.get() || z11) {
            int iA00 = c06947w.A00();
            String strA01 = A01(289, 17, 46);
            String strA02 = A01(31, 16, 8);
            if (iA00 == 0) {
                Log.e(strA01, A01(182, 37, 40) + str + strA02 + i10, c06947w);
            } else {
                Log.i(strA01, A01(306, 32, 116) + str + strA02 + i10 + A01(19, 12, 63) + c06947w.getMessage() + A01(0, 19, 80) + c06947w.A02());
            }
        }
        C1328Xn c1328Xn = new C1328Xn(c7q, str, i10, c06947w, interfaceC06867o);
        if (z10) {
            A01.execute(c1328Xn);
        } else {
            c1328Xn.run();
        }
    }

    public static void A0C(C1336Xv c1336Xv, InterfaceC06867o interfaceC06867o, InterfaceC06857n interfaceC06857n, boolean z10) {
        A0A.set(interfaceC06857n);
        A0B.set(interfaceC06867o);
        A08.set(z10);
        synchronized (C06877p.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C1329Xo(c1336Xv));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.7m
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 121), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    public static boolean A0H(C7Q c7q) {
        Boolean shouldLogFunnelEvents = A0C.get();
        if (shouldLogFunnelEvents != null) {
            return shouldLogFunnelEvents.booleanValue();
        }
        return IP.A0A(c7q) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x015b A[Catch: all -> 0x01e0, TRY_ENTER, TryCatch #0 {all -> 0x01e0, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0037, B:10:0x003f, B:15:0x004a, B:19:0x0052, B:22:0x0059, B:27:0x006f, B:29:0x0086, B:32:0x0091, B:36:0x009a, B:38:0x009e, B:46:0x00ab, B:48:0x00ba, B:50:0x00be, B:58:0x00d2, B:60:0x00d6, B:53:0x00c7, B:68:0x00e3, B:70:0x00f2, B:72:0x00f8, B:75:0x0100, B:81:0x0109, B:83:0x0113, B:85:0x0118, B:87:0x011e, B:90:0x0128, B:104:0x015b, B:106:0x016b, B:114:0x019a, B:23:0x0062, B:26:0x006b), top: B:145:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x016b A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0037, B:10:0x003f, B:15:0x004a, B:19:0x0052, B:22:0x0059, B:27:0x006f, B:29:0x0086, B:32:0x0091, B:36:0x009a, B:38:0x009e, B:46:0x00ab, B:48:0x00ba, B:50:0x00be, B:58:0x00d2, B:60:0x00d6, B:53:0x00c7, B:68:0x00e3, B:70:0x00f2, B:72:0x00f8, B:75:0x0100, B:81:0x0109, B:83:0x0113, B:85:0x0118, B:87:0x011e, B:90:0x0128, B:104:0x015b, B:106:0x016b, B:114:0x019a, B:23:0x0062, B:26:0x006b), top: B:145:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0175  */
    /* JADX WARN: Code duplicated, block: B:110:0x0185  */
    /* JADX WARN: Code duplicated, block: B:112:0x018d  */
    /* JADX WARN: Code duplicated, block: B:114:0x019a A[Catch: all -> 0x01e0, TRY_ENTER, TryCatch #0 {all -> 0x01e0, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0037, B:10:0x003f, B:15:0x004a, B:19:0x0052, B:22:0x0059, B:27:0x006f, B:29:0x0086, B:32:0x0091, B:36:0x009a, B:38:0x009e, B:46:0x00ab, B:48:0x00ba, B:50:0x00be, B:58:0x00d2, B:60:0x00d6, B:53:0x00c7, B:68:0x00e3, B:70:0x00f2, B:72:0x00f8, B:75:0x0100, B:81:0x0109, B:83:0x0113, B:85:0x0118, B:87:0x011e, B:90:0x0128, B:104:0x015b, B:106:0x016b, B:114:0x019a, B:23:0x0062, B:26:0x006b), top: B:145:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01cd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ce A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x01d5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x01de A[RETURN, SYNTHETIC] */
    public static boolean A0I(C7Q c7q, String str, int i10, double d10, C06947w c06947w) {
        double d11;
        boolean z10;
        int additionalDebugLoggingSamplingPercentage;
        double d12;
        String[] strArr;
        int additionalDebugLoggingSamplingPercentage2;
        try {
            int iA04 = IP.A04(c7q);
            if (iA04 < 1) {
                return false;
            }
            HashMap<String, Integer> mapA0M = IP.A0M(c7q);
            Set<String> additionalDebugLoggingBlackList = mapA0M.keySet();
            String str2 = str + A01(47, 1, 19) + i10;
            boolean zContains = additionalDebugLoggingBlackList.contains(str2);
            if (zContains) {
                Integer num = mapA0M.get(str2);
                int additionalDebugLoggingSamplingPercentage3 = num != null ? num.intValue() : -1;
                if (additionalDebugLoggingSamplingPercentage3 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage3 > 0) {
                    return d10 <= 1.0d / ((double) additionalDebugLoggingSamplingPercentage3);
                }
                int additionalDebugLoggingSamplingPercentage4 = IP.A03(c7q);
                if (additionalDebugLoggingSamplingPercentage4 < 1) {
                    return false;
                }
                d11 = ((double) (iA04 * additionalDebugLoggingSamplingPercentage4)) / 10000.0d;
            } else if (!c06947w.A09()) {
                d11 = 0.0d;
            } else {
                d11 = ((double) iA04) / 100.0d;
            }
            double dA00 = c7q.A08().A00();
            if (A01(422, 5, 56).equals(str)) {
                if (c7q.A04().A8n()) {
                    return true;
                }
                int additionalDebugLoggingSamplingPercentage5 = IP.A06(c7q);
                if (additionalDebugLoggingSamplingPercentage5 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage5 > 0) {
                    double d13 = 1.0d / ((double) additionalDebugLoggingSamplingPercentage5);
                    if (zContains) {
                        return dA00 <= d13 * d11;
                    }
                    return dA00 <= d13;
                }
            }
            if (A01(457, 7, 71).equals(str) && C06937v.A1z == i10) {
                if (!A08.get()) {
                    additionalDebugLoggingSamplingPercentage2 = IP.A0E(c7q);
                } else {
                    additionalDebugLoggingSamplingPercentage2 = 1;
                }
                if (additionalDebugLoggingSamplingPercentage2 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage2 > 0) {
                    double d14 = 1.0d / ((double) additionalDebugLoggingSamplingPercentage2);
                    if (zContains) {
                        return dA00 <= d14 * d11;
                    }
                    return dA00 <= d14;
                }
            }
            if (A01(437, 6, 113).equals(str)) {
                if (IP.A0S(c7q) && c06947w.A0A()) {
                    return !zContains || d10 >= 1.0d - d11;
                }
                AtomicReference<Boolean> atomicReference = A0C;
                Boolean bool = atomicReference.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int additionalDebugLoggingSamplingPercentage6 = IP.A0A(c7q);
                if (additionalDebugLoggingSamplingPercentage6 == 0) {
                    atomicReference.set(false);
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage6 > 0) {
                    double d15 = 1.0d / ((double) additionalDebugLoggingSamplingPercentage6);
                    if (!zContains) {
                        return dA00 <= d15;
                    }
                    double d16 = d15 * d11;
                    String[] strArr2 = A05;
                    if (strArr2[5].length() != strArr2[2].length()) {
                        String[] strArr3 = A05;
                        strArr3[5] = "t3EZK0av5HRm0swjvR";
                        strArr3[2] = "429TUKJjq974XMuOG6VE2UuXyW1";
                        return dA00 <= d16;
                    }
                } else {
                    if (A01(443, 14, 63).equals(str)) {
                        if (c7q.A04().A8n()) {
                            if (A05[7].charAt(14) != 'T') {
                                A05[1] = "e";
                                return true;
                            }
                            String[] strArr4 = A05;
                            strArr4[5] = "dRw4UZ8099etu0WhLV";
                            strArr4[2] = "qAglZRfXbaaC8JHltzId8jp93qQ";
                            return true;
                        }
                        z10 = true;
                        additionalDebugLoggingSamplingPercentage = IP.A0B(c7q);
                        if (additionalDebugLoggingSamplingPercentage == 0) {
                            strArr = A05;
                            if (strArr[5].length() != strArr[2].length()) {
                                A05[7] = "7w04Viu4gQwea3uNmATS6axbv6FrlKww";
                                return false;
                            }
                        } else if (additionalDebugLoggingSamplingPercentage > 0) {
                            d12 = 1.0d / ((double) additionalDebugLoggingSamplingPercentage);
                            if (zContains) {
                                if (dA00 <= d12 * d11) {
                                    return true;
                                }
                                return false;
                            }
                            if (dA00 <= d12) {
                                return true;
                            }
                            return false;
                        }
                    } else {
                        z10 = true;
                    }
                    if (d10 >= 1.0d - d11) {
                        return z10;
                    }
                    return false;
                }
            } else {
                if (A01(443, 14, 63).equals(str)) {
                    if (c7q.A04().A8n()) {
                        if (A05[7].charAt(14) != 'T') {
                            A05[1] = "e";
                            return true;
                        }
                        String[] strArr5 = A05;
                        strArr5[5] = "dRw4UZ8099etu0WhLV";
                        strArr5[2] = "qAglZRfXbaaC8JHltzId8jp93qQ";
                        return true;
                    }
                    z10 = true;
                    additionalDebugLoggingSamplingPercentage = IP.A0B(c7q);
                    if (additionalDebugLoggingSamplingPercentage == 0) {
                        strArr = A05;
                        if (strArr[5].length() != strArr[2].length()) {
                            A05[7] = "7w04Viu4gQwea3uNmATS6axbv6FrlKww";
                            return false;
                        }
                    } else if (additionalDebugLoggingSamplingPercentage > 0) {
                        d12 = 1.0d / ((double) additionalDebugLoggingSamplingPercentage);
                        if (zContains) {
                            if (dA00 <= d12 * d11) {
                                return true;
                            }
                            return false;
                        }
                        if (dA00 <= d12) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    z10 = true;
                }
                if (d10 >= 1.0d - d11) {
                    return z10;
                }
                return false;
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            String[] strArr6 = A05;
            if (strArr6[5].length() != strArr6[2].length()) {
                A05[1] = "GN";
                A0F(th);
                return false;
            }
            A0F(th);
            return false;
        }
    }

    public static boolean A0J(C7Q c7q, String str, int i10, C06947w c06947w) {
        if (!IP.A0P(c7q)) {
            return true;
        }
        int customLimit = A00.get(i10);
        int eventsLimit = IP.A00(c7q);
        if (c06947w.A01() != -1) {
            eventsLimit = c06947w.A01();
        } else {
            int currentCounter = A00(str, i10, c7q);
            if (eventsLimit < currentCounter) {
                eventsLimit = currentCounter;
            }
        }
        if (customLimit >= eventsLimit) {
            if (A06.contains(Integer.valueOf(customLimit))) {
                boolean zA0B = c06947w.A0B();
                if (A05[3].charAt(3) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[5] = "DtDXz8TrFQQZw1pkgy";
                strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                if (zA0B) {
                    A05(c7q, i10, customLimit);
                }
            }
            A00.put(i10, customLimit + 1);
            return true;
        }
        A00.put(i10, customLimit + 1);
        return false;
    }
}
