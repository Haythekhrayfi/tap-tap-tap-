package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1195Sg extends K4 {
    public final /* synthetic */ C1190Sb A00;
    public final /* synthetic */ boolean A01;

    public C1195Sg(C1190Sb c1190Sb, boolean z10) {
        this.A00 = c1190Sb;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        AbstractC1018Ll abstractC1018LlA08 = this.A00.A0K.A08();
        if (abstractC1018LlA08 == null) {
            return;
        }
        abstractC1018LlA08.setPageDetailsVisible((this.A01 || abstractC1018LlA08.A07()) ? false : true);
        abstractC1018LlA08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
