package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F7 extends AbstractC1405aE {
    public final C1337Xw A00;
    public final J3 A01;

    public F7(C1337Xw c1337Xw, C05260x c05260x, List<U7> list, J3 j10) {
        super(c05260x, list, c1337Xw);
        this.A00 = c1337Xw;
        this.A01 = j10 == null ? new J3() : j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final TX A0C(ViewGroup viewGroup, int i10) {
        return new TX(new C1021Lo(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1405aE, com.facebook.ads.redexgen.X.C4O
    /* JADX INFO: renamed from: A0H */
    public final void A0E(TX tx, int i10) {
        super.A0E(tx, i10);
        C1021Lo c1021Lo = (C1021Lo) tx.A0l();
        A0F(c1021Lo.getImageCardView(), i10);
        if (((AbstractC1405aE) this).A01.get(i10) != null) {
            c1021Lo.setTitle(((AbstractC1405aE) this).A01.get(i10).getAdHeadline());
            c1021Lo.setSubtitle(((AbstractC1405aE) this).A01.get(i10).getAdLinkDescription());
            c1021Lo.setButtonText(((AbstractC1405aE) this).A01.get(i10).getAdCallToAction());
        }
        U7 u10 = ((AbstractC1405aE) this).A01.get(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1021Lo);
        u10.A1O(c1021Lo, c1021Lo, arrayList);
    }
}
