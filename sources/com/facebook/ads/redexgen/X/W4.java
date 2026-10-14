package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W4 implements InterfaceC0793Ce {
    public static byte[] A0E;
    public static String[] A0F = {"FmtBUqGmzQvxm47AtoGl5GE", "5iXLyJPyDLcaPMUjk1v5bxBpoPhfo", "hif1Xiw3z0OLVixA8K1yUZiszA96", "VzETX2BwbL5Y", "rXQDE7FzOjIY2cTlxG1EbFIaNFkq3NBz", "hyxBaGmEw9nsGl9VO3HFyZpkQthqrgGl", "hfnp76HvDzKR", "cXQxcUyRSwddwq1B1B5vUbLw26Cn"};
    public long A00;
    public long A01;
    public InterfaceC0782Bk A02;
    public C0796Ci A03;
    public String A04;
    public boolean A05;
    public final C0800Cn A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final C0797Ck A08 = new C0797Ck(7, 128);
    public final C0797Ck A06 = new C0797Ck(8, 128);
    public final C0797Ck A07 = new C0797Ck(6, 128);
    public final C0914Hf A0A = new C0914Hf();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 73);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    static {
        A01();
    }

    public W4(C0800Cn c0800Cn, boolean z10, boolean z11) {
        this.A09 = c0800Cn;
        this.A0B = z10;
        this.A0C = z11;
    }

    private void A02(long j10, int i10, int i11, long j11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A04(i11);
            this.A06.A04(i11);
            if (!this.A05) {
                if (this.A08.A03() && this.A06.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    arrayList.add(Arrays.copyOf(this.A06.A01, this.A06.A00));
                    C0909Ha c0909HaA06 = C0910Hb.A06(this.A08.A01, 3, this.A08.A00);
                    HZ ppsData = C0910Hb.A05(this.A06.A01, 3, this.A06.A00);
                    this.A02.A5i(Format.A03(this.A04, A00(0, 9, 18), null, -1, -1, c0909HaA06.A06, c0909HaA06.A02, -1.0f, arrayList, -1, c0909HaA06.A00, null));
                    this.A05 = true;
                    this.A03.A05(c0909HaA06);
                    this.A03.A04(ppsData);
                    this.A08.A00();
                    this.A06.A00();
                }
            } else if (this.A08.A03()) {
                this.A03.A05(C0910Hb.A06(this.A08.A01, 3, this.A08.A00));
                this.A08.A00();
            } else if (this.A06.A03()) {
                this.A03.A04(C0910Hb.A05(this.A06.A01, 3, this.A06.A00));
                this.A06.A00();
            }
        }
        if (this.A07.A04(i11)) {
            C0797Ck c0797Ck = this.A07;
            String[] strArr = A0F;
            if (strArr[4].charAt(26) == strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[4] = "MYiVFEqyRoVR8PpaQvBVtWO0d80axIUe";
            strArr2[5] = "WESehlM6UD3i8IXgr5ZdByrcv93bSxFf";
            int unescapedLength = C0910Hb.A02(c0797Ck.A01, this.A07.A00);
            this.A0A.A0b(this.A07.A01, unescapedLength);
            this.A0A.A0Y(4);
            this.A09.A02(j11, this.A0A);
        }
        this.A03.A02(j10, i10);
    }

    private void A03(long j10, int i10, long j11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i10);
            this.A06.A01(i10);
        }
        this.A07.A01(i10);
        this.A03.A03(j10, i10, j11);
    }

    private void A04(byte[] bArr, int i10, int i11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A03.A06(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4N(C0914Hf c0914Hf) {
        int offset;
        int iA06 = c0914Hf.A06();
        int iA07 = c0914Hf.A07();
        byte[] bArr = c0914Hf.A00;
        long j10 = this.A01;
        int offset2 = c0914Hf.A04();
        this.A01 = j10 + ((long) offset2);
        InterfaceC0782Bk interfaceC0782Bk = this.A02;
        int offset3 = c0914Hf.A04();
        interfaceC0782Bk.AEg(c0914Hf, offset3);
        while (true) {
            int iA04 = C0910Hb.A04(bArr, iA06, iA07, this.A0D);
            if (iA04 == iA07) {
                A04(bArr, iA06, iA07);
                return;
            }
            int lengthToNalUnit = C0910Hb.A01(bArr, iA04);
            int i10 = iA04 - iA06;
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[3] = "lQl99M6qnQlq";
            strArr2[6] = "jJKIbaSVKHql";
            if (i10 > 0) {
                A04(bArr, iA06, iA04);
            }
            int i11 = iA07 - iA04;
            long j11 = this.A01 - ((long) i11);
            if (i10 < 0) {
                offset = -i10;
                String[] strArr3 = A0F;
                if (strArr3[7].length() != strArr3[2].length()) {
                    String[] strArr4 = A0F;
                    strArr4[7] = "CFaupTF247UissJwn80OFqAOj9Vx";
                    strArr4[2] = "5OzpI30ijAeJlsq8Y1OyIdlDADpj";
                } else {
                    String[] strArr5 = A0F;
                    strArr5[1] = "eqTKDwhJaRXE4qM7uaf5ert1lQX8N";
                    strArr5[0] = "XXULpdZ36j09HmRAAM7fCX7";
                }
            } else {
                offset = 0;
            }
            A02(j11, i11, offset, this.A00);
            A03(j11, lengthToNalUnit, this.A00);
            iA06 = iA04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        this.A04 = c0804Cs.A04();
        InterfaceC0782Bk interfaceC0782BkAFm = interfaceC0774Ba.AFm(c0804Cs.A03(), 2);
        this.A02 = interfaceC0782BkAFm;
        this.A03 = new C0796Ci(interfaceC0782BkAFm, this.A0B, this.A0C);
        this.A09.A03(interfaceC0774Ba, c0804Cs);
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
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
