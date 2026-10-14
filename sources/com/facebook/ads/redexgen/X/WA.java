package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WA implements BY {
    public static byte[] A04;
    public static String[] A05 = {"zdP8mq1V4qx9ZCdsfAD4NG7cLFVpQAAe", "koAkuIv", "fyRTvmHGGGsRl9BV6D3JToZwd0QymLEV", "Ol6FmQC", "pWzJ4KWOtVeOprDRKRooJjLfCIz1i7Yl", "FaGWZpOEFJ3DEiDU22ljd64Ld5pUV9HD", "txEKQBUTk3v9kOkzxdvVTnLo1IME9gDG", "VQ1knBpCfCAoSCLl3kVfN2N5wBdN5LBp"};
    public static final InterfaceC0775Bb A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final W9 A02;
    public final C0914Hf A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A05;
            if (strArr[2].charAt(21) == strArr[4].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "6nR4pRT1Z5KTQHbqvhpghrBhlvQkSoKV";
            strArr2[5] = "SkXTa4uQceGhkSQtr6wVij7rDC15CMq5";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 67);
            i13++;
        }
    }

    public static void A01() {
        A04 = new byte[]{66, 79, 56};
    }

    static {
        A01();
        A06 = new WB();
        A07 = C0930Hv.A08(A00(0, 3, 72));
    }

    public WA() {
        this(0L);
    }

    public WA(long j10) {
        this.A01 = j10;
        this.A02 = new W9(true);
        this.A03 = new C0914Hf(200);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A02.A4k(interfaceC0774Ba, new C0804Cs(0, 1));
        interfaceC0774Ba.A5S();
        interfaceC0774Ba.AEm(new C1301Wm(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        int i10 = bz.read(this.A03.A00, 0, 200);
        if (i10 == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(i10);
        if (!this.A00) {
            this.A02.ADY(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4N(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        this.A00 = false;
        this.A02.AEk();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        C0914Hf c0914Hf = new C0914Hf(10);
        C0913He c0913He = new C0913He(c0914Hf.A00);
        int startPosition = 0;
        while (true) {
            bz.ADa(c0914Hf.A00, 0, 10);
            c0914Hf.A0Y(0);
            if (c0914Hf.A0G() != A07) {
                break;
            }
            c0914Hf.A0Z(3);
            int iA0D = c0914Hf.A0D();
            startPosition += iA0D + 10;
            bz.A3R(iA0D);
        }
        bz.AEb();
        bz.A3R(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i10 = 0;
        while (true) {
            bz.ADa(c0914Hf.A00, 0, 2);
            c0914Hf.A0Y(0);
            int headerPosition = 65526 & c0914Hf.A0I();
            if (headerPosition != 65520) {
                i10 = 0;
                validFramesCount = 0;
                bz.AEb();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                bz.A3R(syncBytes);
            } else {
                i10++;
                if (i10 >= 4 && validFramesCount > 188) {
                    return true;
                }
                bz.ADa(c0914Hf.A00, 0, 4);
                c0913He.A07(14);
                int headerPosition3 = c0913He.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                bz.A3R(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
