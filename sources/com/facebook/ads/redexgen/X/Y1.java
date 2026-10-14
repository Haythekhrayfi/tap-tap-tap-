package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Y1 extends K4 {
    public final /* synthetic */ C6G A00;
    public final /* synthetic */ C6H A01;
    public final /* synthetic */ C6O A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public Y1(C6O c6o, ArrayList arrayList, C6H c6h, C6G c6g, ArrayList arrayList2) {
        this.A02 = c6o;
        this.A03 = arrayList;
        this.A01 = c6h;
        this.A00 = c6g;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        AtomicBoolean atomicBooleanA0D = C6O.A0D(this.A03);
        if (this.A02.A04 instanceof C1337Xw) {
            C1337Xw c1337Xw = (C1337Xw) this.A02.A04;
            if (this.A01.A00 == -1) {
                if (atomicBooleanA0D.get()) {
                    c1337Xw.A0E().A43(LF.A01(this.A02.A00));
                } else {
                    c1337Xw.A0E().A41(LF.A01(this.A02.A00));
                }
            } else if (atomicBooleanA0D.get()) {
                c1337Xw.A0E().A44(LF.A01(this.A02.A00), this.A01.A00);
            } else {
                c1337Xw.A0E().A42(LF.A01(this.A02.A00), this.A01.A00);
            }
        }
        this.A02.A02.post(new Y2(this, atomicBooleanA0D));
        C6O.A0D(this.A04);
    }
}
