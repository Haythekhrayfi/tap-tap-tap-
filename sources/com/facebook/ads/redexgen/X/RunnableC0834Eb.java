package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0834Eb implements Runnable {
    public final /* synthetic */ C0840Eh A00;
    public final /* synthetic */ C0841Ei A01;
    public final /* synthetic */ C0842Ej A02;
    public final /* synthetic */ InterfaceC0843Ek A03;

    public RunnableC0834Eb(C0840Eh c0840Eh, InterfaceC0843Ek interfaceC0843Ek, C0841Ei c0841Ei, C0842Ej c0842Ej) {
        this.A00 = c0840Eh;
        this.A03 = interfaceC0843Ek;
        this.A01 = c0841Ei;
        this.A02 = c0842Ej;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A03.ABd(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
