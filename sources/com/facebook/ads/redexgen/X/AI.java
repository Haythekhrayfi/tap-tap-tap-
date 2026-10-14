package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AI implements Runnable {
    public final /* synthetic */ AO A00;
    public final /* synthetic */ C0766As A01;

    public AI(AO ao, C0766As c0766As) {
        this.A00 = ao;
        this.A01 = c0766As;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A01.AAQ(this.A01);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
