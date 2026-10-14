package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AO A01;

    public AN(AO ao, int i10) {
        this.A01 = ao;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.A01.AAS(this.A00);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
