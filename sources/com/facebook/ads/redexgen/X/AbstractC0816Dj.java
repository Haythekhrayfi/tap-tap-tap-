package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0816Dj implements XE, InterfaceC07399q {
    public int A00;
    public int A01;
    public long A02;
    public C07409r A03;
    public InterfaceC0850Er A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public AbstractC0816Dj(int i10) {
        this.A08 = i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<?> */
    public static boolean A0x(BI<?> bi, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (bi == null) {
            return false;
        }
        return bi.A45(drmInitData);
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j10) {
        return this.A04.AFS(j10 - this.A02);
    }

    public final int A10(C9V c9v, X0 x10, boolean z10) {
        int iAE1 = this.A04.AE1(c9v, x10, z10);
        if (iAE1 == -4) {
            if (x10.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            x10.A00 += this.A02;
        } else if (iAE1 == -5) {
            Format format = c9v.A00;
            if (format.A0G != RecyclerView.FOREVER_NS) {
                c9v.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return iAE1;
    }

    public final C07409r A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws C9I {
    }

    public void A14() throws C9I {
    }

    public void A15(long j10, boolean z10) throws C9I {
    }

    public void A16(boolean z10) throws C9I {
    }

    public void A17(Format[] formatArr, long j10) throws C9I {
    }

    public final boolean A18() {
        return this.A05 ? this.A06 : this.A04.A8z();
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void A52() {
        HG.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void A5P(C07409r c07409r, Format[] formatArr, InterfaceC0850Er interfaceC0850Er, long j10, boolean z10, long j11) throws C9I {
        HG.A04(this.A01 == 0);
        this.A03 = c07409r;
        this.A01 = 1;
        A16(z10);
        AES(formatArr, interfaceC0850Er, j11);
        A15(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final InterfaceC07399q A6C() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public HW A7E() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final int A7s() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final InterfaceC0850Er A7v() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.XE, com.facebook.ads.redexgen.X.InterfaceC07399q
    public final int A82() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07369n
    public void A8K(int i10, Object obj) throws C9I {
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final boolean A8P() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final boolean A8m() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void A9u() throws IOException {
        this.A04.A9r();
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void AES(Format[] formatArr, InterfaceC0850Er interfaceC0850Er, long j10) throws C9I {
        HG.A04(!this.A06);
        this.A04 = interfaceC0850Er;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j10;
        A17(formatArr, j10);
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void AEc(long j10) throws C9I {
        this.A06 = false;
        this.A05 = false;
        A15(j10, false);
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void AF3() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void AF6(int i10) {
        this.A00 = i10;
    }

    public int AFk() throws C9I {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void start() throws C9I {
        HG.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.XE
    public final void stop() throws C9I {
        HG.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
