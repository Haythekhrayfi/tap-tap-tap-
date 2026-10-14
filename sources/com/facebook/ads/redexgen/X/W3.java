package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W3 implements InterfaceC0793Ce {
    public static byte[] A0E;
    public static String[] A0F = {"NvpEV7R7ZS5uNQ5TFb57EvhjwIZCTQku", "DdUDSiCrGQUoEviiVingxcQFfwNbDa", "hetlnsRY2wqGSQpiRITV", "h6jp2Z", "H3YUjFwBN5I", "HDGGogJPAHFPfOUxVzLcmHcfpTDLo", "fvYnB4Gz7ZvwaQ8Y4EtF6ZMgsdzNJKEV", "DcduA0DmY9P8nwkm6XpLf73k0ckt"};
    public long A00;
    public long A01;
    public InterfaceC0782Bk A02;
    public Cj A03;
    public String A04;
    public boolean A05;
    public final C0800Cn A0B;
    public final boolean[] A0D = new boolean[3];
    public final C0797Ck A0A = new C0797Ck(32, 128);
    public final C0797Ck A08 = new C0797Ck(33, 128);
    public final C0797Ck A06 = new C0797Ck(34, 128);
    public final C0797Ck A07 = new C0797Ck(39, 128);
    public final C0797Ck A09 = new C0797Ck(40, 128);
    public final C0914Hf A0C = new C0914Hf();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0F[3] = "YNSDJ1";
        A0E = new byte[]{121, 3, 7, 4, 99, 84, 80, 85, 84, 67, 126, 69, 78, 83, 91, 78, 72, 95, 78, 79, 11, 74, 88, 91, 78, 72, 95, 116, 89, 74, 95, 66, 68, 116, 66, 79, 72, 11, 93, 74, 71, 94, 78, 17, 11, 78, 81, 92, 93, 87, 23, 80, 93, 78, 91};
    }

    static {
        A02();
    }

    public W3(C0800Cn c0800Cn) {
        this.A0B = c0800Cn;
    }

    public static Format A00(String str, C0797Ck c0797Ck, C0797Ck c0797Ck2, C0797Ck c0797Ck3) {
        byte[] bArr = new byte[c0797Ck.A00 + c0797Ck2.A00 + c0797Ck3.A00];
        System.arraycopy(c0797Ck.A01, 0, bArr, 0, c0797Ck.A00);
        System.arraycopy(c0797Ck2.A01, 0, bArr, c0797Ck.A00, c0797Ck2.A00);
        System.arraycopy(c0797Ck3.A01, 0, bArr, c0797Ck.A00 + c0797Ck2.A00, c0797Ck3.A00);
        C0915Hg c0915Hg = new C0915Hg(c0797Ck2.A01, 0, c0797Ck2.A00);
        c0915Hg.A07(44);
        int i10 = c0915Hg.A05(3);
        c0915Hg.A06();
        c0915Hg.A07(88);
        c0915Hg.A07(8);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (c0915Hg.A0A()) {
                i11 += 89;
            }
            if (c0915Hg.A0A()) {
                i11 += 8;
            }
        }
        c0915Hg.A07(i11);
        if (i10 > 0) {
            c0915Hg.A07((8 - i10) * 2);
        }
        c0915Hg.A04();
        int chromaFormatIdc = c0915Hg.A04();
        if (chromaFormatIdc == 3) {
            c0915Hg.A06();
        }
        int picHeightInLumaSamples = c0915Hg.A04();
        int confWinLeftOffset = c0915Hg.A04();
        if (A0F[1].length() == 12) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[4] = "a8PzOvYW3xW";
        strArr[2] = "i4yWj6LgSPQERWLdQfta";
        if (c0915Hg.A0A()) {
            int toSkip = c0915Hg.A04();
            int iA04 = c0915Hg.A04();
            int subHeightC = c0915Hg.A04();
            int iA05 = c0915Hg.A04();
            picHeightInLumaSamples -= (toSkip + iA04) * ((chromaFormatIdc == 1 || chromaFormatIdc == 2) ? 2 : 1);
            confWinLeftOffset -= (subHeightC + iA05) * (chromaFormatIdc == 1 ? 2 : 1);
        }
        c0915Hg.A04();
        c0915Hg.A04();
        int iA06 = c0915Hg.A04();
        for (int i13 = c0915Hg.A0A() ? 0 : i10; i13 <= i10; i13++) {
            c0915Hg.A04();
            c0915Hg.A04();
            c0915Hg.A04();
        }
        c0915Hg.A04();
        c0915Hg.A04();
        c0915Hg.A04();
        c0915Hg.A04();
        c0915Hg.A04();
        c0915Hg.A04();
        if (c0915Hg.A0A() && c0915Hg.A0A()) {
            A05(c0915Hg);
        }
        c0915Hg.A07(2);
        if (c0915Hg.A0A()) {
            c0915Hg.A07(8);
            c0915Hg.A04();
            c0915Hg.A04();
            c0915Hg.A06();
        }
        A06(c0915Hg);
        if (c0915Hg.A0A()) {
            for (int i14 = 0; i14 < c0915Hg.A04(); i14++) {
                c0915Hg.A07(iA06 + 4 + 1);
            }
        }
        c0915Hg.A07(2);
        float f10 = 1.0f;
        if (c0915Hg.A0A() && c0915Hg.A0A()) {
            int log2MaxPicOrderCntLsbMinus4 = c0915Hg.A05(8);
            if (log2MaxPicOrderCntLsbMinus4 == 255) {
                int iA07 = c0915Hg.A05(16);
                int iA08 = c0915Hg.A05(16);
                if (iA07 != 0 && iA08 != 0) {
                    f10 = iA07 / iA08;
                }
            } else {
                float[] fArr = C0910Hb.A04;
                String[] strArr2 = A0F;
                if (strArr2[4].length() == strArr2[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0F;
                strArr3[4] = "Mq8kmMTSiz0";
                strArr3[2] = "TBAE07oWZ5Khy7farxDr";
                if (log2MaxPicOrderCntLsbMinus4 < fArr.length) {
                    f10 = C0910Hb.A04[log2MaxPicOrderCntLsbMinus4];
                } else {
                    Log.w(A01(0, 10, 24), A01(10, 35, 2) + log2MaxPicOrderCntLsbMinus4);
                }
            }
        }
        List listSingletonList = Collections.singletonList(bArr);
        if (A0F[3].length() != 6) {
            String[] strArr4 = A0F;
            strArr4[7] = "REKIidOCsv4ptzsgivtfnGOww6JG";
            strArr4[5] = "T94vPaWVm7jdMSWQElc8luWGTOlSo";
            return Format.A03(str, A01(45, 10, 17), null, -1, -1, picHeightInLumaSamples, confWinLeftOffset, -1.0f, listSingletonList, -1, f10, null);
        }
        String[] strArr5 = A0F;
        strArr5[7] = "W2GdBlThEFkhmpYhDIzNH9YY1BaI";
        strArr5[5] = "0yDCfDeoWht2juYgXJKTHBbNY9ana";
        return Format.A03(str, A01(45, 10, 17), null, -1, -1, picHeightInLumaSamples, confWinLeftOffset, -1.0f, listSingletonList, -1, f10, null);
    }

    private void A03(long j10, int i10, int i11, long j11) {
        if (this.A05) {
            this.A03.A02(j10, i10);
        } else {
            this.A0A.A04(i11);
            this.A08.A04(i11);
            this.A06.A04(i11);
            if (this.A0A.A03() && this.A08.A03() && this.A06.A03()) {
                this.A02.A5i(A00(this.A04, this.A0A, this.A08, this.A06));
                this.A05 = true;
            }
        }
        if (this.A07.A04(i11)) {
            C0797Ck c0797Ck = this.A07;
            if (A0F[1].length() == 12) {
                throw new RuntimeException();
            }
            A0F[3] = "Yba7mj";
            this.A0C.A0b(this.A07.A01, C0910Hb.A02(c0797Ck.A01, this.A07.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j11, this.A0C);
        }
        if (this.A09.A04(i11)) {
            this.A0C.A0b(this.A09.A01, C0910Hb.A02(this.A09.A01, this.A09.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j11, this.A0C);
        }
    }

    private void A04(long j10, int i10, int i11, long j11) {
        if (this.A05) {
            this.A03.A03(j10, i10, i11, j11);
        } else {
            this.A0A.A01(i11);
            this.A08.A01(i11);
            this.A06.A01(i11);
        }
        this.A07.A01(i11);
        this.A09.A01(i11);
    }

    public static void A05(C0915Hg c0915Hg) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int matrixId = 1;
                if (!c0915Hg.A0A()) {
                    c0915Hg.A04();
                } else {
                    int sizeId = i10 << 1;
                    int iMin = Math.min(64, 1 << (sizeId + 4));
                    if (i10 > 1) {
                        c0915Hg.A03();
                    }
                    for (int sizeId2 = 0; sizeId2 < iMin; sizeId2++) {
                        c0915Hg.A03();
                    }
                }
                if (i10 == 3) {
                    matrixId = 3;
                }
                i11 += matrixId;
            }
        }
    }

    public static void A06(C0915Hg c0915Hg) {
        int iA04 = c0915Hg.A04();
        boolean zA0A = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < iA04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                zA0A = c0915Hg.A0A();
            }
            if (zA0A) {
                c0915Hg.A06();
                c0915Hg.A04();
                for (int i10 = 0; i10 <= numNegativePics; i10++) {
                    if (c0915Hg.A0A()) {
                        c0915Hg.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = c0915Hg.A04();
                int iA05 = c0915Hg.A04();
                numNegativePics = previousNumDeltaPocs + iA05;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    c0915Hg.A04();
                    c0915Hg.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < iA05; numShortTermRefPicSets2++) {
                    c0915Hg.A04();
                    c0915Hg.A06();
                }
            }
        }
    }

    private void A07(byte[] bArr, int i10, int i11) {
        if (this.A05) {
            this.A03.A04(bArr, i10, i11);
        } else {
            this.A0A.A02(bArr, i10, i11);
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A09.A02(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4N(C0914Hf c0914Hf) {
        while (true) {
            int iA04 = c0914Hf.A04();
            if (A0F[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[0] = "AvzYB124iDQiX3hdxqfkLksaQ25q0Ga1";
            strArr[6] = "Nv2bR4D3VQ28suo5ivBlL2099SuCEJEb";
            if (iA04 > 0) {
                int iA06 = c0914Hf.A06();
                int iA07 = c0914Hf.A07();
                byte[] bArr = c0914Hf.A00;
                long j10 = this.A01;
                int offset = c0914Hf.A04();
                this.A01 = j10 + ((long) offset);
                InterfaceC0782Bk interfaceC0782Bk = this.A02;
                int offset2 = c0914Hf.A04();
                interfaceC0782Bk.AEg(c0914Hf, offset2);
                while (iA06 < iA07) {
                    int iA05 = C0910Hb.A04(bArr, iA06, iA07, this.A0D);
                    if (iA05 == iA07) {
                        A07(bArr, iA06, iA07);
                        return;
                    }
                    int bytesWrittenPastPosition = C0910Hb.A00(bArr, iA05);
                    int i10 = iA05 - iA06;
                    if (i10 > 0) {
                        A07(bArr, iA06, iA05);
                    }
                    int i11 = iA07 - iA05;
                    long j11 = this.A01 - ((long) i11);
                    int offset3 = i10 < 0 ? -i10 : 0;
                    A03(j11, i11, offset3, this.A00);
                    long absolutePosition = this.A00;
                    A04(j11, i11, bytesWrittenPastPosition, absolutePosition);
                    iA06 = iA05 + 3;
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        this.A04 = c0804Cs.A04();
        InterfaceC0782Bk interfaceC0782BkAFm = interfaceC0774Ba.AFm(c0804Cs.A03(), 2);
        this.A02 = interfaceC0782BkAFm;
        this.A03 = new Cj(interfaceC0782BkAFm);
        this.A0B.A03(interfaceC0774Ba, c0804Cs);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADX() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADY(long j10, boolean z10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void AEk() {
        C0910Hb.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
