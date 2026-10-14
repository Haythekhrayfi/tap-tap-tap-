package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T9 implements InterfaceC1057My {
    public final /* synthetic */ C1048Mp A00;

    public T9(C1048Mp c1048Mp) {
        this.A00 = c1048Mp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1057My
    public final void AAV(boolean z10) {
        if (this.A00.A07 && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z10);
            this.A00.A00.setAlpha(z10 ? 1.0f : 0.3f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1057My
    public final void ABE(boolean z10) {
        if (this.A00.A07 && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z10);
            this.A00.A02.setAlpha(z10 ? 1.0f : 0.3f);
        }
    }
}
