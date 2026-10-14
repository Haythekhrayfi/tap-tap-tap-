package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1251Ul implements GZ {
    public final int A00;
    public final GX A01;
    public final GZ A02;
    public final GZ A03;
    public final H0 A04;
    public final H2 A05;

    public C1251Ul(H0 h10, GZ gz, GZ gz2, GX gx, int i10, H2 h11) {
        this.A04 = h10;
        this.A03 = gz;
        this.A02 = gz2;
        this.A01 = gx;
        this.A00 = i10;
        this.A05 = h11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GZ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1252Um A4T() {
        H0 h10 = this.A04;
        InterfaceC0885Ga interfaceC0885GaA4T = this.A03.A4T();
        InterfaceC0885Ga interfaceC0885GaA4T2 = this.A02.A4T();
        GX gx = this.A01;
        return new C1252Um(h10, interfaceC0885GaA4T, interfaceC0885GaA4T2, gx != null ? gx.createDataSink() : null, this.A00, this.A05);
    }
}
