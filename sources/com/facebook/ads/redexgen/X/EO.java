package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EO implements Runnable {
    public final /* synthetic */ BR A00;

    public EO(BR br) {
        this.A00 = br;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
