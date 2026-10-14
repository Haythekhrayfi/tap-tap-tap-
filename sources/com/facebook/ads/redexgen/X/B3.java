package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B3 implements Runnable {
    public final /* synthetic */ B5 A00;
    public final /* synthetic */ B6 A01;

    public B3(B5 b10, B6 b11) {
        this.A00 = b10;
        this.A01 = b11;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.AAz();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
