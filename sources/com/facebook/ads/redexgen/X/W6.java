package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W6 implements InterfaceC0793Ce {
    public static byte[] A06;
    public static String[] A07 = {"c0KpkRjZorNQD76", "v", "0d4inMg3wDkuo1aYYl0ssqqGC", "DDXERfdvXnPt4luj6e7N9DVUtx6ZaQcR", "MB0SdpAzdDPGS5LRihVQgeZ9YJgSZ4OW", "1ftUnjVA0zWQWzcI2VyXZGsvfHTse3XE", "DWX3euW52jSmR8J8g1ui9PfHl", "CNcDYli8yhj93EfpNTcuq0KbKbZRyRug"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C0801Cp> A04;
    public final InterfaceC0782Bk[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{52, 67, 67, 63, 60, 54, 52, 71, 60, 66, 65, 2, 55, 73, 53, 70, 72, 53, 70};
    }

    static {
        A01();
    }

    public W6(List<C0801Cp> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0782Bk[list.size()];
    }

    private boolean A02(C0914Hf c0914Hf, int i10) {
        if (c0914Hf.A04() == 0) {
            return false;
        }
        if (c0914Hf.A0E() != i10) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4N(C0914Hf c0914Hf) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c0914Hf, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c0914Hf, 0)) {
                return;
            }
            int iA06 = c0914Hf.A06();
            if (A07[5].charAt(6) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "JHIe8W9CfwFDjJjaFpf1hCiFr";
            strArr[6] = "vBjglJY7hKXluELD1o7ad0wQv";
            int iA04 = c0914Hf.A04();
            for (InterfaceC0782Bk interfaceC0782Bk : this.A05) {
                c0914Hf.A0Y(iA06);
                interfaceC0782Bk.AEg(c0914Hf, iA04);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + iA04;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        for (int i10 = 0; i10 < i; i10++) {
            C0801Cp c0801Cp = this.A04.get(i10);
            c0804Cs.A05();
            InterfaceC0782Bk output = interfaceC0774Ba.AFm(c0804Cs.A03(), 3);
            output.A5i(Format.A0A(c0804Cs.A04(), A00(0, 19, 126), null, -1, 0, Collections.singletonList(c0801Cp.A02), c0801Cp.A01, null));
            this.A05[i10] = output;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADX() {
        if (this.A03) {
            for (InterfaceC0782Bk interfaceC0782Bk : this.A05) {
                interfaceC0782Bk.AEh(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADY(long j10, boolean z10) {
        if (!z10) {
            return;
        }
        this.A03 = true;
        this.A02 = j10;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void AEk() {
        this.A03 = false;
    }
}
