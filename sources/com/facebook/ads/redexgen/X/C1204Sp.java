package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1204Sp implements NC {
    public final WeakReference<C9E> A00;

    public C1204Sp(C9E c9e) {
        this.A00 = new WeakReference<>(c9e);
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void ABM(boolean z10) {
        C9E cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z10;
            cardLayout.A04();
        }
    }
}
