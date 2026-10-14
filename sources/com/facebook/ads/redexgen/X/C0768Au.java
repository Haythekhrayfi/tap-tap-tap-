package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0768Au extends Thread {
    public final /* synthetic */ AbstractC1313Wy A00;

    public C0768Au(AbstractC1313Wy abstractC1313Wy) {
        this.A00 = abstractC1313Wy;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
