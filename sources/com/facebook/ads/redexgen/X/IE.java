package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ II A02;

    public IE(II ii, int i10, long j10) {
        this.A02 = ii;
        this.A00 = i10;
        this.A01 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A02.A01.AB2(this.A00, this.A01);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
