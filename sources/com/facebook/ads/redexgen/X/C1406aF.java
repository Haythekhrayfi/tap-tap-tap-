package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1406aF implements NC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1405aE A01;
    public final /* synthetic */ U7 A02;

    public C1406aF(AbstractC1405aE abstractC1405aE, int i10, U7 u10) {
        this.A01 = abstractC1405aE;
        this.A00 = i10;
        this.A02 = u10;
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void ABM(boolean z10) {
        if (this.A00 == 0) {
            this.A02.A1Z(this.A01.A04);
        }
        this.A02.A1c(z10, true);
    }
}
