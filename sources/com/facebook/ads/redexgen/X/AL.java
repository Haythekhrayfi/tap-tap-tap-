package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AO A03;

    public AL(AO ao, int i10, long j10, long j11) {
        this.A03 = ao;
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A03.A01.AAT(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
