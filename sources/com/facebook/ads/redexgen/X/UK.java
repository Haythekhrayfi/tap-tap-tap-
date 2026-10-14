package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UK implements InterfaceC0954Iu {
    public WeakReference<U7> A00;

    public UK(U7 u10) {
        this.A00 = new WeakReference<>(u10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0954Iu
    public final void AC9(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z10, false);
        }
    }
}
