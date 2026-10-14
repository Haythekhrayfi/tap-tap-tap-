package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SA implements InterfaceC0989Kg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K4 A01;
    public final /* synthetic */ S7 A02;

    public SA(S7 s10, int i10, K4 k10) {
        this.A02 = s10;
        this.A00 = i10;
        this.A01 = k10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void AAk() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void ACO(float f10) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
