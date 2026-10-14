package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SD implements InterfaceC0989Kg {
    public final /* synthetic */ SC A00;

    public SD(SC sc2) {
        this.A00 = sc2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void AAk() {
        this.A00.A0F.AAr(this.A00.A0A);
        this.A00.A0F.AAU();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void ACO(float f10) {
        int i10;
        float totalForce = (this.A00.A0A - f10) + (this.A00.A0V ? 0 : this.A00.A0I.getDuration());
        if (this.A00.A0V) {
            i10 = this.A00.A0A;
        } else {
            i10 = this.A00.A09;
        }
        float seenTime = i10;
        this.A00.A0F.AFv(totalForce / seenTime);
    }
}
