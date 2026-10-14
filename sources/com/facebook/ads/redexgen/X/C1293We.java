package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.We, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1293We extends AbstractC0783Bm {
    public static byte[] A05;
    public static String[] A06 = {"S6oix22WW3XrOL6PgcbxfAkEtHdPkPhf", "4OWz7hl1Zq8qyI8tM", "clV1g7mDIxTidmwZ1CuuG8s1lTi1VXAM", "4pPGx9", "ltKNubnfMHDxlo41G", "61sVTIAUswj0oFXzD6", "V6Pb0wOPN8cWCdQmqK9dHxyDUr6EkDd0", "qXRSabgl4tCI0bSRqPqCbhaUnodlSpfB"};
    public int A00;
    public int A01;
    public boolean A02;
    public final C0914Hf A03;
    public final C0914Hf A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{71, 120, 117, 116, 126, 49, 119, 126, 99, 124, 112, 101, 49, Ascii.DEL, 126, 101, 49, 98, 100, 97, 97, 126, 99, 101, 116, 117, 43, 49, 39, 56, 53, 52, 62, 126, 48, 39, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0783Bm
    public final void A0B(C0914Hf c0914Hf, long j10) throws C07249b {
        int iA0E = c0914Hf.A0E();
        long jA09 = j10 + (((long) c0914Hf.A09()) * 1000);
        if (iA0E == 0 && !this.A02) {
            C0914Hf c0914Hf2 = new C0914Hf(new byte[c0914Hf.A04()]);
            c0914Hf.A0c(c0914Hf2.A00, 0, c0914Hf.A04());
            C0932Hx c0932HxA00 = C0932Hx.A00(c0914Hf2);
            this.A01 = c0932HxA00.A02;
            super.A00.A5i(Format.A03(null, A00(28, 9, 110), null, -1, -1, c0932HxA00.A03, c0932HxA00.A01, -1.0f, c0932HxA00.A04, -1, c0932HxA00.A00, null));
            this.A02 = true;
            return;
        }
        if (iA0E == 1 && this.A02) {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = 4 - this.A01;
            int i11 = 0;
            while (c0914Hf.A04() > 0) {
                c0914Hf.A0c(this.A03.A00, i10, this.A01);
                this.A03.A0Y(0);
                int iA0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AEg(this.A04, 4);
                super.A00.AEg(c0914Hf, iA0H);
                i11 = i11 + 4 + iA0H;
            }
            super.A00.AEh(jA09, this.A00 != 1 ? 0 : 1, i11, 0, null);
        }
    }

    static {
        A01();
    }

    public C1293We(InterfaceC0782Bk interfaceC0782Bk) {
        super(interfaceC0782Bk);
        this.A04 = new C0914Hf(C0910Hb.A03);
        this.A03 = new C0914Hf(4);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0783Bm
    public final boolean A0C(C0914Hf c0914Hf) throws C1294Wf {
        int frameType = c0914Hf.A0E();
        int header = frameType >> 4;
        int i10 = header & 15;
        int i11 = frameType & 15;
        if (i11 == 7) {
            this.A00 = i10;
            if (A06[2].charAt(25) == 118) {
                throw new RuntimeException();
            }
            A06[5] = "9goNtADcrLhK1amHV7";
            return i10 != 5;
        }
        throw new C1294Wf(A00(0, 28, 46) + i11);
    }
}
