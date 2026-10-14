package com.facebook.ads.redexgen.X;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1296Wh implements BY {
    public static byte[] A0F;
    public static String[] A0G = {"QnLOeuXESrCaGCWmeMmr3ccgSJivirlh", "YhzsmTzzzxhtyY2gbPt9z7nrByNpJ8AG", "zwujZ5tU8kb2uxp5tp3MFQMZqwl6Xl8T", "kc6RUJmY0MGel4Ws9MlGHroinjQjp2AB", "ZiGWNZua4Zts1sNsjYBSU4OXsNo5k01z", "vZczIWNBPrLvTkXGahgR3lrPVHA61MAE", "WEnNwLMqAaXyN6vSaeVfRhJYgSEHaora", "u0NJWOpvT5UyzhfOPQB88kiisy6mVL7a"};
    public static final InterfaceC0775Bb A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC0774Ba A06;
    public C1298Wj A07;
    public C1293We A08;
    public boolean A09;
    public final C0914Hf A0C = new C0914Hf(4);
    public final C0914Hf A0B = new C0914Hf(9);
    public final C0914Hf A0E = new C0914Hf(11);
    public final C0914Hf A0D = new C0914Hf();
    public final C1295Wg A0A = new C1295Wg();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-41, -35, -25};
    }

    static {
        A03();
        A0H = new C1297Wi();
        A0I = C0930Hv.A08(A01(0, 3, 61));
    }

    private C0914Hf A00(BZ bz) throws InterruptedException, IOException {
        if (this.A02 > this.A0D.A05()) {
            C0914Hf c0914Hf = this.A0D;
            c0914Hf.A0b(new byte[Math.max(c0914Hf.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        bz.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        long j10;
        if (!this.A09) {
            this.A06.AEm(new C1301Wm(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 == -9223372036854775807L) {
            if (this.A0A.A0D() == -9223372036854775807L) {
                long j11 = this.A05;
                String[] strArr = A0G;
                if (strArr[5].charAt(20) != strArr[0].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[7] = "L5UStG7DYoKpX710PXz3zQwSbfDogpGa";
                strArr2[6] = "NY6hXsIFzv8ItyXdU8z07IBZswL3MGXa";
                j10 = -j11;
            } else {
                j10 = 0;
            }
            this.A04 = j10;
        }
    }

    private void A04(BZ bz) throws InterruptedException, IOException {
        bz.AFT(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(BZ bz) throws InterruptedException, IOException {
        if (!bz.AE3(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        this.A0B.A0Y(0);
        this.A0B.A0Z(4);
        int iA0E = this.A0B.A0E();
        int flags = iA0E & 4;
        boolean hasVideo = flags != 0;
        int flags2 = iA0E & 1;
        boolean z10 = flags2 != 0;
        if (hasVideo && this.A07 == null) {
            this.A07 = new C1298Wj(this.A06.AFm(8, 1));
        }
        if (z10 && this.A08 == null) {
            this.A08 = new C1293We(this.A06.AFm(9, 2));
        }
        this.A06.A5S();
        int flags3 = this.A0B.A08();
        this.A00 = (flags3 - 9) + 4;
        this.A01 = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    private boolean A06(BZ bz) throws InterruptedException, IOException {
        boolean z10 = true;
        int i10 = this.A03;
        if (i10 == 8 && this.A07 != null) {
            A02();
            C1298Wj c1298Wj = this.A07;
            C0914Hf c0914HfA00 = A00(bz);
            long j10 = this.A04;
            String[] strArr = A0G;
            if (strArr[2].charAt(9) == strArr[1].charAt(9)) {
                throw new RuntimeException();
            }
            A0G[4] = "14LyfFoDFqyov0bzU05kIxDiosYU9C09";
            c1298Wj.A00(c0914HfA00, j10 + this.A05);
        } else if (i10 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(bz), this.A04 + this.A05);
        } else if (i10 == 18) {
            boolean wasConsumed = this.A09;
            if (!wasConsumed) {
                this.A0A.A00(A00(bz), this.A05);
                long jA0D = this.A0A.A0D();
                if (jA0D != -9223372036854775807L) {
                    this.A06.AEm(new C1301Wm(jA0D));
                    this.A09 = true;
                }
            } else {
                bz.AFT(this.A02);
                z10 = false;
            }
        } else {
            bz.AFT(this.A02);
            z10 = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z10;
    }

    private boolean A07(BZ bz) throws InterruptedException, IOException {
        if (!bz.AE3(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Y(0);
        this.A03 = this.A0E.A0E();
        this.A02 = this.A0E.A0G();
        this.A05 = this.A0E.A0G();
        this.A05 = (((long) (this.A0E.A0E() << 24)) | this.A05) * 1000;
        this.A0E.A0Z(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A06 = interfaceC0774Ba;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        while (true) {
            switch (this.A01) {
                case 1:
                    if (!A05(bz)) {
                        return -1;
                    }
                    break;
                    break;
                case 2:
                    A04(bz);
                    break;
                case 3:
                    if (!A07(bz)) {
                        return -1;
                    }
                    break;
                    break;
                case 4:
                    if (A06(bz)) {
                        return 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        bz.ADa(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        bz.ADa(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & BaseTransientBottomBar.ANIMATION_DURATION) != 0) {
            return false;
        }
        bz.ADa(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        bz.AEb();
        bz.A3R(dataOffset);
        bz.ADa(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset2 = this.A0C.A08();
        return dataOffset2 == 0;
    }
}
