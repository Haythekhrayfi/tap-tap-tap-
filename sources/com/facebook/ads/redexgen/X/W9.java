package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W9 implements InterfaceC0793Ce {
    public static byte[] A0H;
    public static String[] A0I = {"aRSbhnMLIcOzj", "ArMoJofeV0W2c5eK3C8YvO0k1qJSW4Bu", "08qFCQPWLGI3uv5FT5gA6GEjfGrW3Yqx", "08xirDFjjs8oqtTIfBkr", "oUVAEbDN9zve", "EoNb", "rtTHy9LVM9SlY", "UaKoPz55Hu2hTR949azFeJYsN1lXPKTw"};
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public InterfaceC0782Bk A07;
    public InterfaceC0782Bk A08;
    public InterfaceC0782Bk A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C0913He A0D;
    public final C0914Hf A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-31, -43, 23, 42, 41, -43, 22, 40, 40, 42, 34, Ascii.RS, 35, Ascii.FS, -43, -10, -10, -8, -43, 1, -8, -29, -8, Ascii.ESC, 43, 42, 9, Ascii.FS, Ascii.CAN, Ascii.ESC, Ascii.FS, 41, -39, -6, 9, -6, -8, 9, -6, -7, -75, -10, 10, -7, -2, 4, -75, 4, -9, -1, -6, -8, 9, -75, 9, 14, 5, -6, -49, -75, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 42, 37, -12, 0, 20, 3, 8, 14, -50, 12, 15, -45, 0, -52, 11, 0, 19, 12};
    }

    static {
        A06();
        A0J = new byte[]{73, 68, 51};
    }

    public W9(boolean z10) {
        this(z10, null);
    }

    public W9(boolean z10, String str) {
        this.A0D = new C0913He(new byte[7]);
        this.A0E = new C0914Hf(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z10;
        this.A0F = str;
    }

    private void A01() throws C07249b {
        this.A0D.A07(0);
        if (!this.A0C) {
            int iA04 = this.A0D.A04(2) + 1;
            if (iA04 != 2) {
                Log.w(A00(22, 10, 59), A00(32, 28, 25) + iA04 + A00(0, 22, 57));
                iA04 = 2;
            }
            int iA05 = this.A0D.A04(4);
            this.A0D.A08(1);
            int audioObjectType = this.A0D.A04(3);
            byte[] bArrA07 = HK.A07(iA04, iA05, audioObjectType);
            Pair<Integer, Integer> pairA03 = HK.A03(bArrA07);
            Format formatA07 = Format.A07(this.A0A, A00(75, 15, 35), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(bArrA07), null, 0, this.A0F);
            int audioObjectType2 = formatA07.A0C;
            this.A05 = 1024000000 / ((long) audioObjectType2);
            this.A09.A5i(formatA07);
            this.A0C = true;
        } else {
            this.A0D.A08(10);
        }
        this.A0D.A08(4);
        int iA06 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            iA06 -= 2;
        }
        A07(this.A09, this.A05, 0, iA06);
    }

    private void A02() {
        this.A08.AEg(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(InterfaceC0782Bk interfaceC0782Bk, long j10, int i10, int i11) {
        this.A03 = 3;
        this.A00 = i10;
        this.A07 = interfaceC0782Bk;
        this.A04 = j10;
        this.A02 = i11;
    }

    private void A08(C0914Hf c0914Hf) {
        byte[] bArr = c0914Hf.A00;
        int iA06 = c0914Hf.A06();
        int iA07 = c0914Hf.A07();
        while (iA06 < iA07) {
            int i10 = iA06 + 1;
            int i11 = bArr[iA06] & 255;
            int endOffset = this.A01;
            if (endOffset == 512 && i11 >= 240 && i11 != 255) {
                this.A0B = (i11 & 1) == 0;
                A04();
                c0914Hf.A0Y(i10);
                return;
            }
            switch (endOffset | i11) {
                case 329:
                    this.A01 = 768;
                    iA06 = i10;
                    break;
                case 511:
                    this.A01 = 512;
                    iA06 = i10;
                    break;
                case 836:
                    this.A01 = 1024;
                    iA06 = i10;
                    break;
                case 1075:
                    A05();
                    c0914Hf.A0Y(i10);
                    break;
                default:
                    if (endOffset != 256) {
                        this.A01 = 256;
                        iA06 = i10 - 1;
                    } else {
                        iA06 = i10;
                    }
                    break;
            }
            return;
        }
        c0914Hf.A0Y(iA06);
    }

    private void A09(C0914Hf c0914Hf) {
        int iMin = Math.min(c0914Hf.A04(), this.A02 - this.A00);
        this.A07.AEg(c0914Hf, iMin);
        int bytesToRead = this.A00 + iMin;
        this.A00 = bytesToRead;
        int i10 = this.A02;
        if (bytesToRead == i10) {
            this.A07.AEh(this.A06, 1, i10, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C0914Hf c0914Hf, byte[] bArr, int i10) {
        int iMin = Math.min(c0914Hf.A04(), i10 - this.A00);
        int bytesToRead = this.A00;
        c0914Hf.A0c(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + iMin;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4N(C0914Hf c0914Hf) throws C07249b {
        while (c0914Hf.A04() > 0) {
            switch (this.A03) {
                case 0:
                    A08(c0914Hf);
                    break;
                case 1:
                    if (A0A(c0914Hf, this.A0E.A00, 10)) {
                        A02();
                    }
                    break;
                case 2:
                    if (A0A(c0914Hf, this.A0D.A00, this.A0B ? 7 : 5)) {
                        A01();
                    }
                    break;
                case 3:
                    A09(c0914Hf);
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        this.A0A = c0804Cs.A04();
        this.A09 = interfaceC0774Ba.AFm(c0804Cs.A03(), 1);
        if (this.A0G) {
            c0804Cs.A05();
            InterfaceC0782Bk interfaceC0782BkAFm = interfaceC0774Ba.AFm(c0804Cs.A03(), 4);
            this.A08 = interfaceC0782BkAFm;
            if (A0I[4].length() != 12) {
                throw new RuntimeException();
            }
            A0I[5] = "GBp";
            interfaceC0782BkAFm.A5i(Format.A0B(c0804Cs.A04(), A00(60, 15, 69), null, -1, null));
            return;
        }
        this.A08 = new C1303Wo();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADX() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADY(long j10, boolean z10) {
        this.A06 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void AEk() {
        A03();
    }
}
