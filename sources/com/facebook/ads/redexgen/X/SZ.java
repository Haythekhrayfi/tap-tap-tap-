package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SZ implements NC {
    public final WeakReference<AnonymousClass95> A00;

    public SZ(AnonymousClass95 anonymousClass95) {
        this.A00 = new WeakReference<>(anonymousClass95);
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void ABM(boolean z10) {
        AnonymousClass95 cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z10;
            cardLayout.A03();
        }
    }
}
