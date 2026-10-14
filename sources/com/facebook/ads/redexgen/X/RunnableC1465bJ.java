package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1465bJ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1464bI A01;

    public RunnableC1465bJ(C1464bI c1464bI, int i10) {
        this.A01 = c1464bI;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (this.A01.A01) {
                C1464bI c1464bI = this.A01;
                c1464bI.A04(c1464bI.A05.AA3());
                this.A01.A04.postDelayed(this.A01.A09, this.A00);
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
