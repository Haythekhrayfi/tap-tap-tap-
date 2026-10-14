package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B5 {
    public final CopyOnWriteArrayList<B4> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        for (B4 b10 : this.A00) {
            B6 listener = b10.A01;
            b10.A00.post(new B0(this, listener));
        }
    }

    public final void A01() {
        for (B4 b10 : this.A00) {
            B6 listener = b10.A01;
            b10.A00.post(new B3(this, listener));
        }
    }

    public final void A02() {
        for (B4 b10 : this.A00) {
            B6 listener = b10.A01;
            b10.A00.post(new B2(this, listener));
        }
    }

    public final void A03(Handler handler, B6 b10) {
        HG.A03((handler == null || b10 == null) ? false : true);
        this.A00.add(new B4(handler, b10));
    }

    public final void A04(Exception exc) {
        for (B4 b10 : this.A00) {
            B6 listener = b10.A01;
            b10.A00.post(new B1(this, listener, exc));
        }
    }
}
