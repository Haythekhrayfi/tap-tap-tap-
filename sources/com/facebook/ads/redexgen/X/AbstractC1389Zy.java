package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1389Zy implements C6G {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z10);

    public AbstractC1389Zy(boolean z10) {
        this.A00 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAc() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAl() {
        A01(true);
    }
}
