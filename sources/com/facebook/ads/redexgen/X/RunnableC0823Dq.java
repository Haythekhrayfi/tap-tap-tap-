package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0823Dq implements Runnable {
    public final /* synthetic */ RunnableC0826Dt A00;

    public RunnableC0823Dq(RunnableC0826Dt runnableC0826Dt) {
        this.A00 = runnableC0826Dt;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
