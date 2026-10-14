package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GB implements RE {
    public final R6 A00;
    public final C4C A01;

    public GB(C4C c4c, R6 r10) {
        this.A01 = c4c;
        this.A00 = r10;
    }

    @Override // com.facebook.ads.redexgen.X.RE
    public void A3U(Map<InterfaceC1159Qw, RJ> map, Map<InterfaceC0888Gd, R6> map2) {
        map2.put(this.A01, this.A00);
    }
}
