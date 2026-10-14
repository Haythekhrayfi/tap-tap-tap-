package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IC implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ II A02;
    public final /* synthetic */ String A03;

    public IC(II ii, String str, long j10, long j11) {
        this.A02 = ii;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A02.A01.AD9(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
