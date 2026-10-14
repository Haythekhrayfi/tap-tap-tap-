package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class G1 implements RE {
    public final C0892Gj A00;
    public final RJ A01;

    public G1(C0892Gj c0892Gj, RJ rj) {
        this.A00 = c0892Gj;
        this.A01 = rj;
    }

    @Override // com.facebook.ads.redexgen.X.RE
    public void A3U(Map<InterfaceC1159Qw, RJ> map, Map<InterfaceC0888Gd, R6> map2) {
        map.put(this.A00, this.A01);
    }
}
