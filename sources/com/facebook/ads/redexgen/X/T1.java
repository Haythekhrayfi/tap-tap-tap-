package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T1 extends K4 {
    public final WeakReference<QR> A00;

    public T1(QR qr) {
        this.A00 = new WeakReference<>(qr);
    }

    public T1(WeakReference<QR> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        QR viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
