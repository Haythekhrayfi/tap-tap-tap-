package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05080e extends C2M implements InterfaceC0959Iz {
    public C07309h A00;
    public List<P2> A01;

    public C05080e(C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A00 = new C07309h(this, 1, null, null, null);
    }

    public final void A23(QR qr) {
        C07309h c07309h = this.A00;
        if (c07309h != null) {
            c07309h.A0d(qr);
        }
    }

    public C07309h getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(arrayList);
    }
}
