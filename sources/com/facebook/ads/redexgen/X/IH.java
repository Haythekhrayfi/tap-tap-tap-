package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IH implements Runnable {
    public final /* synthetic */ C0766As A00;
    public final /* synthetic */ II A01;

    public IH(II ii, C0766As c0766As) {
        this.A01 = ii;
        this.A00 = c0766As;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            this.A01.A01.ADA(this.A00);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
