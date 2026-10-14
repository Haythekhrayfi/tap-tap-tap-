package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QA implements Runnable {
    public final /* synthetic */ QD A00;

    public QA(QD qd2) {
        this.A00 = qd2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            this.A00.A04.removeCallbacks(this);
            this.A00.A04.postDelayed(this, 250L);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
