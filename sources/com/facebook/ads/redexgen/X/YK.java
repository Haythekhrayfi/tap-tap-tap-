package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YK implements C6G {
    public final List<C1419aS> A00;
    public final /* synthetic */ YJ A01;

    public YK(YJ yj, List<C1419aS> list) {
        this.A01 = yj;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        Iterator<C1419aS> it = this.A00.iterator();
        while (it.hasNext()) {
            U7 u10 = new U7(this.A01.A01, it.next(), null, U7.A0K(), this.A01.A00.A01());
            if (u10.A0y() != null && u10.A0y().A0F() != null) {
                ((AbstractC1380Zp) u10.A0y().A0F()).A00(u10);
            }
            this.A01.A00.A04(new NativeAd(this.A01.A01, u10));
        }
        C0978Jv.A00(new YL(this));
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAc() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAl() {
        A00();
    }
}
