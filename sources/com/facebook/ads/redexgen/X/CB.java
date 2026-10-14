package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CB {
    public static String[] A0A = {"VV6EzFzDFGyxh7278LhkWh1nAnO", "a", "RIeoUtwh2k0Lp", "KiUc8yTTjWF6Y9v", "6tIA8m5WM2YSgVpCAFtgKZOFEkm", "A00z45", "ej2X1eDppCFfwh6aI5B812e88v7VHLnd", "obdd9bh"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C5 A04;
    public CK A05;
    public final InterfaceC0782Bk A06;
    public final CM A07 = new CM();
    public final C0914Hf A09 = new C0914Hf(1);
    public final C0914Hf A08 = new C0914Hf();

    public CB(InterfaceC0782Bk interfaceC0782Bk) {
        this.A06 = interfaceC0782Bk;
    }

    private CL A00() {
        int i10 = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            CM cm = this.A07;
            if (A0A[2].length() == 16) {
                throw new RuntimeException();
            }
            A0A[2] = "yH";
            return cm.A08;
        }
        return this.A05.A00(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C0914Hf c0914Hf = this.A07.A09;
        CL encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            c0914Hf.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c0914Hf.A0Z(c0914Hf.A0I() * 6);
        }
    }

    public final int A03() {
        C0914Hf c0914Hf;
        int vectorSize;
        if (!this.A07.A0A) {
            return 0;
        }
        CL clA00 = A00();
        if (A0A[5].length() != 6) {
            throw new RuntimeException();
        }
        A0A[1] = "c";
        if (clA00.A00 != 0) {
            c0914Hf = this.A07.A09;
            vectorSize = clA00.A00;
        } else {
            byte[] bArr = clA00.A04;
            this.A08.A0b(bArr, bArr.length);
            c0914Hf = this.A08;
            vectorSize = bArr.length;
        }
        boolean subsampleEncryption = this.A07.A0H[this.A01];
        this.A09.A00[0] = (byte) ((subsampleEncryption ? 128 : 0) | vectorSize);
        this.A09.A0Y(0);
        this.A06.AEg(this.A09, 1);
        this.A06.AEg(c0914Hf, vectorSize);
        if (!subsampleEncryption) {
            return vectorSize + 1;
        }
        C0914Hf c0914Hf2 = this.A07.A09;
        int iA0I = c0914Hf2.A0I();
        c0914Hf2.A0Z(-2);
        int i10 = (iA0I * 6) + 2;
        this.A06.AEg(c0914Hf2, i10);
        return vectorSize + 1 + i10;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j10) {
        long jA01 = C9C.A01(j10);
        for (int i10 = this.A01; i10 < this.A07.A00 && this.A07.A00(i10) < jA01; i10++) {
            if (this.A07.A0I[i10]) {
                this.A03 = i10;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        CL encryptionBox = this.A05.A00(this.A07.A07.A02);
        this.A06.A5i(this.A05.A07.A0I(drmInitData.A02(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A07(CK ck, C5 c10) {
        this.A05 = (CK) HG.A01(ck);
        this.A04 = (C5) HG.A01(c10);
        this.A06.A5i(ck.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        int i10 = this.A00 + 1;
        this.A00 = i10;
        int[] iArr = this.A07.A0E;
        int i11 = this.A02;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.A02 = i11 + 1;
        this.A00 = 0;
        return false;
    }
}
