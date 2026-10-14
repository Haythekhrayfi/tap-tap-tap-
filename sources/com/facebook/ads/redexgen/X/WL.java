package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WL implements CR, InterfaceC0779Bh {
    public static String[] A05 = {"RxrevBHwZunvWtoC5v6V", "BM7NoIYIDKALVkWYBFUm4mgKfD4surZT", "wT545zonAETVeqcNIpSLQKDSBA4psZtT", "O6YerNOVuBIV8g4cn8DH", "f7xxxnJira03VIlY2bxNtwSQeXyrwxct", "8kRv9b0m26r6Uh6XKMOB9WasCMU5o07v", "0W8GSaK37PxtOyOV4bIEUVoiYe2UqjRN", "TYUMHNguvpgJeUJ5Wme9D9z4"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ WK A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final C0778Bg A7k(long j10) {
        int iA0B = C0930Hv.A0B(this.A02, this.A04.A04(j10), true, true);
        long jA03 = this.A04.A03(this.A02[iA0B]);
        C0780Bi c0780Bi = new C0780Bi(jA03, this.A00 + this.A03[iA0B]);
        if (jA03 < j10) {
            long[] jArr = this.A02;
            if (iA0B != jArr.length - 1) {
                return new C0778Bg(c0780Bi, new C0780Bi(this.A04.A03(jArr[iA0B + 1]), this.A00 + this.A03[iA0B + 1]));
            }
        }
        return new C0778Bg(c0780Bi);
    }

    public WL(WK wk) {
        this.A04 = wk;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(C0914Hf c0914Hf) {
        c0914Hf.A0Z(1);
        int length = c0914Hf.A0G();
        int i10 = length / 18;
        this.A02 = new long[i10];
        this.A03 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.A02[i11] = c0914Hf.A0L();
            this.A03[i11] = c0914Hf.A0L();
            c0914Hf.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final InterfaceC0779Bh A4h() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final long A6j() {
        return this.A04.A01.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final boolean A93() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final long ADz(BZ bz) throws InterruptedException, IOException {
        long j10 = this.A01;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.A01 = -1L;
        if (A05[5].charAt(9) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "MeEp95NFLxRX8bxkfA2m";
        strArr[3] = "RwTpOb1Sie1PnKrI5U9E";
        return j11;
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final long AFb(long j10) {
        long jA04 = this.A04.A04(j10);
        long granule = this.A02[C0930Hv.A0B(this.A02, jA04, true, true)];
        this.A01 = granule;
        return jA04;
    }
}
