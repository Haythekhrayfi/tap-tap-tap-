package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WD implements BY {
    public static byte[] A04;
    public static String[] A05 = {"89ZAS4gKAvfsCOhGFLRndaPlzH5Jylu0", "WDj0w8iYShPhw5JkNLQVjMzFidij1YMB", "SZD8V9ebG6DMCxkEToUDQHseHkwYH45y", "flB69VC8Ebs69L5nDVZVAs6kLxLMfW9p", "Dc9Giep11FBAOEJK", "fiVRhSZcsaoyqUlEeIiHO4czNXpaN55t", "HHz5E2PDkz6p7na9zQig", "GASwop9kiLfFsL9tAHZWlbr16muWtU3x"};
    public static final InterfaceC0775Bb A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final WC A02;
    public final C0914Hf A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-8, -13, -30};
        if (A05[3].charAt(6) != 'C') {
            throw new RuntimeException();
        }
        A05[6] = "Dcf";
    }

    static {
        A01();
        A06 = new WE();
        A07 = C0930Hv.A08(A00(0, 3, 105));
    }

    public WD() {
        this(0L);
    }

    public WD(long j10) {
        this.A01 = j10;
        this.A02 = new WC();
        this.A03 = new C0914Hf(2786);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A02.A4k(interfaceC0774Ba, new C0804Cs(0, 1));
        interfaceC0774Ba.A5S();
        interfaceC0774Ba.AEm(new C1301Wm(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        int i10 = bz.read(this.A03.A00, 0, 2786);
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
        int i10 = 0;
        while (true) {
            bz.ADa(c0914Hf.A00, 0, 5);
            c0914Hf.A0Y(0);
            int headerPosition = c0914Hf.A0I();
            if (headerPosition != 2935) {
                i10 = 0;
                bz.AEb();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                bz.A3R(syncBytes);
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int headerPosition3 = A6.A05(c0914Hf.A00);
                if (headerPosition3 == -1) {
                    return false;
                }
                bz.A3R(headerPosition3 - 5);
            }
        }
    }
}
