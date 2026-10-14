package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IF implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ II A04;

    public IF(II ii, int i10, int i11, int i12, float f10) {
        this.A04 = ii;
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = f10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A04.A01.ADK(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
