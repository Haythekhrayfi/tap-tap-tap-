package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CQ {
    public static byte[] A0B;
    public static final int A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C0914Hf A0A = new C0914Hf(255);

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{122, -110, -110, 126, -85, -66, -74, -85, -87, -70, -85, -86, 102, -107, -83, -83, -103, 102, -87, -89, -74, -70, -69, -72, -85, 102, -74, -89, -70, -70, -85, -72, -76, 102, -89, -70, 102, -88, -85, -83, -81, -76, 102, -75, -84, 102, -74, -89, -83, -85, -63, -70, -65, -63, -68, -68, -69, -66, -64, -79, -80, 108, -82, -75, -64, 108, -65, -64, -66, -79, -83, -71, 108, -66, -79, -62, -75, -65, -75, -69, -70};
    }

    static {
        A01();
        A0C = C0930Hv.A08(A00(0, 4, 33));
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(BZ bz, boolean z10) throws InterruptedException, IOException {
        this.A0A.A0V();
        A02();
        boolean hasEnoughBytes = bz.A7A() == -1 || bz.A7A() - bz.A7U() >= 27;
        if (hasEnoughBytes) {
            boolean hasEnoughBytes2 = bz.ADb(this.A0A.A00, 0, 27, true);
            if (hasEnoughBytes2) {
                if (this.A0A.A0M() != A0C) {
                    if (z10) {
                        return false;
                    }
                    throw new C07249b(A00(4, 46, 60));
                }
                int iA0E = this.A0A.A0E();
                this.A03 = iA0E;
                if (iA0E != 0) {
                    if (z10) {
                        return false;
                    }
                    throw new C07249b(A00(50, 31, 66));
                }
                this.A04 = this.A0A.A0E();
                this.A05 = this.A0A.A0J();
                this.A08 = this.A0A.A0K();
                this.A07 = this.A0A.A0K();
                this.A06 = this.A0A.A0K();
                int iA0E2 = this.A0A.A0E();
                this.A02 = iA0E2;
                this.A01 = iA0E2 + 27;
                this.A0A.A0V();
                bz.ADa(this.A0A.A00, 0, this.A02);
                for (int i10 = 0; i10 < this.A02; i10++) {
                    this.A09[i10] = this.A0A.A0E();
                    int i11 = this.A00;
                    this.A00 = i11 + this.A09[i10];
                }
                return true;
            }
        }
        if (z10) {
            return false;
        }
        throw new EOFException();
    }
}
