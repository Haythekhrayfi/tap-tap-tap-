package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BU implements VS, VT {
    public static String[] A06 = {"ZtwyXb21lqsDJdKT2ajh9JxAXgW69QuB", "FrcJuXyaSLrnc8pAXv2TAxnFyZgF4qHK", "0iGJizGlWH9", "qhteMkWWDojgH5n0mIn7zojGTGtfRfRL", "S4vRLIoihFPQ", "xoDrhUfozcoi1lbYtymgci4hovtTAG3t", "yhmtadr4WKeMx7Xbvtz69UkymvwaYHjB", "iiLQKF6aVsd0mv8Gzt0Boeru5TAZQ446"};
    public long A00;
    public long A01;
    public long A02;
    public VT A03;
    public VY[] A04 = new VY[0];
    public final VS A05;

    public BU(VS vs, boolean z10, long j10, long j11) {
        this.A05 = vs;
        this.A02 = z10 ? j10 : -9223372036854775807L;
        this.A01 = j10;
        this.A00 = j11;
    }

    private C07429t A00(long j10, C07429t c07429t) {
        long toleranceBeforeUs = C0930Hv.A0E(c07429t.A01, 0L, j10 - this.A01);
        long j11 = c07429t.A00;
        long j12 = this.A00;
        long jA0E = C0930Hv.A0E(j11, 0L, j12 == Long.MIN_VALUE ? RecyclerView.FOREVER_NS : j12 - j10);
        if (toleranceBeforeUs == c07429t.A01 && jA0E == c07429t.A00) {
            return c07429t;
        }
        return new C07429t(toleranceBeforeUs, jA0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0851Es
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void AAm(VS vs) {
        this.A03.AAm(this);
    }

    public static boolean A02(long j10, GM[] gmArr) {
        if (j10 != 0) {
            for (GM gm : gmArr) {
                if (gm != null && !HY.A09(gm.A7l().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final boolean A4P(long j10) {
        return this.A05.A4P(j10);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void A54(long j10, boolean z10) {
        this.A05.A54(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long A5r(long j10, C07429t c07429t) {
        long j11 = this.A01;
        if (j10 == j11) {
            return j11;
        }
        return this.A05.A5r(j10, A00(j10, c07429t));
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long A67() {
        long jA67 = this.A05.A67();
        if (jA67 != Long.MIN_VALUE) {
            long j10 = this.A00;
            if (j10 != Long.MIN_VALUE) {
                if (A06[2].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "DtDan6JMsc2D9dL8KrRs9GVt0cLu7T4O";
                if (jA67 >= j10) {
                }
            }
            return jA67;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long A7L() {
        long jA7L = this.A05.A7L();
        if (jA7L != Long.MIN_VALUE) {
            long j10 = this.A00;
            if (j10 == Long.MIN_VALUE || jA7L < j10) {
                return jA7L;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final TrackGroupArray A81() {
        return this.A05.A81();
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void A9s() throws IOException {
        this.A05.A9s();
    }

    @Override // com.facebook.ads.redexgen.X.VT
    public final void ACL(VS vs) {
        this.A03.ACL(this);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void ADj(VT vt, long j10) {
        this.A03 = vt;
        this.A05.ADj(this, j10);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final long AE2() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            if (A06[4].length() != 12) {
                throw new RuntimeException();
            }
            A06[6] = "LhyfL76jA11YYofpKqTom8Rw5oMGbfG9";
            this.A02 = -9223372036854775807L;
            long initialDiscontinuityUs = AE2();
            return initialDiscontinuityUs != -9223372036854775807L ? initialDiscontinuityUs : childDiscontinuityUs;
        }
        long jAE2 = this.A05.AE2();
        if (jAE2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        HG.A04(jAE2 >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && jAE2 > discontinuityUs) {
            z10 = false;
        }
        HG.A04(z10);
        return jAE2;
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void AE9(long j10) {
        this.A05.AE9(j10);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    @Override // com.facebook.ads.redexgen.X.VS
    public final long AEp(long j10) {
        this.A02 = -9223372036854775807L;
        boolean z10 = false;
        for (VY vy : this.A04) {
            if (vy != null) {
                vy.A00();
            }
        }
        long jAEp = this.A05.AEp(j10);
        if (jAEp == j10) {
            z10 = true;
        } else if (jAEp >= this.A01) {
            long j11 = this.A00;
            if (j11 == Long.MIN_VALUE) {
                z10 = true;
            } else {
                if (A06[0].charAt(28) != '9') {
                    throw new RuntimeException();
                }
                A06[2] = "Q";
                if (jAEp <= j11) {
                    z10 = true;
                }
            }
        }
        HG.A04(z10);
        return jAEp;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    @Override // com.facebook.ads.redexgen.X.VS
    public final long AEq(GM[] gmArr, boolean[] zArr, InterfaceC0850Er[] interfaceC0850ErArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.A04 = new VY[interfaceC0850ErArr.length];
        InterfaceC0850Er[] interfaceC0850ErArr2 = new InterfaceC0850Er[interfaceC0850ErArr.length];
        int i10 = 0;
        while (true) {
            InterfaceC0850Er interfaceC0850Er = null;
            if (i10 >= interfaceC0850ErArr.length) {
                break;
            }
            VY[] vyArr = this.A04;
            VY vy = (VY) interfaceC0850ErArr[i10];
            vyArr[i10] = vy;
            if (vy != null) {
                interfaceC0850Er = vy.A01;
            }
            interfaceC0850ErArr2[i10] = interfaceC0850Er;
            i10++;
        }
        long jAEq = this.A05.AEq(gmArr, zArr, interfaceC0850ErArr2, zArr2, j10);
        if (A03()) {
            long j12 = this.A01;
            if (j10 == j12 && A02(j12, gmArr)) {
                j11 = jAEq;
            } else {
                j11 = -9223372036854775807L;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        this.A02 = j11;
        if (jAEq != j10) {
            if (jAEq >= this.A01) {
                long enablePositionUs = this.A00;
                z10 = enablePositionUs == Long.MIN_VALUE || jAEq <= enablePositionUs;
            }
        }
        HG.A04(z10);
        for (int i11 = 0; i11 < interfaceC0850ErArr.length; i11++) {
            if (interfaceC0850ErArr2[i11] == null) {
                InterfaceC0850Er[] childStreams = this.A04;
                childStreams[i11] = null;
            } else if (interfaceC0850ErArr[i11] == null || this.A04[i11].A01 != interfaceC0850ErArr2[i11]) {
                this.A04[i11] = new VY(this, interfaceC0850ErArr2[i11]);
            }
            InterfaceC0850Er[] childStreams2 = this.A04;
            interfaceC0850ErArr[i11] = childStreams2[i11];
        }
        return jAEq;
    }
}
