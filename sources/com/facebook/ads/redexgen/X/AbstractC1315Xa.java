package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1315Xa implements C7T {
    public final C7Q A00;

    public AbstractC1315Xa(C7Q c7q) {
        this.A00 = c7q;
    }

    @Override // com.facebook.ads.redexgen.X.C7T
    public final Map<String, String> A4i() {
        return C8M.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C7T
    public final Map<String, String> A5v() {
        return AnonymousClass84.A02();
    }

    @Override // com.facebook.ads.redexgen.X.C7T
    public final String A77() {
        return AnonymousClass84.A00();
    }

    @Override // com.facebook.ads.redexgen.X.C7T
    public final String A79() {
        return AnonymousClass60.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.X.C7T
    public final boolean A8s() {
        return KP.A00().A03();
    }
}
