package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1114Pd implements PX {
    public final View A00;
    public final C1337Xw A01;

    public C1114Pd(C1337Xw c1337Xw, View view) {
        this.A01 = c1337Xw;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final double A8A() {
        QS result = QR.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
