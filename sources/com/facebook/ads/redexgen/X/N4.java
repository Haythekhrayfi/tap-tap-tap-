package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N4 implements Runnable {
    public final /* synthetic */ N5 A00;
    public final /* synthetic */ N6 A01;

    public N4(N5 n10, N6 n11) {
        this.A00 = n10;
        this.A01 = n11;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.AAN();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
