package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TM implements InterfaceC1017Lk {
    public final /* synthetic */ TI A00;

    public TM(TI ti) {
        this.A00 = ti;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1017Lk
    public final void AAg() {
        if (this.A00.A0Z() && !this.A00.A0T.get()) {
            this.A00.A0R.A07(this.A00);
            return;
        }
        if (!this.A00.A0V || this.A00.A0T.get() || !this.A00.A0Y()) {
            this.A00.A0L.A04(EnumC0944Ik.A07, null);
            this.A00.A0O.A3y(this.A00.A0P.A6m());
        } else {
            this.A00.A0Y.setToolbarActionMode(0);
            this.A00.A0M();
        }
    }
}
