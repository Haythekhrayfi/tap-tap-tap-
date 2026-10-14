package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1471bP {
    public InterfaceC1472bQ A00;

    public final void A00() {
        InterfaceC1472bQ interfaceC1472bQ = this.A00;
        if (interfaceC1472bQ != null) {
            interfaceC1472bQ.onStart();
        }
    }

    public final void A01() {
        InterfaceC1472bQ interfaceC1472bQ = this.A00;
        if (interfaceC1472bQ != null) {
            interfaceC1472bQ.onStop();
        }
    }

    public final void A02(InterfaceC1472bQ interfaceC1472bQ) {
        this.A00 = interfaceC1472bQ;
    }
}
