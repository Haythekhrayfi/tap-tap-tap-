package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0824Dr implements Runnable {
    public final /* synthetic */ RunnableC0826Dt A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC0824Dr(RunnableC0826Dt runnableC0826Dt, Throwable th) {
        this.A00 = runnableC0826Dt;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            RunnableC0826Dt runnableC0826Dt = this.A00;
            Throwable th = this.A01;
            if (!runnableC0826Dt.A0G(1, th != null ? 4 : 2, th) && !this.A00.A0F(6, 3) && !this.A00.A0F(7, 0)) {
                throw new IllegalStateException();
            }
        } catch (Throwable th2) {
            C0979Jw.A00(th2, this);
        }
    }
}
