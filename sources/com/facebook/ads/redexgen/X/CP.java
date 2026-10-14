package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CP {
    public static String[] A05 = {"lKy0YI5EGjXv2", "kqfQDU0iwDhqaMHC0BsTfGE6FjC2jeup", "jv6iVn6YCI", "Kbod1kIlqRm2x7YGttwPvO3kKDdBerP9", "AKxPCvcOfBY8Sui08oZDK8EPANpoB5ev", "JY0GDhLNZiQYBqJ9WzpbNW6VWiMf19In", "nhad57ygvI1TjLq62wNjXmGRomNY9pWS", "x2lvOIXYuZTotm1szSwJqESRclSL2a8b"};
    public int A01;
    public boolean A02;
    public final CQ A03 = new CQ();
    public final C0914Hf A04 = new C0914Hf(new byte[65025], 0);
    public int A00 = -1;

    private int A00(int i10) {
        int segmentLength;
        this.A01 = 0;
        int i11 = 0;
        do {
            int i12 = this.A01 + i10;
            CQ cq = this.A03;
            if (A05[0].length() == 13) {
                A05[5] = "SgZ2PRj4NlkJ3BHKSnaMRED72QUEdulA";
                int size = cq.A02;
                if (i12 >= size) {
                    break;
                }
                int[] iArr = this.A03.A09;
                int i13 = this.A01;
                int size2 = i13 + 1;
                this.A01 = size2;
                segmentLength = iArr[i13 + i10];
                i11 += segmentLength;
            } else {
                throw new RuntimeException();
            }
        } while (segmentLength == 255);
        return i11;
    }

    public final CQ A01() {
        return this.A03;
    }

    public final C0914Hf A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C0914Hf c0914Hf = this.A04;
        byte[] bArr = c0914Hf.A00;
        C0914Hf c0914Hf2 = this.A04;
        if (A05[2].length() == 26) {
            throw new RuntimeException();
        }
        A05[0] = "HnsfJzdopseCo";
        c0914Hf.A00 = Arrays.copyOf(bArr, Math.max(65025, c0914Hf2.A07()));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[PHI: r3
  0x0097: PHI (r3v5 'segmentIndex' int) = (r3v1 'segmentIndex' int), (r3v6 'segmentIndex' int) binds: [B:46:0x0108, B:30:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[SYNTHETIC] */
    public final boolean A05(BZ bz) throws InterruptedException, IOException {
        int segmentIndex;
        boolean z10;
        C0914Hf c0914Hf;
        byte[] bArr;
        int iA07;
        HG.A04(bz != null);
        if (this.A02) {
            this.A02 = false;
            this.A04.A0V();
        }
        while (!this.A02) {
            if (this.A00 < 0) {
                if (!this.A03.A03(bz, true)) {
                    return false;
                }
                int i10 = 0;
                int iA00 = this.A03.A01;
                int bytesToSkip = this.A03.A04;
                int bytesToSkip2 = bytesToSkip & 1;
                if (A05[0].length() != 13) {
                    throw new RuntimeException();
                }
                A05[3] = "DGX3mlcDy37xJAmSOrUIcVUM6emcoPwG";
                if (bytesToSkip2 == 1 && this.A04.A07() == 0) {
                    iA00 += A00(0);
                    int bytesToSkip3 = this.A01;
                    if (A05[5].charAt(15) != '3') {
                        A05[3] = "AFkKoUuE7mshfLpTVlvrzPrYfrcgxZ46";
                        i10 = 0 + bytesToSkip3;
                    } else {
                        i10 = 0 + bytesToSkip3;
                    }
                }
                bz.AFT(iA00);
                this.A00 = i10;
            }
            int iA01 = A00(this.A00);
            int i11 = this.A00;
            int i12 = this.A01;
            if (A05[3].charAt(7) != 'W') {
                A05[0] = "rNz5xQDnDJbSd";
                segmentIndex = i11 + i12;
                if (iA01 > 0) {
                    if (this.A04.A05() < this.A04.A07() + iA01) {
                        c0914Hf = this.A04;
                        bArr = c0914Hf.A00;
                        iA07 = this.A04.A07() + iA01;
                        if (A05[5].charAt(15) != '3') {
                            throw new RuntimeException();
                        }
                        A05[2] = "JzmWwV1YqYi";
                        c0914Hf.A00 = Arrays.copyOf(bArr, iA07);
                    }
                    bz.readFully(this.A04.A00, this.A04.A07(), iA01);
                    C0914Hf c0914Hf2 = this.A04;
                    c0914Hf2.A0X(c0914Hf2.A07() + iA01);
                    if (this.A03.A09[segmentIndex - 1] != 255) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.A02 = z10;
                }
            } else {
                A05[4] = "eWsMjGJOzbCV7BMGMZrvqQ3qOIA8iUo3";
                segmentIndex = i11 + i12;
                if (iA01 > 0) {
                    if (this.A04.A05() < this.A04.A07() + iA01) {
                        c0914Hf = this.A04;
                        bArr = c0914Hf.A00;
                        iA07 = this.A04.A07() + iA01;
                        if (A05[5].charAt(15) != '3') {
                            throw new RuntimeException();
                        }
                        A05[2] = "JzmWwV1YqYi";
                        c0914Hf.A00 = Arrays.copyOf(bArr, iA07);
                    }
                    bz.readFully(this.A04.A00, this.A04.A07(), iA01);
                    C0914Hf c0914Hf3 = this.A04;
                    c0914Hf3.A0X(c0914Hf3.A07() + iA01);
                    if (this.A03.A09[segmentIndex - 1] != 255) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.A02 = z10;
                }
            }
            if (segmentIndex == this.A03.A02) {
                segmentIndex = -1;
            }
            this.A00 = segmentIndex;
        }
        return true;
    }
}
