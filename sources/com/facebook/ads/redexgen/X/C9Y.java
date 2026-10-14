package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9Y {
    public static byte[] A0F;
    public long A00;
    public C9Y A01;
    public C9Z A02;
    public TrackGroupArray A03;
    public GQ A04;
    public boolean A05;
    public boolean A06;
    public GQ A07;
    public final VS A08;
    public final Object A09;
    public final InterfaceC0850Er[] A0A;
    public final boolean[] A0B;
    public final EW A0C;
    public final GP A0D;
    public final InterfaceC07399q[] A0E;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102, 74, 109, 110, 102, 103, 112, 81, 100, 115, 104, 110, 101, 33, 115, 100, 109, 100, 96, 114, 100, 33, 103, 96, 104, 109, 100, 101, 47};
    }

    public C9Y(InterfaceC07399q[] interfaceC07399qArr, long j10, GP gp, GS gs, EW ew, Object obj, C9Z c9z) {
        this.A0E = interfaceC07399qArr;
        this.A00 = j10 - c9z.A03;
        this.A0D = gp;
        this.A0C = ew;
        this.A09 = HG.A01(obj);
        this.A02 = c9z;
        this.A0A = new InterfaceC0850Er[interfaceC07399qArr.length];
        this.A0B = new boolean[interfaceC07399qArr.length];
        VS vsA4f = ew.A4f(c9z.A04, gs);
        this.A08 = c9z.A02 != Long.MIN_VALUE ? new BU(vsA4f, true, 0L, c9z.A02) : vsA4f;
    }

    private void A02(GQ gq) {
        for (int i10 = 0; i10 < i; i10++) {
            boolean rendererEnabled = gq.A00(i10);
            GM gmA00 = gq.A01.A00(i10);
            if (rendererEnabled && gmA00 != null) {
                gmA00.A5O();
            }
        }
    }

    private void A03(GQ gq) {
        GQ gq2 = this.A07;
        this.A07 = gq;
        if (gq != null) {
            A02(gq);
        }
    }

    private void A04(InterfaceC0850Er[] interfaceC0850ErArr) {
        int i10 = 0;
        while (true) {
            InterfaceC07399q[] interfaceC07399qArr = this.A0E;
            int i11 = interfaceC07399qArr.length;
            if (i10 < i11) {
                if (interfaceC07399qArr[i10].A82() == 5 && this.A04.A00(i10)) {
                    interfaceC0850ErArr[i10] = new VX();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void A05(InterfaceC0850Er[] interfaceC0850ErArr) {
        int i10 = 0;
        while (true) {
            InterfaceC07399q[] interfaceC07399qArr = this.A0E;
            int i11 = interfaceC07399qArr.length;
            if (i10 < i11) {
                if (interfaceC07399qArr[i10].A82() == 5) {
                    interfaceC0850ErArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A7L();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j10) {
        return j10 - A07();
    }

    public final long A09(long j10) {
        return A07() + j10;
    }

    public final long A0A(long j10, boolean z10) {
        return A0B(j10, z10, new boolean[this.A0E.length]);
    }

    public final long A0B(long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            int i11 = this.A04.A00;
            boolean z11 = false;
            if (i10 >= i11) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z10 && this.A04.A02(this.A07, i10)) {
                z11 = true;
            }
            zArr2[i10] = z11;
            i10++;
        }
        A05(this.A0A);
        A03(this.A04);
        GN gn = this.A04.A01;
        long jAEq = this.A08.AEq(gn.A01(), this.A0B, this.A0A, zArr, j10);
        A04(this.A0A);
        this.A05 = false;
        int i12 = 0;
        while (true) {
            InterfaceC0850Er[] interfaceC0850ErArr = this.A0A;
            if (i12 < interfaceC0850ErArr.length) {
                if (interfaceC0850ErArr[i12] != null) {
                    HG.A04(this.A04.A00(i12));
                    int i13 = this.A0E[i12].A82();
                    if (i13 != 5) {
                        this.A05 = true;
                    }
                } else {
                    HG.A04(gn.A00(i12) == null);
                }
                i12++;
            } else {
                return jAEq;
            }
        }
    }

    public final long A0C(boolean z10) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long jA67 = this.A08.A67();
        if (jA67 == Long.MIN_VALUE && z10) {
            return this.A02.A01;
        }
        return jA67;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.AEI(((BU) this.A08).A05);
            } else {
                this.A0C.AEI(this.A08);
            }
        } catch (RuntimeException e10) {
            Log.e(A00(0, 17, 28), A00(17, 22, 31), e10);
        }
    }

    public final void A0E(float f10) throws C9I {
        this.A06 = true;
        this.A03 = this.A08.A81();
        A0I(f10);
        long jA0A = A0A(this.A02.A03, false);
        long j10 = this.A00;
        long newStartPositionUs = this.A02.A03;
        this.A00 = j10 + (newStartPositionUs - jA0A);
        this.A02 = this.A02.A01(jA0A);
    }

    public final void A0F(long j10) {
        this.A08.A4P(A08(j10));
    }

    public final void A0G(long j10) {
        if (this.A06) {
            this.A08.AE9(A08(j10));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A67() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f10) throws C9I {
        GQ gqA0T = this.A0D.A0T(this.A0E, this.A03);
        GQ selectorResult = this.A07;
        if (gqA0T.A01(selectorResult)) {
            return false;
        }
        this.A04 = gqA0T;
        for (GM gm : gqA0T.A01.A01()) {
            if (gm != null) {
                gm.ACE(f10);
            }
        }
        return true;
    }
}
