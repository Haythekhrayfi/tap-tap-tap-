package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1199Sk implements InterfaceC0989Kg {
    public final /* synthetic */ C9B A00;

    public C1199Sk(C9B c9b) {
        this.A00 = c9b;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void AAk() {
        this.A00.A07 = false;
        if (this.A00.A04 != null) {
            this.A00.A04.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void ACO(float f10) {
        if (this.A00.A04 != null) {
            float percentage = 100.0f * (1.0f - (f10 / this.A00.getAdInfo().A0G().A00()));
            this.A00.A04.setProgressImmediate(percentage);
        }
    }
}
