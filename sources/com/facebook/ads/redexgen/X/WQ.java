package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WQ implements BY {
    public static byte[] A0X;
    public static String[] A0Y = {"XdJWu", "FUlE3E4RGCFuY0n1jkLa4sDNStY", "LTfWg4MeBgD", "ea2mTe", "5aN4xnjUR54", "JRDUjTwIRED0cdRjG5ryaKaac6vLzQ8c", "s80pf3iUB", "VFz"};
    public static final InterfaceC0775Bb A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public InterfaceC0774Ba A0C;
    public CB A0D;
    public C0914Hf A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC0782Bk[] A0H;
    public InterfaceC0782Bk[] A0I;
    public final int A0J;
    public final SparseArray<CB> A0K;
    public final DrmInitData A0L;
    public final InterfaceC0782Bk A0M;
    public final CK A0N;
    public final C0914Hf A0O;
    public final C0914Hf A0P;
    public final C0914Hf A0Q;
    public final C0914Hf A0R;
    public final C0926Hr A0S;
    public final ArrayDeque<WW> A0T;
    public final ArrayDeque<CA> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(CB cb2, int i10, long j10, int i11, C0914Hf c0914Hf, int i12) {
        int iA0H;
        int iA08;
        int i13 = i12;
        long j11 = j10;
        c0914Hf.A0Y(8);
        int iA00 = AbstractC0790Bz.A00(c0914Hf.A08());
        CK ck = cb2.A05;
        CM cm = cb2.A07;
        C5 c10 = cm.A07;
        cm.A0E[i10] = c0914Hf.A0H();
        cm.A0G[i10] = cm.A05;
        if ((iA00 & 1) != 0) {
            long[] jArr = cm.A0G;
            jArr[i10] = jArr[i10] + ((long) c0914Hf.A08());
        }
        boolean z10 = (iA00 & 4) != 0;
        int iA0H2 = c10.A01;
        if (z10) {
            iA0H2 = c0914Hf.A0H();
        }
        boolean z11 = (iA00 & 256) != 0;
        boolean z12 = (iA00 & 512) != 0;
        boolean z13 = (iA00 & 1024) != 0;
        boolean z14 = (iA00 & 2048) != 0;
        long jA0F = 0;
        if (ck.A08 != null && ck.A08.length == 1 && ck.A08[0] == 0) {
            jA0F = C0930Hv.A0F(ck.A09[0], 1000L, ck.A06);
        }
        int[] iArr = cm.A0D;
        int[] iArr2 = cm.A0C;
        long[] jArr2 = cm.A0F;
        boolean[] zArr = cm.A0I;
        boolean z15 = ck.A03 == 2 && (i11 & 1) != 0;
        int i14 = i13 + cm.A0E[i10];
        long j12 = ck.A06;
        if (i10 > 0) {
            j11 = cm.A06;
        }
        while (i13 < i14) {
            int iA0H3 = z11 ? c0914Hf.A0H() : c10.A00;
            if (z12) {
                iA0H = c0914Hf.A0H();
            } else {
                iA0H = c10.A03;
                if (A0Y[5].charAt(2) == 'C') {
                    throw new RuntimeException();
                }
                A0Y[6] = "dkwnFPd0";
            }
            if (i13 == 0 && z10) {
                iA08 = iA0H2;
            } else {
                iA08 = z13 ? c0914Hf.A08() : c10.A01;
            }
            if (z14) {
                iArr2[i13] = (int) ((((long) c0914Hf.A08()) * 1000) / j12);
            } else {
                iArr2[i13] = 0;
            }
            jArr2[i13] = C0930Hv.A0F(j11, 1000L, j12) - jA0F;
            iArr[i13] = iA0H;
            zArr[i13] = ((iA08 >> 16) & 1) == 0 && (!z15 || i13 == 0);
            j11 += (long) iA0H3;
            i13++;
        }
        cm.A06 = j11;
        return i14;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C1306Wr> A04(C0914Hf c0914Hf, long j10) throws C07249b {
        long jA0N;
        long jA0N2;
        c0914Hf.A0Y(8);
        int iA01 = AbstractC0790Bz.A01(c0914Hf.A08());
        c0914Hf.A0Z(4);
        long jA0M = c0914Hf.A0M();
        if (iA01 == 0) {
            jA0N = c0914Hf.A0M();
            jA0N2 = j10 + c0914Hf.A0M();
        } else {
            jA0N = c0914Hf.A0N();
            jA0N2 = j10 + c0914Hf.A0N();
        }
        long jA0F = C0930Hv.A0F(jA0N, 1000000L, jA0M);
        c0914Hf.A0Z(2);
        int iA0I = c0914Hf.A0I();
        int[] iArr = new int[iA0I];
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        long[] jArr3 = new long[iA0I];
        long jA0F2 = jA0F;
        for (int i10 = 0; i10 < iA0I; i10++) {
            int iA08 = c0914Hf.A08();
            if ((Integer.MIN_VALUE & iA08) != 0) {
                throw new C07249b(A0A(581, 28, 126));
            }
            long jA0M2 = c0914Hf.A0M();
            iArr[i10] = Integer.MAX_VALUE & iA08;
            jArr[i10] = jA0N2;
            jArr3[i10] = jA0F2;
            jA0N += jA0M2;
            jA0F2 = C0930Hv.A0F(jA0N, 1000000L, jA0M);
            jArr2[i10] = jA0F2 - jArr3[i10];
            c0914Hf.A0Z(4);
            jA0N2 += (long) iArr[i10];
        }
        return Pair.create(Long.valueOf(jA0F), new C1306Wr(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static CB A09(C0914Hf c0914Hf, SparseArray<CB> sparseArray) {
        c0914Hf.A0Y(8);
        int iA00 = AbstractC0790Bz.A00(c0914Hf.A08());
        CB cbA08 = A08(sparseArray, c0914Hf.A08());
        if (cbA08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0N = c0914Hf.A0N();
            cbA08.A07.A05 = jA0N;
            cbA08.A07.A04 = jA0N;
        }
        C5 c10 = cbA08.A04;
        cbA08.A07.A07 = new C5((iA00 & 2) != 0 ? c0914Hf.A0H() - 1 : c10.A02, (iA00 & 8) != 0 ? c0914Hf.A0H() : c10.A00, (iA00 & 16) != 0 ? c0914Hf.A0H() : c10.A03, (iA00 & 32) != 0 ? c0914Hf.A0H() : c10.A01);
        return cbA08;
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0X, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{117, 121, 84, 97, 122, 120, 53, 102, 124, 111, 112, 53, 121, 112, 102, 102, 53, 97, 125, 116, 123, 53, 125, 112, 116, 113, 112, 103, 53, 121, 112, 123, 114, 97, 125, 53, 61, 96, 123, 102, 96, 101, 101, 122, 103, 97, 112, 113, 60, 59, 114, 89, 67, 69, 78, 23, 84, 88, 66, 89, 67, 23, 94, 89, 23, 68, 85, 80, 71, 23, 22, 10, 23, 6, 23, Ascii.US, 66, 89, 68, 66, 71, 71, 88, 69, 67, 82, 83, Ascii.RS, Ascii.EM, 119, 92, 70, 64, 75, 18, 81, 93, 71, 92, 70, 18, 91, 92, 18, 65, 85, 66, 86, 18, 19, 15, 18, 3, 18, Ascii.SUB, 71, 92, 65, 71, 66, 66, 93, 64, 70, 87, 86, Ascii.ESC, Ascii.FS, 57, 13, Ascii.RS, Ascii.CAN, 18, Ascii.SUB, 17, 11, Ascii.SUB, Ascii.ESC, 50, 15, 75, 58, 7, 11, 13, Ascii.RS, Ascii.FS, 11, 16, 13, 0, 46, 39, 38, 59, 32, 39, 46, 105, 39, 44, 46, 40, 61, 32, 63, 44, 105, 38, 47, 47, 58, 44, 61, 105, 61, 38, 105, 58, 40, 36, 57, 37, 44, 105, 45, 40, 61, 40, 103, 51, Ascii.SUB, Ascii.RS, Ascii.EM, 95, Ascii.RS, 11, 16, 18, 95, Ascii.ESC, Ascii.SUB, Ascii.EM, 22, 17, Ascii.SUB, 12, 95, Ascii.SUB, 7, 11, Ascii.SUB, 17, Ascii.ESC, Ascii.SUB, Ascii.ESC, 95, Ascii.RS, 11, 16, 18, 95, 12, 22, 5, Ascii.SUB, 95, 87, 10, 17, 12, 10, 15, 15, 16, 13, 11, Ascii.SUB, Ascii.ESC, 86, 81, Ascii.RS, 55, 51, 52, 114, 51, 38, 61, 63, 114, 37, 59, 38, 58, 114, 62, 55, 60, 53, 38, 58, 114, 108, 114, 96, 99, 102, 101, 102, 106, 97, 100, 102, 101, 114, 122, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 123, 124, 63, 22, Ascii.GS, 20, 7, Ascii.ESC, 83, Ascii.RS, Ascii.SUB, 0, Ascii.RS, 18, 7, 16, Ascii.ESC, 73, 83, 15, 38, 38, 51, 37, 52, 96, 52, 47, 96, 37, 46, 35, 50, 57, 48, 52, 41, 47, 46, 96, 36, 33, 52, 33, 96, 55, 33, 51, 96, 46, 37, 39, 33, 52, 41, 54, 37, 110, 16, 57, 57, 44, 58, 43, Ascii.DEL, 43, 48, Ascii.DEL, 58, 49, 59, Ascii.DEL, 48, 57, Ascii.DEL, 50, 59, 62, 43, Ascii.DEL, 40, 62, 44, Ascii.DEL, 49, 58, 56, 62, 43, 54, 41, 58, 113, 106, 83, 64, 87, 87, 76, 65, 76, 75, 66, 5, 113, 87, 68, 70, 78, 96, 75, 70, 87, 92, 85, 81, 76, 74, 75, 103, 74, 93, 5, 85, 68, 87, 68, 72, 64, 81, 64, 87, 86, 5, 76, 86, 5, 80, 75, 86, 80, 85, 85, 74, 87, 81, 64, 65, 11, 14, 54, 52, 45, 45, 56, 57, 125, 45, 46, 46, 53, 125, 60, 41, 50, 48, 125, 117, 59, 60, 52, 49, 56, 57, 125, 41, 50, 125, 56, 37, 41, 47, 60, 62, 41, 125, 40, 40, 52, 57, 116, 54, 14, 12, 21, 21, 12, 11, 2, 69, 4, 17, 10, 8, 69, 18, 12, 17, 13, 69, 9, 0, 11, 2, 17, 13, 69, 91, 69, 87, 84, 81, 82, 81, 93, 86, 83, 81, 82, 69, 77, 16, 11, 22, 16, 21, 21, 10, 23, 17, 0, 1, 76, 75, 62, 5, 14, 19, Ascii.ESC, 14, 8, Ascii.US, 14, 15, 75, 6, 4, 4, Ascii.GS, 75, 9, 4, 19, 69, 13, 54, 61, 32, 40, 61, 59, 44, 61, 60, 120, 43, 57, 49, 55, 120, 61, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 98, 120, 76, 119, 113, 120, 119, 125, 117, 124, 125, 57, 112, 119, 125, 112, 107, 124, 122, 109, 57, 107, 124, Ascii.DEL, 124, 107, 124, 119, 122, 124, 58, 13, Ascii.RS, 5, 13, 14, 0, 9, 76, 0, 9, 2, 11, Ascii.CAN, 4, 76, 8, 9, Ascii.US, 15, Ascii.RS, 5, Ascii.FS, Ascii.CAN, 5, 3, 2, 76, 5, 2, 76, Ascii.US, 11, Ascii.FS, 8, 76, 10, 3, Ascii.EM, 2, 8, 76, 68, Ascii.EM, 2, Ascii.US, Ascii.EM, Ascii.FS, Ascii.FS, 3, Ascii.RS, Ascii.CAN, 9, 8, 69, Ascii.US, 14, 14, 18, 23, Ascii.GS, Ascii.US, 10, 23, 17, 16, 81, 6, 83, Ascii.ESC, 19, 13, Ascii.EM, 3, 21, Ascii.EM, 23, 23, 8, 5, 4, 14, 78, 9, 4, 23, 2, 6, Ascii.EM, 20, 21, Ascii.US, 95, Ascii.GS, 0, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0K(WW ww) throws C07249b {
        HG.A06(this.A0N == null, A0A(532, 20, 12));
        DrmInitData drmInitDataA05 = this.A0L;
        if (drmInitDataA05 == null) {
            drmInitDataA05 = A05(ww.A02);
        }
        WW wwA06 = ww.A06(AbstractC0790Bz.A0n);
        SparseArray<C5> sparseArray = new SparseArray<>();
        long jA01 = -9223372036854775807L;
        int size = wwA06.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            WV wv = wwA06.A02.get(i10);
            if (((AbstractC0790Bz) wv).A00 == AbstractC0790Bz.A1N) {
                Pair<Integer, C5> pairA03 = A03(wv.A00);
                sparseArray.put(((Integer) pairA03.first).intValue(), (C5) pairA03.second);
            } else if (((AbstractC0790Bz) wv).A00 == AbstractC0790Bz.A0g) {
                jA01 = A01(wv.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = ww.A01.size();
        for (int i11 = 0; i11 < size2; i11++) {
            WW ww2 = ww.A01.get(i11);
            if (((AbstractC0790Bz) ww2).A00 == AbstractC0790Bz.A1M) {
                CK ckA0C = C4.A0C(ww2, ww.A07(AbstractC0790Bz.A0o), jA01, drmInitDataA05, (this.A0J & 16) != 0, false);
                if (ckA0C != null) {
                    sparseArray2.put(ckA0C.A00, ckA0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            HG.A04(this.A0K.size() == size3);
            for (int i12 = 0; i12 < size3; i12++) {
                CK ck = (CK) sparseArray2.valueAt(i12);
                this.A0K.get(ck.A00).A07(ck, A06(sparseArray, ck.A00));
            }
            return;
        }
        for (int i13 = 0; i13 < size3; i13++) {
            CK ck2 = (CK) sparseArray2.valueAt(i13);
            CB cb2 = new CB(this.A0C.AFm(i13, ck2.A03));
            cb2.A07(ck2, A06(sparseArray, ck2.A00));
            this.A0K.put(ck2.A00, cb2);
            this.A08 = Math.max(this.A08, ck2.A04);
        }
        A0C();
        this.A0C.A5S();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(WW ww, SparseArray<CB> sparseArray, int i10, byte[] bArr) throws C07249b {
        CB cbA09 = A09(ww.A07(AbstractC0790Bz.A1J).A00, sparseArray);
        if (cbA09 == null) {
            return;
        }
        CM cm = cbA09.A07;
        long jA02 = cm.A06;
        cbA09.A04();
        if (ww.A07(AbstractC0790Bz.A1I) != null && (i10 & 2) == 0) {
            jA02 = A02(ww.A07(AbstractC0790Bz.A1I).A00);
        }
        A0N(ww, cbA09, jA02, i10);
        CL clA00 = cbA09.A05.A00(cm.A07.A02);
        WV wvA07 = ww.A07(AbstractC0790Bz.A0v);
        if (wvA07 != null) {
            A0P(clA00, wvA07.A00, cm);
        }
        WV wvA08 = ww.A07(AbstractC0790Bz.A0u);
        if (wvA08 != null) {
            A0S(wvA08.A00, cm);
        }
        WV wvA09 = ww.A07(AbstractC0790Bz.A11);
        if (wvA09 != null) {
            A0T(wvA09.A00, cm);
        }
        WV wvA010 = ww.A07(AbstractC0790Bz.A0y);
        WV wvA011 = ww.A07(AbstractC0790Bz.A12);
        if (wvA010 != null && wvA011 != null) {
            A0V(wvA010.A00, wvA011.A00, clA00 != null ? clA00.A02 : null, cm);
        }
        int size = ww.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            WV wv = ww.A02.get(i11);
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "89j";
            WV wv2 = wv;
            if (((AbstractC0790Bz) wv2).A00 == AbstractC0790Bz.A1R) {
                A0U(wv2.A00, cm, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0P(CL cl, C0914Hf c0914Hf, CM cm) throws C07249b {
        int i10 = cl.A00;
        c0914Hf.A0Y(8);
        if ((AbstractC0790Bz.A00(c0914Hf.A08()) & 1) == 1) {
            c0914Hf.A0Z(8);
        }
        int iA0E = c0914Hf.A0E();
        int iA0H = c0914Hf.A0H();
        if (iA0H != cm.A00) {
            throw new C07249b(A0A(290, 17, 20) + iA0H + A0A(0, 2, 62) + cm.A00);
        }
        int i11 = 0;
        if (iA0E == 0) {
            boolean[] zArr = cm.A0H;
            for (int i12 = 0; i12 < iA0H; i12++) {
                int iA0E2 = c0914Hf.A0E();
                i11 += iA0E2;
                zArr[i12] = iA0E2 > i10;
            }
        } else {
            i11 = 0 + (iA0E * iA0H);
            Arrays.fill(cm.A0H, 0, iA0H, iA0E > i10);
        }
        cm.A02(i11);
        if (A0Y[6].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[2] = "tC3WLCXP6DZ";
        strArr[4] = "0Zxl8CEli3D";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(C0914Hf c0914Hf, C0914Hf c0914Hf2, String str, CM cm) throws C07249b {
        c0914Hf.A0Y(8);
        int iA08 = c0914Hf.A08();
        int iA09 = c0914Hf.A08();
        int i10 = A0a;
        if (iA09 != i10) {
            return;
        }
        if (AbstractC0790Bz.A01(iA08) == 1) {
            c0914Hf.A0Z(4);
        }
        if (c0914Hf.A08() != 1) {
            throw new C07249b(A0A(50, 39, 80));
        }
        c0914Hf2.A0Y(8);
        int iA010 = c0914Hf2.A08();
        if (c0914Hf2.A08() != i10) {
            return;
        }
        int iA01 = AbstractC0790Bz.A01(iA010);
        if (iA01 == 1) {
            if (c0914Hf2.A0M() == 0) {
                throw new C07249b(A0A(609, 55, 11));
            }
        } else if (iA01 >= 2) {
            c0914Hf2.A0Z(4);
        }
        if (c0914Hf2.A0M() != 1) {
            throw new C07249b(A0A(89, 39, 85));
        }
        c0914Hf2.A0Z(1);
        int iA0E = c0914Hf2.A0E();
        int i11 = (iA0E & 240) >> 4;
        int i12 = iA0E & 15;
        boolean z10 = c0914Hf2.A0E() == 1;
        if (z10) {
            int iA0E2 = c0914Hf2.A0E();
            byte[] bArr = new byte[16];
            c0914Hf2.A0c(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (z10 && iA0E2 == 0) {
                int iA0E3 = c0914Hf2.A0E();
                bArr2 = new byte[iA0E3];
                c0914Hf2.A0c(bArr2, 0, iA0E3);
            }
            cm.A0A = true;
            cm.A08 = new CL(z10, str, iA0E2, bArr, i11, i12, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new WR();
        A0a = C0930Hv.A08(A0A(682, 4, 23));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 25), RecyclerView.FOREVER_NS);
    }

    public WQ() {
        this(0);
    }

    public WQ(int i10) {
        this(i10, null);
    }

    public WQ(int i10, C0926Hr c0926Hr) {
        this(i10, c0926Hr, null, null);
    }

    public WQ(int i10, C0926Hr c0926Hr, CK ck, DrmInitData drmInitData) {
        this(i10, c0926Hr, ck, drmInitData, Collections.emptyList());
    }

    public WQ(int i10, C0926Hr c0926Hr, CK ck, DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i10, c0926Hr, ck, drmInitData, closedCaptionFormats, null);
    }

    public WQ(int i10, C0926Hr c0926Hr, CK ck, DrmInitData drmInitData, List<Format> closedCaptionFormats, InterfaceC0782Bk interfaceC0782Bk) {
        this.A0J = (ck != null ? 8 : 0) | i10;
        this.A0S = c0926Hr;
        this.A0N = ck;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = interfaceC0782Bk;
        this.A0O = new C0914Hf(16);
        this.A0R = new C0914Hf(C0910Hb.A03);
        this.A0Q = new C0914Hf(5);
        this.A0P = new C0914Hf();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    public static long A01(C0914Hf c0914Hf) {
        c0914Hf.A0Y(8);
        int fullAtom = c0914Hf.A08();
        return AbstractC0790Bz.A01(fullAtom) == 0 ? c0914Hf.A0M() : c0914Hf.A0N();
    }

    public static long A02(C0914Hf c0914Hf) {
        c0914Hf.A0Y(8);
        int fullAtom = c0914Hf.A08();
        int version = AbstractC0790Bz.A01(fullAtom);
        return version == 1 ? c0914Hf.A0N() : c0914Hf.A0M();
    }

    public static Pair<Integer, C5> A03(C0914Hf c0914Hf) {
        c0914Hf.A0Y(12);
        int defaultSampleDescriptionIndex = c0914Hf.A08();
        int trackId = c0914Hf.A0H();
        int defaultSampleFlags = c0914Hf.A0H();
        int defaultSampleSize = c0914Hf.A0H();
        int defaultSampleDuration = c0914Hf.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C5(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<WV> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            WV wv = list.get(i10);
            int leafChildrenSize = ((AbstractC0790Bz) wv).A00;
            if (leafChildrenSize == AbstractC0790Bz.A0s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = wv.A00.A00;
                UUID uuidA03 = CH.A03(bArr);
                int leafChildrenSize2 = A0Y[3].length();
                if (leafChildrenSize2 != 6) {
                    throw new RuntimeException();
                }
                A0Y[7] = "tzO";
                if (uuidA03 == null) {
                    Log.w(A0A(128, 22, 24), A0A(437, 42, 58));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA03, A0A(696, 9, 23), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C5 A06(SparseArray<C5> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C5) HG.A01(sparseArray.get(i10));
    }

    public static CB A07(SparseArray<CB> sparseArray) {
        CB cb2 = null;
        long trunOffset = RecyclerView.FOREVER_NS;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            CB cbValueAt = sparseArray.valueAt(i10);
            int i11 = cbValueAt.A02;
            if (A0Y[1].length() == 5) {
                throw new RuntimeException();
            }
            A0Y[0] = "VXm0n";
            if (i11 != cbValueAt.A07.A02) {
                long nextTrackRunOffset = cbValueAt.A07.A0G[cbValueAt.A02];
                if (nextTrackRunOffset < trunOffset) {
                    cb2 = cbValueAt;
                    trunOffset = nextTrackRunOffset;
                }
            }
        }
        return cb2;
    }

    public static CB A08(SparseArray<CB> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i10);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        if (this.A0I == null) {
            InterfaceC0782Bk[] interfaceC0782BkArr = new InterfaceC0782Bk[2];
            this.A0I = interfaceC0782BkArr;
            int i10 = 0;
            InterfaceC0782Bk interfaceC0782Bk = this.A0M;
            if (interfaceC0782Bk != null) {
                interfaceC0782BkArr[0] = interfaceC0782Bk;
                i10 = 0 + 1;
            }
            if ((this.A0J & 4) != 0) {
                int emsgTrackOutputCount = i10 + 1;
                interfaceC0782BkArr[i10] = this.A0C.AFm(this.A0K.size(), 4);
                i10 = emsgTrackOutputCount;
            }
            InterfaceC0782Bk[] interfaceC0782BkArr2 = (InterfaceC0782Bk[]) Arrays.copyOf(this.A0I, i10);
            this.A0I = interfaceC0782BkArr2;
            for (InterfaceC0782Bk interfaceC0782Bk2 : interfaceC0782BkArr2) {
                interfaceC0782Bk2.A5i(A0b);
            }
        }
        InterfaceC0782Bk[] interfaceC0782BkArr3 = this.A0H;
        if (A0Y[6].length() == 17) {
            throw new RuntimeException();
        }
        A0Y[3] = "8HQd7O";
        if (interfaceC0782BkArr3 == null) {
            this.A0H = new InterfaceC0782Bk[this.A0V.size()];
            for (int i11 = 0; i11 < i; i11++) {
                InterfaceC0774Ba interfaceC0774Ba = this.A0C;
                int i12 = this.A0K.size();
                InterfaceC0782Bk output = interfaceC0774Ba.AFm(i12 + 1 + i11, 3);
                output.A5i(this.A0V.get(i11));
                this.A0H[i11] = output;
            }
        }
    }

    private void A0E(long j10) {
        while (!this.A0U.isEmpty()) {
            CA caRemoveFirst = this.A0U.removeFirst();
            this.A03 -= caRemoveFirst.A00;
            long jA06 = j10 + caRemoveFirst.A01;
            C0926Hr c0926Hr = this.A0S;
            if (c0926Hr != null) {
                jA06 = c0926Hr.A06(jA06);
            }
            InterfaceC0782Bk[] interfaceC0782BkArr = this.A0I;
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "ltl";
            for (InterfaceC0782Bk interfaceC0782Bk : interfaceC0782BkArr) {
                interfaceC0782Bk.AEh(jA06, 1, caRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j10) throws C07249b {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j10) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(BZ bz) throws InterruptedException, IOException {
        int i10 = ((int) this.A07) - this.A00;
        C0914Hf c0914Hf = this.A0E;
        if (c0914Hf != null) {
            bz.readFully(c0914Hf.A00, 8, i10);
            int atomPayloadSize = this.A01;
            A0O(new WV(atomPayloadSize, this.A0E), bz.A7Z());
        } else {
            bz.AFT(i10);
        }
        A0F(bz.A7Z());
        String[] strArr = A0Y;
        String str = strArr[2];
        String str2 = strArr[4];
        int atomPayloadSize2 = str.length();
        if (atomPayloadSize2 != str2.length()) {
            throw new RuntimeException();
        }
        A0Y[1] = "jmSEpbOdW733bHBoDHkBty1cmj";
    }

    private void A0H(BZ bz) throws InterruptedException, IOException {
        CB cbValueAt = null;
        long j10 = RecyclerView.FOREVER_NS;
        int size = this.A0K.size();
        for (int i10 = 0; i10 < size; i10++) {
            CB nextTrackBundle = this.A0K.valueAt(i10);
            CM cm = nextTrackBundle.A07;
            if (cm.A0B && cm.A04 < j10) {
                j10 = cm.A04;
                cbValueAt = this.A0K.valueAt(i10);
            }
        }
        if (cbValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA7Z = (int) (j10 - bz.A7Z());
        if (iA7Z >= 0) {
            bz.AFT(iA7Z);
            cbValueAt.A07.A04(bz);
            return;
        }
        throw new C07249b(A0A(StatusLine.HTTP_TEMP_REDIRECT, 39, 39));
    }

    private void A0I(WW ww) throws C07249b {
        if (((AbstractC0790Bz) ww).A00 == AbstractC0790Bz.A0k) {
            A0K(ww);
            return;
        }
        int i10 = ((AbstractC0790Bz) ww).A00;
        int i11 = AbstractC0790Bz.A0j;
        String[] strArr = A0Y;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[6] = "QeKmRdkmErMZReeQj8";
        if (i10 == i11) {
            A0J(ww);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        WW wwPeek = this.A0T.peek();
        if (A0Y[6].length() != 17) {
            A0Y[1] = "g8UpS1NyodMZ5eBXtPatKQwsoR";
            wwPeek.A08(ww);
        } else {
            A0Y[5] = "mkv5is6F5Mu6y6USr0b4mkDGodGLaqlp";
            wwPeek.A08(ww);
        }
    }

    private void A0J(WW ww) throws C07249b {
        DrmInitData drmInitDataA05;
        A0L(ww, this.A0K, this.A0J, this.A0W);
        if (this.A0L != null) {
            drmInitDataA05 = null;
        } else {
            List<WV> list = ww.A02;
            int trackCount = A0Y[3].length();
            if (trackCount != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[2] = "YTpzURZBrt0";
            strArr[4] = "jDJUPBNch9x";
            drmInitDataA05 = A05(list);
        }
        if (drmInitDataA05 != null) {
            int i10 = this.A0K.size();
            for (int trackCount2 = 0; trackCount2 < i10; trackCount2++) {
                this.A0K.valueAt(trackCount2).A06(drmInitDataA05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0K.valueAt(i11).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    public static void A0L(WW ww, SparseArray<CB> sparseArray, int i10, byte[] bArr) throws C07249b {
        int size = ww.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            WW child = ww.A01.get(i11);
            int i12 = ((AbstractC0790Bz) child).A00;
            int moofContainerChildrenSize = AbstractC0790Bz.A1L;
            if (i12 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i10, bArr);
            }
        }
    }

    public static void A0N(WW ww, CB cb2, long j10, int totalSampleCount) {
        int i10 = 0;
        int i11 = 0;
        List<WV> list = ww.A02;
        int size = list.size();
        for (int trunSampleCount = 0; trunSampleCount < size; trunSampleCount++) {
            WV wv = list.get(trunSampleCount);
            if (((AbstractC0790Bz) wv).A00 == AbstractC0790Bz.A1O) {
                C0914Hf trunData = wv.A00;
                trunData.A0Y(12);
                int iA0H = trunData.A0H();
                if (iA0H > 0) {
                    i11 += iA0H;
                    i10++;
                }
            }
        }
        cb2.A02 = 0;
        cb2.A00 = 0;
        cb2.A01 = 0;
        cb2.A07.A03(i10, i11);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            WV wv2 = list.get(i14);
            int trunIndex = ((AbstractC0790Bz) wv2).A00;
            if (trunIndex == AbstractC0790Bz.A1O) {
                i13 = A00(cb2, i12, j10, totalSampleCount, wv2.A00, i13);
                i12++;
            }
        }
    }

    private void A0O(WV wv, long j10) throws C07249b {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(wv);
            return;
        }
        if (((AbstractC0790Bz) wv).A00 == AbstractC0790Bz.A13) {
            Pair<Long, C1306Wr> pairA04 = A04(wv.A00, j10);
            this.A0B = ((Long) pairA04.first).longValue();
            this.A0C.AEm((InterfaceC0779Bh) pairA04.second);
            this.A0F = true;
            return;
        }
        if (((AbstractC0790Bz) wv).A00 != AbstractC0790Bz.A0Q) {
            return;
        }
        A0Q(wv.A00);
    }

    private void A0Q(C0914Hf c0914Hf) {
        InterfaceC0782Bk[] interfaceC0782BkArr = this.A0I;
        if (interfaceC0782BkArr == null || interfaceC0782BkArr.length == 0) {
            return;
        }
        c0914Hf.A0Y(12);
        int sampleSize = c0914Hf.A04();
        c0914Hf.A0Q();
        c0914Hf.A0Q();
        long jA0M = c0914Hf.A0M();
        long timescale = c0914Hf.A0M();
        long jA0F = C0930Hv.A0F(timescale, 1000000L, jA0M);
        for (InterfaceC0782Bk interfaceC0782Bk : this.A0I) {
            c0914Hf.A0Y(12);
            interfaceC0782Bk.AEg(c0914Hf, sampleSize);
        }
        long j10 = this.A0B;
        if (j10 != -9223372036854775807L) {
            long jA06 = j10 + jA0F;
            C0926Hr c0926Hr = this.A0S;
            if (c0926Hr != null) {
                jA06 = c0926Hr.A06(jA06);
            }
            for (InterfaceC0782Bk interfaceC0782Bk2 : this.A0I) {
                interfaceC0782Bk2.AEh(jA06, 1, sampleSize, 0, null);
            }
            return;
        }
        this.A0U.addLast(new CA(jA0F, sampleSize));
        this.A03 += sampleSize;
    }

    public static void A0R(C0914Hf c0914Hf, int i10, CM cm) throws C07249b {
        c0914Hf.A0Y(i10 + 8);
        int fullAtom = c0914Hf.A08();
        int flags = AbstractC0790Bz.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c0914Hf.A0H();
            int fullAtom4 = cm.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(cm.A0H, 0, sampleCount, z10);
                int fullAtom5 = c0914Hf.A04();
                cm.A02(fullAtom5);
                cm.A05(c0914Hf);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0A(290, 17, 20)).append(sampleCount).append(A0A(0, 2, 62));
            int fullAtom6 = cm.A00;
            throw new C07249b(sbAppend.append(fullAtom6).toString());
        }
        throw new C07249b(A0A(381, 56, 66));
    }

    public static void A0S(C0914Hf c0914Hf, CM cm) throws C07249b {
        c0914Hf.A0Y(8);
        int flags = c0914Hf.A08();
        int fullAtom = AbstractC0790Bz.A00(flags) & 1;
        if (fullAtom == 1) {
            c0914Hf.A0Z(8);
        }
        int iA0H = c0914Hf.A0H();
        if (iA0H == 1) {
            int entryCount = AbstractC0790Bz.A01(flags);
            cm.A04 += entryCount == 0 ? c0914Hf.A0M() : c0914Hf.A0N();
            return;
        }
        throw new C07249b(A0A(552, 29, 63) + iA0H);
    }

    public static void A0T(C0914Hf c0914Hf, CM cm) throws C07249b {
        A0R(c0914Hf, 0, cm);
    }

    public static void A0U(C0914Hf c0914Hf, CM cm, byte[] bArr) throws C07249b {
        c0914Hf.A0Y(8);
        c0914Hf.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c0914Hf, 16, cm);
    }

    public static boolean A0W(int i10) {
        return i10 == AbstractC0790Bz.A0k || i10 == AbstractC0790Bz.A1M || i10 == AbstractC0790Bz.A0e || i10 == AbstractC0790Bz.A0i || i10 == AbstractC0790Bz.A17 || i10 == AbstractC0790Bz.A0j || i10 == AbstractC0790Bz.A1L || i10 == AbstractC0790Bz.A0n || i10 == AbstractC0790Bz.A0O;
    }

    public static boolean A0X(int i10) {
        if (i10 != AbstractC0790Bz.A0W && i10 != AbstractC0790Bz.A0d && i10 != AbstractC0790Bz.A0o && i10 != AbstractC0790Bz.A13 && i10 != AbstractC0790Bz.A1B) {
            int i11 = AbstractC0790Bz.A1I;
            if (A0Y[6].length() != 17) {
                A0Y[0] = "0bfDB";
                if (i10 != i11 && i10 != AbstractC0790Bz.A1J && i10 != AbstractC0790Bz.A1K && i10 != AbstractC0790Bz.A1N && i10 != AbstractC0790Bz.A1O && i10 != AbstractC0790Bz.A0s && i10 != AbstractC0790Bz.A0v) {
                    int i12 = AbstractC0790Bz.A0u;
                    if (A0Y[1].length() != 5) {
                        A0Y[5] = "GM1eDi9JpLsxcWxFcWWsCjSZthCJdr4f";
                        if (i10 != i12 && i10 != AbstractC0790Bz.A11 && i10 != AbstractC0790Bz.A1R && i10 != AbstractC0790Bz.A0y && i10 != AbstractC0790Bz.A12 && i10 != AbstractC0790Bz.A0P) {
                            int i13 = AbstractC0790Bz.A0g;
                            if (A0Y[3].length() == 6) {
                                A0Y[7] = "Eu3";
                                if (i10 != i13 && i10 != AbstractC0790Bz.A0Q) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        r2 = r11.A7Z() - ((long) r10.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r10.A01 != com.facebook.ads.redexgen.X.AbstractC0790Bz.A0j) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r9 = r10.A0K.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (r8 >= r9) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r0 = r10.A0K.valueAt(r8).A07;
        r0.A03 = r2;
        r0.A04 = r2;
        r0.A05 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (com.facebook.ads.redexgen.X.WQ.A0Y[3].length() == 6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        r7 = com.facebook.ads.redexgen.X.WQ.A0Y;
        r7[2] = "tKeeSnEBB5V";
        r7[4] = "1ppH9MP2kpM";
        r8 = r8 + 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        com.facebook.ads.redexgen.X.WQ.A0Y[0] = "GrBVN";
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012c, code lost:
    
        if (r10.A01 != com.facebook.ads.redexgen.X.AbstractC0790Bz.A0c) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
    
        r10.A0D = null;
        r10.A09 = r10.A07 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0137, code lost:
    
        if (r10.A0F != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0139, code lost:
    
        r10.A0C.AEm(new com.facebook.ads.redexgen.X.C1301Wm(r10.A08, r2));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0147, code lost:
    
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
    
        throw new com.facebook.ads.redexgen.X.C07249b(A0A(2, 48, 114));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0163, code lost:
    
        if (A0X(r10.A01) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0165, code lost:
    
        r3 = r10.A00;
        r2 = com.facebook.ads.redexgen.X.WQ.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        if (r2[2].length() == r2[4].length()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
    
        com.facebook.ads.redexgen.X.WQ.A0Y[7] = "6Yw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0186, code lost:
    
        if (r3 != 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0188, code lost:
    
        r2 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018c, code lost:
    
        if (r2 > 2147483647L) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018e, code lost:
    
        r10.A0E = new com.facebook.ads.redexgen.X.C0914Hf((int) r2);
        java.lang.System.arraycopy(r10.A0O.A00, 0, r10.A0E.A00, 0, 8);
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a8, code lost:
    
        if (r10.A07 > 2147483647L) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01aa, code lost:
    
        r10.A0E = null;
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b5, code lost:
    
        if (A0W(r10.A01) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b7, code lost:
    
        r5 = (r11.A7Z() + r10.A07) - 8;
        r10.A0T.push(new com.facebook.ads.redexgen.X.WW(r10.A01, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d4, code lost:
    
        if (r10.A07 != r10.A00) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d6, code lost:
    
        A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01da, code lost:
    
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ed, code lost:
    
        throw new com.facebook.ads.redexgen.X.C07249b(A0A(241, 49, 53));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fd, code lost:
    
        throw new com.facebook.ads.redexgen.X.C07249b(A0A(190, 51, 24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        throw new com.facebook.ads.redexgen.X.C07249b(A0A(479, 53, 2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Y(com.facebook.ads.redexgen.X.BZ r11) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WQ.A0Y(com.facebook.ads.redexgen.X.BZ):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0107 A[PHI: r0 r1 r5 r7 r8
  0x0107: PHI (r0v80 com.facebook.ads.redexgen.X.Hr) = (r0v9 com.facebook.ads.redexgen.X.Hr), (r0v84 com.facebook.ads.redexgen.X.Hr) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r1v6 long) = (r1v4 long), (r1v10 long) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r5v3 com.facebook.ads.redexgen.X.CK) = (r5v0 com.facebook.ads.redexgen.X.CK), (r5v4 com.facebook.ads.redexgen.X.CK) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r7v3 com.facebook.ads.redexgen.X.Bk) = (r7v0 com.facebook.ads.redexgen.X.Bk), (r7v4 com.facebook.ads.redexgen.X.Bk) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r8v3 int) = (r8v0 int), (r8v4 int) binds: [B:62:0x020c, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0188  */
    /* JADX WARN: Code duplicated, block: B:58:0x0191  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean A0Z(BZ bz) throws InterruptedException, IOException {
        CK ck;
        InterfaceC0782Bk interfaceC0782Bk;
        int i10;
        long jA00;
        C0926Hr c0926Hr;
        CL clA00;
        boolean z10;
        int iAEf;
        int i11 = 4;
        int i12 = 1;
        int i13 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                CB cbA07 = A07(this.A0K);
                if (cbA07 == null) {
                    int iA7Z = (int) (this.A09 - bz.A7Z());
                    if (iA7Z >= 0) {
                        bz.AFT(iA7Z);
                        A0B();
                        return false;
                    }
                    throw new C07249b(A0A(346, 35, 56));
                }
                int iA7Z2 = (int) (cbA07.A07.A0G[cbA07.A02] - bz.A7Z());
                if (iA7Z2 < 0) {
                    Log.w(A0A(128, 22, 24), A0A(150, 40, 46));
                    iA7Z2 = 0;
                }
                bz.AFT(iA7Z2);
                if (A0Y[6].length() == 17) {
                    throw new RuntimeException();
                }
                A0Y[3] = "TF0FBE";
                this.A0D = cbA07;
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                bz.AFT(this.A06);
                this.A0D.A01();
                if (!this.A0D.A08()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            if (this.A0D.A05.A02 == 1) {
                this.A06 -= 8;
                bz.AFT(8);
            }
            int iA03 = this.A0D.A03();
            this.A04 = iA03;
            this.A06 += iA03;
            this.A02 = 4;
            this.A05 = 0;
        }
        CM cm = this.A0D.A07;
        CB cb2 = this.A0D;
        String[] strArr = A0Y;
        if (strArr[2].length() != strArr[4].length()) {
            A0Y[7] = "Pqi";
            ck = cb2.A05;
            interfaceC0782Bk = this.A0D.A06;
            i10 = this.A0D.A01;
            jA00 = cm.A00(i10) * 1000;
            c0926Hr = this.A0S;
            if (c0926Hr != null) {
                jA00 = c0926Hr.A06(jA00);
            }
        } else {
            A0Y[0] = "M6XHB";
            ck = cb2.A05;
            interfaceC0782Bk = this.A0D.A06;
            i10 = this.A0D.A01;
            jA00 = cm.A00(i10) * 1000;
            c0926Hr = this.A0S;
            if (c0926Hr != null) {
                jA00 = c0926Hr.A06(jA00);
            }
        }
        if (ck.A01 == 0) {
            while (true) {
                int i14 = this.A04;
                int i15 = this.A06;
                if (i14 >= i15) {
                    break;
                }
                this.A04 += interfaceC0782Bk.AEf(bz, i15 - i14, false);
            }
        } else {
            byte[] bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i16 = ck.A01 + 1;
            int i17 = 4 - ck.A01;
            while (this.A04 < this.A06) {
                int i18 = this.A05;
                if (A0Y[1].length() != 5) {
                    String[] strArr2 = A0Y;
                    strArr2[2] = "oY9Cfc6NZLH";
                    strArr2[4] = "IHvoiGll8tT";
                    if (i18 == 0) {
                        bz.readFully(bArr, i17, i16);
                        this.A0Q.A0Y(i13);
                        this.A05 = this.A0Q.A0H() - i12;
                        this.A0R.A0Y(i13);
                        interfaceC0782Bk.AEg(this.A0R, i11);
                        interfaceC0782Bk.AEg(this.A0Q, i12);
                        if (this.A0H.length > 0 || !C0910Hb.A0C(ck.A07.A0O, bArr[i11])) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        this.A0G = z10;
                        this.A04 += 5;
                        this.A06 += i17;
                    } else {
                        if (this.A0G) {
                            this.A0P.A0W(i18);
                            bz.readFully(this.A0P.A00, i13, this.A05);
                            interfaceC0782Bk.AEg(this.A0P, this.A05);
                            iAEf = this.A05;
                            int iA02 = C0910Hb.A02(this.A0P.A00, this.A0P.A07());
                            this.A0P.A0Y(A0A(686, 10, 6).equals(ck.A07.A0O) ? 1 : 0);
                            this.A0P.A0X(iA02);
                            C0863Fe.A03(jA00, this.A0P, this.A0H);
                        } else {
                            iAEf = interfaceC0782Bk.AEf(bz, i18, false);
                        }
                        this.A04 += iAEf;
                        this.A05 -= iAEf;
                        i11 = 4;
                        i12 = 1;
                        i13 = 0;
                    }
                } else if (i18 == 0) {
                    bz.readFully(bArr, i17, i16);
                    this.A0Q.A0Y(i13);
                    this.A05 = this.A0Q.A0H() - i12;
                    this.A0R.A0Y(i13);
                    interfaceC0782Bk.AEg(this.A0R, i11);
                    interfaceC0782Bk.AEg(this.A0Q, i12);
                    if (this.A0H.length > 0) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    this.A0G = z10;
                    this.A04 += 5;
                    this.A06 += i17;
                } else {
                    if (this.A0G) {
                        this.A0P.A0W(i18);
                        bz.readFully(this.A0P.A00, i13, this.A05);
                        interfaceC0782Bk.AEg(this.A0P, this.A05);
                        iAEf = this.A05;
                        int iA04 = C0910Hb.A02(this.A0P.A00, this.A0P.A07());
                        this.A0P.A0Y(A0A(686, 10, 6).equals(ck.A07.A0O) ? 1 : 0);
                        this.A0P.A0X(iA04);
                        C0863Fe.A03(jA00, this.A0P, this.A0H);
                    } else {
                        iAEf = interfaceC0782Bk.AEf(bz, i18, false);
                    }
                    this.A04 += iAEf;
                    this.A05 -= iAEf;
                    i11 = 4;
                    i12 = 1;
                    i13 = 0;
                }
            }
        }
        boolean z11 = cm.A0I[i10];
        C0781Bj c0781Bj = null;
        int i19 = z11;
        if (cm.A0A) {
            int i20 = (z11 ? 1 : 0) | 1073741824;
            if (cm.A08 != null) {
                clA00 = cm.A08;
            } else {
                clA00 = ck.A00(cm.A07.A02);
            }
            c0781Bj = clA00.A01;
            i19 = i20;
        }
        interfaceC0782Bk.AEh(jA00, i19, this.A06, 0, c0781Bj);
        A0E(jA00);
        if (!this.A0D.A08()) {
            this.A0D = null;
        }
        this.A02 = 3;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A0C = interfaceC0774Ba;
        CK ck = this.A0N;
        if (ck != null) {
            CB cb2 = new CB(interfaceC0774Ba.AFm(0, ck.A03));
            cb2.A07(this.A0N, new C5(0, 0, 0, 0));
            this.A0K.put(0, cb2);
            A0C();
            this.A0C.A5S();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.A02;
            if (A0Y[6].length() == 17) {
                throw new RuntimeException();
            }
            A0Y[6] = "Adcvl3OLLWBEEjCvRjB7l1tHvWvuGk";
            switch (i10) {
                case 0:
                    if (!A0Y(bz)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0G(bz);
                    break;
                case 2:
                    A0H(bz);
                    break;
                default:
                    if (A0Z(bz)) {
                        return 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        int size = this.A0K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0K.valueAt(i10).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j11;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        return CI.A03(bz);
    }
}
