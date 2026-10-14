package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TP implements NX {
    public final /* synthetic */ TI A00;

    public TP(TI ti) {
        this.A00 = ti;
    }

    @Override // com.facebook.ads.redexgen.X.NX
    public final void AAH() {
        if (this.A00.A0Y()) {
            this.A00.A0M();
            this.A00.A0Y.setToolbarActionMessage("");
            this.A00.A0Y.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NX
    public final void ABo() {
        this.A00.A0D = false;
        this.A00.A0M.A08();
    }

    @Override // com.facebook.ads.redexgen.X.NX
    public final void ABp() {
        this.A00.A0D = true;
        this.A00.A0M.A07();
    }
}
