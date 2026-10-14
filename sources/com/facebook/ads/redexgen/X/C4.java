package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4 {
    public static byte[] A00;
    public static String[] A01 = {"b", "1fRxwJ5XE31BEFto", "uScK6DjhwaakoKLKywWqQqJcG3f6AUTY", "4Hlq2lRki9cJUEzjlqXKmdMa0dcUUFBD", "g78w6vvkNWOU54nDIB5PtPh0iS7AkCQe", "b", "Krct3XGjvdQG30dTRHyGL58gGhCYlC87", "LauCO"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<long[], long[]> A05(WW ww) {
        WV wvA07;
        if (ww == null || (wvA07 = ww.A07(AbstractC0790Bz.A0P)) == null) {
            return Pair.create(null, null);
        }
        C0914Hf c0914Hf = wvA07.A00;
        c0914Hf.A0Y(8);
        int iA01 = AbstractC0790Bz.A01(c0914Hf.A08());
        int iA0H = c0914Hf.A0H();
        long[] jArr = new long[iA0H];
        long[] jArr2 = new long[iA0H];
        for (int i10 = 0; i10 < iA0H; i10++) {
            jArr[i10] = iA01 == 1 ? c0914Hf.A0N() : c0914Hf.A0M();
            jArr2[i10] = iA01 == 1 ? c0914Hf.A0L() : c0914Hf.A08();
            if (c0914Hf.A0U() != 1) {
                throw new IllegalArgumentException(A0I(272, 23, 92));
            }
            c0914Hf.A0Z(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3 A0B(C0914Hf c0914Hf) {
        long jA0M;
        int i10;
        c0914Hf.A0Y(8);
        int iA01 = AbstractC0790Bz.A01(c0914Hf.A08());
        c0914Hf.A0Z(iA01 == 0 ? 8 : 16);
        int iA08 = c0914Hf.A08();
        c0914Hf.A0Z(4);
        boolean z10 = true;
        String[] strArr = A01;
        if (strArr[0].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "r";
        strArr2[5] = "s";
        int iA06 = c0914Hf.A06();
        int i11 = iA01 == 0 ? 4 : 8;
        for (int i12 = 0; i12 < i11; i12++) {
            if (c0914Hf.A00[iA06 + i12] != -1) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            c0914Hf.A0Z(i11);
            jA0M = -9223372036854775807L;
        } else {
            jA0M = iA01 == 0 ? c0914Hf.A0M() : c0914Hf.A0N();
            if (jA0M == 0) {
                jA0M = -9223372036854775807L;
            }
        }
        c0914Hf.A0Z(16);
        int iA09 = c0914Hf.A08();
        int iA010 = c0914Hf.A08();
        c0914Hf.A0Z(4);
        int iA011 = c0914Hf.A08();
        int iA012 = c0914Hf.A08();
        if (iA09 == 0 && iA010 == 65536 && iA011 == (-65536) && iA012 == 0) {
            i10 = 90;
        } else if (iA09 == 0 && iA010 == (-65536) && iA011 == 65536 && iA012 == 0) {
            i10 = 270;
        } else {
            i10 = (iA09 == (-65536) && iA010 == 0 && iA011 == 0 && iA012 == (-65536)) ? BaseTransientBottomBar.ANIMATION_FADE_DURATION : 0;
        }
        return new C3(iA08, jA0M, i10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static CK A0C(WW ww, WV wv, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws C07249b {
        long j11 = j10;
        WW wwA06 = ww.A06(AbstractC0790Bz.A0e);
        int iA02 = A02(wwA06.A07(AbstractC0790Bz.A0W).A00);
        if (iA02 == -1) {
            return null;
        }
        C3 c3A0B = A0B(ww.A07(AbstractC0790Bz.A1K).A00);
        if (j11 == -9223372036854775807L) {
            j11 = c3A0B.A02;
        }
        long jA04 = A04(wv.A00);
        if (A01[6].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A01[7] = "VRI";
        long jA0F = j11 == -9223372036854775807L ? -9223372036854775807L : C0930Hv.A0F(j11, 1000000L, jA04);
        WW wwA07 = wwA06.A06(AbstractC0790Bz.A0i).A06(AbstractC0790Bz.A17);
        Pair<Long, String> pairA06 = A06(wwA06.A07(AbstractC0790Bz.A0d).A00);
        C2 c2A0A = A0A(wwA07.A07(AbstractC0790Bz.A1B).A00, c3A0B.A00, c3A0B.A01, (String) pairA06.second, drmInitData, z11);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z10) {
            Pair<long[], long[]> pairA05 = A05(ww.A06(AbstractC0790Bz.A0O));
            jArr = (long[]) pairA05.first;
            jArr2 = (long[]) pairA05.second;
        }
        if (c2A0A.A02 == null) {
            return null;
        }
        return new CK(c3A0B.A00, iA02, ((Long) pairA06.first).longValue(), jA04, jA0F, c2A0A.A02, c2A0A.A01, c2A0A.A03, c2A0A.A00, jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static CL A0D(C0914Hf c0914Hf, int i10, int i11, String str) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            c0914Hf.A0Y(i12);
            int iA08 = c0914Hf.A08();
            if (c0914Hf.A08() == AbstractC0790Bz.A1H) {
                int iA01 = AbstractC0790Bz.A01(c0914Hf.A08());
                c0914Hf.A0Z(1);
                int i13 = 0;
                int i14 = 0;
                if (iA01 == 0) {
                    c0914Hf.A0Z(1);
                } else {
                    int iA0E = c0914Hf.A0E();
                    i13 = (iA0E & 240) >> 4;
                    i14 = iA0E & 15;
                }
                boolean z10 = c0914Hf.A0E() == 1;
                int iA0E2 = c0914Hf.A0E();
                byte[] bArr = new byte[16];
                c0914Hf.A0c(bArr, 0, bArr.length);
                byte[] bArr2 = null;
                if (z10 && iA0E2 == 0) {
                    int iA0E3 = c0914Hf.A0E();
                    if (A01[3].charAt(18) == 'y') {
                        throw new RuntimeException();
                    }
                    A01[6] = "4wz2pNpdOED2I1F7uwyPx7ja9AIbtNj6";
                    bArr2 = new byte[iA0E3];
                    c0914Hf.A0c(bArr2, 0, iA0E3);
                }
                return new CL(z10, str, iA0E2, bArr, i13, i14, bArr2);
            }
            i12 += iA08;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0289  */
    /* JADX WARN: Code duplicated, block: B:106:0x0301  */
    /* JADX WARN: Code duplicated, block: B:157:0x044e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0511  */
    /* JADX WARN: Code duplicated, block: B:207:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01b8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x013d A[ADDED_TO_REGION, LOOP:1: B:48:0x013d->B:51:0x0154, LOOP_START, PHI: r5 r9
  0x013d: PHI (r5v27 long) = (r5v21 long), (r5v30 long) binds: [B:47:0x013b, B:51:0x0154] A[DONT_GENERATE, DONT_INLINE]
  0x013d: PHI (r9v20 int) = (r9v19 int), (r9v22 int) binds: [B:47:0x013b, B:51:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x013f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154 A[LOOP:1: B:48:0x013d->B:51:0x0154, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0162 A[ADDED_TO_REGION, LOOP:2: B:53:0x0162->B:55:0x0166, LOOP_START, PHI: r26 r27 r28
  0x0162: PHI (r26v5 int) = (r26v3 int), (r26v6 int) binds: [B:52:0x0160, B:55:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r27v7 int) = (r27v3 int), (r27v8 int) binds: [B:52:0x0160, B:55:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r28v6 int) = (r28v4 int), (r28v8 int) binds: [B:52:0x0160, B:55:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0182  */
    /* JADX WARN: Code duplicated, block: B:62:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196  */
    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x020a A[LOOP:8: B:92:0x0204->B:94:0x020a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0228  */
    /* JADX WARN: Code duplicated, block: B:98:0x024f  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static CN A0E(CK ck, WW ww, C0776Bc c0776Bc) throws C07249b {
        C1 wt;
        boolean z10;
        int i10;
        long j10;
        String strA0I;
        long[] jArr;
        int[] iArr;
        Format format;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long j11;
        long jA0F;
        boolean z11;
        long j12;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        int i13;
        WV wvA07 = ww.A07(AbstractC0790Bz.A1D);
        if (wvA07 != null) {
            wt = new WU(wvA07);
        } else {
            WV wvA08 = ww.A07(AbstractC0790Bz.A1F);
            if (wvA08 == null) {
                throw new C07249b(A0I(230, 42, 96));
            }
            wt = new WT(wvA08);
        }
        int iA7f = wt.A7f();
        if (iA7f == 0) {
            return new CN(ck, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        boolean z14 = false;
        WV wvA09 = ww.A07(AbstractC0790Bz.A18);
        if (wvA09 == null) {
            z14 = true;
            wvA09 = ww.A07(AbstractC0790Bz.A0C);
        }
        C0914Hf c0914Hf = wvA09.A00;
        C0914Hf c0914Hf2 = ww.A07(AbstractC0790Bz.A1A).A00;
        int i14 = AbstractC0790Bz.A1E;
        if (A01[4].charAt(24) == 'i') {
            A01[3] = "VC45zkewNZzpqmaBl1H7tUMq9GmKccOG";
            C0914Hf c0914Hf3 = ww.A07(i14).A00;
            WV wvA010 = ww.A07(AbstractC0790Bz.A1C);
            C0914Hf c0914Hf4 = wvA010 != null ? wvA010.A00 : null;
            WV wvA011 = ww.A07(AbstractC0790Bz.A0D);
            C0914Hf c0914Hf5 = wvA011 != null ? wvA011.A00 : null;
            C0 c10 = new C0(c0914Hf2, c0914Hf, z14);
            c0914Hf3.A0Y(12);
            int iA0H = c0914Hf3.A0H() - 1;
            int iA0H2 = c0914Hf3.A0H();
            int iA0H3 = c0914Hf3.A0H();
            int iA0H4 = 0;
            int iA0H5 = 0;
            int iA08 = 0;
            if (c0914Hf5 != null) {
                c0914Hf5.A0Y(12);
                iA0H5 = c0914Hf5.A0H();
            }
            int iA0H6 = -1;
            int iA0H7 = 0;
            if (c0914Hf4 != null) {
                c0914Hf4.A0Y(12);
                iA0H7 = c0914Hf4.A0H();
                if (iA0H7 > 0) {
                    iA0H6 = c0914Hf4.A0H() - 1;
                } else {
                    c0914Hf4 = null;
                }
            }
            boolean zA8r = wt.A8r();
            if (A01[7].length() == 14) {
                A01[3] = "JmCEQgBO3I7S12cR5vZQ3WUXD6vvV57N";
                if (zA8r) {
                    if (!A0I(492, 9, 73).equals(ck.A07.A0O)) {
                    }
                }
                i10 = 0;
                j10 = 0;
                strA0I = A0I(128, 11, 7);
                if (z10) {
                    jArr = new long[c10.A05];
                    iArr = new int[c10.A05];
                    while (c10.A02()) {
                        jArr[c10.A00] = c10.A02;
                        iArr[c10.A00] = c10.A01;
                    }
                    format = ck.A07;
                    if (A01[6].charAt(18) != 'y') {
                        C7 c7A00 = C8.A00(C0930Hv.A05(format.A0A, ck.A07.A05), jArr, iArr, iA0H3);
                        jArr2 = c7A00.A04;
                        iArr2 = c7A00.A03;
                        i10 = c7A00.A00;
                        jArr3 = c7A00.A05;
                        iArr3 = c7A00.A02;
                        j11 = c7A00.A01;
                    } else {
                        String[] strArr = A01;
                        strArr[0] = "5";
                        strArr[5] = "P";
                        C7 c7A01 = C8.A00(C0930Hv.A05(format.A0A, ck.A07.A05), jArr, iArr, iA0H3);
                        jArr2 = c7A01.A04;
                        iArr2 = c7A01.A03;
                        i10 = c7A01.A00;
                        jArr3 = c7A01.A05;
                        iArr3 = c7A01.A02;
                        j11 = c7A01.A01;
                    }
                } else {
                    jArr2 = new long[iA7f];
                    iArr2 = new int[iA7f];
                    jArr3 = new long[iA7f];
                    iArr3 = new int[iA7f];
                    j12 = 0;
                    i11 = 0;
                    for (i12 = 0; i12 < iA7f; i12++) {
                        while (i11 == 0) {
                            HG.A04(c10.A02());
                            if (A01[2].charAt(2) != 't') {
                                A01[7] = "3XDIuarfTH54Gh2sDFB8u";
                                j12 = c10.A02;
                                i11 = c10.A01;
                            }
                        }
                        if (c0914Hf5 != null) {
                            while (iA0H4 == 0) {
                                iA0H4 = c0914Hf5.A0H();
                                iA08 = c0914Hf5.A08();
                                iA0H5--;
                            }
                            iA0H4--;
                        }
                        jArr2[i12] = j12;
                        iArr2[i12] = wt.AE4();
                        if (iArr2[i12] > i10) {
                            i10 = iArr2[i12];
                        }
                        jArr3[i12] = j10 + ((long) iA08);
                        if (c0914Hf4 == null) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        iArr3[i12] = i13;
                        if (i12 == iA0H6) {
                            iArr3[i12] = 1;
                            iA0H7--;
                            if (iA0H7 > 0) {
                                iA0H6 = c0914Hf4.A0H() - 1;
                            }
                        }
                        j10 += (long) iA0H3;
                        iA0H2--;
                        if (iA0H2 != 0) {
                        }
                        j12 += (long) iArr2[i12];
                        i11--;
                    }
                    j11 = j10 + ((long) iA08);
                    if (iA0H4 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    HG.A03(z12);
                    while (iA0H5 > 0) {
                        if (c0914Hf5.A0H() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        HG.A03(z13);
                        c0914Hf5.A08();
                        iA0H5--;
                    }
                    if (iA0H7 == 0) {
                        Log.w(strA0I, A0I(198, 32, 66) + ck.A00 + A0I(94, 34, 29) + iA0H7 + A0I(0, 35, 33) + iA0H2 + A0I(35, 26, 27) + i11 + A0I(61, 33, 101) + iA0H);
                    } else {
                        Log.w(strA0I, A0I(198, 32, 66) + ck.A00 + A0I(94, 34, 29) + iA0H7 + A0I(0, 35, 33) + iA0H2 + A0I(35, 26, 27) + i11 + A0I(61, 33, 101) + iA0H);
                    }
                }
                jA0F = C0930Hv.A0F(j11, 1000000L, ck.A06);
                if (ck.A08 != null) {
                }
                C0930Hv.A0a(jArr3, 1000000L, ck.A06);
                return new CN(ck, jArr2, iArr2, i10, jArr3, iArr3, jA0F);
            }
            A01[4] = "hEJdTsd1BrdgtnhVHuIKNZxoiMcvZFQc";
            if (zA8r) {
                if (!A0I(492, 9, 73).equals(ck.A07.A0O) && iA0H == 0 && iA0H5 == 0 && iA0H7 == 0) {
                    z10 = true;
                }
            }
            i10 = 0;
            j10 = 0;
            strA0I = A0I(128, 11, 7);
            if (z10) {
                jArr2 = new long[iA7f];
                iArr2 = new int[iA7f];
                jArr3 = new long[iA7f];
                iArr3 = new int[iA7f];
                j12 = 0;
                i11 = 0;
                while (i12 < iA7f) {
                    while (i11 == 0) {
                        HG.A04(c10.A02());
                        if (A01[2].charAt(2) != 't') {
                            A01[7] = "3XDIuarfTH54Gh2sDFB8u";
                            j12 = c10.A02;
                            i11 = c10.A01;
                        }
                    }
                    if (c0914Hf5 != null) {
                        while (iA0H4 == 0 && iA0H5 > 0) {
                            iA0H4 = c0914Hf5.A0H();
                            iA08 = c0914Hf5.A08();
                            iA0H5--;
                        }
                        iA0H4--;
                    }
                    jArr2[i12] = j12;
                    iArr2[i12] = wt.AE4();
                    if (iArr2[i12] > i10) {
                        i10 = iArr2[i12];
                    }
                    jArr3[i12] = j10 + ((long) iA08);
                    if (c0914Hf4 == null) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    iArr3[i12] = i13;
                    if (i12 == iA0H6) {
                        iArr3[i12] = 1;
                        iA0H7--;
                        if (iA0H7 > 0) {
                            iA0H6 = c0914Hf4.A0H() - 1;
                        }
                    }
                    j10 += (long) iA0H3;
                    iA0H2--;
                    if (iA0H2 != 0 && iA0H > 0) {
                        iA0H2 = c0914Hf3.A0H();
                        iA0H3 = c0914Hf3.A08();
                        iA0H--;
                    }
                    j12 += (long) iArr2[i12];
                    i11--;
                }
                j11 = j10 + ((long) iA08);
                if (iA0H4 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                HG.A03(z12);
                while (iA0H5 > 0) {
                    if (c0914Hf5.A0H() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    HG.A03(z13);
                    c0914Hf5.A08();
                    iA0H5--;
                }
                if (iA0H7 == 0 || iA0H2 != 0 || i11 != 0 || iA0H != 0) {
                    Log.w(strA0I, A0I(198, 32, 66) + ck.A00 + A0I(94, 34, 29) + iA0H7 + A0I(0, 35, 33) + iA0H2 + A0I(35, 26, 27) + i11 + A0I(61, 33, 101) + iA0H);
                }
            } else {
                jArr = new long[c10.A05];
                iArr = new int[c10.A05];
                while (c10.A02()) {
                    jArr[c10.A00] = c10.A02;
                    iArr[c10.A00] = c10.A01;
                }
                format = ck.A07;
                if (A01[6].charAt(18) != 'y') {
                    C7 c7A02 = C8.A00(C0930Hv.A05(format.A0A, ck.A07.A05), jArr, iArr, iA0H3);
                    jArr2 = c7A02.A04;
                    iArr2 = c7A02.A03;
                    i10 = c7A02.A00;
                    jArr3 = c7A02.A05;
                    iArr3 = c7A02.A02;
                    j11 = c7A02.A01;
                } else {
                    String[] strArr2 = A01;
                    strArr2[0] = "5";
                    strArr2[5] = "P";
                    C7 c7A03 = C8.A00(C0930Hv.A05(format.A0A, ck.A07.A05), jArr, iArr, iA0H3);
                    jArr2 = c7A03.A04;
                    iArr2 = c7A03.A03;
                    i10 = c7A03.A00;
                    jArr3 = c7A03.A05;
                    iArr3 = c7A03.A02;
                    j11 = c7A03.A01;
                }
            }
            jA0F = C0930Hv.A0F(j11, 1000000L, ck.A06);
            if (ck.A08 != null || c0776Bc.A03()) {
                C0930Hv.A0a(jArr3, 1000000L, ck.A06);
                return new CN(ck, jArr2, iArr2, i10, jArr3, iArr3, jA0F);
            }
            if (ck.A08.length == 1 && ck.A03 == 1 && jArr3.length >= 2) {
                long j13 = ck.A09[0];
                long jA0F2 = j13 + C0930Hv.A0F(ck.A08[0], ck.A06, ck.A05);
                if (A0N(jArr3, j11, j13, jA0F2)) {
                    long jA0F3 = C0930Hv.A0F(j13 - jArr3[0], ck.A07.A0C, ck.A06);
                    long jA0F4 = C0930Hv.A0F(j11 - jA0F2, ck.A07.A0C, ck.A06);
                    if ((jA0F3 != 0 || jA0F4 != 0) && jA0F3 <= 2147483647L && jA0F4 <= 2147483647L) {
                        c0776Bc.A00 = (int) jA0F3;
                        c0776Bc.A01 = (int) jA0F4;
                        C0930Hv.A0a(jArr3, 1000000L, ck.A06);
                        return new CN(ck, jArr2, iArr2, i10, jArr3, iArr3, jA0F);
                    }
                }
            }
            if (ck.A08.length == 1) {
                long[] jArr4 = ck.A08;
                if (A01[7].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A01;
                strArr3[0] = "2";
                strArr3[5] = "c";
                if (jArr4[0] == 0) {
                    long j14 = ck.A09[0];
                    for (int i15 = 0; i15 < jArr3.length; i15++) {
                        jArr3[i15] = C0930Hv.A0F(jArr3[i15] - j14, 1000000L, ck.A06);
                    }
                    return new CN(ck, jArr2, iArr2, i10, jArr3, iArr3, C0930Hv.A0F(j11 - j14, 1000000L, ck.A06));
                }
            }
            boolean z15 = ck.A03 == 1;
            int i16 = 0;
            int i17 = 0;
            boolean z16 = false;
            for (int i18 = 0; i18 < ck.A08.length; i18++) {
                long j15 = ck.A09[i18];
                if (j15 != -1) {
                    long jA0F5 = C0930Hv.A0F(ck.A08[i18], ck.A06, ck.A05);
                    int iA0A = C0930Hv.A0A(jArr3, j15, true, true);
                    int iA0A2 = C0930Hv.A0A(jArr3, j15 + jA0F5, z15, false);
                    i16 += iA0A2 - iA0A;
                    z16 |= i17 != iA0A;
                    i17 = iA0A2;
                }
            }
            if (A01[1].length() != 12) {
                A01[6] = "kwnW70E81yVLGqt4h2ynIc7oXyulLjyz";
                if (i16 != iA7f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                A01[4] = "IBcqblQzdyIwYrCXVHJIvpyFiJoNYMYn";
                if (i16 != iA7f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            boolean z17 = z16 | z11;
            long[] jArr5 = z17 ? new long[i16] : jArr2;
            int[] iArr4 = z17 ? new int[i16] : iArr2;
            if (z17) {
                i10 = 0;
            }
            int[] iArr5 = z17 ? new int[i16] : iArr3;
            long[] jArr6 = new long[i16];
            long j16 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < ck.A08.length; i20++) {
                long j17 = ck.A09[i20];
                long j18 = ck.A08[i20];
                if (j17 != -1) {
                    long jA0F6 = C0930Hv.A0F(j18, ck.A06, ck.A05) + j17;
                    int iA0A3 = C0930Hv.A0A(jArr3, j17, true, true);
                    int iA0A4 = C0930Hv.A0A(jArr3, jA0F6, z15, false);
                    if (z17) {
                        int i21 = iA0A4 - iA0A3;
                        System.arraycopy(jArr2, iA0A3, jArr5, i19, i21);
                        System.arraycopy(iArr2, iA0A3, iArr4, i19, i21);
                        System.arraycopy(iArr3, iA0A3, iArr5, i19, i21);
                    }
                    if (iA0A3 < iA0A4 && (iArr5[i19] & 1) == 0) {
                        Log.w(strA0I, A0I(139, 59, 39));
                        throw new WS();
                    }
                    while (iA0A3 < iA0A4) {
                        jArr6[i19] = C0930Hv.A0F(j16, 1000000L, ck.A05) + C0930Hv.A0F(jArr3[iA0A3] - j17, 1000000L, ck.A06);
                        if (z17 && iArr4[i19] > i10) {
                            i10 = iArr2[iA0A3];
                        }
                        i19++;
                        iA0A3++;
                    }
                    if (A01[7].length() != 14) {
                        A01[7] = "ss";
                    }
                }
                j16 += j18;
            }
            return new CN(ck, jArr5, iArr4, i10, jArr6, iArr5, C0930Hv.A0F(j16, 1000000L, ck.A06));
            z10 = false;
            i10 = 0;
            j10 = 0;
            strA0I = A0I(128, 11, 7);
            if (z10) {
                jArr2 = new long[iA7f];
                iArr2 = new int[iA7f];
                jArr3 = new long[iA7f];
                iArr3 = new int[iA7f];
                j12 = 0;
                i11 = 0;
                while (i12 < iA7f) {
                    while (i11 == 0) {
                        HG.A04(c10.A02());
                        if (A01[2].charAt(2) != 't') {
                            A01[7] = "3XDIuarfTH54Gh2sDFB8u";
                            j12 = c10.A02;
                            i11 = c10.A01;
                        }
                    }
                    if (c0914Hf5 != null) {
                        while (iA0H4 == 0) {
                            iA0H4 = c0914Hf5.A0H();
                            iA08 = c0914Hf5.A08();
                            iA0H5--;
                        }
                        iA0H4--;
                    }
                    jArr2[i12] = j12;
                    iArr2[i12] = wt.AE4();
                    if (iArr2[i12] > i10) {
                        i10 = iArr2[i12];
                    }
                    jArr3[i12] = j10 + ((long) iA08);
                    if (c0914Hf4 == null) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    iArr3[i12] = i13;
                    if (i12 == iA0H6) {
                        iArr3[i12] = 1;
                        iA0H7--;
                        if (iA0H7 > 0) {
                            iA0H6 = c0914Hf4.A0H() - 1;
                        }
                    }
                    j10 += (long) iA0H3;
                    iA0H2--;
                    if (iA0H2 != 0) {
                    }
                    j12 += (long) iArr2[i12];
                    i11--;
                }
                j11 = j10 + ((long) iA08);
                if (iA0H4 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                HG.A03(z12);
                while (iA0H5 > 0) {
                    if (c0914Hf5.A0H() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    HG.A03(z13);
                    c0914Hf5.A08();
                    iA0H5--;
                }
                if (iA0H7 == 0) {
                    Log.w(strA0I, A0I(198, 32, 66) + ck.A00 + A0I(94, 34, 29) + iA0H7 + A0I(0, 35, 33) + iA0H2 + A0I(35, 26, 27) + i11 + A0I(61, 33, 101) + iA0H);
                } else {
                    Log.w(strA0I, A0I(198, 32, 66) + ck.A00 + A0I(94, 34, 29) + iA0H7 + A0I(0, 35, 33) + iA0H2 + A0I(35, 26, 27) + i11 + A0I(61, 33, 101) + iA0H);
                }
            } else {
                jArr = new long[c10.A05];
                iArr = new int[c10.A05];
                while (c10.A02()) {
                    jArr[c10.A00] = c10.A02;
                    iArr[c10.A00] = c10.A01;
                }
                format = ck.A07;
                if (A01[6].charAt(18) != 'y') {
                    C7 c7A04 = C8.A00(C0930Hv.A05(format.A0A, ck.A07.A05), jArr, iArr, iA0H3);
                    jArr2 = c7A04.A04;
                    iArr2 = c7A04.A03;
                    i10 = c7A04.A00;
                    jArr3 = c7A04.A05;
                    iArr3 = c7A04.A02;
                    j11 = c7A04.A01;
                } else {
                    String[] strArr4 = A01;
                    strArr4[0] = "5";
                    strArr4[5] = "P";
                    C7 c7A05 = C8.A00(C0930Hv.A05(format.A0A, ck.A07.A05), jArr, iArr, iA0H3);
                    jArr2 = c7A05.A04;
                    iArr2 = c7A05.A03;
                    i10 = c7A05.A00;
                    jArr3 = c7A05.A05;
                    iArr3 = c7A05.A02;
                    j11 = c7A05.A01;
                }
            }
            jA0F = C0930Hv.A0F(j11, 1000000L, ck.A06);
            if (ck.A08 != null) {
            }
            C0930Hv.A0a(jArr3, 1000000L, ck.A06);
            return new CN(ck, jArr2, iArr2, i10, jArr3, iArr3, jA0F);
        }
        throw new RuntimeException();
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{92, 80, -94, -107, -99, -111, -103, -98, -103, -98, -105, -125, -111, -99, -96, -100, -107, -93, 113, -92, -124, -103, -99, -107, -93, -92, -111, -99, -96, 116, -107, -100, -92, -111, 80, 86, 74, -100, -113, -105, -117, -109, -104, -109, -104, -111, 125, -117, -105, -102, -106, -113, -99, 115, -104, 109, -110, -97, -104, -107, 74, -96, -108, -26, -39, -31, -43, -35, -30, -35, -30, -37, -56, -35, -31, -39, -25, -24, -43, -31, -28, -72, -39, -32, -24, -43, -73, -36, -43, -30, -37, -39, -25, -108, 102, 76, -98, -111, -103, -115, -107, -102, -107, -102, -109, Ascii.DEL, -91, -102, -113, -108, -98, -101, -102, -107, -90, -115, -96, -107, -101, -102, Ascii.DEL, -115, -103, -100, -104, -111, -97, 76, 87, -118, -123, -125, 102, 119, -120, -119, 123, -120, -119, Ascii.DEL, -99, -92, -91, -88, -97, -92, -99, 86, -101, -102, -97, -86, 86, -94, -97, -87, -86, 112, 86, -101, -102, -97, -86, 86, -102, -91, -101, -87, 86, -92, -91, -86, 86, -87, -86, -105, -88, -86, 86, -83, -97, -86, -98, 86, -105, 86, -87, -81, -92, -103, 86, -87, -105, -93, -90, -94, -101, 100, -102, -65, -76, -64, -65, -60, -70, -60, -59, -74, -65, -59, 113, -60, -59, -77, -67, 113, -77, -64, -55, 113, -73, -64, -61, 113, -59, -61, -78, -76, -68, 113, -61, -31, -48, -46, -38, -113, -41, -48, -30, -113, -35, -34, -113, -30, -48, -36, -33, -37, -44, -113, -29, -48, -47, -37, -44, -113, -30, -40, -23, -44, -113, -40, -35, -43, -34, -31, -36, -48, -29, -40, -34, -35, -64, -39, -34, -32, -37, -37, -38, -35, -33, -48, -49, -117, -40, -48, -49, -44, -52, -117, -35, -52, -33, -48, -103, -126, -111, -111, -115, -118, -124, -126, -107, -118, -112, -113, 80, -107, -107, -114, -115, 76, -103, -114, -115, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, 105, -78, 103, -99, -101, -89, -97, -84, -101, 103, -89, -87, -82, -93, -87, -88, -88, -73, -73, -77, -80, -86, -88, -69, -80, -74, -75, 118, -65, 116, -76, -73, 123, 116, -86, -84, -88, 116, 125, 119, Ascii.DEL, 121, -120, -120, -124, -127, 123, 121, -116, -127, -121, -122, 71, -112, 69, -123, -120, 76, 69, -114, -116, -116, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -66, 115, -73, -69, -81, -87, -79, -70, -81, -77, -85, 115, -70, -66, 121, -83, -96, -76, -93, -88, -82, 110, 114, -90, -81, -81, 126, -110, -127, -122, -116, 76, 126, -128, 80, -39, -19, -36, -31, -25, -89, -39, -28, -39, -37, 120, -116, 123, -128, -122, 70, 120, -124, -119, 68, -114, 121, -30, -10, -27, -22, -16, -80, -26, -30, -28, -76, -127, -107, -124, -119, -113, 79, -115, -112, 84, -127, 77, -116, -127, -108, -115, -49, -29, -46, -41, -35, -99, -37, -34, -45, -43, -71, -51, -68, -63, -57, -121, -54, -71, -49, -21, -1, -18, -13, -7, -71, 0, -8, -18, -72, -18, -2, -3, -96, -76, -93, -88, -82, 110, -75, -83, -93, 109, -93, -77, -78, 109, -89, -93, -36, -16, -33, -28, -22, -86, -15, -23, -33, -87, -33, -17, -18, -87, -29, -33, -74, -21, -19, -22, -31, -28, -25, -32, -72, -25, -35, -19, -69, -70, -69, -119, -17, -18, -17, -1, -65, -63, -54, -65, -65, -63, -54, -49, -55, -50, -49, -46, -54, -89, -38, -43, -45, -71, -49, -32, -53, -122, -39, -50, -43, -37, -46, -54, -122, -56, -53, -122, -42, -43, -39, -49, -38, -49, -36, -53, -127, -118, -127, -114, -123, -111, -116, -128, 63, -128, -109, -114, -116, 63, -120, -110, 63, -116, -128, -115, -125, -128, -109, -114, -111, -104, -12, -20, -5, -24, -114, 125, -113, -121, -8, -24, -19, -18, -91, -26, -7, -12, -14, -91, -18, -8, -91, -14, -26, -13, -23, -26, -7, -12, -9, -2, -8, -12, -6, -13, -31, -29, -48, -30, -76, -91, -82, -93, 96, -95, -76, -81, -83, 96, -87, -77, 96, -83, -95, -82, -92, -95, -76, -81, -78, -71, -58, -73, -54, -58, -74, -87, -92, -91, -61, -74, -79, -78, -68, 124, -128, -76, -67, -67, -112, -125, 126, Ascii.DEL, -119, 73, 123, -112, 125, -114, -127, 124, 125, -121, 71, -128, 125, -114, 123, -21, -34, -39, -38, -28, -92, -19, -94, -21, -29, -39, -93, -28, -29, -89, -93, -21, -27, -83, -95, -108, -113, -112, -102, 90, -93, 88, -95, -103, -113, 89, -102, -103, 93, 89, -95, -101, 100};
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00c9 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x018a  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x019a  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01db  */
    /* JADX WARN: Code duplicated, block: B:90:0x0209  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0K(C0914Hf c0914Hf, int i10, int i11, int i12, int i13, int i14, DrmInitData drmInitData, C2 c10, int i15) throws C07249b {
        int iA0E;
        DrmInitData drmInitDataA02 = drmInitData;
        int iIntValue = i10;
        c0914Hf.A0Y(i11 + 8 + 8);
        c0914Hf.A0Z(16);
        int iA0I = c0914Hf.A0I();
        int iA0I2 = c0914Hf.A0I();
        boolean z10 = false;
        float fA00 = 1.0f;
        c0914Hf.A0Z(50);
        int iA06 = c0914Hf.A06();
        if (iIntValue != AbstractC0790Bz.A0S) {
            if (A01[7].length() != 14) {
                A01[2] = "PeJuctV1gZmOLx5oH2gSZJGQBpKTFEo9";
            }
            throw new RuntimeException();
        }
        Pair<Integer, CL> pairA09 = A09(c0914Hf, i11, i12);
        if (pairA09 != null) {
            iIntValue = ((Integer) pairA09.first).intValue();
            drmInitDataA02 = drmInitDataA02 == null ? null : drmInitDataA02.A02(((CL) pairA09.second).A02);
            c10.A03[i15] = (CL) pairA09.second;
        }
        c0914Hf.A0Y(iA06);
        List<byte[]> listSingletonList = null;
        String strA0I = null;
        byte[] bArrA0O = null;
        int i16 = -1;
        String[] strArr = A01;
        if (strArr[0].length() == strArr[5].length()) {
            A01[4] = "jNZq0IwPPShJWAAKA9azFLLmiQKjz3bf";
            while (iA06 - i11 < i12) {
                c0914Hf.A0Y(iA06);
                int iA07 = c0914Hf.A06();
                int iA08 = c0914Hf.A08();
                if (iA08 == 0 && c0914Hf.A06() - i11 == i12) {
                    if (strA0I == null) {
                        return;
                    }
                    c10.A02 = Format.A04(Integer.toString(i13), strA0I, null, -1, -1, iA0I, iA0I2, -1.0f, listSingletonList, i14, fA00, bArrA0O, i16, null, drmInitDataA02);
                    return;
                }
                HG.A05(iA08 > 0, A0I(574, 32, 87));
                int iA09 = c0914Hf.A08();
                if (iA09 == AbstractC0790Bz.A09) {
                    HG.A04(strA0I == null);
                    strA0I = A0I(710, 9, 11);
                    c0914Hf.A0Y(iA07 + 8);
                    C0932Hx c0932HxA00 = C0932Hx.A00(c0914Hf);
                    listSingletonList = c0932HxA00.A04;
                    c10.A00 = c0932HxA00.A02;
                    if (!z10) {
                        fA00 = c0932HxA00.A00;
                    }
                } else {
                    int i17 = AbstractC0790Bz.A0Z;
                    if (A01[1].length() != 12) {
                        A01[7] = "trr";
                        if (iA09 == i17) {
                            HG.A04(strA0I == null);
                            strA0I = A0I(719, 10, 9);
                            c0914Hf.A0Y(iA07 + 8);
                            I3 i3A00 = I3.A00(c0914Hf);
                            listSingletonList = i3A00.A01;
                            c10.A00 = i3A00.A00;
                        } else {
                            int i18 = AbstractC0790Bz.A1V;
                            if (A01[4].charAt(24) != 'i') {
                                A01[4] = "BNWfK92Afgdig3u125odHn9NiRsm91NE";
                                if (iA09 == i18) {
                                    HG.A04(strA0I == null);
                                    if (iIntValue == AbstractC0790Bz.A1T) {
                                        strA0I = A0I(729, 19, 102);
                                    } else {
                                        strA0I = A0I(748, 19, 28);
                                    }
                                } else if (iA09 == AbstractC0790Bz.A0E) {
                                    HG.A04(strA0I == null);
                                    strA0I = A0I(700, 10, 62);
                                } else if (iA09 == AbstractC0790Bz.A0T) {
                                    HG.A04(strA0I == null);
                                    Pair<String, byte[]> pairA07 = A07(c0914Hf, iA07);
                                    strA0I = (String) pairA07.first;
                                    listSingletonList = Collections.singletonList((byte[]) pairA07.second);
                                } else if (iA09 == AbstractC0790Bz.A0q) {
                                    fA00 = A00(c0914Hf, iA07);
                                    z10 = true;
                                } else if (iA09 == AbstractC0790Bz.A1G) {
                                    bArrA0O = A0O(c0914Hf, iA07, iA08);
                                } else if (iA09 == AbstractC0790Bz.A16) {
                                    iA0E = c0914Hf.A0E();
                                    c0914Hf.A0Z(3);
                                    if (iA0E == 0) {
                                        switch (c0914Hf.A0E()) {
                                            case 0:
                                                i16 = 0;
                                                break;
                                            case 1:
                                                i16 = 1;
                                                break;
                                            case 2:
                                                i16 = 2;
                                                break;
                                            case 3:
                                                i16 = 3;
                                                if (A01[1].length() != 12) {
                                                    A01[2] = "dnuTGkt9wQcTbo6J7tdoKURT12LZQ83u";
                                                } else {
                                                    A01[2] = "ncqjdIo8Q7C9TEhGWLQwCcGeWNY5S9h6";
                                                }
                                                break;
                                        }
                                    }
                                }
                            } else {
                                String[] strArr2 = A01;
                                strArr2[0] = "R";
                                strArr2[5] = "z";
                                if (iA09 == i18) {
                                    HG.A04(strA0I == null);
                                    if (iIntValue == AbstractC0790Bz.A1T) {
                                        strA0I = A0I(729, 19, 102);
                                    } else {
                                        strA0I = A0I(748, 19, 28);
                                    }
                                } else if (iA09 == AbstractC0790Bz.A0E) {
                                    HG.A04(strA0I == null);
                                    strA0I = A0I(700, 10, 62);
                                } else if (iA09 == AbstractC0790Bz.A0T) {
                                    HG.A04(strA0I == null);
                                    Pair<String, byte[]> pairA08 = A07(c0914Hf, iA07);
                                    strA0I = (String) pairA08.first;
                                    listSingletonList = Collections.singletonList((byte[]) pairA08.second);
                                } else if (iA09 == AbstractC0790Bz.A0q) {
                                    fA00 = A00(c0914Hf, iA07);
                                    z10 = true;
                                } else if (iA09 == AbstractC0790Bz.A1G) {
                                    bArrA0O = A0O(c0914Hf, iA07, iA08);
                                } else if (iA09 == AbstractC0790Bz.A16) {
                                    iA0E = c0914Hf.A0E();
                                    c0914Hf.A0Z(3);
                                    if (iA0E == 0) {
                                        switch (c0914Hf.A0E()) {
                                            case 0:
                                                i16 = 0;
                                                break;
                                            case 1:
                                                i16 = 1;
                                                break;
                                            case 2:
                                                i16 = 2;
                                                break;
                                            case 3:
                                                i16 = 3;
                                                if (A01[1].length() != 12) {
                                                    A01[2] = "dnuTGkt9wQcTbo6J7tdoKURT12LZQ83u";
                                                } else {
                                                    A01[2] = "ncqjdIo8Q7C9TEhGWLQwCcGeWNY5S9h6";
                                                }
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                iA06 += iA08;
            }
            if (strA0I == null) {
                return;
            }
            c10.A02 = Format.A04(Integer.toString(i13), strA0I, null, -1, -1, iA0I, iA0I2, -1.0f, listSingletonList, i14, fA00, bArrA0O, i16, null, drmInitDataA02);
            return;
        }
        throw new RuntimeException();
    }

    static {
        A0J();
        A08 = C0930Hv.A08(A0I(696, 4, 49));
        A05 = C0930Hv.A08(A0I(662, 4, 118));
        A07 = C0930Hv.A08(A0I(692, 4, 67));
        A04 = C0930Hv.A08(A0I(636, 4, 12));
        A06 = C0930Hv.A08(A0I(666, 4, 95));
        A02 = C0930Hv.A08(A0I(606, 4, 15));
        A03 = C0930Hv.A08(A0I(632, 4, 120));
    }

    public static float A00(C0914Hf c0914Hf, int i10) {
        c0914Hf.A0Y(i10 + 8);
        int vSpacing = c0914Hf.A0H();
        int hSpacing = c0914Hf.A0H();
        return vSpacing / hSpacing;
    }

    public static int A01(C0914Hf c0914Hf) {
        int iA0E = c0914Hf.A0E();
        int size = iA0E & 127;
        while ((iA0E & 128) == 128) {
            iA0E = c0914Hf.A0E();
            int currentByte = iA0E & 127;
            size = (size << 7) | currentByte;
        }
        return size;
    }

    public static int A02(C0914Hf c0914Hf) {
        c0914Hf.A0Y(16);
        int iA08 = c0914Hf.A08();
        int trackType = A05;
        if (iA08 == trackType) {
            return 1;
        }
        int trackType2 = A08;
        if (iA08 == trackType2) {
            return 2;
        }
        int trackType3 = A07;
        if (iA08 == trackType3) {
            return 3;
        }
        int trackType4 = A04;
        if (iA08 == trackType4) {
            return 3;
        }
        int trackType5 = A06;
        if (iA08 == trackType5) {
            return 3;
        }
        int trackType6 = A02;
        if (iA08 == trackType6) {
            return 3;
        }
        int trackType7 = A03;
        if (iA08 == trackType7) {
            return 4;
        }
        return -1;
    }

    public static int A03(C0914Hf c0914Hf, int i10, int i11) {
        int iA06 = c0914Hf.A06();
        while (childAtomPosition < i11) {
            c0914Hf.A0Y(iA06);
            int iA08 = c0914Hf.A08();
            boolean z10 = iA08 > 0;
            int childAtomSize = A01[4].charAt(24);
            if (childAtomSize != 105) {
                throw new RuntimeException();
            }
            A01[4] = "NygnrBLA11LVP9MJCR7n8rNii2RIBIyr";
            HG.A05(z10, A0I(574, 32, 87));
            int childAtomSize2 = c0914Hf.A08();
            int childAtomPosition = AbstractC0790Bz.A0T;
            if (childAtomSize2 == childAtomPosition) {
                return iA06;
            }
            iA06 += iA08;
        }
        return -1;
    }

    public static long A04(C0914Hf c0914Hf) {
        int fullAtom = 8;
        c0914Hf.A0Y(8);
        if (AbstractC0790Bz.A01(c0914Hf.A08()) != 0) {
            fullAtom = 16;
        }
        c0914Hf.A0Z(fullAtom);
        int fullAtom2 = A01[1].length();
        if (fullAtom2 == 12) {
            throw new RuntimeException();
        }
        A01[7] = "3W9G8I03JPUdsev";
        return c0914Hf.A0M();
    }

    public static Pair<Long, String> A06(C0914Hf c0914Hf) {
        c0914Hf.A0Y(8);
        int fullAtom = AbstractC0790Bz.A01(c0914Hf.A08());
        int languageCode = fullAtom == 0 ? 8 : 16;
        c0914Hf.A0Z(languageCode);
        long jA0M = c0914Hf.A0M();
        int version = fullAtom == 0 ? 4 : 8;
        c0914Hf.A0Z(version);
        int iA0I = c0914Hf.A0I();
        int languageCode2 = iA0I >> 10;
        StringBuilder sbAppend = new StringBuilder().append(A0I(0, 0, 85)).append((char) ((languageCode2 & 31) + 96));
        int languageCode3 = iA0I >> 5;
        StringBuilder sbAppend2 = sbAppend.append((char) ((languageCode3 & 31) + 96));
        int languageCode4 = iA0I & 31;
        return Pair.create(Long.valueOf(jA0M), sbAppend2.append((char) (languageCode4 + 96)).toString());
    }

    public static Pair<String, byte[]> A07(C0914Hf c0914Hf, int i10) {
        c0914Hf.A0Y(i10 + 8 + 4);
        c0914Hf.A0Z(1);
        A01(c0914Hf);
        c0914Hf.A0Z(2);
        int iA0E = c0914Hf.A0E();
        if ((iA0E & 128) != 0) {
            c0914Hf.A0Z(2);
        }
        int i11 = iA0E & 64;
        if (A01[6].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A01[4] = "xKeFRQRG14ulCThjCTH6nGG5i69swr7b";
        if (i11 != 0) {
            c0914Hf.A0Z(c0914Hf.A0I());
        }
        if ((iA0E & 32) != 0) {
            c0914Hf.A0Z(2);
        }
        c0914Hf.A0Z(1);
        A01(c0914Hf);
        String mimeType = HY.A03(c0914Hf.A0E());
        if (A0I(482, 10, 95).equals(mimeType) || A0I(501, 13, 123).equals(mimeType) || A0I(SyslogConstants.SYSLOG_PORT, 16, 48).equals(mimeType)) {
            Pair<String, byte[]> pairCreate = Pair.create(mimeType, null);
            int objectTypeIndication = A01[6].charAt(18);
            if (objectTypeIndication != 121) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "4";
            strArr[5] = IntegerTokenConverter.CONVERTER_KEY;
            return pairCreate;
        }
        c0914Hf.A0Z(12);
        c0914Hf.A0Z(1);
        int flags = A01(c0914Hf);
        byte[] bArr = new byte[flags];
        c0914Hf.A0c(bArr, 0, flags);
        return Pair.create(mimeType, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    public static Pair<Integer, CL> A08(C0914Hf c0914Hf, int i10, int i11) {
        int i12 = i10 + 8;
        int childAtomType = -1;
        int childAtomSize = 0;
        String schemeType = null;
        Integer dataFormat = null;
        while (childPosition < i11) {
            c0914Hf.A0Y(i12);
            int iA08 = c0914Hf.A08();
            int schemeInformationBoxPosition = c0914Hf.A08();
            int childPosition = AbstractC0790Bz.A0U;
            if (schemeInformationBoxPosition == childPosition) {
                int childPosition2 = c0914Hf.A08();
                dataFormat = Integer.valueOf(childPosition2);
            } else {
                int childPosition3 = AbstractC0790Bz.A10;
                if (schemeInformationBoxPosition == childPosition3) {
                    c0914Hf.A0Z(4);
                    schemeType = c0914Hf.A0S(4);
                } else {
                    int childPosition4 = AbstractC0790Bz.A0z;
                    if (schemeInformationBoxPosition == childPosition4) {
                        childAtomType = i12;
                        int schemeInformationBoxPosition2 = A01[1].length();
                        if (schemeInformationBoxPosition2 == 12) {
                            throw new RuntimeException();
                        }
                        A01[4] = "1Dp8zcpsjMOU2LphvBo6Szkhi7qi1syu";
                        childAtomSize = iA08;
                    } else {
                        continue;
                    }
                }
            }
            i12 += iA08;
        }
        int schemeInformationBoxPosition3 = A01[4].charAt(24);
        if (schemeInformationBoxPosition3 != 105) {
            A01[2] = "sI3X7CYNkWTnNUBuJepPqwY6PzAeX7x4";
            if (!A0I(566, 4, 77).equals(schemeType)) {
                if (!A0I(558, 4, 73).equals(schemeType) && !A0I(570, 4, 77).equals(schemeType) && !A0I(562, 4, 125).equals(schemeType)) {
                    return null;
                }
            }
        } else {
            A01[1] = "yPyTXv33PIzdo";
            if (!A0I(566, 4, 77).equals(schemeType)) {
                if (!A0I(558, 4, 73).equals(schemeType)) {
                    return null;
                }
            }
        }
        boolean z10 = true;
        int schemeInformationBoxPosition4 = A01[3].charAt(18);
        if (schemeInformationBoxPosition4 == 121) {
            throw new RuntimeException();
        }
        A01[4] = "c3g2qilHanrF8nzgjzcjaWK2icn944It";
        HG.A05(dataFormat != null, A0I(610, 22, 16));
        HG.A05(childAtomType != -1, A0I(640, 22, 118));
        CL clA0D = A0D(c0914Hf, childAtomType, childAtomSize, schemeType);
        if (clA0D == null) {
            z10 = false;
        }
        HG.A05(z10, A0I(670, 22, 49));
        return Pair.create(dataFormat, clA0D);
    }

    public static Pair<Integer, CL> A09(C0914Hf c0914Hf, int i10, int i11) {
        Pair<Integer, CL> pairA08;
        int iA06 = c0914Hf.A06();
        while (true) {
            int i12 = iA06 - i10;
            if (A01[3].charAt(18) == 'y') {
                throw new RuntimeException();
            }
            A01[6] = "VuSqoU71mDFleviScFynwgGpV5GSmBmr";
            if (i12 < i11) {
                c0914Hf.A0Y(iA06);
                int iA08 = c0914Hf.A08();
                HG.A05(iA08 > 0, A0I(574, 32, 87));
                int childAtomSize = c0914Hf.A08();
                int childPosition = AbstractC0790Bz.A14;
                if (childAtomSize == childPosition && (pairA08 = A08(c0914Hf, iA06, iA08)) != null) {
                    return pairA08;
                }
                iA06 += iA08;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    public static C2 A0A(C0914Hf c0914Hf, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws C07249b {
        C0914Hf c0914Hf2 = c0914Hf;
        c0914Hf2.A0Y(12);
        int iA08 = c0914Hf2.A08();
        C2 out = new C2(iA08);
        for (int childAtomSize = 0; childAtomSize < iA08; childAtomSize++) {
            int iA06 = c0914Hf2.A06();
            int iA09 = c0914Hf2.A08();
            HG.A05(iA09 > 0, A0I(574, 32, 87));
            int iA010 = c0914Hf2.A08();
            if (iA010 != AbstractC0790Bz.A07) {
                int i12 = AbstractC0790Bz.A08;
                if (A01[4].charAt(24) == 'i') {
                    A01[2] = "XfWsLr5EskpQolouThrY0L7T3EnzbtXq";
                    if (iA010 == i12 || iA010 == AbstractC0790Bz.A0S) {
                        A0K(c0914Hf2, iA010, iA06, iA09, i10, i11, drmInitData, out, childAtomSize);
                    } else {
                        int i13 = AbstractC0790Bz.A0m;
                        if (A01[7].length() != 14) {
                            String[] strArr = A01;
                            strArr[0] = "z";
                            strArr[5] = "6";
                            if (iA010 == i13 || iA010 == AbstractC0790Bz.A0Y || iA010 == AbstractC0790Bz.A0X || iA010 == AbstractC0790Bz.A0t || iA010 == AbstractC0790Bz.A1T) {
                                A0K(c0914Hf2, iA010, iA06, iA09, i10, i11, drmInitData, out, childAtomSize);
                            } else {
                                int i14 = AbstractC0790Bz.A1U;
                                if (A01[4].charAt(24) == 'i') {
                                    A01[6] = "2YqAUbM6XE3am7qEi8y8ENpTVaXzAM3G";
                                    if (iA010 == i14) {
                                        A0K(c0914Hf2, iA010, iA06, iA09, i10, i11, drmInitData, out, childAtomSize);
                                    } else if (iA010 != AbstractC0790Bz.A0l) {
                                        c0914Hf2 = c0914Hf2;
                                        A0M(c0914Hf2, iA010, iA06, iA09, i10, str, z10, drmInitData, out, childAtomSize);
                                    } else {
                                        c0914Hf2 = c0914Hf2;
                                        A0M(c0914Hf2, iA010, iA06, iA09, i10, str, z10, drmInitData, out, childAtomSize);
                                    }
                                } else if (iA010 == i14) {
                                    A0K(c0914Hf2, iA010, iA06, iA09, i10, i11, drmInitData, out, childAtomSize);
                                } else if (iA010 != AbstractC0790Bz.A0l || iA010 == AbstractC0790Bz.A0R || iA010 == AbstractC0790Bz.A05) {
                                    c0914Hf2 = c0914Hf2;
                                    A0M(c0914Hf2, iA010, iA06, iA09, i10, str, z10, drmInitData, out, childAtomSize);
                                } else {
                                    int i15 = AbstractC0790Bz.A0N;
                                    if (A01[6].charAt(18) != 'y') {
                                        A01[7] = "sstJHJE2SSSA0gl";
                                        if (iA010 != i15) {
                                            if (iA010 == AbstractC0790Bz.A0J && iA010 != AbstractC0790Bz.A0K && iA010 != AbstractC0790Bz.A0L && iA010 != AbstractC0790Bz.A0M && iA010 != AbstractC0790Bz.A0w && iA010 != AbstractC0790Bz.A0x && iA010 != AbstractC0790Bz.A0b && iA010 != AbstractC0790Bz.A15 && iA010 != AbstractC0790Bz.A04 && iA010 != AbstractC0790Bz.A06) {
                                                if (iA010 == AbstractC0790Bz.A03 || iA010 == AbstractC0790Bz.A1P || iA010 == AbstractC0790Bz.A1X || iA010 == AbstractC0790Bz.A19 || iA010 == AbstractC0790Bz.A0A) {
                                                    c0914Hf2 = c0914Hf2;
                                                    iA06 = iA06;
                                                    iA09 = iA09;
                                                    A0L(c0914Hf2, iA010, iA06, iA09, i10, str, out);
                                                } else if (iA010 == AbstractC0790Bz.A0B) {
                                                    out.A02 = Format.A0B(Integer.toString(i10), A0I(315, 27, 43), null, -1, null);
                                                }
                                            }
                                        }
                                    } else {
                                        A01[4] = "NowU1j8TXSe0umpE5Ib758xlieALevMk";
                                        if (iA010 != i15) {
                                            if (iA010 == AbstractC0790Bz.A0J) {
                                            }
                                        }
                                    }
                                    c0914Hf2 = c0914Hf2;
                                    A0M(c0914Hf2, iA010, iA06, iA09, i10, str, z10, drmInitData, out, childAtomSize);
                                }
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
            A0K(c0914Hf2, iA010, iA06, iA09, i10, i11, drmInitData, out, childAtomSize);
            c0914Hf2.A0Y(iA06 + iA09);
        }
        return out;
    }

    public static Metadata A0F(WV wv, boolean z10) {
        if (z10) {
            return null;
        }
        C0914Hf c0914Hf = wv.A00;
        c0914Hf.A0Y(8);
        while (c0914Hf.A04() >= 8) {
            int atomPosition = c0914Hf.A06();
            int iA08 = c0914Hf.A08();
            if (c0914Hf.A08() == AbstractC0790Bz.A0h) {
                c0914Hf.A0Y(atomPosition);
                return A0H(c0914Hf, atomPosition + iA08);
            }
            c0914Hf.A0Z(iA08 - 8);
        }
        return null;
    }

    public static Metadata A0G(C0914Hf c0914Hf, int i10) {
        c0914Hf.A0Z(8);
        ArrayList arrayList = new ArrayList();
        while (c0914Hf.A06() < i10) {
            Id3Frame id3FrameA04 = CC.A04(c0914Hf);
            if (id3FrameA04 != null) {
                arrayList.add(id3FrameA04);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0H(C0914Hf c0914Hf, int i10) {
        c0914Hf.A0Z(12);
        while (true) {
            int iA06 = c0914Hf.A06();
            if (A01[2].charAt(2) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "B";
            strArr[5] = "e";
            if (iA06 < i10) {
                int iA07 = c0914Hf.A06();
                int atomType = c0914Hf.A08();
                int atomSize = c0914Hf.A08();
                int atomPosition = AbstractC0790Bz.A0a;
                if (atomSize == atomPosition) {
                    c0914Hf.A0Y(iA07);
                    return A0G(c0914Hf, iA07 + atomType);
                }
                int atomPosition2 = atomType - 8;
                c0914Hf.A0Z(atomPosition2);
            } else {
                return null;
            }
        }
    }

    public static void A0L(C0914Hf c0914Hf, int i10, int i11, int i12, int i13, String str, C2 c10) throws C07249b {
        String strA0I;
        c0914Hf.A0Y(i11 + 8 + 8);
        List listSingletonList = null;
        long j10 = RecyclerView.FOREVER_NS;
        if (i10 == AbstractC0790Bz.A03) {
            strA0I = A0I(295, 20, 18);
        } else if (i10 == AbstractC0790Bz.A1P) {
            strA0I = A0I(388, 28, 55);
            int i14 = (i12 - 8) - 8;
            byte[] bArr = new byte[i14];
            c0914Hf.A0c(bArr, 0, i14);
            listSingletonList = Collections.singletonList(bArr);
        } else if (i10 == AbstractC0790Bz.A1X) {
            strA0I = A0I(367, 21, 9);
        } else if (i10 == AbstractC0790Bz.A19) {
            strA0I = A0I(295, 20, 18);
            j10 = 0;
        } else if (i10 == AbstractC0790Bz.A0A) {
            strA0I = A0I(342, 25, 56);
            c10.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        c10.A02 = Format.A09(Integer.toString(i13), strA0I, null, -1, 0, str, -1, null, j10, listSingletonList);
    }

    public static void A0M(C0914Hf c0914Hf, int i10, int childPosition, int i11, int i12, String mimeType, boolean z10, DrmInitData drmInitData, C2 c10, int i13) throws C07249b {
        int iA0I;
        int iA0F;
        int iA03;
        DrmInitData drmInitData2 = drmInitData;
        int childPosition2 = i10;
        c0914Hf.A0Y(childPosition + 8 + 8);
        int quickTimeSoundDescriptionVersion = 0;
        if (z10) {
            quickTimeSoundDescriptionVersion = c0914Hf.A0I();
            c0914Hf.A0Z(6);
        } else {
            c0914Hf.A0Z(8);
        }
        if (quickTimeSoundDescriptionVersion == 0 || quickTimeSoundDescriptionVersion == 1) {
            iA0I = c0914Hf.A0I();
            c0914Hf.A0Z(6);
            iA0F = c0914Hf.A0F();
            if (quickTimeSoundDescriptionVersion == 1) {
                c0914Hf.A0Z(16);
            }
        } else if (quickTimeSoundDescriptionVersion == 2) {
            c0914Hf.A0Z(16);
            iA0F = (int) Math.round(c0914Hf.A03());
            iA0I = c0914Hf.A0H();
            c0914Hf.A0Z(20);
        } else {
            return;
        }
        int channelCount = c0914Hf.A06();
        if (childPosition2 == AbstractC0790Bz.A0R) {
            Pair<Integer, CL> pairA09 = A09(c0914Hf, childPosition, i11);
            if (A01[2].charAt(2) == 't') {
                throw new RuntimeException();
            }
            A01[1] = "rXJd0uQKTdLTB";
            if (pairA09 != null) {
                childPosition2 = ((Integer) pairA09.first).intValue();
                if (drmInitData2 == null) {
                    drmInitData2 = null;
                } else {
                    drmInitData2 = drmInitData2.A02(((CL) pairA09.second).A02);
                }
                c10.A03[i13] = (CL) pairA09.second;
            }
            c0914Hf.A0Y(channelCount);
        }
        String strA0I = null;
        if (childPosition2 == AbstractC0790Bz.A05) {
            strA0I = A0I(426, 9, 14);
        } else if (childPosition2 == AbstractC0790Bz.A0N) {
            strA0I = A0I(457, 10, 114);
        } else if (childPosition2 == AbstractC0790Bz.A0J) {
            strA0I = A0I(501, 13, 123);
        } else if (childPosition2 == AbstractC0790Bz.A0L || childPosition2 == AbstractC0790Bz.A0M) {
            strA0I = A0I(SyslogConstants.SYSLOG_PORT, 16, 48);
        } else if (childPosition2 == AbstractC0790Bz.A0K) {
            strA0I = A0I(530, 28, 108);
        } else if (childPosition2 == AbstractC0790Bz.A0w) {
            strA0I = A0I(416, 10, 48);
        } else if (childPosition2 == AbstractC0790Bz.A0x) {
            strA0I = A0I(445, 12, 8);
        } else if (childPosition2 == AbstractC0790Bz.A0b || childPosition2 == AbstractC0790Bz.A15) {
            strA0I = A0I(492, 9, 73);
        } else if (childPosition2 == AbstractC0790Bz.A04) {
            strA0I = A0I(482, 10, 95);
        } else {
            int atomType = AbstractC0790Bz.A06;
            int atomType2 = A01[7].length();
            if (atomType2 == 14) {
                throw new RuntimeException();
            }
            A01[1] = "HdbKXAaE1rDpPSyLEE9ktT";
            if (childPosition2 == atomType) {
                strA0I = A0I(435, 10, 105);
            }
        }
        byte[] bArr = null;
        int atomType3 = A01[4].charAt(24);
        if (atomType3 != 105) {
            throw new RuntimeException();
        }
        A01[6] = "QyfbMcdO26pfDQU6rlymYH0CLTjMRKBW";
        while (channelCount - childPosition < i11) {
            c0914Hf.A0Y(channelCount);
            int childAtomSize = c0914Hf.A08();
            HG.A05(childAtomSize > 0, A0I(574, 32, 87));
            int atomType4 = c0914Hf.A08();
            if (atomType4 == AbstractC0790Bz.A0T || (z10 && atomType4 == AbstractC0790Bz.A1W)) {
                if (atomType4 == AbstractC0790Bz.A0T) {
                    iA03 = channelCount;
                } else {
                    iA03 = A03(c0914Hf, channelCount, childAtomSize);
                }
                if (iA03 != -1) {
                    Pair<String, byte[]> pairA07 = A07(c0914Hf, iA03);
                    strA0I = (String) pairA07.first;
                    bArr = (byte[]) pairA07.second;
                    if (A0I(467, 15, 17).equals(strA0I)) {
                        Pair<Integer, Integer> pairA03 = HK.A03(bArr);
                        iA0F = ((Integer) pairA03.first).intValue();
                        iA0I = ((Integer) pairA03.second).intValue();
                    }
                }
            } else {
                int i14 = AbstractC0790Bz.A0F;
                if (A01[2].charAt(2) == 't') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "Q";
                strArr[5] = "M";
                if (atomType4 == i14) {
                    c0914Hf.A0Y(channelCount + 8);
                    c10.A02 = A6.A07(c0914Hf, Integer.toString(i12), mimeType, drmInitData2);
                } else if (atomType4 == AbstractC0790Bz.A0I) {
                    c0914Hf.A0Y(channelCount + 8);
                    c10.A02 = A6.A08(c0914Hf, Integer.toString(i12), mimeType, drmInitData2);
                } else if (atomType4 == AbstractC0790Bz.A0H) {
                    c10.A02 = Format.A07(Integer.toString(i12), strA0I, null, -1, -1, iA0I, iA0F, null, drmInitData2, 0, mimeType);
                } else if (atomType4 == AbstractC0790Bz.A06) {
                    bArr = new byte[childAtomSize];
                    c0914Hf.A0Y(channelCount);
                    c0914Hf.A0c(bArr, 0, childAtomSize);
                }
            }
            channelCount += childAtomSize;
        }
        if (c10.A02 != null || strA0I == null) {
            return;
        }
        int atomType5 = A0I(492, 9, 73).equals(strA0I) ? 2 : -1;
        c10.A02 = Format.A06(Integer.toString(i12), strA0I, null, -1, -1, iA0I, iA0F, atomType5, bArr != null ? Collections.singletonList(bArr) : null, drmInitData2, 0, mimeType);
    }

    public static boolean A0N(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int latestDelayIndex = C0930Hv.A06(3, 0, length);
        int lastIndex = jArr.length;
        return jArr[0] <= j11 && j11 < jArr[latestDelayIndex] && jArr[C0930Hv.A06(lastIndex - 3, 0, length)] < j12 && j12 <= j10;
    }

    public static byte[] A0O(C0914Hf c0914Hf, int i10, int i11) {
        int i12 = i10 + 8;
        while (true) {
            int i13 = i12 - i10;
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[5];
            int length = str.length();
            int childPosition = str2.length();
            if (length != childPosition) {
                break;
            }
            A01[2] = "hiyhCkw83qioTZht4ycME2aPtqNlSya0";
            if (i13 >= i11) {
                if (A01[4].charAt(24) != 'i') {
                    return null;
                }
                A01[6] = "op0Xll27WP2wTMdM3NyEU8fL7oyu7ROp";
                return null;
            }
            c0914Hf.A0Y(i12);
            int iA08 = c0914Hf.A08();
            int iA09 = c0914Hf.A08();
            int i14 = AbstractC0790Bz.A0r;
            int childAtomSize = A01[2].charAt(2);
            if (childAtomSize == 116) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[0] = "K";
            strArr2[5] = "V";
            if (iA09 == i14) {
                int childPosition2 = i12 + iA08;
                return Arrays.copyOfRange(c0914Hf.A00, i12, childPosition2);
            }
            i12 += iA08;
        }
        throw new RuntimeException();
    }
}
