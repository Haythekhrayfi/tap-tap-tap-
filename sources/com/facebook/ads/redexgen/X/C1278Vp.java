package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.util.FileUtil;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1278Vp implements BY {
    public static byte[] A05;
    public static String[] A06 = {"4UYaWsXN1cGpTlRGsO1EVWVYv3mJMVWU", "hbK8JAe0mxfaYRX1PJWZwY", "A0tXjRJ", "osk77A0r9", "0YYQ7Ec", "0ahCLR5uyRlwKx93emwBc8GJDT750HRT", "YIO", "F1mMZvBQ8EiEftVGCLgPL0zcj9avMacR"};
    public static final InterfaceC0775Bb A07;
    public int A00;
    public int A01;
    public InterfaceC0774Ba A02;
    public InterfaceC0782Bk A03;
    public C1277Vo A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{53, 78, 83, 85, 80, 80, 79, 82, 84, 69, 68, 0, 79, 82, 0, 85, 78, 82, 69, 67, 79, 71, 78, 73, 90, 69, 68, 0, 87, 65, 86, 0, 72, 69, 65, 68, 69, 82, 14, 52, 72, 55, 60, 66, 2, 69, 52, 74};
    }

    static {
        A01();
        A07 = new C1279Vq();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A02 = interfaceC0774Ba;
        this.A03 = interfaceC0774Ba.AFm(0, 1);
        this.A04 = null;
        interfaceC0774Ba.A5S();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        if (this.A04 == null) {
            C1277Vo c1277VoA00 = C0807Cv.A00(bz);
            this.A04 = c1277VoA00;
            if (c1277VoA00 != null) {
                this.A03.A5i(Format.A06(null, A00(39, 9, 113), null, c1277VoA00.A00(), FileUtil.BUF_SIZE, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new C07249b(A00(0, 39, 126));
            }
        }
        C1277Vo c1277Vo = this.A04;
        if (A06[0].charAt(24) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "XBd";
        strArr[3] = "hS3DTCCH9";
        if (!c1277Vo.A07()) {
            C0807Cv.A03(bz, this.A04);
            this.A02.AEm(this.A04);
        }
        int iAEf = this.A03.AEf(bz, FileUtil.BUF_SIZE - this.A01, true);
        if (iAEf != -1) {
            this.A01 += iAEf;
        }
        int i10 = this.A01 / this.A00;
        if (i10 > 0) {
            long jA05 = this.A04.A05(bz.A7Z() - ((long) this.A01));
            int i11 = this.A00 * i10;
            int i12 = this.A01 - i11;
            this.A01 = i12;
            this.A03.AEh(jA05, 1, i11, i12, null);
        }
        return iAEf == -1 ? -1 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        return C0807Cv.A00(bz) != null;
    }
}
