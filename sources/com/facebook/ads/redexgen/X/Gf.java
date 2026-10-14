package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Gf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ V4 A03;

    public Gf(V4 v10, int i10, long j10, long j11) {
        this.A03 = v10;
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A03.A07.AAW(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
