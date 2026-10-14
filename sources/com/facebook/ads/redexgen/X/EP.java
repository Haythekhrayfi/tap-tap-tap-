package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EP implements Runnable {
    public final /* synthetic */ BR A00;

    public EP(BR br) {
        this.A00 = br;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0G) {
                this.A00.A08.AAm(this.A00);
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
