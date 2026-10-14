package com.facebook.ads.redexgen.X;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S5 implements InterfaceC1101Oq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ S3 A01;

    public S5(S3 s10, int i10) {
        this.A01 = s10;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1101Oq
    public final void AAU() {
        this.A01.A0P(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1101Oq
    public final void AAr(int i10) {
        S3.A01(this.A01, i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1101Oq
    public final void ABD(float f10) {
        if (!this.A01.A08) {
            this.A01.A0F(f10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1101Oq
    public final void ACl(boolean z10) {
        this.A01.A0O(z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1101Oq
    public final void ADC(String str) {
        this.A01.A0D.A0E().A2u(str);
        this.A01.A0H.A3y(this.A01.A0J.A6q());
        this.A01.A0G(3);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1101Oq
    public final void AFu() {
        this.A01.A09 = false;
        this.A01.A0I.setProgressImmediate(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.A01.A0I.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1101Oq
    public final void AFv(float f10) {
        this.A01.A0I.setProgress(100.0f * f10);
    }
}
