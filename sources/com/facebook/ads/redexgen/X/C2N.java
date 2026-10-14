package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2N extends AbstractC0759Al {
    public final int A00;
    public final int A01;
    public final InterfaceC0905Gw<? super InterfaceC0885Ga> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gw != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C2N(String str, InterfaceC0905Gw<? super InterfaceC0885Ga> interfaceC0905Gw) {
        this(str, interfaceC0905Gw, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gw != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C2N(String str, InterfaceC0905Gw<? super InterfaceC0885Ga> interfaceC0905Gw, int i10, int i11, boolean z10) {
        this.A03 = str;
        this.A02 = interfaceC0905Gw;
        this.A00 = i10;
        this.A01 = i11;
        this.A04 = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0759Al
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0767At A01(C0894Gl c0894Gl) {
        return new C0767At(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0894Gl);
    }
}
