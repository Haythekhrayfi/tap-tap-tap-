package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1264Uy implements GZ {
    public final InterfaceC0905Gw<? super C1265Uz> A00;

    public C1264Uy() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gw != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C1264Uy(InterfaceC0905Gw<? super C1265Uz> interfaceC0905Gw) {
        this.A00 = interfaceC0905Gw;
    }

    @Override // com.facebook.ads.redexgen.X.GZ
    public final InterfaceC0885Ga A4T() {
        return new C1265Uz(this.A00);
    }
}
