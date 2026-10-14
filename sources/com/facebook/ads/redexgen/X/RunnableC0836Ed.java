package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0836Ed implements Runnable {
    public final /* synthetic */ C0840Eh A00;
    public final /* synthetic */ InterfaceC0843Ek A01;

    public RunnableC0836Ed(C0840Eh c0840Eh, InterfaceC0843Ek interfaceC0843Ek) {
        this.A00 = c0840Eh;
        this.A01 = interfaceC0843Ek;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.ACT(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
