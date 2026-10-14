package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1427aa implements InterfaceC06435n {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1422aV A01;
    public final /* synthetic */ C1422aV A02;
    public final /* synthetic */ C8E A03;

    public C1427aa(C1422aV c1422aV, int i10, C8E c8e, C1422aV c1422aV2) {
        this.A01 = c1422aV;
        this.A00 = i10;
        this.A03 = c8e;
        this.A02 = c1422aV2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAL() {
        this.A01.A0B(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06435n
    public final void AAM() {
        this.A01.A00.ABb(this.A02, JD.A00(AdErrorType.NO_FILL));
    }
}
