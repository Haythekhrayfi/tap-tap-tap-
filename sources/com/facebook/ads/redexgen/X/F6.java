package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F6 extends AbstractC1405aE {
    public final C1337Xw A00;

    public F6(C05260x c05260x, List<U7> list, C1337Xw c1337Xw) {
        super(c05260x, list, c1337Xw);
        this.A00 = c1337Xw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final TX A0C(ViewGroup viewGroup, int i10) {
        return new TX(new C1026Lt(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1405aE, com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A0H */
    public final void A0E(TX tx, int i10) {
        super.A0E(tx, i10);
        C1026Lt c1026Lt = (C1026Lt) tx.A0l();
        M5 imageView = (M5) c1026Lt.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i10);
        U7 childAd = ((AbstractC1405aE) this).A01.get(i10);
        childAd.A11().A0G(this.A00);
        childAd.A1N(c1026Lt, c1026Lt);
    }
}
