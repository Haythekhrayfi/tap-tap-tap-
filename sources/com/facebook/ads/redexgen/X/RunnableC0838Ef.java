package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0838Ef implements Runnable {
    public final /* synthetic */ C0840Eh A00;
    public final /* synthetic */ C0842Ej A01;
    public final /* synthetic */ InterfaceC0843Ek A02;

    public RunnableC0838Ef(C0840Eh c0840Eh, InterfaceC0843Ek interfaceC0843Ek, C0842Ej c0842Ej) {
        this.A00 = c0840Eh;
        this.A02 = interfaceC0843Ek;
        this.A01 = c0842Ej;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A02.AAx(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
