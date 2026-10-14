package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BQ extends VZ implements ER {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC0775Bb A05;
    public final GZ A06;
    public final Object A07;
    public final String A08;

    public BQ(Uri uri, GZ gz, InterfaceC0775Bb interfaceC0775Bb, int i10, String str, int i11, Object obj) {
        this.A04 = uri;
        this.A06 = gz;
        this.A05 = interfaceC0775Bb;
        this.A03 = i10;
        this.A08 = str;
        this.A02 = i11;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j10, boolean z10) {
        this.A00 = j10;
        this.A01 = z10;
        A01(new VQ(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.VZ
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.VZ
    public final void A03(XF xf, boolean z10) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.EW
    public final VS A4f(EU eu, GS gs) {
        HG.A03(eu.A02 == 0);
        return new BR(this.A04, this.A06.A4T(), this.A05.A4X(), this.A03, A00(eu), this, gs, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.EW
    public final void A9t() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.ER
    public final void ACn(long j10, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (this.A00 == j10 && this.A01 == z10) {
            return;
        }
        A00(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.EW
    public final void AEI(VS vs) {
        ((BR) vs).A0R();
    }
}
