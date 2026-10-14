package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1448av implements AnonymousClass00 {
    public static byte[] A09;
    public static String[] A0A = {"2hmAfzTadn", "1uDqsMr9wv4o5ZghfCOZg4FuDp7sllqp", "nT1KYDstdBBAZ5nN", "UVqk4rMzzgqbiyaJgpoGMOUy0jQCoEBq", "ewXxsmpHr", "rT44HeCpkJQ", "C3kiv90mrVS0BL1BSM5Dfu9lHf0n3Csl", "grgxNBq6hb"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final AnonymousClass08 A02;
    public final C0L A04;
    public final C7Q A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C0A A03 = new C0A();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0106: INVOKE 
  (r9v1 ?? I:com.facebook.ads.redexgen.X.0L)
  (r10 I:java.lang.String)
  (r11 I:int)
  (r12 I:java.lang.String)
  (r13 I:java.lang.Long)
  (r14 I:java.lang.Long)
  (r15 I:com.facebook.ads.redexgen.X.06)
 INTERFACE call: com.facebook.ads.redexgen.X.0L.AE6(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void (m)], block:B:40:0x00fb */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0120: INVOKE 
  (r9v0 ?? I:com.facebook.ads.redexgen.X.0L)
  (r10 I:java.lang.String)
  (r11 I:int)
  (r12 I:java.lang.String)
  (r13 I:java.lang.Long)
  (r14 I:java.lang.Long)
  (r15 I:com.facebook.ads.redexgen.X.06)
 INTERFACE call: com.facebook.ads.redexgen.X.0L.AE6(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void (m)], block:B:46:0x0115 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0105: MOVE (r15 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:40:0x00fb */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x011f: MOVE (r15 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:46:0x0115 */
    private File A02(AnonymousClass06 anonymousClass06, String str, String str2, int i10, AnonymousClass09 anonymousClass09) throws Throwable {
        AnonymousClass06 anonymousClass07;
        String strAE6;
        AnonymousClass06 anonymousClass08;
        String strAE7;
        C1444ar c1444ar;
        String strA03 = A03(222, 22, 68);
        try {
            String str3 = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            C1444ar c1444ar2 = new C1444ar(file, new FS(IN.A0N(this.A05)));
            if (c1444ar2.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 106) + c1444ar2.A00.getName();
                }
                this.A06.put(str3, file);
                c1444ar2.A06();
                this.A04.AE7(str3, true, anonymousClass06);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 117) + c1444ar2.A00.getName();
            }
            if (!anonymousClass09.A04()) {
                return null;
            }
            this.A04.AE7(str3, false, anonymousClass06);
            int i11 = 0;
            while (i11 < this.A00) {
                try {
                    str3 = str3;
                    c1444ar = c1444ar2;
                    try {
                        A05(this.A05, c1444ar2, str3, i10, i11, jCurrentTimeMillis);
                        int iA03 = c1444ar.A03();
                        c1444ar.A06();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        anonymousClass09.A00().A4Q(file, this.A04);
                        this.A06.put(str3, file);
                        this.A04.AE6(str3, 2112, null, Long.valueOf(iA03), Long.valueOf(jCurrentTimeMillis2), anonymousClass06);
                        return file;
                    } catch (C0H e10) {
                        e = e10;
                        if (i11 == this.A00 - 1) {
                            A06(c1444ar);
                            if (e instanceof C1445as) {
                                throw ((C1445as) e);
                            }
                            if (e instanceof C1442ap) {
                                throw ((C1442ap) e);
                            }
                        }
                        i11++;
                        c1444ar2 = c1444ar;
                    }
                } catch (C0H e11) {
                    e = e11;
                    c1444ar = c1444ar2;
                }
            }
            c1444ar = c1444ar2;
            int iA04 = c1444ar.A03();
            c1444ar.A06();
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            anonymousClass09.A00().A4Q(file, this.A04);
            this.A06.put(str3, file);
            this.A04.AE6(str3, 2112, null, Long.valueOf(iA04), Long.valueOf(jCurrentTimeMillis3), anonymousClass06);
            return file;
        } catch (C1442ap e12) {
            this.A04.AE6(strAE7, 2113, e12.toString(), null, null, anonymousClass08);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e12);
            return null;
        } catch (C1445as e13) {
            this.A04.AE6(strAE6, 2119, e13.toString(), null, null, anonymousClass07);
            if (!this.A08) {
                return null;
            }
            Log.e(A0B, strA03, e13);
            return null;
        }
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "m9U6X0moZlc";
            strArr2[7] = "IfCNkNm6kG";
            bArrCopyOfRange[i13] = (byte) (i14 - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-105, -33, -40, -22, -105, -39, -36, -36, -27, -105, -32, -27, -21, -36, -23, -23, -20, -25, -21, -36, -37, -91, -63, -75, -5, -2, 1, -6, -75, -8, 1, -6, -10, 3, -6, -7, -49, -75, -125, 117, -106, -55, -55, -70, -62, -59, -55, -113, 117, -7, 23, Ascii.EM, Ascii.RS, Ascii.US, 36, Ascii.GS, -42, Ascii.FS, Ascii.US, 34, Ascii.ESC, -42, Ascii.EM, 37, 35, 38, 34, Ascii.ESC, 42, Ascii.ESC, -42, 4, 34, 36, 41, 42, 47, 40, -31, 39, 42, 45, 38, -31, 47, 48, 53, -31, 36, 48, 46, 49, 45, 38, 53, 38, -31, -91, -61, -59, -54, -53, -48, -55, -126, -47, -56, -126, -32, -2, 11, -60, 17, -67, 0, 9, 12, 16, 2, -67, 0, -2, 0, 5, 2, -67, 3, 6, 9, 2, -53, -80, -50, -37, -108, -31, -115, -33, -46, -50, -47, -115, -50, -32, -32, -46, -31, -32, -101, -69, -39, -26, -97, -20, -104, -22, -35, -39, -36, -104, -28, -35, -26, -33, -20, -32, -104, -25, -34, -104, -72, -39, -32, -39, -24, -35, -30, -37, -108, -41, -43, -41, -36, -39, -108, -38, -35, -32, -39, -108, -43, -38, -24, -39, -26, -108, -39, -20, -41, -39, -39, -40, -35, -30, -37, -108, -26, -39, -24, -26, -19, -108, -43, -24, -24, -39, -31, -28, -24, -25, -82, -108, -43, 2, 2, -1, 2, -80, -13, -15, -13, -8, -7, -2, -9, -80, 4, -8, -11, -80, -10, -7, -4, -11, -54, -9, -9, -12, -9, -91, -24, -15, -22, -26, -13, -18, -13, -20, -91, -21, -18, -15, -22, -72, -27, -27, -30, -27, -109, -42, -33, -30, -26, -36, -31, -38, -109, -26, -30, -24, -27, -42, -40, -72, -35, -46, -34, -36, -33, -37, -44, -29, -44, -113, -31, -44, -30, -33, -34, -35, -30, -44, -99, -65, -35, -28, -44, -39, -46, -117, -33, -38, -117, -35, -48, -52, -49, -117, -73, -70, -60, -51, -125, -68, -65, -62, -69, -125, -71, -73, -71, -66, -69, -18, 0, 0, -14, 1, -57, -68, -68, -68, 5, 8, 11, 4, -39, -50, -50, -50, 0, 13, 3, 17, 14, 8, 3, -2, 0, 18, 18, 4, 19, -50};
        String[] strArr = A0A;
        if (strArr[1].charAt(5) == strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A0A[6] = "1YrvosXM8zHw8wsMUb3ulJ8Xgx5scBHO";
    }

    static {
        A04();
        A0B = C1448av.class.getSimpleName();
    }

    public C1448av(C7Q c7q, AnonymousClass08 anonymousClass08, C0L c0l) {
        this.A05 = c7q;
        this.A08 = anonymousClass08.A02();
        this.A00 = anonymousClass08.A00();
        this.A04 = c0l;
        this.A01 = anonymousClass08.A01();
        this.A02 = anonymousClass08;
    }

    public static C1446at A00(Context context, String str) throws C0H {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStreamOpen.read(bArr, 0, bArr.length);
                if (i10 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                } else {
                    return new C1446at(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e10) {
            throw new C0H(A03(131, 18, 33), e10);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 10));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba A[Catch: all -> 0x0121, 0H -> 0x0123, TRY_ENTER, TryCatch #15 {0H -> 0x0123, blocks: (B:12:0x007c, B:36:0x0106, B:42:0x0119, B:34:0x0100, B:26:0x00ba, B:28:0x00c2), top: B:98:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c2 A[Catch: all -> 0x0121, 0H -> 0x0123, TryCatch #15 {0H -> 0x0123, blocks: (B:12:0x007c, B:36:0x0106, B:42:0x0119, B:34:0x0100, B:26:0x00ba, B:28:0x00c2), top: B:98:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2 A[Catch: all -> 0x0163, 0H -> 0x0165, TRY_ENTER, TryCatch #14 {0H -> 0x0165, blocks: (B:9:0x0051, B:15:0x0089, B:40:0x0113, B:47:0x0125, B:37:0x010a, B:39:0x0110, B:31:0x00f2, B:32:0x00f9), top: B:100:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0100 A[Catch: all -> 0x0121, 0H -> 0x0123, LOOP:0: B:32:0x00f9->B:34:0x0100, LOOP_END, TRY_ENTER, TryCatch #15 {0H -> 0x0123, blocks: (B:12:0x007c, B:36:0x0106, B:42:0x0119, B:34:0x0100, B:26:0x00ba, B:28:0x00c2), top: B:98:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0106 A[ADDED_TO_REGION, Catch: all -> 0x0121, 0H -> 0x0123, REMOVE, TRY_LEAVE, TryCatch #15 {0H -> 0x0123, blocks: (B:12:0x007c, B:36:0x0106, B:42:0x0119, B:34:0x0100, B:26:0x00ba, B:28:0x00c2), top: B:98:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x010a A[Catch: all -> 0x0163, 0H -> 0x0165, TRY_ENTER, TryCatch #14 {0H -> 0x0165, blocks: (B:9:0x0051, B:15:0x0089, B:40:0x0113, B:47:0x0125, B:37:0x010a, B:39:0x0110, B:31:0x00f2, B:32:0x00f9), top: B:100:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0119 A[Catch: all -> 0x0121, 0H -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #15 {0H -> 0x0123, blocks: (B:12:0x007c, B:36:0x0106, B:42:0x0119, B:34:0x0100, B:26:0x00ba, B:28:0x00c2), top: B:98:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:96:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void A05(Context context, C1444ar c1444ar, String str, int i10, int i11, long j10) throws Throwable {
        C0K c1443aq;
        int iA06;
        int iA03;
        int length;
        boolean z10;
        boolean zA07;
        byte[] bArr;
        int i12;
        int iA07;
        String strA03 = A03(263, 20, 39);
        String strA04 = A03(342, 22, 83);
        if (str.startsWith(strA04)) {
            String localUrl = str.substring(strA04.length());
            c1443aq = A00(context, localUrl);
        } else {
            String strA05 = A03(333, 9, 65);
            if (str.startsWith(strA05)) {
                String localUrl2 = str.substring(strA05.length());
                c1443aq = A00(context, localUrl2);
            } else {
                c1443aq = new C1443aq(str, i10);
            }
        }
        try {
            if (this.A08) {
                try {
                    try {
                        String str2 = A03(303, 15, 31) + str + A03(38, 11, 9) + i11;
                        iA03 = c1444ar.A03();
                        length = c1443aq.length();
                        if (A0A[2].length() != 16) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0A;
                        strArr[1] = "eTbeym3Ey2TfwhNFyBG6ZkfAKtzQxWab";
                        strArr[3] = "sd4JUTjhNLXLgefrlj4RQDt9w4Pjz5Uj";
                        if (length < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            zA07 = A07(c1444ar);
                            if (this.A08) {
                                String str3 = A03(149, 21, 44) + str + A03(22, 16, 73) + zA07;
                            }
                        }
                        try {
                            try {
                                if (!z10 || iA03 < length) {
                                    c1443aq.ADR(iA03);
                                    bArr = new byte[8192];
                                    while (true) {
                                        i12 = c1443aq.read(bArr);
                                        if (i12 == -1) {
                                            break;
                                        } else {
                                            c1444ar.A08(bArr, i12);
                                        }
                                    }
                                    if (!z10 || c1444ar.A03() == length) {
                                        c1444ar.A07();
                                        iA07 = 0;
                                        if (c1443aq instanceof C1443aq) {
                                            iA07 = ((C1443aq) c1443aq).A06();
                                        }
                                        this.A05.A07().A9U(j10, System.currentTimeMillis() - j10, c1444ar.A03(), 0L, iA07, null);
                                        c1443aq.close();
                                        return;
                                    }
                                    throw new C1445as(A03(283, 20, 35));
                                }
                                c1443aq.close();
                                return;
                            } catch (C0H | IllegalArgumentException e10) {
                                if (this.A08) {
                                    Log.e(A0B, strA03, e10);
                                    return;
                                }
                                return;
                            }
                            if (!z10) {
                                c1444ar.A07();
                            } else {
                                throw new C1445as(A03(283, 20, 35));
                            }
                            iA07 = 0;
                            if (c1443aq instanceof C1443aq) {
                                iA07 = ((C1443aq) c1443aq).A06();
                            }
                            this.A05.A07().A9U(j10, System.currentTimeMillis() - j10, c1444ar.A03(), 0L, iA07, null);
                        } catch (C0H e11) {
                            e = e11;
                        }
                    } catch (C0H e12) {
                        e = e12;
                    }
                } catch (C0H e13) {
                    e = e13;
                }
                iA06 = 0;
                if (c1443aq instanceof C1443aq) {
                    iA06 = ((C1443aq) c1443aq).A06();
                }
                try {
                    this.A05.A07().A9U(j10, System.currentTimeMillis() - j10, 0L, 0L, iA06, null);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } else {
                iA03 = c1444ar.A03();
                length = c1443aq.length();
                if (A0A[2].length() != 16) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[1] = "eTbeym3Ey2TfwhNFyBG6ZkfAKtzQxWab";
                strArr2[3] = "sd4JUTjhNLXLgefrlj4RQDt9w4Pjz5Uj";
                if (length < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    zA07 = A07(c1444ar);
                    if (this.A08) {
                        String str4 = A03(149, 21, 44) + str + A03(22, 16, 73) + zA07;
                    }
                }
                if (!z10) {
                    c1443aq.ADR(iA03);
                    bArr = new byte[8192];
                    while (true) {
                        i12 = c1443aq.read(bArr);
                        if (i12 == -1) {
                            break;
                        } else {
                            c1444ar.A08(bArr, i12);
                        }
                    }
                    if (!z10) {
                        c1444ar.A07();
                    } else {
                        throw new C1445as(A03(283, 20, 35));
                    }
                    iA07 = 0;
                    if (c1443aq instanceof C1443aq) {
                        iA07 = ((C1443aq) c1443aq).A06();
                    }
                    this.A05.A07().A9U(j10, System.currentTimeMillis() - j10, c1444ar.A03(), 0L, iA07, null);
                    c1443aq.close();
                    return;
                }
                c1443aq.ADR(iA03);
                bArr = new byte[8192];
                while (true) {
                    i12 = c1443aq.read(bArr);
                    if (i12 == -1) {
                        break;
                    } else {
                        c1444ar.A08(bArr, i12);
                    }
                }
                if (!z10) {
                    c1444ar.A07();
                } else {
                    throw new C1445as(A03(283, 20, 35));
                }
                iA07 = 0;
                if (c1443aq instanceof C1443aq) {
                    iA07 = ((C1443aq) c1443aq).A06();
                }
                this.A05.A07().A9U(j10, System.currentTimeMillis() - j10, c1444ar.A03(), 0L, iA07, null);
                c1443aq.close();
                return;
                if (!z10) {
                    c1444ar.A07();
                } else {
                    throw new C1445as(A03(283, 20, 35));
                }
                iA07 = 0;
                if (c1443aq instanceof C1443aq) {
                    iA07 = ((C1443aq) c1443aq).A06();
                }
                this.A05.A07().A9U(j10, System.currentTimeMillis() - j10, c1444ar.A03(), 0L, iA07, null);
                c1443aq.close();
                return;
                iA06 = 0;
                if (c1443aq instanceof C1443aq) {
                    iA06 = ((C1443aq) c1443aq).A06();
                }
                this.A05.A07().A9U(j10, System.currentTimeMillis() - j10, 0L, 0L, iA06, null);
                throw e;
            }
        } catch (C0H e14) {
            e = e14;
        }
        try {
            c1443aq.close();
        } catch (C0H | IllegalArgumentException e15) {
            boolean z11 = this.A08;
            String[] strArr3 = A0A;
            if (strArr3[5].length() != strArr3[7].length()) {
                A0A[6] = "T9HhHUPHmRtDRYih6csTBmWckuigXZik";
                if (z11) {
                    Log.e(A0B, strA03, e15);
                }
            } else if (z11) {
                Log.e(A0B, strA03, e15);
            }
        }
        throw th;
    }

    private void A06(C1444ar c1444ar) {
        try {
            File fileA04 = c1444ar.A04();
            if (fileA04.exists()) {
                c1444ar.A06();
                boolean zDelete = fileA04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 40) + zDelete);
                }
            }
        } catch (Exception e10) {
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 81), e10);
            }
        }
    }

    private boolean A07(C1444ar c1444ar) {
        try {
            c1444ar.A05();
            return true;
        } catch (C1442ap e10) {
            boolean z10 = this.A08;
            if (A0A[6].charAt(7) == 'U') {
                throw new RuntimeException();
            }
            A0A[6] = "AEs2mSbxTVyMZvMH4XlDgcN9VznTkYzp";
            if (z10) {
                Log.e(A0B, A03(244, 19, 57), e10);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> AnonymousClass02<T> A08(AnonymousClass06 anonymousClass06, AnonymousClass09<T> anonymousClass09) {
        Semaphore semaphore;
        if (anonymousClass09.A03()) {
            File file = this.A06.get(anonymousClass06.A09);
            if (file != null) {
                this.A04.AE7(anonymousClass06.A09, true, anonymousClass06);
                return anonymousClass09.A00().A3H(file, this.A04);
            }
            this.A04.AE7(anonymousClass06.A09, false, anonymousClass06);
            return new AnonymousClass02<>(false, null);
        }
        String str = anonymousClass06.A09;
        String str2 = anonymousClass06.A04;
        StringBuilder sb2 = new StringBuilder();
        String baseUrl = this.A03.A03(str);
        String extension = sb2.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            File fileA02 = A02(anonymousClass06, str, extension, this.A01, anonymousClass09);
            if (fileA02 != null) {
                AnonymousClass02<T> anonymousClass02A3H = anonymousClass09.A00().A3H(fileA02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return anonymousClass02A3H;
            }
            AnonymousClass02<T> anonymousClass02 = new AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return anonymousClass02;
        } catch (InterruptedException unused) {
            if (this.A08) {
                StringBuilder sb3 = new StringBuilder();
                String baseUrl2 = A03(97, 11, 22);
                StringBuilder sbAppend = sb3.append(baseUrl2).append(str);
                String baseUrl3 = A03(0, 22, 43);
                sbAppend.append(baseUrl3).toString();
            }
            AnonymousClass02<T> anonymousClass03 = new AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return anonymousClass03;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final AnonymousClass02<Bitmap> AEW(AnonymousClass06 anonymousClass06, boolean z10) {
        return A08(anonymousClass06, new AnonymousClass09(new C1451ay(anonymousClass06.A01, anonymousClass06.A00, this.A02.A04(), this.A02.A03(), z10)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final File AEX(AnonymousClass06 anonymousClass06) {
        AnonymousClass09 anonymousClass09 = new AnonymousClass09(new C1450ax());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (File) A08(anonymousClass06, anonymousClass09).A00();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final String AEY(AnonymousClass06 anonymousClass06) {
        return (String) A08(anonymousClass06, new AnonymousClass09(new C1449aw())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass00
    public final String AEZ(AnonymousClass06 anonymousClass06) {
        AnonymousClass09 anonymousClass09 = new AnonymousClass09(new C1449aw());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (String) A08(anonymousClass06, anonymousClass09).A00();
    }
}
